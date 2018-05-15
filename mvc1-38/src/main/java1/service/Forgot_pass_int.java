package service;

import java.security.GeneralSecurityException;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// TODO: Auto-generated Javadoc
/**
 * The Interface Forgot_pass_int.
 */
public interface Forgot_pass_int {
	
	/**
	 * Forgotpass.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws NoSuchPaddingException the no such padding exception
	 * @throws GeneralSecurityException the general security exception
	 */
	void forgotpass(HttpServletRequest request,HttpServletResponse response) throws NoSuchPaddingException, GeneralSecurityException;

}
