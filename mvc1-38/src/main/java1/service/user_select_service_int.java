/*
 * 
 */
package service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// TODO: Auto-generated Javadoc

/**
 * The Interface user_select_service_int.
 */
public interface user_select_service_int {

	/**
	 * Login validationn.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws GeneralSecurityException the general security exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 */
	void login_validationn(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, GeneralSecurityException, NoSuchAlgorithmException;

	/**
	 * User editt.
	 *
	 * @param request the request
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void userEditt(HttpServletRequest request) throws ClassNotFoundException, SQLException, IOException;

	/**
	 * User editt add.
	 *
	 * @param request the request
	 * @throws SQLException the SQL exception
	 */
	void userEdittAdd(HttpServletRequest request) throws SQLException;

	/**
	 * User updatee.
	 *
	 * @param request the request
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 * @throws InvalidKeyException the invalid key exception
	 * @throws NoSuchPaddingException the no such padding exception
	 * @throws GeneralSecurityException the general security exception
	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
	 * @throws BadPaddingException the bad padding exception
	 * @throws IllegalBlockSizeException the illegal block size exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	void userUpdatee(HttpServletRequest request) throws ClassNotFoundException, SQLException, InvalidKeyException, NoSuchPaddingException, GeneralSecurityException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException;

}
