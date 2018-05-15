package service;

import java.io.IOException;
import java.sql.SQLException;

import model.Model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dao.Role_dao;
import dao.Role_dao_int;

// TODO: Auto-generated Javadoc
/**
 * The Class Rolee.
 */
public class Rolee implements Role_int{

	private static final Logger LOGGER = LogManager.getLogger(Rolee.class.getName());

	/* (non-Javadoc)
	 * @see service.Role_int#role_select(java.lang.String, java.lang.String)
	 */
	public Model role_select(final String login_emailid, final String login_password) throws IOException  {

		final Model model=new Model();
		model.setLogin_emailid(login_emailid);
		model.setLogin_password(login_password);
		final Role_dao_int role = new Role_dao();
		try {
			role.selectrole(model);
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("exception ignored", e);
		}
		return model;
	}
}
