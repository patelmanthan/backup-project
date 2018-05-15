package dao;

import java.io.IOException;
import java.io.InputStream;
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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.AddressModel;
import model.Model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import connection.Connect;
import controller.Controller;
import encryption.EncryptDecrypt;

// TODO: Auto-generated Javadoc
/**
 * The Class data_insert_dao.
 */
public class data_insert_dao  implements data_insert_dao_int{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Controller.class.getName());

	/** The input stream. */
	private InputStream inputStream = getClass().getResourceAsStream("../database.properties");

	/** The properties. */
	private final Properties properties = new Properties();

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#insert(model.Model, model.AddressModel[], javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void insert(final Model bean,final AddressModel[] addressModel,final HttpServletRequest request,final HttpServletResponse response) throws SQLException{
		try{
			properties.load(inputStream);
			final String driver = properties.getProperty("jdbc.driver");
			final String url = properties.getProperty("jdbc.url");
			final String username = properties.getProperty("jdbc.username");
			final String password = properties.getProperty("jdbc.password");
			Class.forName(driver);
			try(Connection connection = DriverManager.getConnection(url, username,password)){
	            final PreparedStatement pss=connection.prepareStatement("select emailid from demo where emailid='"+bean.getEmailid()+"'");
	            final ResultSet rss=pss.executeQuery();
	            try {
	            if(rss.next()){
	            	final Model insertModel=new Model();
					insertModel.setFname(request.getParameter("fname"));
					insertModel.setMname(request.getParameter("mname"));
					insertModel.setLname(request.getParameter("lname"));
					insertModel.setEmailid(request.getParameter("emailid"));
					insertModel.setDob(request.getParameter("dob"));
					insertModel.setGender(request.getParameter("gender"));
					insertModel.setAddress(request.getParameter("address"));
					insertModel.setCity(request.getParameter("city"));
					insertModel.setState(request.getParameter("state"));
					insertModel.setCountry(request.getParameter("country"));
					insertModel.setPhonenumber(Integer.parseInt (request.getParameter("phonenumber")));

					request.setAttribute("uname", insertModel);
					request.setAttribute("user_id", insertModel.getUser_id());
					request.setAttribute("fname", insertModel.getFname());
					request.setAttribute("mname", insertModel.getMname());
					request.setAttribute("Lname", insertModel.getLname());
					request.setAttribute("emailid", insertModel.getEmailid());
					request.setAttribute("gender", insertModel.getGender());
					request.setAttribute("language", insertModel.getLanguage());
					request.setAttribute("dob", insertModel.getDob());
					request.setAttribute("phonenumber", insertModel.getPhonenumber());
					request.setAttribute("address", insertModel.getAddress());
					request.setAttribute("city", insertModel.getCity());
					request.setAttribute("state", insertModel.getState());
					request.setAttribute("country", insertModel.getCountry());
					request.setAttribute("sameemailid", "alert");
				    final RequestDispatcher insertRd=request.getRequestDispatcher("registration.jsp");
				    insertRd.forward(request, response);
	            }
	            else{
	       		 	final Part filePart = request.getPart("image");
	       		 	if (filePart != null) {
	       	            inputStream = filePart.getInputStream();
	       	        }
	                final PreparedStatement pes = connection.prepareStatement("insert into demo(fname,mname,lname,emailid,password,Gender,language,Dob,phonenumber,role_id,image) values(?,?,?,?,?,?,?,?,?,?,?)");
	                pes.setString(1,bean.getFname());
					pes.setString(2,bean.getMname());
					pes.setString(3,bean.getLname());
					pes.setString(4,bean.getEmailid());
					pes.setString(5,bean.getPassword());
					pes.setString(6,bean.getGender());
					pes.setString(7,bean.getLanguage());
					pes.setString(8,bean.getDob());
					pes.setInt(9,bean.getPhonenumber());
					pes.setInt(10,bean.getRole_id());
					if (inputStream != null) {
						pes.setBlob(11, inputStream);
					}
					pes.executeUpdate();
					pes.close();
					try(Statement insertSt = connection.createStatement()){
					final String selectSQL = "SELECT user_id FROM demo WHERE emailid='"+bean.getEmailid()+"';";
					try(ResultSet insertRs = insertSt.executeQuery(selectSQL)){
					while (insertRs.next()) {
						final int user_id = insertRs.getInt("user_id");
						bean.setUser_id(user_id);
					}
					insertRs.close();}
					insertSt.close();}
					final PreparedStatement insertPs1 = connection.prepareStatement("insert into address(user_id,address,city,state,country) values(?,?,?,?,?)");
					for (final AddressModel element : addressModel) {
						insertPs1.setInt(1,bean.getUser_id());
						insertPs1.setString(2,element.getAddress());
						insertPs1.setString(3,element.getCity());
						insertPs1.setString(4,element.getState());
						insertPs1.setString(5,element.getCountry());
						insertPs1.addBatch();
					}
					insertPs1.executeBatch();
					insertPs1.close();

					request.setAttribute("alertbox", "alert");
					final RequestDispatcher insertRd=request.getRequestDispatcher("login.jsp");
					insertRd.forward(request, response);
	            }
			}
			catch(final NoSuchFieldError | ServletException | SQLException e){
				LOGGER.error("exception ignored", e);
			}finally{
				rss.close();
				pss.close();
			}
			connection.close();}
		} catch (final ClassNotFoundException e) {
		    	// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		    } catch (final IOException e1) {
			// TODO Auto-generated catch block
		    	LOGGER.error("exception ignored", e1);
		}
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#select(model.Model)
	 */
	public List<Model> select(final Model selectModel){

		final List<Model> selectList=new ArrayList<Model>();
		try{
			 final ResultSet selectRs= Connect.dbOperationSelect("SELECT * FROM demo where  role_id !='1'");
			 try{
				 
			 while(selectRs.next())
			 {
				 final Model selectModel1=new Model();
				 final int user_id=selectRs.getInt("user_id");
				 final String fname=selectRs.getString("fname");
				 final String mname=selectRs.getString("mname");
				 final String lname=selectRs.getString("lname");
				 final String emailid=selectRs.getString("emailid");
				 final String passwordd=selectRs.getString("password");
				 final String gender=selectRs.getString("gender");
				 final String language=selectRs.getString("language");
				 final String dob=selectRs.getString("dob");
				 final Integer phonenumber=selectRs.getInt("phonenumber");
				 selectModel1.setUser_id(user_id);
				 selectModel1.setFname(fname);
				 selectModel1.setMname(mname);
				 selectModel1.setLname(lname);
				 selectModel1.setEmailid(emailid);
				 selectModel1.setPassword(passwordd);
				 selectModel1.setGender(gender);
				 selectModel1.setLanguage(language);
				 selectModel1.setDob(dob);
				 selectModel1.setPhonenumber(phonenumber);
				 selectList.add(selectModel1);
			 }
			 }catch(final Exception e){
				 LOGGER.error("exception ignored", e);
			 }finally{
				 selectRs.close();
			 }
		}catch(final ClassNotFoundException | SQLException | IOException e){
			LOGGER.error("exception ignored", e);
		}
		return selectList;
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#delete(model.Model)
	 */
	public void delete(final Model bean){

			 try {
				Connect.dbOperationDelete("delete from demo where user_id="+bean.getUser_id()+"");
			} catch (ClassNotFoundException | SQLException | IOException e) {
				// TODO Auto-generated catch block
				LOGGER.error("exception ignored", e);
			}
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#edit(javax.servlet.http.HttpServletRequest, model.Model)
	 */
	public Model edit(final HttpServletRequest request, final Model editModel) throws SQLException{

		final Model userModel=new Model();
		try{
			final ResultSet editRs=Connect.dbOperationSelect("SELECT * from demo WHERE user_id = '"+editModel.getUser_id()+"%'");
			try{
				
				while(editRs.next()){
					final int user_id=editRs.getInt("user_id");
					final String fname=editRs.getString("fname");
					final String mname=editRs.getString("mname");
					final String lname=editRs.getString("lname");
					final String emailid=editRs.getString("emailid");
					final String password1=editRs.getString("password");
					final String gender=editRs.getString("gender");
					final String language=editRs.getString("language");
					final String dob=editRs.getString("dob");
					final int phonenumber=editRs.getInt("phonenumber");
					final EncryptDecrypt encryptDecrypt=new EncryptDecrypt();
					encryptDecrypt.decrypt(password1);
					userModel.setUser_id(user_id);
					userModel.setFname(fname);
					userModel.setMname(mname);
					userModel.setLname(lname);
					userModel.setEmailid(emailid);
					userModel.setPassword(encryptDecrypt.decrypt(password1));
					userModel.setGender(gender);
					userModel.setLanguage(language);
					userModel.setDob(dob);
					userModel.setPhonenumber(phonenumber);
				}
			}catch(final SQLException | UnsupportedEncodingException | NoSuchPaddingException | NoSuchAlgorithmException |
					InvalidKeyException | InvalidAlgorithmParameterException | BadPaddingException | IllegalBlockSizeException e){
				LOGGER.error("exception ignored", e);
			}finally{
				editRs.close();
			}
		}
		catch(final ClassNotFoundException | IOException e){
			LOGGER.error("exception ignored", e);
		}
		return userModel;
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#edit_add(model.AddressModel)
	 */
	public List<AddressModel> edit_add(final AddressModel address) throws SQLException{

		final List<AddressModel> addLs=new ArrayList<AddressModel>();
		try{
			final ResultSet addRs=Connect.dbOperationSelect("SELECT * from address WHERE user_id = '"+address.getUser_id()+"%'");
			try{
				
				while(addRs.next()){
					final AddressModel address1=new AddressModel();
					final int user_id=addRs.getInt("user_id");
					final int address_id=addRs.getInt("address_id");
					final String addresss=addRs.getString("address");
					final String city=addRs.getString("city");
					final String state=addRs.getString("state");
					final String country=addRs.getString("country");
					address1.setUser_id(user_id);
					address1.setAddress_id(address_id);
					address1.setAddress(addresss);
					address1.setCity(city);
					address1.setState(state);
					address1.setCountry(country);
					addLs.add(address1);
				}
			}catch(final Exception e){
				LOGGER.error("exception ignored", e);
			}finally{
				addRs.close();
			}
		}catch(final SQLException e){
			LOGGER.error("exception ignored", e);
		} catch (final ClassNotFoundException | IOException e1) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e1);
		}
		return addLs;
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#update(model.Model)
	 */
	public List<Model> update(final Model updateModel){
		final List<Model> updateList=new ArrayList<Model>();

			try {
				Connect.dbOperationUpdate("update demo set fname='"+updateModel.getFname()+"',mname='"+updateModel.getMname()+"',lname='"+updateModel.getLname()+"',emailid='"+updateModel.getEmailid()+"',password='"+updateModel.getPassword()+"',gender='"+updateModel.getGender()+"',language='"+updateModel.getLanguage()+"',dob='"+updateModel.getDob()+"',phonenumber='"+updateModel.getPhonenumber()+"' where user_id='"+updateModel.getUser_id()+"'");
			} catch (ClassNotFoundException | SQLException | IOException e) {
				// TODO Auto-generated catch block
				LOGGER.error("exception ignored", e);
			}
			return updateList;
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#update(java.util.ArrayList)
	 */

	public int update(final ArrayList<AddressModel> adrslist){

		final Statement st1=null;
		new ArrayList<Model>();
		try{
			for(final AddressModel v : adrslist){
				Connect.dbOperationUpdate("update address set address='"+v.getAddress()+"',city='"+v.getCity()+"',state='"+v.getState()+"',country='"+v.getCountry()+"' where address_id='"+v.getAddress_id()+"'");
			}
		}catch(final Exception e){
			LOGGER.error("exception ignored", e);
		}finally {
			if(inputStream!=null) {
				try {
					inputStream.close();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					LOGGER.error("exception ignored", e);
				}
			}
			if(st1!=null) {
				try {
					st1.close();
				} catch (final SQLException e) {
					// TODO Auto-generated catch block
					LOGGER.error("exception ignored", e);
				}
			}
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#insert(java.util.ArrayList)
	 */

	public int insert(final ArrayList<AddressModel>addressModel ) throws ClassNotFoundException, SQLException{

		final InputStream inputStream = getClass().getResourceAsStream("../database.properties");
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
			try(Connection con = DriverManager.getConnection(url, username,password);){
				final PreparedStatement ps1 = con.prepareStatement("insert into address(user_id,address,city,state,country) values(?,?,?,?,?)");
				for(final AddressModel s:addressModel){
					ps1.setInt(1,s.getUser_id());
					ps1.setString(2,s.getAddress());
					ps1.setString(3,s.getCity());
					ps1.setString(4,s.getState());
					ps1.setString(5,s.getCountry());
					ps1.addBatch();
				}
				ps1.executeBatch();
				ps1.close();
				con.close();}
		} catch (final ClassNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
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
		return 0;
	}

	/* (non-Javadoc)
	 * @see dao.data_insert_dao_int#delete_add(java.util.ArrayList)
	 */
	public int delete_add(final ArrayList<AddressModel> adrslist){

		final Statement delStt=null;
		new ArrayList<Model>();
		try{
			for(final AddressModel address : adrslist){
				Connect.dbOperationDelete("delete from address where address_id="+address.getAddress_id());
			}
		}catch(final Exception e) {
			LOGGER.error("exception ignored", e);
		}finally {
			if(inputStream!=null) {
				try {
					inputStream.close();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					LOGGER.error("exception ignored", e);
				}
			}
			if(delStt!=null){
				try {
					delStt.close();
				} catch (final SQLException e) {
					// TODO Auto-generated catch block
					LOGGER.error("exception ignored", e);
				}
			}
		}
		return 0;
	}
}


