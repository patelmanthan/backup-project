package model;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 */
public class Model implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4208646070089749600L;

	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger(Model.class.getName());

	/** The fname. */
	private String fname;

	/** The mname. */
	private String mname;

	/** The lname. */
	private String lname;

	/** The emailid. */
	private String emailid;

	/** The password. */
	private String password;

	/** The gender. */
	private String gender;

	/** The language. */
	private String language;

	/** The dob. */
	private String dob;

	/** The phonenumber. */
	private int phonenumber;

	/** The user id. */
	private int user_id;

	/** The login emailid. */
	private String login_emailid;

	/** The login password. */
	private String login_password;

	/** The oldpassword. */
	private String oldpassword;

	/** The newpassword. */
	private String newpassword;

	/** The renewpassword. */
	private String renewpassword;

	/** The address. */
	private String address;

	/** The city. */
	private String city;

	/** The state. */
	private String state;

	/** The country. */
	private String country;

	/** The address id. */
	private int address_id;

	/** The name. */
	private String name;

	/** The message. */
	private String message;

	/** The id. */
	//private int id;

	/** The role id. */
	private int role_id;




	/**
	 * Gets the role id.
	 *
	 * @return the role id
	 */
	public int getRole_id() {
		return role_id;
	}

	/**
	 * Sets the role id.
	 *
	 * @param role_id the new role id
	 */
	public void setRole_id(final int role_id) {
		this.role_id = role_id;
	}

	/**
	 * Gets the logger.
	 *
	 * @return the logger
	 */
	public static Logger getLogger() {
		return logger;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	/*public int getId() {
		return id;
	}
	*/
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	/*public void setId(final int id) {
		this.id = id;
	}
	*/
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * Gets the address id.
	 *
	 * @return the address id
	 */
	public int getAddress_id() {
		return address_id;
	}

	/**
	 * Sets the address id.
	 *
	 * @param address_id the new address id
	 */
	public void setAddress_id(final int address_id) {
		this.address_id = address_id;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(final String state) {
		this.state = state;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * Gets the fname.
	 *
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * Sets the fname.
	 *
	 * @param fname the new fname
	 */
	public void setFname(final String fname) {
		this.fname = fname;
	}

	/**
	 * Gets the mname.
	 *
	 * @return the mname
	 */
	public String getMname() {
		return mname;
	}

	/**
	 * Sets the mname.
	 *
	 * @param mname the new mname
	 */
	public void setMname(final String mname) {
		this.mname = mname;
	}

	/**
	 * Gets the lname.
	 *
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * Sets the lname.
	 *
	 * @param lname the new lname
	 */
	public void setLname(final String lname) {
		this.lname = lname;
	}

	/**
	 * Gets the emailid.
	 *
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}

	/**
	 * Sets the emailid.
	 *
	 * @param emailid the new emailid
	 */
	public void setEmailid(final String emailid) {
		this.emailid = emailid;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(final String gender) {
		this.gender = gender;
	}

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language the new language
	 */
	public void setLanguage(final String language) {
		this.language = language;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(final String dob) {
		this.dob = dob;
	}

	/**
	 * Gets the phonenumber.
	 *
	 * @return the phonenumber
	 */
	public int getPhonenumber() {
		return phonenumber;
	}

	/**
	 * Sets the phonenumber.
	 *
	 * @param phonenumber the new phonenumber
	 */
	public void setPhonenumber(final int phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * Sets the user id.
	 *
	 * @param user_id the new user id
	 */
	public void setUser_id(final int user_id) {
		this.user_id = user_id;
	}

	/**
	 * Gets the login emailid.
	 *
	 * @return the login emailid
	 */
	public String getLogin_emailid() {
		return login_emailid;
	}

	/**
	 * Sets the login emailid.
	 *
	 * @param login_emailid the new login emailid
	 */
	public void setLogin_emailid(final String login_emailid) {
		this.login_emailid = login_emailid;
	}

	/**
	 * Gets the login password.
	 *
	 * @return the login password
	 */
	public String getLogin_password() {
		return login_password;
	}

	/**
	 * Sets the login password.
	 *
	 * @param login_password the new login password
	 */
	public void setLogin_password(final String login_password) {
		this.login_password = login_password;
	}

	/**
	 * Gets the oldpassword.
	 *
	 * @return the oldpassword
	 */
	public String getOldpassword() {
		return oldpassword;
	}

	/**
	 * Sets the oldpassword.
	 *
	 * @param oldpassword the new oldpassword
	 */
	public void setOldpassword(final String oldpassword) {
		this.oldpassword = oldpassword;
	}

	/**
	 * Gets the newpassword.
	 *
	 * @return the newpassword
	 */
	public String getNewpassword() {
		return newpassword;
	}

	/**
	 * Sets the newpassword.
	 *
	 * @param newpassword the new newpassword
	 */
	public void setNewpassword(final String newpassword) {
		this.newpassword = newpassword;
	}

	/**
	 * Gets the renewpassword.
	 *
	 * @return the renewpassword
	 */
	public String getRenewpassword() {
		return renewpassword;
	}

	/**
	 * Sets the renewpassword.
	 *
	 * @param renewpassword the new renewpassword
	 */
	public void setRenewpassword(final String renewpassword) {
		this.renewpassword = renewpassword;
	}
}
