/*
 * 
 */
package service;

import java.io.IOException;
import model.Model;

// TODO: Auto-generated Javadoc
/**
 * The Interface Role_int.
 */
public interface Role_int {
	
	 /**
 	 * Role select.
 	 *
 	 * @param login_emailid the login emailid
 	 * @param login_password the login password
 	 * @return the model
 	 * @throws IOException Signals that an I/O exception has occurred.
 	 */
 	Model role_select(final String login_emailid,final String login_password) throws IOException;

}
