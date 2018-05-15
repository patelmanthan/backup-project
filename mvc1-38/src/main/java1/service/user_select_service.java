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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AddressModel;
import model.Model;
import dao.data_insert_dao;
import dao.data_insert_dao_int;
import dao.login_validation_dao;
import dao.login_validation_dao_int;
import encryption.EncryptDecrypt;


// TODO: Auto-generated Javadoc
/**
 * The Class user_select_service.
 */
public class user_select_service  implements user_select_service_int{

	/**
	 * Logger for this class.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws GeneralSecurityException the general security exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 */
	public void login_validationn(final HttpServletRequest request,final HttpServletResponse response) throws UnsupportedEncodingException, GeneralSecurityException, NoSuchAlgorithmException {

		final String login_emailid = request.getParameter("login_emailid");
		final String login_password = request.getParameter("login_password");
		final EncryptDecrypt encryptDecrypt=new EncryptDecrypt();
		encryptDecrypt.encrypt(login_password);
		final Model model=new Model();
		model.setLogin_emailid(login_emailid);
		model.setLogin_password(encryptDecrypt.encrypt(login_password));
		final login_validation_dao_int user_select=new login_validation_dao();
		final java.util.List<Model> list=user_select.login_validation(model,request,response);
		final HttpSession session = request.getSession();
		session.setAttribute("List",list);
	}

	/* (non-Javadoc)
	 * @see service.user_select_service_int#userEditt(javax.servlet.http.HttpServletRequest)
	 */
	public void userEditt(final HttpServletRequest request) throws ClassNotFoundException, SQLException, IOException{

		final String user_id = request.getParameter("user_id");
		final int user_id1=Integer.parseInt(user_id);
		final Model ueditmodel=new Model();
		ueditmodel.setUser_id(user_id1);
		final login_validation_dao_int user_edit=new login_validation_dao();
		final Model ueditmodel1 = user_edit.editt(request, ueditmodel);
		request.setAttribute("uname", ueditmodel1);
		request.setAttribute("user_id", ueditmodel1.getUser_id());
		request.setAttribute("fname", ueditmodel1.getFname());
		request.setAttribute("mname", ueditmodel1.getMname());
		request.setAttribute("Lname", ueditmodel1.getLname());
		request.setAttribute("emailid", ueditmodel1.getEmailid());
		request.setAttribute("password", ueditmodel1.getPassword());
		request.setAttribute("gender", ueditmodel1.getGender());
		request.setAttribute("language", ueditmodel1.getLanguage());
		request.setAttribute("dob", ueditmodel1.getDob());
		request.setAttribute("phonenumber", ueditmodel1.getPhonenumber());
	}

	/* (non-Javadoc)
	 * @see service.user_select_service_int#userEdittAdd(javax.servlet.http.HttpServletRequest)
	 */
	public void userEdittAdd(final HttpServletRequest request) throws SQLException{

		final String user_id = request.getParameter("user_id");
		final int user_idd=Integer.parseInt(user_id);
		final AddressModel address=new AddressModel();
		address.setUser_id(user_idd);
		final login_validation_dao_int user_edit_add=new login_validation_dao();;
		final java.util.List<AddressModel> editList=user_edit_add.editt_add(address);
		final HttpSession session = request.getSession();
		session.setAttribute("List",editList);
	}

	/* (non-Javadoc)
	 * @see service.user_select_service_int#userUpdatee(javax.servlet.http.HttpServletRequest)
	 */
	public void userUpdatee(final HttpServletRequest request) throws ClassNotFoundException, SQLException, InvalidKeyException, NoSuchPaddingException, GeneralSecurityException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException{

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
		final int cityNo = city.length;
		final ArrayList<AddressModel> amlist = new ArrayList<AddressModel>();
		for(int j=0;j<cityNo;j++){
			final AddressModel addressModel = new AddressModel();
			if (!iduser[j].equals("")) {
				addressModel.setUser_id(Integer.parseInt(iduser[j]));
			}
			addressModel.setAddress(address[j]);
			addressModel.setCity(city[j]);
			addressModel.setState(state[j]);
			addressModel.setCountry(country[j]);
			if (request.getParameter("address_id") != null) {
				if (!adrsid[j].equals("")) {
					addressModel.setAddress_id(Integer.parseInt(adrsid[j]));
				}
			}
			amlist.add(addressModel);
		}
		final data_insert_dao_int dataeditaddd = new data_insert_dao();
		final ArrayList<AddressModel> updateaddrs = new ArrayList<AddressModel>();
		final ArrayList<AddressModel> insert = new ArrayList<AddressModel>();
		final java.util.List<AddressModel> databaseList=dataeditaddd.edit_add(amlist.get(0));
		int flag = 0;
		for (final AddressModel newaddress : amlist) {
			for (final AddressModel oldaddress : databaseList) {
				if (oldaddress.getAddress_id() == newaddress.getAddress_id()) {
					updateaddrs.add(newaddress);
					databaseList.remove(oldaddress);
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				insert.add(newaddress);
			}
			flag = 0;
		}
		if (databaseList.size() > 0) {
			dataeditaddd.delete_add((ArrayList<AddressModel>) databaseList);
		}
		if (updateaddrs.size() > 0) {
			dataeditaddd.update(updateaddrs);
		}
		if (insert.size() > 0) {
		dataeditaddd.insert(insert);
		}
		final EncryptDecrypt encryptDecrypt1=new EncryptDecrypt();
		encryptDecrypt1.encrypt(password);
		final Model updateModel=new Model();
        updateModel.setUser_id(userid);
        updateModel.setFname(fname);
        updateModel.setMname(mname);
        updateModel.setLname(lname);
        updateModel.setEmailid(emailid);
        updateModel.setPassword(encryptDecrypt1.encrypt(password));
        updateModel.setGender(gender);
        updateModel.setLanguage(language);
        updateModel.setDob(dob);
        updateModel.setPhonenumber(phonenumber);
        final login_validation_dao_int user_update=new login_validation_dao();
        final java.util.List<Model> updateList=user_update.update(updateModel);
        final HttpSession session = request.getSession();
        session.setAttribute("List",updateList);
	}
}
