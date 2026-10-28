import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		Application_Catalog catalog = new Application_Catalog();
		
		System.out.println("Καλως ήρθατε στο ΣΥΣΤΗΜΑ ΥΠΟΒΟΛΗΣ ΚΑΙ ΑΞΙΟΛΟΓΗΣΗΣ ΑΙΤΗΣΕΩΝ ΤΗΣ ΕΗΔΕ!");
		//arxikopoiisi arithmou prvtokolou
		int i = 1;
		
		/*Δημιουργία User
		User user1 = new User();
		user1.setName("Εμμανουήλ Στειακάκης");
		user1.setUsername("panos");
		user1.setPassword("1234");*/
		
		//Δμιουργία Αιτούντα
		Applicant applicant = new Applicant(); 
		applicant.setName("Εμμανουήλ Στειακάκης");
		applicant.setUsername("panos");
		applicant.setPassword("1234");
		applicant.setUserID(7732);
		
		//applicant.SubjectOfResearch = "sub-drones";
		
		//Δημιουργία Τακτικού Μέλους
		Member melos = new Member();
		melos.setName("Ευθήμιος Ταμπούρης");
		melos.setUserID(7732);
		
		//βοηθητική μεταβλητή για καθορισμό του ρόλου του user
		int flag = 1;
		
		//Βρόγχος για Σελίδα login
		while(true) {
			 
			flag = applicant.login();
			if(flag == 1 || flag == 2) break; 
			else
				System.out.println("Λάθος στοιχεία! Παρακαλώ επαναλάβετε.");
		}
		
		//βοηθητική μεταβλητή για καθορισμό επιλογής στο μενού 
		int choice = 0;	
		
		if(flag == 1) {
			do {
				//Εμφάνιση Κεντρικού μενού αιτούντα
				choice = applicant.showmenu();
				
				if(choice == 1) {
					int submit = 0;
					Application application1 = new Application();
					application1.setID(applicant.getUserID());
					System.out.println("Συμπληρώστε τα στοιχεία της αίτησης : ");
					System.out.println("Θέμα Έρευνας : ");
					application1.setSubjectOfResearch(in.next());
					
					while(true) {
						System.out.println("Πατήστε 1 για Υποβολή και 2 για Προσωρινή Αποθηκευση.");
						//βοηθητική μεταβλητή για καθορισμό επιλογής μενού
						submit = in.nextInt();
						
						if (submit == 1) {
							
							//Προσθήκη αίτησης στον κατάλογο αιτήσεων
							application1.addApplicationtoCatalog(application1);
							
							//Θεωρούμε ότι η Γραμματεία έκανε τον έλεγχο πληρότητας, η αίτηση χαρακτηρίζεται πλήρης, και πρωτοκολλείται
							application1.setStatus("Πλήρης");
							application1.setProtocolNum(i);
							i++;
							
							//προσθήκη πρωτοκολλημένης αίτησης στον κατάλογο αιτήσεων
							application1.catalog[i] = application1;
							
							//εκτύπωση στοιχείων αίτησης
							System.out.println("Τα στοιχεία της αίτησης είναι τα παρακάτω :");
							application1.printinfo();
							System.out.println("Η αίτηση σας καταχωρήθηκε επιτυχώς και θα περάσει στο στάδιο Αξιολόγησης.");
							break;
						}
						else if(submit == 2 ) {
							System.out.println("Η αίτησή σας αποθηκέυτηκε. Μπορείτε να συνεχίσετε την επεξεργασία της σε δεύτερο χρόνο.");
							applicant.showmenu();
							break;
						}
						else {
							System.out.println("Παρακαλώ πληκτρολογείστε 1 ή 2");
						}
					}
					
				}
				/*else if (choice == 2) {
					.....
				}
				else if (choice == 3) {
					.....
				}
				else if (choice == 4) {
					.....
				}*/

			}while(choice != 5);
			System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
		}
		else if(flag == 2) {
			
			do {
				choice = melos.showmenu();
				
				if(choice == 1) {
					
				}
				else if(choice == 2) {
					
				}
				
			}while(choice !=3);
			System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
			
		} 		
	}
}
