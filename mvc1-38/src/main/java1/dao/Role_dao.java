package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import model.Model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class Role_dao.
 */
public class Role_dao implements Role_dao_int{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Role_dao.class.getName());

	/* (non-Javadoc)
	 * @see dao.Role_dao_int#selectrole(model.Model)
	 */
	public Model selectrole(final Model model) throws SQLException{
		final InputStream inputStream = getClass().getResourceAsStream("../database.properties");
		try{

			final Properties properties = new Properties();
			ResultSet resultset = null;

				properties.load(inputStream);

			final String driver = properties.getProperty("jdbc.driver");
			final String url = properties.getProperty("jdbc.url");
			final String username = properties.getProperty("jdbc.username");
			final String password = properties.getProperty("jdbc.password");
			Class.forName(driver);
			try(Connection connection = DriverManager.getConnection(url, username,password)){
			try(Statement Statement=connection.createStatement()){
			final String sql = String.format("select * from demo  where emailid='"+model.getLogin_emailid()+"' and password='"+model.getLogin_password()+"'");
			resultset=Statement.executeQuery(sql);
			try{
			while(resultset.next()){
				final int user_id=resultset.getInt("user_id");
				final int role_id=resultset.getInt("role_id");
				final String emailid=resultset.getString("emailid");
				final String passwordd=resultset.getString("password");
				model.setUser_id(user_id);
				model.setRole_id(role_id);
				model.setEmailid(emailid);
				model.setPassword(passwordd);

			}
			}catch(final Exception e){

			}finally{
				resultset.close();
				Statement.close();}
				connection.close();}
			}

		}catch (final ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e1);
		} catch (final IOException e1) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e1);
		}finally {

		    if(inputStream!=null) {
		    	try {
					inputStream.close();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					LOGGER.error("exception ignored", e);
				}
		    }
		    }
		return model;
	}
}
