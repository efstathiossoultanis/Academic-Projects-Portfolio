import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag; 
		
		System.out.println("Καλως ήρθατε στο ΣΥΣΤΗΜΑ ΥΠΟΒΟΛΗΣ ΚΑΙ ΑΞΙΟΛΟΓΗΣΗΣ ΑΙΤΗΣΕΩΝ ΤΗΣ ΕΗΔΕ!");
		Scanner in = new Scanner(System.in);
		while(true) {
			
		System.out.println("Πληκτρολογήστε το username");
		String username = in.next();
		
		System.out.println("Πληκτρολογήστε το password");
		String password = in.next();
		
		User user1 = new User(); 
		flag = user1.login(username, password);
		if(flag == true) break;
	    System.out.println("Λάθος στοιχεία! Παρακαλώ επαναλάβετε");
		}
		
		/*System.out.println("Κεντρική οθόνη αιτούντα");
		System.out.println("1. Νέα Αίτηση");
		System.out.println("2. Επεξεργασία Αίτησης");
		System.out.println("3. Έλεγχος Αίτησης");
		System.out.println("4. Ενημερώσεις");
		System.out.println("5. Αποσύνδεση"); */
		
		Applicant ap = new Applicant(); 
		ap.UserID = 7732;
		ap.SubjectOfResearch = "sub-drones";
		int choice = ap.showmenu();
		if(choice == 1) {
			Application app = new Application(ap.UserID);
			app.create_app();
			
		}
		
		Application_Catalog app_cat = new Application_Catalog();
		
		Chairman chair = new Chairman();
		Credentials_Catalog creds = new Credentials_Catalog();
		Evaluation eval = new Evaluation();
		Evaluations_Catalog eval_cat = new Evaluations_Catalog();
		FinalDecision FD = new FinalDecision();
		Member member = new Member();
		Rapporteur rapp = new Rapporteur(); 
		Secretary sec = new Secretary();
		Suggestion sug = new Suggestion();
		
		
	}
         
}
