package dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import connection.Connect;
import encryption.EncryptDecrypt;

// TODO: Auto-generated Javadoc
/**
 * The Class Forgot_pass_dao.
 */
public class Forgot_pass_dao implements Forgot_pass_dao_int{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Forgot_pass_dao.class.getName());

	/* (non-Javadoc)
	 * @see dao.Forgot_pass_dao_int#forgotpass(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void forgotpass(final HttpServletRequest request,final HttpServletResponse response) throws IOException, NoSuchPaddingException, GeneralSecurityException, ClassNotFoundException{
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("forgotpass(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}
		final String emailid=request.getParameter("emailid");
		final String newpass=request.getParameter("newpass");
		final String renewpass=request.getParameter("renewpass");
		if(newpass.equals(renewpass)){
			final EncryptDecrypt EncryptDecrypt=new EncryptDecrypt();
			EncryptDecrypt.encrypt(newpass);
	        final InputStream inputStream = getClass().getResourceAsStream("../database.properties");
	        final Properties properties = new Properties();
			properties.load(inputStream);
			final String driver = properties.getProperty("jdbc.driver");
			final String url = properties.getProperty("jdbc.url");
			final String username = properties.getProperty("jdbc.username");
			final String password = properties.getProperty("jdbc.password");
			Class.forName(driver);
			try(Connection connection = DriverManager.getConnection(url, username,password)){
			String email="";
			int user_id=0;
			try{
				try(ResultSet rss = Connect.dbOperationSelect("select * from demo where emailid='"+emailid+"'")){
				while(rss.next()){
					user_id=rss.getInt(1);
					email=rss.getString(5);
				}
				rss.close();}
				if(email.equals(emailid)){
					try(java.sql.Statement Statement= connection.createStatement()){
					Statement.executeUpdate("update demo set password='"+EncryptDecrypt.encrypt(newpass)+"' where user_id='"+user_id+"'");
					response.setContentType("text/html");
					final PrintWriter out = response.getWriter();
					request.setAttribute("alertbox2", "alert");
					final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("login.jsp");
					RequestDispatcher.forward(request, response);
					out.close();
					Statement.close();}
				}

				else{
					response.setContentType("text/html");
			        final PrintWriter out = response.getWriter();
			        request.setAttribute("forgotalert", "alert");
				    final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("forgotpass.jsp");
				    RequestDispatcher.forward(request, response);
			        out.close();
				}
			}catch(final Exception e2){
				LOGGER.error("exception ignored", e2);
			}
			connection.close();} catch (final SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("exception ignored", e);
			}
		}else{
			response.setContentType("text/html");
			request.setAttribute("passalert", "alert");
			final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("forgotpass.jsp");
			try {
				RequestDispatcher.forward(request, response);
			} catch (final ServletException e) {
				// TODO Auto-generated catch block
				LOGGER.error("exception ignored", e);
			}
		}
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("forgotpass(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}
}
