package service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AddressModel;
import model.Model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import controller.Controller;
import dao.data_insert_dao;
import dao.data_insert_dao_int;
import encryption.EncryptDecrypt;

// TODO: Auto-generated Javadoc
/**
 * The Class Data_insert.
 */
public class Data_insert implements Data_insert_int {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Controller.class.getName());

	/* (non-Javadoc)
	 * @see service.Data_insert_int#insert(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void insert(final HttpServletRequest request, final HttpServletResponse response) throws SQLException, IOException, ServletException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException {

		final Model bean=new Model();
		final String fname=request.getParameter("fname");
		final String mname=request.getParameter("mname");
		final String lname=request.getParameter("lname");
		final String emailid=request.getParameter("emailid");
		final String password=request.getParameter("password");
		final String gender=request.getParameter("gender");
		final String language=request.getParameter("language");
		final String dob=request.getParameter("dob");
		final int phonenumber=Integer.parseInt(request.getParameter("phonenumber"));
		final String[] address=request.getParameterValues("address");
		final String[] city=request.getParameterValues("city");
		final String[] state=request.getParameterValues("state");
		final String[] country = request.getParameterValues("country");

		final int role_id=2;
		final int noo = city.length;
		final EncryptDecrypt encryptDecrypt=new EncryptDecrypt();
		encryptDecrypt.encrypt(password);
		bean.setFname(fname);
		bean.setMname(mname);
		bean.setLname(lname);
		bean.setEmailid(emailid);
		bean.setPassword(encryptDecrypt.encrypt(password));
		bean.setGender(gender);
		bean.setLanguage(language);
		bean.setDob(dob);
		bean.setPhonenumber(phonenumber);
		bean.setRole_id(role_id);
		// TODO Auto-generated method stub
		final AddressModel amm[] = new AddressModel[noo];
		int addressModel = 0;
		amm[addressModel] = new AddressModel();
		for( addressModel=0;addressModel<noo;addressModel++){
			amm[addressModel].setAddress(address[addressModel]);
			amm[addressModel].setCity(city[addressModel]);
			amm[addressModel].setState(state[addressModel]);
			amm[addressModel].setCountry(country[addressModel]);
		}
		final data_insert_dao_int datainsert = new data_insert_dao();
		try {
			datainsert.insert(bean,amm,request,response);
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
	}

	/* (non-Javadoc)
	 * @see service.Data_insert_int#adminSelectt(javax.servlet.http.HttpServletRequest)
	 */
	public void adminSelectt(final HttpServletRequest request) throws SQLException{
		final Model selectModel=new Model();
		final data_insert_dao_int dataselect = new data_insert_dao();
		final java.util.List<Model> selectList=dataselect.select(selectModel);
		final HttpSession session = request.getSession();
		session.setAttribute("List",selectList);
	}

	/* (non-Javadoc)
	 * @see service.Data_insert_int#adminDeletee(javax.servlet.http.HttpServletRequest)
	 */
	public void adminDeletee(final HttpServletRequest request){

		final String user_id = request.getParameter("user_id");
		final int iuser_id1=Integer.parseInt(user_id);
		final Model deleteModel=new Model();
		deleteModel.setUser_id(iuser_id1);
		final data_insert_dao_int datadelete = new data_insert_dao();
		try {
			datadelete.delete(deleteModel);
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
	}

	/* (non-Javadoc)
	 * @see service.Data_insert_int#adminEditt(javax.servlet.http.HttpServletRequest)
	 */
	public void adminEditt(final HttpServletRequest request) throws InvalidKeyException, ClassNotFoundException, UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, SQLException{

		final String user_id = request.getParameter("user_id");
		final int user_idd=Integer.parseInt(user_id);
		final Model editModel=new Model();
		editModel.setUser_id(user_idd);
		final data_insert_dao_int dataedit = new data_insert_dao();
		 final Model editModel1 = dataedit.edit(request, editModel);
		 request.setAttribute("uname", editModel1);
		 request.setAttribute("user_id", editModel1.getUser_id());
		 request.setAttribute("fname", editModel1.getFname());
		 request.setAttribute("mname", editModel1.getMname());
		 request.setAttribute("Lname", editModel1.getLname());
		 request.setAttribute("emailid", editModel1.getEmailid());
		 request.setAttribute("password", editModel1.getPassword());
		 request.setAttribute("gender", editModel1.getGender());
		 request.setAttribute("language", editModel1.getLanguage());
		 request.setAttribute("dob", editModel1.getDob());
		 request.setAttribute("phonenumber", editModel1.getPhonenumber());
	}

	/* (non-Javadoc)
	 * @see service.Data_insert_int#adminEdittAdd(javax.servlet.http.HttpServletRequest)
	 */
	public void adminEdittAdd(final HttpServletRequest request) throws SQLException{

		final String user_id = request.getParameter("user_id");
		final int user_id1=Integer.parseInt(user_id);
		final AddressModel address=new AddressModel();
		address.setUser_id(user_id1);
		final data_insert_dao_int dataeditadd = new data_insert_dao();
		final java.util.List<AddressModel> editList=dataeditadd.edit_add(address);
		final HttpSession session = request.getSession();
		session.setAttribute("List",editList);
	}

	/* (non-Javadoc)
	 * @see service.Data_insert_int#adminUpdatee(javax.servlet.http.HttpServletRequest)
	 */
	public void adminUpdatee(final HttpServletRequest request) throws ClassNotFoundException, SQLException, UnsupportedEncodingException, GeneralSecurityException, NoSuchAlgorithmException{

		// TODO Auto-generated method stub
		final String fname = request.getParameter("fname");
		final String mname= request.getParameter("mname");
		final String lname= request.getParameter("lname");
		final String emailid= request.getParameter("emailid");
		final String password= request.getParameter("password");
		final String gender= request.getParameter("gender");
		final String language= request.getParameter("language");
		final String dob= request.getParameter("dob");
		final int phonenumber=Integer.parseInt(request.getParameter("phonenumber"));
		final String[] address=request.getParameterValues("address");
		final String[] city=request.getParameterValues("city");
		final String[] state=request.getParameterValues("state");
		final String[] country=request.getParameterValues("country");
		final String[] adrsid = request.getParameterValues("address_id");
		final String[] iduser = request.getParameterValues("user_id");
		final int userid=Integer.parseInt(iduser[0]);

		final int citylen = city.length;
		final ArrayList<AddressModel> amlist = new ArrayList<AddressModel>();
		
		for(int i=0;i<citylen;i++){
			final AddressModel addressModel = new AddressModel();
			if (!iduser[i].equals("")) {
				addressModel.setUser_id(Integer.parseInt(iduser[i]));
			}
			addressModel.setAddress(address[i]);
			addressModel.setCity(city[i]);
			addressModel.setState(state[i]);
			addressModel.setCountry(country[i]);
			if (request.getParameter("address_id") != null && !adrsid[i].equals("")) {
					addressModel.setAddress_id(Integer.parseInt(adrsid[i]));
			}
			amlist.add(addressModel);
		}
		final data_insert_dao_int dataeditadd = new data_insert_dao();
		final ArrayList<AddressModel> updateaddrs = new ArrayList<AddressModel>();
		final ArrayList<AddressModel> insert = new ArrayList<AddressModel>();
		final java.util.List<AddressModel> dbls=dataeditadd.edit_add(amlist.get(0));
		int flag = 0;
		for (final AddressModel newaddress : amlist) {
			for (final AddressModel oldaddress : dbls) {
				if (oldaddress.getAddress_id() == newaddress.getAddress_id()) {
					updateaddrs.add(newaddress);
					dbls.remove(oldaddress);
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				insert.add(newaddress);
			}
			flag = 0;
		}
		if (dbls.size() > 0) {
			dataeditadd.delete_add((ArrayList<AddressModel>) dbls);
		}
		if (updateaddrs.size() > 0) {
			dataeditadd.update(updateaddrs);
		}
		if (insert.size() > 0) {
		dataeditadd.insert(insert);
		}
		final EncryptDecrypt encryptDecryptt=new EncryptDecrypt();
		encryptDecryptt.encrypt(password);
		final Model updateModel=new Model();
		updateModel.setUser_id(userid);
		updateModel.setFname(fname);
		updateModel.setMname(mname);
		updateModel.setLname(lname);
		updateModel.setEmailid(emailid);
		updateModel.setPassword(encryptDecryptt.encrypt(password));
		updateModel.setGender(gender);
		updateModel.setLanguage(language);
		updateModel.setDob(dob);
		updateModel.setPhonenumber(phonenumber);
		final data_insert_dao_int dataupdate = new data_insert_dao();
		final java.util.List<Model> updateList=dataupdate.update(updateModel);
		final HttpSession session = request.getSession();
		session.setAttribute("List",updateList);
	}
}
