package controller;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import service.Forgot_pass;
import service.Forgot_pass_int;


// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class forgotpass.
 */
public class Forgotpass extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Forgotpass.class.getName());

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Forgotpass() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {


			// TODO Auto-generated method stub
			final Forgot_pass_int forgot_pass=new Forgot_pass();
			try {
				forgot_pass.forgotpass(request,response);
			} catch (final GeneralSecurityException e) {
				// TODO Auto-generated catch block
				LOGGER.error("exception ignored", e);
			}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("doGet(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
