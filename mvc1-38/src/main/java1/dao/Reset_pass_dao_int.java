package dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// TODO: Auto-generated Javadoc
/**
 * The Interface Reset_pass_dao_int.
 */
public interface Reset_pass_dao_int {
	
	 /**
 	 * Resetpass.
 	 *
 	 * @param request the request
 	 * @param response the response
 	 * @throws UnsupportedEncodingException the unsupported encoding exception
 	 * @throws NoSuchPaddingException the no such padding exception
 	 * @throws GeneralSecurityException the general security exception
 	 * @throws IOException Signals that an I/O exception has occurred.
 	 * @throws ClassNotFoundException the class not found exception
 	 * @throws SQLException the SQL exception
 	 * @throws ServletException the servlet exception
 	 */
 	void resetpass(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, NoSuchPaddingException, GeneralSecurityException, IOException, ClassNotFoundException, SQLException, ServletException;

}
