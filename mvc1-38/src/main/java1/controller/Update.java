package controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import service.Data_insert;
import service.Data_insert_int;
// TODO: Auto-generated Javadoc

/**
 * The Class Update.
 */
public class Update extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Update.class.getName());

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Update() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {

	// TODO Auto-generated method stub
		final Data_insert_int dataupdate=new Data_insert();
		try {
			dataupdate.adminUpdatee(request);
		} catch (ClassNotFoundException | SQLException | GeneralSecurityException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		response.setContentType("text/html");
		request.setAttribute("update", "alert");
	    final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("Select");
	    RequestDispatcher.forward(request, response);
	}
}
