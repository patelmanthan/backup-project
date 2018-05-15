/*
 *
 */
package controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import service.Role_int;
import service.Rolee;
import backendvalidation.Backvalidation;
import encryption.EncryptDecrypt;

// TODO: Auto-generated Javadoc
/**
 * Servlet Filter implementation class filteradmin.
 */
public class Filteradmin implements Filter {

	//private static final Logger LOGGER = LogManager.getLogger(Filteradmin.class.getName());
    /**
     * Default constructor.
     */
    public Filteradmin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * Destroy.
	 *
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * The Constant LOGGER.
	 *
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */


	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException, NullPointerException, RuntimeException {

		final String login_emailid=request.getParameter("login_emailid");
		final String login_password=request.getParameter("login_password");
		final String error = new Backvalidation().loginvalidationn(request);
		if (!error.isEmpty()) {
			request.setAttribute("errormsg", error);
		}
		else {
			try{
				final EncryptDecrypt EncryptDecrypt=new EncryptDecrypt();
				try{
					EncryptDecrypt.encrypt(login_password);
				}catch(final Exception ioe){
					//LOGGER.error("exception ignored", ioe);
				}
				final Role_int select = new Rolee();
				Model model= new Model();
				model=select.role_select(login_emailid, EncryptDecrypt.encrypt(login_password));
				final int role=model.getRole_id();
				final int user_id=model.getUser_id();
				final HttpServletRequest req = (HttpServletRequest)request;
				final HttpSession HttpSession = req.getSession();
				HttpSession.setAttribute("rid", user_id);
				String path="";
				final int admin = 1;
				final int user = 2;
				if(role == admin){
					path="welcome.jsp";
				}
				else if(role == user){
					path="User_select";
				}
				else{
					path="login.jsp";
					req.setAttribute("alertboxx", "alert");
				}
				final RequestDispatcher RequestDispatcher = request.getRequestDispatcher(path);
				RequestDispatcher.forward(request, response);
			}catch(final Exception ioe){
			//	LOGGER.error("exception ignored", ioe);
	        }
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(final FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
