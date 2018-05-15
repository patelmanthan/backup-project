package backendvalidation;

import javax.servlet.ServletRequest;

// TODO: Auto-generated Javadoc
/**
 * The Class Backvalidation.
 */
public class Backvalidation {

	/**
	 * Validation.
	 *
	 * @param request the request
	 * @return the string
	 */
	public String validation(final ServletRequest request) {
		// TODO Auto-generated method stub
		final String fname=request.getParameter("fname");
		final String lname=request.getParameter("lname");
		final String emailid=request.getParameter("emailid");
		final String password=request.getParameter("password");
		final String gender=request.getParameter("gender");
		final String language=request.getParameter("language");
		final String phonenumber=request.getParameter("phonenumber");
		final String[] address=request.getParameterValues("address");
		final String[] city=request.getParameterValues("city");
		final String[] state=request.getParameterValues("state");
		final String[] country=request.getParameterValues("country");
		final StringBuilder error = new StringBuilder(500);

		if (fname == null || "".equals(fname)) {
			error.append( "fname should not be null \n");
		} else if (fname.length() > 100) {
			error.append( "fname should not be more than 100 characters <br/>");
		}
		final String mname=request.getParameter("mname");
		if (mname == null ||"".equals(mname)) {
			error.append( "mname should not be null");
		} else if (mname.length() > 100) {
			error.append( "mname should not be more than 100 characters <br/>");
		}
		if (lname == null ||"".equals(lname)) {
			error.append( "lname should not be null");
		} else if (lname.length() > 100) {
			error.append( "lname should not be more than 100 characters <br/>");
		}
		if (emailid == null ||"".equals(emailid)) {
			error.append( "emailid should not be null");
		} else if (emailid.length() > 80) {
			error.append( "email should not be more than 80 characters <br/>");
		} else if (!emailid.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+")) {
			error.append( "email should  be in valid format <br/>");
		}
		if (password == null ||"".equals(password)) {
			error.append( "password should not be null \n");
		} else if (password.length() < 6 || password.length() > 12) {
			error.append( "password should not be more than 15 characters and less than 6 characters <br/>");
		}
		if (gender == null ||"".equals(gender)) {
			error.append( "gender should not be null <br/>");
		}
		if (language == null ||"".equals(language)) {
			error.append( "langage should not be null <br/>");
		}
		if (phonenumber == null || "".equals(phonenumber)) {
			error.append("phonenumber should not be null");

		} else if (phonenumber.length() > 10) {
			error.append("mobile.length.errormsg");

		}
		if (city != null && state != null && country != null) {
			for (int i = 0; i < address.length; i++) {
				if (address[i].equals("")) {
					error.append( "address " + i + 1 + " should not be null <br/>");
				} else if (address[i].length() > 45) {
					error.append( "address " + i + 1 + " should not be more than 45 characters <br/>");
				}
				if (city[i].equals("")) {
					error.append( "city of address " + i + 1 + " should not be null <br/>");
				} else if (city[i].length() > 45) {
					error.append( "city of address " + i + 1 + " should not be more than 45 characters <br/>");
				}
				if (state[i].equals("")) {
					error.append( "state of address " +( i + 1) + " should not be null <br/>");
				} else if (state[i].length() > 45) {
					error.append( "state of address " + i + 1 + " should not be more than 45 characters <br/>");
				}
				if (country[i].equals("")) {
					error.append( "country of address " + i + 1 + " should not be null <br/>");
				} else if (city[i].length() > 45) {
					error.append( "country of address " + i + 1 + " should not be more than 45 characters <br/>");
				}

			}

		}
		return error.toString();
	}

	/**
	 * Loginvalidationn.
	 *
	 * @param request the request
	 * @return the string
	 */
	public String loginvalidationn(final ServletRequest request) {

		final String login_emailid=request.getParameter("login_emailid");
		final String login_password=request.getParameter("login_password");

		final StringBuilder error = new StringBuilder(200);
		if (login_emailid == null ||"".equals(login_emailid)) {
			error.append( "emailid should not be null");
		} else if (login_emailid.length() > 80) {
			error.append( "email should not be more than 80 characters <br/>");
		} else if (!login_emailid.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+")) {
			error.append( "email should  be in valid format <br/>");
		}
		if (login_password == null ||"".equals(login_password)) {
			error.append( "password should not be null \n");
		} else if (login_password.length() < 6 || login_password.length() > 12) {
			error.append( "password should not be more than 15 characters and less than 6 characters <br/>");
		}
		return error.toString();
	}

}

