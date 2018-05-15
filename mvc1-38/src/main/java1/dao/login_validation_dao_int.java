package dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddressModel;
import model.Model;

// TODO: Auto-generated Javadoc
/**
 * The Interface login_validation_dao_int.
 */
public interface login_validation_dao_int {


	  /**
  	 * Login validation.
  	 *
  	 * @param model the model
  	 * @param request the request
  	 * @param response the response
  	 * @return the list
  	 * @throws UnsupportedEncodingException the unsupported encoding exception
  	 * @throws GeneralSecurityException the general security exception
  	 * @throws NoSuchAlgorithmException the no such algorithm exception
  	 */
  	List<Model> login_validation(Model model,HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, GeneralSecurityException, NoSuchAlgorithmException;

	  /**
  	 * User selectt.
  	 *
  	 * @param request the request
  	 * @param response the response
  	 * @throws UnsupportedEncodingException the unsupported encoding exception
  	 * @throws NoSuchPaddingException the no such padding exception
  	 * @throws NoSuchAlgorithmException the no such algorithm exception
  	 * @throws InvalidKeyException the invalid key exception
  	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
  	 * @throws BadPaddingException the bad padding exception
  	 * @throws IllegalBlockSizeException the illegal block size exception
  	 * @throws ClassNotFoundException the class not found exception
  	 * @throws SQLException the SQL exception
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 */
  	void user_selectt(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, ClassNotFoundException, SQLException, IOException;

	  /**
  	 * Editt.
  	 *
  	 * @param request the request
  	 * @param model the model
  	 * @return the model
  	 * @throws ClassNotFoundException the class not found exception
  	 * @throws SQLException the SQL exception
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 */
  	Model editt(HttpServletRequest request, Model model) throws ClassNotFoundException, SQLException, IOException;

	  /**
  	 * Editt add.
  	 *
  	 * @param address the address
  	 * @return the list
  	 * @throws SQLException the SQL exception
  	 */
  	List<AddressModel> editt_add(AddressModel address) throws SQLException;

	  /**
  	 * Update.
  	 *
  	 * @param model the model
  	 * @return the list
  	 */
  	List<Model> update(Model model);

	  /**
  	 * Update.
  	 *
  	 * @param adrslist the adrslist
  	 * @return the int
  	 */
  	int update(ArrayList<AddressModel> adrslist);

	  /**
  	 * Insert.
  	 *
  	 * @param addressModel the address model
  	 * @return the int
  	 * @throws ClassNotFoundException the class not found exception
  	 * @throws SQLException the SQL exception
  	 */
  	int insert(ArrayList<AddressModel>addressModel ) throws ClassNotFoundException, SQLException;

	  /**
  	 * Delete add.
  	 *
  	 * @param adrslist the adrslist
  	 * @return the int
  	 */
  	int delete_add(ArrayList<AddressModel> adrslist);

}
