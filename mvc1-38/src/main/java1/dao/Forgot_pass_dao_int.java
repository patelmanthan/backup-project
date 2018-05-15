package dao;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// TODO: Auto-generated Javadoc
/**
 * The Interface Forgot_pass_dao_int.
 */
public interface Forgot_pass_dao_int {

  	/**
  	 * Forgotpass.
  	 *
  	 * @param request the request
  	 * @param response the response
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 * @throws NoSuchPaddingException the no such padding exception
  	 * @throws GeneralSecurityException the general security exception
  	 * @throws ClassNotFoundException
  	 */
  	void forgotpass(HttpServletRequest request,HttpServletResponse response) throws IOException, NoSuchPaddingException, GeneralSecurityException, ClassNotFoundException;

}
