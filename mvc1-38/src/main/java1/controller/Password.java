/*
 *
 */
package controller;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import service.Reset_pass;
import service.Reset_pass_int;


// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class password.
 */
public class Password extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Password.class.getName());

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Password() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		final Reset_pass_int reset_pass=new Reset_pass();
		try {
			reset_pass.resetpassword(request,response);
		} catch (final GeneralSecurityException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
	}
}
