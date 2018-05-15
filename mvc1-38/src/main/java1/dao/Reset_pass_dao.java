package dao;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import encryption.EncryptDecrypt;

// TODO: Auto-generated Javadoc
/**
 * The Class Reset_pass_dao.
 */
public class Reset_pass_dao implements Reset_pass_dao_int {

	/** Logger for this class. */
	private static final Logger LOGGER = LogManager.getLogger(Reset_pass_dao.class.getName());


	/* (non-Javadoc)
	 * @see dao.Reset_pass_dao_int#resetpass(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void resetpass(final HttpServletRequest request,final HttpServletResponse response) throws NoSuchPaddingException, GeneralSecurityException, ClassNotFoundException, SQLException, ServletException, IOException{
		final String oldpass=request.getParameter("oldpass");
		final String newpass=request.getParameter("newpass");
		final String renewpass=request.getParameter("renewpass");

		if(newpass.equals(renewpass)){
			final EncryptDecrypt EncryptDecrypt=new EncryptDecrypt();
			EncryptDecrypt.encrypt(newpass);
			EncryptDecrypt.encrypt(oldpass);
			int user_id=0;
			String pass="";
			final InputStream inputStream = getClass().getResourceAsStream("../database.properties");
			//try{

				final Properties propertiess = new Properties();

					propertiess.load(inputStream);

				final String driver = propertiess.getProperty("jdbc.driver");
				final String url = propertiess.getProperty("jdbc.url");
				final String username = propertiess.getProperty("jdbc.username");
				final String password = propertiess.getProperty("jdbc.password");
				Class.forName(driver);
				final Connection connection = DriverManager.getConnection(url, username,password);
				final String sql = String.format("select password from demo where password='"+EncryptDecrypt.encrypt(newpass)+"'");
				final PreparedStatement pss=connection.prepareStatement(sql);
				final ResultSet rss=pss.executeQuery();
				try{
				if(rss.next()){
					response.setContentType("text/html");
					request.setAttribute("resetpassalert", "alert");
					final RequestDispatcher rdd=request.getRequestDispatcher("resetpass.jsp");
					rdd.forward(request, response);
				}
				else{
					final Statement Statement=connection.createStatement();
					final String sql1 = String.format("select * from demo where password='" + EncryptDecrypt.encrypt(oldpass)+ "'");
					final ResultSet ResultSet=Statement.executeQuery(sql1);
				try{
					while(ResultSet.next()){
						user_id=ResultSet.getInt(1);
						pass=ResultSet.getString(6);
					}
					if(pass.equals(EncryptDecrypt.encrypt(oldpass))){
					try(Statement st1=connection.createStatement()){
					st1.executeUpdate("update demo set password='"+EncryptDecrypt.encrypt(newpass)+"' where user_id='"+user_id+"'");
					response.setContentType("text/html");
					request.setAttribute("resetpass", "alert");
					final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("NewFile.jsp");
					RequestDispatcher.forward(request, response);
					st1.close();
					}

					}
					else{
						response.setContentType("text/html");
					//	PrintWriter out = response.getWriter();
						request.setAttribute("resetpassalert1", "alert");
						final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("resetpass.jsp");
						RequestDispatcher.forward(request, response);
					}
				}catch(final Exception e){

				}finally{
					Statement.close();
					ResultSet.close();
				}


				}
				}catch(final SQLException e){}
				finally{
					rss.close();
					pss.close();
					connection.close();
					inputStream.close();
				}
			}else{
				response.setContentType("text/html");
		        request.setAttribute("chnagepassalert", "alert");
			    final RequestDispatcher rdd=request.getRequestDispatcher("resetpass.jsp");
			    try {
					try {
						rdd.forward(request, response);
					} catch (final IOException e) {
						// TODO Auto-generated catch block
						LOGGER.error("exception ignored", e);
					}
			    } catch (final ServletException e) {
			    	// TODO Auto-generated catch block
			    	LOGGER.error("exception ignored", e);
			    }
			}
	}
}
