package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Data_insert;
import service.Data_insert_int;
// TODO: Auto-generated Javadoc

/**
 * Servlet implementation class delete.
 */
public class Delete extends HttpServlet {


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Delete() {
    	super();
        // TODO Auto-generated constructor stub
    }


	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

		final Data_insert_int datadelete=new Data_insert();
		datadelete.adminDeletee(request);
		response.setContentType("text/html");
		request.setAttribute("delete","alert");
		final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("Select");
	    RequestDispatcher.forward(request, response);

	}

}
