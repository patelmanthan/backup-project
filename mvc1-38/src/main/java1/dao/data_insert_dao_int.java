package dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
 * The Interface data_insert_dao_int.
 */
public interface data_insert_dao_int {

	/**
	 * Insert.
	 *
	 * @param bean the bean
	 * @param ddressModel the ddress model
	 * @param request the request
	 * @param response the response
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws SQLException
	 * @throws Exception the exception
	 */
	void insert(Model bean,AddressModel[] ddressModel,HttpServletRequest request,HttpServletResponse response) throws ClassNotFoundException, IOException, SQLException;

	/**
	 * Select.
	 *
	 * @param model the model
	 * @return the list
	 * @throws SQLException the SQL exception
	 */
	List<Model> select(Model model) throws  SQLException;

	/**
	 * Delete.
	 *
	 * @param bean the bean
	 * @throws Exception the exception
	 */
	void delete(Model bean);

	/**
	 * Edits the.
	 *
	 * @param request the request
	 * @param model the model
	 * @return the model
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws NoSuchPaddingException the no such padding exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws InvalidKeyException the invalid key exception
	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
	 * @throws BadPaddingException the bad padding exception
	 * @throws IllegalBlockSizeException the illegal block size exception
	 */
	Model edit(HttpServletRequest request, Model model) throws ClassNotFoundException, SQLException, UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException;

	/**
	 * Edits the add.
	 *
	 * @param address the address
	 * @return the list
	 * @throws SQLException the SQL exception
	 */
	List<AddressModel> edit_add(AddressModel address) throws SQLException;

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
	int insert(ArrayList<AddressModel> addressModel) throws ClassNotFoundException, SQLException;

	/**
	 * Delete add.
	 *
	 * @param adrslist the adrslist
	 * @return the int
	 */
	int delete_add(ArrayList<AddressModel> adrslist);

}
