public class User {

	private int UserID;
	private String Username;
	private String Password;
	private String Name;

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public boolean login(String username, String password) {
		// TODO - implement User.login
	boolean flag = false;
		if(username.equals("panos") && password.equals("1234")) {
			flag = true;
		}
		else {
		    flag = false;
		}
		return flag;
		//throw new UnsupportedOperationException();
	}

	public void getEmail() {
		// TODO - implement User.getEmail
		throw new UnsupportedOperationException();
	}

	public int getUserID() {
		// TODO - implement User.getUserID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param UserID
	 */
	public void setUserID(int UserID) {
		// TODO - implement User.setUserID
		throw new UnsupportedOperationException();
	}

	public String getUsername() {
		// TODO - implement User.getUsername
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Username
	 */
	public void setUsername(String Username) {
		// TODO - implement User.setUsername
		throw new UnsupportedOperationException();
	}

	public String getPassword() {
		// TODO - implement User.getPassword
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Password
	 */
	public void setPassword(String Password) {
		// TODO - implement User.setPassword
		throw new UnsupportedOperationException();
	}

	public String getName() {
		// TODO - implement User.getName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Name
	 */
	public void setName(String Name) {
		// TODO - implement User.setName
		throw new UnsupportedOperationException();
	}

}