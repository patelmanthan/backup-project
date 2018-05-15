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
import javax.servlet.http.HttpServletResponse;

// TODO: Auto-generated Javadoc
/**
 * Servlet Filter implementation class backbutton.
 */
public class Backbutton implements Filter {

    /**
     * Default constructor.
     */
    public Backbutton() {
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
	 * Do filter.
	 *
	 * @param request the request
	 * @param response the response
	 * @param chain the chain
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ServletException the servlet exception
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	final public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {

		final HttpServletRequest req = (HttpServletRequest) request;

		if (req.getRequestURI().matches(".*(js|css|png|jpg|woff|woff2|ttf)$")) {
			chain.doFilter(request, response);
		} else {
				if (req.getSession().getAttribute("rid") == null && needsAuthentication(req.getRequestURI())) {
					final RequestDispatcher requestdispatcher = req.getRequestDispatcher("login.jsp");
					requestdispatcher.forward(request, response);
				} else {
					chain.doFilter(request, response);
				}
				final HttpServletResponse respp = (HttpServletResponse) response;
				respp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
				respp.addHeader("Cache-Control", "post-check=0, pre-check=0");
				respp.setHeader("Pragma", "no-cache");
				respp.setDateHeader("Expires", 0);
			}
		}

	/**
	 * Needs authentication.
	 *
	 * @param url the url
	 * @return true, if successful
	 */
	private boolean needsAuthentication(final String url) {

		final String[]  validNonAuth = {"mvc1/","login.jsp","forgotpass.jsp","Forgotpass","registration.jsp","controller"};
		for (final String validUrl : validNonAuth) {
			if (url.endsWith(validUrl)) {
				return false;
			}
		}
		return true;
	}

	 /* (non-Javadoc)
 	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
 	 */
 	public void init(final FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		/**
		*
		*
		* @author Jon Doe
		*/

	}

}
