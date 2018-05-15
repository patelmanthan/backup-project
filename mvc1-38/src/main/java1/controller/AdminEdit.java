/*
 *
 */
package controller;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
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
 * The Class AdminEdit.
 */
public class AdminEdit extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(AdminEdit.class.getName());


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new admin edit.
     */
    public AdminEdit() {
    	super();

    }


	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {



		final Data_insert_int dataedit=new Data_insert();
		try {
			dataedit.adminEditt(request);
		} catch (InvalidKeyException | ClassNotFoundException | NoSuchPaddingException | NoSuchAlgorithmException |
				InvalidAlgorithmParameterException | BadPaddingException | IllegalBlockSizeException | SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		try {
			dataedit.adminEdittAdd(request);
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		final RequestDispatcher RequestDispatcher=request.getRequestDispatcher("update.jsp");
	    RequestDispatcher.include(request, response);
	}
}
