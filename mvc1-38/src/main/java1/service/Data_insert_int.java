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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// TODO: Auto-generated Javadoc
/**
 * The Interface Data_insert_int.
 */
public interface Data_insert_int {

	/**
	 * Insert.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws SQLException the SQL exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ServletException the servlet exception
	 * @throws NoSuchPaddingException the no such padding exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws InvalidKeyException the invalid key exception
	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
	 * @throws BadPaddingException the bad padding exception
	 * @throws IllegalBlockSizeException the illegal block size exception
	 */
	void insert(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException;

	/**
	 * Admin selectt.
	 *
	 * @param request the request
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	void adminSelectt(HttpServletRequest request) throws ClassNotFoundException, SQLException;

	/**
	 * Admin deletee.
	 *
	 * @param request the request
	 */
	void adminDeletee(HttpServletRequest request);

	/**
	 * Admin editt.
	 *
	 * @param request the request
	 * @throws InvalidKeyException the invalid key exception
	 * @throws ClassNotFoundException the class not found exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws NoSuchPaddingException the no such padding exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
	 * @throws BadPaddingException the bad padding exception
	 * @throws IllegalBlockSizeException the illegal block size exception
	 * @throws SQLException the SQL exception
	 */
	void adminEditt(HttpServletRequest request) throws InvalidKeyException, ClassNotFoundException, UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, SQLException;

	/**
	 * Admin editt add.
	 *
	 * @param request the request
	 * @throws SQLException the SQL exception
	 */
	void adminEdittAdd(HttpServletRequest request) throws SQLException;

	/**
	 * Admin updatee.
	 *
	 * @param request the request
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws GeneralSecurityException the general security exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 */
	void adminUpdatee(HttpServletRequest request) throws ClassNotFoundException, SQLException, UnsupportedEncodingException, GeneralSecurityException, NoSuchAlgorithmException;

}
