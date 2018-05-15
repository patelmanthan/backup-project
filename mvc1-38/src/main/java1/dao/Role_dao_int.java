package dao;

import java.io.IOException;
import java.sql.SQLException;

import model.Model;

// TODO: Auto-generated Javadoc
/**
 * The Interface Role_dao_int.
 */
public interface Role_dao_int {

	 /**
 	 * Selectrole.
 	 *
 	 * @param model the model
 	 * @return the model
 	 * @throws IOException Signals that an I/O exception has occurred.
 	 * @throws SQLException the SQL exception
 	 */
 	Model selectrole( Model model) throws IOException, SQLException;



}
