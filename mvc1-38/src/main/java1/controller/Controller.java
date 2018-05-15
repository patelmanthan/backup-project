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
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import service.Data_insert;
import service.Data_insert_int;

// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class controller.
 */

@MultipartConfig(maxFileSize = 16177216)
public class Controller extends HttpServlet {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(Controller.class.getName());

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new controller.
     *
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	 /* (non-Javadoc)
 	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 	 */
 	protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*final String error = new Backvalidation().validation(request);
		if(!error.isEmpty()) {
			request.setAttribute("errormsg", error);
		}*/
		//else{
			final Data_insert_int datainsert=new Data_insert();
			try {
				datainsert.insert(request,response);

				} catch (SQLException  | InvalidKeyException | NoSuchPaddingException | NoSuchAlgorithmException |
						InvalidAlgorithmParameterException | BadPaddingException |  IllegalBlockSizeException e) {
					// TODO Auto-generated catch block
					LOGGER.error("exception ignored", e);
				}
			}
		}
	//}


