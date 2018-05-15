package dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AddressModel;
import model.Model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import connection.Connect;
import encryption.EncryptDecrypt;

// TODO: Auto-generated Javadoc
/**
 * The Class login_validation_dao.
 */
public class login_validation_dao implements login_validation_dao_int {

	/** Logger for this class. */
	private static final Logger LOGGER = LogManager.getLogger(login_validation_dao.class.getName());

	/** The input stream. */
	private final InputStream inputStream = getClass().getResourceAsStream("../database.properties");

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#login_validation(model.Model, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public List<Model> login_validation(final Model model,final HttpServletRequest request, final HttpServletResponse response){

		final List<Model> list=new ArrayList<Model>();
		try{
			final ResultSet rss=Connect.dbOperationSelect("SELECT * FROM demo WHERE demo.emailid like '"+model.getLogin_emailid()+"%' && demo.password like '"+model.getLogin_password()+"%'");
			try{
			while(rss.next())
			{
				final Model model1=new Model();
				final int user_id=rss.getInt("user_id");
				final String fname=rss.getString("fname");
				final String mname=rss.getString("mname");
				final String lname=rss.getString("lname");
				final String emailid=rss.getString("emailid");
				final String password1=rss.getString("password");
				final String gender=rss.getString("gender");
				final String language=rss.getString("language");
				final String dob=rss.getString("dob");
				final Integer phonenumber=rss.getInt("phonenumber");
				model1.setUser_id(user_id);
				model1.setFname(fname);
				model1.setMname(mname);
				model1.setLname(lname);
				model1.setEmailid(emailid);
				model1.setPassword(password1);
				model1.setGender(gender);
				model1.setLanguage(language);
				model1.setDob(dob);
				model1.setPhonenumber(phonenumber);
				list.add(model1);
			}
			}catch(final Exception e){

			}finally{
				rss.close();
			}
		}catch (final SQLException | IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#user_selectt(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void user_selectt(final HttpServletRequest request,final HttpServletResponse response) throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException{

		final Model selectModel=new Model();
		final String login_emailid = request.getParameter("login_emailid");
		final String login_password = request.getParameter("login_password");
		final EncryptDecrypt encryptDecrypt=new EncryptDecrypt();
		encryptDecrypt.encrypt(login_password);
		try{
			final ResultSet selectRss=Connect.dbOperationSelect("SELECT * FROM demo WHERE emailid = '"+selectModel.getLogin_emailid()+"%' && demo.password = '"+selectModel.getLogin_password()+"%'");
			try{
			if(selectRss.next())
			{
				final Model selectModell=new Model();
				final int user_id=selectRss.getInt("user_id");
				final String fname=selectRss.getString("fname");
				final String mname=selectRss.getString("mname");
				final String lname=selectRss.getString("lname");
				final String emailid=selectRss.getString("emailid");
				final String passwordd=selectRss.getString("password");
				final String gender=selectRss.getString("gender");
				final String language=selectRss.getString("language");
				final String dob=selectRss.getString("dob");
				final Integer phonenumber=selectRss.getInt("phonenumber");
				selectModell.setUser_id(user_id);
				selectModell.setFname(fname);
				selectModell.setMname(mname);
				selectModell.setLname(lname);
				selectModell.setEmailid(emailid);
				selectModell.setPassword(passwordd);
				selectModell.setGender(gender);
				selectModell.setLanguage(language);
				selectModell.setDob(dob);
				selectModell.setPhonenumber(phonenumber);
				final HttpSession session = request.getSession();
				session.setAttribute("login_emailid", login_emailid);
				response.setContentType("text/html");
			    final PrintWriter out = response.getWriter();
			    out.println("<script>alert('Welcome User!!');document.location='user.jsp';</script>");
			}
			else{
				response.setContentType("text/html");
		        final PrintWriter out = response.getWriter();
		        out.println("<script>alert('Invalid Emailid or Password');document.location='login.jsp';</script>");
			}
			}catch(final Exception e){
			}finally{
				selectRss.close();
			}
		}catch (final IOException |ClassNotFoundException |  SQLException e) {
			LOGGER.error("exception ignored", e);
		}
	}

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#editt(javax.servlet.http.HttpServletRequest, model.Model)
	 */
	public Model editt(final HttpServletRequest request, final Model editModel) throws SQLException, IOException, ClassNotFoundException{

		final Model editModell=new Model();
			final ResultSet editrss=Connect.dbOperationSelect("SELECT * from demo WHERE user_id = '"+editModel.getUser_id()+"%'");
			try{
				while(editrss.next()){
					final int user_id=editrss.getInt("user_id");
					final String fname=editrss.getString("fname");
					final String mname=editrss.getString("mname");
					final String lname=editrss.getString("lname");
					final String emailid=editrss.getString("emailid");
					final String passwordd=editrss.getString("password");
					final String gender=editrss.getString("gender");
					final String language=editrss.getString("language");
					final String dob=editrss.getString("dob");
					final int phonenumber=editrss.getInt("phonenumber");
					final EncryptDecrypt encryptDecrypt=new EncryptDecrypt();
					encryptDecrypt.decrypt(passwordd);
					editModell.setUser_id(user_id);
					editModell.setFname(fname);
					editModell.setMname(mname);
					editModell.setLname(lname);
					editModell.setEmailid(emailid);
					editModell.setPassword(encryptDecrypt.decrypt(passwordd));
					editModell.setGender(gender);
					editModell.setLanguage(language);
					editModell.setDob(dob);
					editModell.setPhonenumber(phonenumber);
				}
			} catch (final NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException |
					InvalidAlgorithmParameterException |  BadPaddingException | IllegalBlockSizeException | SQLException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
			}finally{
				editrss.close();
			}
			return editModell;
	}

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#editt_add(model.AddressModel)
	 */
	public List<AddressModel> editt_add(final AddressModel address) throws SQLException{

		final List<AddressModel> addList=new ArrayList<AddressModel>();
		try{
			final Properties properties = new Properties();
			properties.load(inputStream);
			final String driver = properties.getProperty("jdbc.driver");
			final String url = properties.getProperty("jdbc.url");
			final String username = properties.getProperty("jdbc.username");
			final String password = properties.getProperty("jdbc.password");
			Class.forName(driver);
			try(Connection connection = DriverManager.getConnection(url, username,password)){
			try(Statement addStt=connection.createStatement()){
			final ResultSet addRss=addStt.executeQuery("SELECT * from address WHERE user_id = '"+address.getUser_id()+"%'");
			try{
			while(addRss.next())
			{
				final AddressModel address1=new AddressModel();
				final int user_id=addRss.getInt("user_id");
				final int address_id=addRss.getInt("address_id");
				final String addresss=addRss.getString("address");
				final String city=addRss.getString("city");
				final String state=addRss.getString("state");
				final String country=addRss.getString("country");
				address1.setUser_id(user_id);
				address1.setAddress_id(address_id);
				address1.setAddress(addresss);
				address1.setCity(city);
				address1.setState(state);
				address1.setCountry(country);
				addList.add(address1);
			}
			}catch(final Exception e){

			}finally{
				addRss.close();
				addStt.close();}
				connection.close();}
			}
		}
		catch(final IOException | ClassNotFoundException e){
			LOGGER.error("editt(model)", e); //$NON-NLS-1$
		}
		return addList;
	}

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#update(model.Model)
	 */
	public List<Model> update(final Model model){

		final List<Model> update_listt=new ArrayList<Model>();
		try{
			Connect.dbOperationUpdate("update demo set fname='"+model.getFname()+"',mname='"+model.getMname()+"',lname='"+model.getLname()+"',emailid='"+model.getEmailid()+"',password='"+model.getPassword()+"',gender='"+model.getGender()+"',language='"+model.getLanguage()+"',dob='"+model.getDob()+"',phonenumber='"+model.getPhonenumber()+"' where user_id='"+model.getUser_id()+"'");
		}
		catch(final Exception e){
			LOGGER.error("exception ignored", e);
		}
		return update_listt;
	}

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#update(java.util.ArrayList)
	 */
	public int update(final ArrayList<AddressModel> adrslist){

		new ArrayList<Model>();
		try{
			new Properties();
			for(final AddressModel v : adrslist){
				Connect.dbOperationUpdate("update address set address='"+v.getAddress()+"',city='"+v.getCity()+"',state='"+v.getState()+"',country='"+v.getCountry()+"' where address_id='"+v.getAddress_id()+"'");
			}
		}
		catch (final SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		catch(final IOException | ClassNotFoundException e){
			LOGGER.error("exception ignored", e);
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#insert(java.util.ArrayList)
	 */
	public int insert(final ArrayList<AddressModel>AddressModel ) throws ClassNotFoundException, SQLException{
		try{
			 final Properties properties = new Properties();
			try {
				properties.load(inputStream);
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				LOGGER.error("exception ignored", e);
			}
			final String driver = properties.getProperty("jdbc.driver");
			final String url = properties.getProperty("jdbc.url");
			final String username = properties.getProperty("jdbc.username");
			final String password = properties.getProperty("jdbc.password");
			Class.forName(driver);
			try(Connection connection = DriverManager.getConnection(url, username,password)){
				try(PreparedStatement insertPs = connection.prepareStatement("insert into address(user_id,address,city,state,country) values(?,?,?,?,?)")){
					for (int i = 0; i < AddressModel.size(); i++) {
						insertPs.setInt(1,AddressModel.get(i).getUser_id());
						insertPs.setString(2,AddressModel.get(i).getAddress());
						insertPs.setString(3,AddressModel.get(i).getCity());
						insertPs.setString(4,AddressModel.get(i).getState());
						insertPs.setString(5,AddressModel.get(i).getCountry());
						insertPs.addBatch();
					}
					insertPs.executeBatch();
					insertPs.close();}
					connection.close();}
		} catch (final ClassNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see dao.login_validation_dao_int#delete_add(java.util.ArrayList)
	 */
	public int delete_add(final ArrayList<AddressModel> adrslist){

		new ArrayList<Model>();
		try{
			for(final AddressModel address : adrslist){
				Connect.dbOperationDelete("delete from address where address_id="+address.getAddress_id());
			}
		}
		catch (final SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		} catch (final ClassNotFoundException | IOException e) {
			LOGGER.error("exception ignored", e);
		}
		return 0;
	}
}



