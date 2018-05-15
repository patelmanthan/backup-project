package controller;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import service.user_select_service;
import service.user_select_service_int;



// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class user_select.
 */
public class User_select extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(User_select.class.getName());

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new user select.
     *
     * @see HttpServlet#HttpServlet()
     */
    public User_select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Do get.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {


		// TODO Auto-generated method stub


		final user_select_service_int user_select=new user_select_service();
		try {
			user_select.login_validationn(request,response);
		} catch (final GeneralSecurityException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("NewFile.jsp");
	    RequestDispatcher.include(request, response);
	}
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
