/*package connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;


public class Connect {

	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {

		final Properties prop = Connect.getProperties("database.properties");
		final String driver = prop.getProperty("jdbc.driver");
		final String url = prop.getProperty("jdbc.url");
		final String uname = prop.getProperty("jdbc.username");
		final String pass = prop.getProperty("jdbc.password");
		Class.forName(driver);
		final Connection con = DriverManager.getConnection(url, uname, pass);
		return con;
	}


	public static Properties getProperties(final String pname) throws FileNotFoundException, IOException {

		final Properties prop = new Properties();
		final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		final InputStream fis = classLoader.getResourceAsStream(pname);
		prop.load(fis);
		return prop;
	}


	public static ResultSet dbOperationSelect(final String query, final Object... params)
			throws SQLException, ClassNotFoundException, IOException {

		try(Connection con = Connect.getConnection()){
		final PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(query);

		if (params != null) {
			int index = 1;
			for (final Object param : params) {
				preparedStatement.setObject(index, param);
				index++;
			}
		}

		final ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
		}

	}


	public static int dbOperationDelete(final String query, final Object... params)
			throws SQLException, ClassNotFoundException, IOException {

		try(Connection con = Connect.getConnection()){
		final PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(query);

		if (params != null) {
			int index = 1;
			for (final Object param : params) {
				preparedStatement.setObject(index, param);
				index++;
			}
		}
		final int resultSet = preparedStatement.executeUpdate();
		return resultSet;
		}
	}


	public static int dbOperationUpdate(final String query, final Object... params)
			throws SQLException, ClassNotFoundException, IOException {

		try(Connection con = Connect.getConnection()){
		final PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(query);

		if (params != null) {
			int index = 1;
			for (final Object param : params) {
				preparedStatement.setObject(index, param);
				index++;
			}
		}
		final int resultSet = preparedStatement.executeUpdate();
		return resultSet;
		}
	}
}
*/



package connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;


public class Connect {

	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {

		final Properties prop = Connect.getProperties("database.properties");
		final String driver = prop.getProperty("jdbc.driver");
		final String url = prop.getProperty("jdbc.url");
		final String uname = prop.getProperty("jdbc.username");
		final String pass = prop.getProperty("jdbc.password");
		Class.forName(driver);
		final Connection con = DriverManager.getConnection(url, uname, pass);
		return con;
	}


	public static Properties getProperties(final String pname) throws FileNotFoundException, IOException {

		final Properties prop = new Properties();
		final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		final InputStream fis = classLoader.getResourceAsStream(pname);
		prop.load(fis);
		return prop;
	}


	public static ResultSet dbOperationSelect(final String query, final Object... params)
			throws SQLException, ClassNotFoundException, IOException {

		final Connection con = Connect.getConnection();
		final PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(query);

		if (params != null) {
			int index = 1;
			for (final Object param : params) {
				preparedStatement.setObject(index, param);
				index++;
			}
		}

		final ResultSet resultSet = preparedStatement.executeQuery();

		return resultSet;

	}


	public static int dbOperationDelete(final String query, final Object... params)
			throws SQLException, ClassNotFoundException, IOException {

		final Connection con = Connect.getConnection();
		final PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(query);

		if (params != null) {
			int index = 1;
			for (final Object param : params) {
				preparedStatement.setObject(index, param);
				index++;
			}
		}
		final int resultSet = preparedStatement.executeUpdate();
		return resultSet;

	}


	public static int dbOperationUpdate(final String query, final Object... params)
			throws SQLException, ClassNotFoundException, IOException {

		final Connection con = Connect.getConnection();
		final PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(query);

		if (params != null) {
			int index = 1;
			for (final Object param : params) {
				preparedStatement.setObject(index, param);
				index++;
			}
		}
		final int resultSet = preparedStatement.executeUpdate();
		return resultSet;

	}
}
