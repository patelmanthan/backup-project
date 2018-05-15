package service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// TODO: Auto-generated Javadoc
/**
 * The Interface Reset_pass_int.
 */
public interface Reset_pass_int {
	
	/**
	 * Resetpassword.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws NoSuchPaddingException the no such padding exception
	 * @throws GeneralSecurityException the general security exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void resetpassword(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, NoSuchPaddingException, GeneralSecurityException, IOException;
}
