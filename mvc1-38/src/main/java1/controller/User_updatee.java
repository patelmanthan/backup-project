package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

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
 * Servlet implementation class user_updatee.
 */
public class User_updatee extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(User_updatee.class.getName());

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new user updatee.
     *
     * @see HttpServlet#HttpServlet()
     */
    public User_updatee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		final user_select_service_int user_update=new user_select_service();
		try {
			user_update.userUpdatee(request);
		} catch (ClassNotFoundException | SQLException | GeneralSecurityException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		out.println("<script>alert('thanq you!!, update successfully!!');document.location='login.jsp';</script>");
	}
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
