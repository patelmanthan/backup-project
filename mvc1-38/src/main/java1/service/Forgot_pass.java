package service;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dao.Forgot_pass_dao;
import dao.Forgot_pass_dao_int;

// TODO: Auto-generated Javadoc
/**
 * The Class Forgot_pass.
 */
public class Forgot_pass implements Forgot_pass_int {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Forgot_pass.class.getName());

	/* (non-Javadoc)
	 * @see service.Forgot_pass_int#forgotpass(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void forgotpass(final HttpServletRequest request,final HttpServletResponse response) throws NoSuchPaddingException, GeneralSecurityException {

		final Forgot_pass_dao_int forgot_pass=new Forgot_pass_dao();
		try {
			forgot_pass.forgotpass(request,response);
		} catch (final IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
	}
}
