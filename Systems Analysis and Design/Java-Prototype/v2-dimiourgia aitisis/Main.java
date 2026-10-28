import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean flag; 
		Application_Catalog catalog = new Application_Catalog();
		System.out.println("Καλως ήρθατε στο ΣΥΣΤΗΜΑ ΥΠΟΒΟΛΗΣ ΚΑΙ ΑΞΙΟΛΟΓΗΣΗΣ ΑΙΤΗΣΕΩΝ ΤΗΣ ΕΗΔΕ!");
		//ar prot
		int i = 1;
		//dimourgia user
		User user1 = new User(); 
		
		//loop gia kataxorisi cedentials
		while(true) {
			System.out.println("Πληκτρολογήστε το username");
			String username = in.next();
			System.out.println("Πληκτρολογήστε το password");
			String password = in.next();
			flag = user1.login(username, password);
			if(flag == true) break;
		    System.out.println("Λάθος στοιχεία! Παρακαλώ επαναλάβετε.");
		}
				
		//dimiourgia aitounta
		Applicant applicant = new Applicant(); 
		applicant.UserID = 7732;
		applicant.SubjectOfResearch = "sub-drones";
		
		int choice = 0;
		do {
			//methodos showmenu() gia tin emfanisi kentrikou menu
			choice = applicant.showmenu();
			
			if(choice == 1) {
				int submit = 0;
				Application application1 = new Application();
				application1.setID(applicant.UserID);
				System.out.println("Συμπληρώστε τα στοιχεία της αίτησης : ");
				System.out.println("Θέμα Έρευνας : ");
				application1.setSubjectOfResearch(in.next());
				
				
				System.out.println("Πατήστε 1 για Υποβολή και 2 για Προσωρινή Αποθηκευση.");
				submit = in.nextInt();
				if (submit == 1) {
					System.out.println("Η αίτηση σας καταχωρήθηκε επιτυχώς και θα περάσει στο στάδιο Αξιολόγησης.");
					
					//prosthiki aitisis ston katalogo
					application1.addApplicationtoCatalog(application1);
					
					//theoroume oti i grammateia ekane elegxo orthotitas kai i aitisi einai ok , opote protokoleitai
					application1.setStatus("Πλήρης");
					application1.setProtocolNum(i);
					i = i++;
					//System.out.println("00" + application1.getProtocolNum());
					
					//prosthiki protokollimenis aitisis ston katalogo
					application1.catalog[i] = application1;
					//System.out.println(application1.catalog[i].getProtocolNum());
					
					System.out.println("Τα στοιχεία της αίτησης είναι τα παρακάτω :");
					application1.printinfo();
				}
				else if(submit == 2 ) {
					System.out.println("Η αίτησή σας αποθηκέυτηκε. Μπορείτε να συνεχίσετε την επεξεργασία της σε δεύτερο χρόνο.");
					applicant.showmenu();
				}
				else {
					System.out.println("1 και 2 σου είπανε να επιλέξεις βρε Μπούφο");
				}
				
			}
			/*else if (choice == 2) {
				
			}
			else if (choice == 3) {
				
			}
			else if (choice == 4) {
				
			}*/

		}while(choice != 5);
		
		System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
		
		
		//login melous???
		
		//dimiourgia melous
		Member melos = new Member();
		melos.setName("Ευθήμιος Ταμπούρης");
		melos.setUserID(7732);
		
		do {
			choice = melos.showmenu();
			
			if(choice == 1) {
				
			}
			else if(choice == 2) {
				
			}
			
		}while(choice !=3);
		
		System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
		
		
		/*Application_Catalog app_cat = new Application_Catalog();
		Chairman chair = new Chairman();
		Credentials_Catalog creds = new Credentials_Catalog();
		Evaluation eval = new Evaluation();
		Evaluations_Catalog eval_cat = new Evaluations_Catalog();
		FinalDecision FD = new FinalDecision();
		Member member = new Member();
		Rapporteur rapp = new Rapporteur(); 
		Secretary sec = new Secretary();
		Suggestion sug = new Suggestion(); */
		
		
	}
         
}
