import java.util.Scanner;

public class User {

	private int UserID;
	private String Username;
	private String Password;
	private String Name;

	Scanner in = new Scanner(System.in);
	
	public int login() {
		int flag = 0;
		System.out.println("Πληκτρολογήστε το username");
		this.Username = in.next();
		System.out.println("Πληκτρολογήστε το password");
		this.Password = in.next();
		
		if(this.Username.equals("panos") && this.Password.equals("1234")) {
			flag = 1;
		}
		else if(this.Username.equals("e.tampouris")&& this.Password.equals("1234")) {
			flag = 2;
		}
		else {
		    flag = 0;
		}
		return flag;
	}


	public void setUserID(int aUserID) {
		UserID = aUserID;
	}
	public int getUserID() {
		return UserID;
	}

	public void setUsername(String aUsername) {
			Username = aUsername;
	}

	public String getUsername() {
		return Username;

	}
	
	public void setPassword(String aPassword) {
		Password = aPassword;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setName(String aName) {
		Name = aName;
	}
	
	public String getName() {
		return Name;
	}

	/* Η μέθοδος θα αποστέλλει email για κάθε ενέργεια του χρήστη
	 * Υποβολή αίτησης, πρωτοκόλληση αίτησης, ορισμός ως εισηγητή, πρόσβαση στο φάκελο κτλ
	public void getEmail() {
		...........
	}
	 */
	}