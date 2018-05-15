package service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dao.Reset_pass_dao;
import dao.Reset_pass_dao_int;

// TODO: Auto-generated Javadoc
/**
 * The Class Reset_pass.
 */
public class Reset_pass implements Reset_pass_int {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Reset_pass.class.getName());

	/* (non-Javadoc)
	 * @see service.Reset_pass_int#resetpassword(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void resetpassword(final HttpServletRequest request,final HttpServletResponse response) throws NoSuchPaddingException, GeneralSecurityException, IOException {

		final Reset_pass_dao_int reset_pass=new Reset_pass_dao();
		try {
			reset_pass.resetpass(request,response);
		} catch (ClassNotFoundException | SQLException | ServletException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
	}
}
