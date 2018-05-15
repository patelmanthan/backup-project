/*
 *
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class select.
 */
public class Select extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Select.class.getName());

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Select() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {


		// TODO Auto-generated method stub
		if(request.getAttribute("delete")==null){
		}
		else{
			 response.setContentType("text/html");
			 final PrintWriter outt= response.getWriter();
			 outt.println("<div class='alert alert-success' role='alert'> ");
			 outt.println("<button type='button' class='close' data-dismiss='alert' aria-label='Close'>");
			 outt.println("<span aria-hidden='true'onclick='location.href = 'login.jsp''>&times;</span></button>");
			 outt.println("successfully data delete");
			 outt.println("</div>");
			 outt.println("<script type='text/javascript'>");
			 outt.println("window.setTimeout(function() {");
			 outt.println("$('.alert').fadeTo(500, 0).slideUp(500, function(){");
			 outt.println("$(this).remove();");
			 outt.println("});");
			 outt.println("}, 4000);");
			 outt.println("</script>");
		}
		if(request.getAttribute("update")==null){
		}
		else{
			 response.setContentType("text/html");
			 final PrintWriter out= response.getWriter();
			 out.println("<div class='alert alert-success' role='alert'> ");
			 out.println("<button type='button' class='close' data-dismiss='alert' aria-label='Close'>");
			 out.println("<span aria-hidden='true'onclick='location.href = 'login.jsp''>&times;</span></button>");
			 out.println("successfully data update");
			 out.println("</div>");
			 out.println("<script type='text/javascript'>");
			 out.println("window.setTimeout(function() {");
			 out.println("$('.alert').fadeTo(500, 0).slideUp(500, function(){");
			 out.println("$(this).remove();");
			 out.println("});");
			 out.println("}, 4000);");
			 out.println("</script>");
		}
		//model v=new model();
		final Data_insert_int dataselect=new Data_insert();
		try {
			dataselect.adminSelectt(request);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("table.jsp");
		RequestDispatcher.include(request, response);

	}
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
