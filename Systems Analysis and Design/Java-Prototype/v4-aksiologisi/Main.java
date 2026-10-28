import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Καλως ήρθατε στο ΣΥΣΤΗΜΑ ΥΠΟΒΟΛΗΣ ΚΑΙ ΑΞΙΟΛΟΓΗΣΗΣ ΑΙΤΗΣΕΩΝ ΤΗΣ ΕΗΔΕ!");
		//arxikopoiisi arithmou prvtokolou
		int i = 1;
		
		/*Δημιουργία User
		User user1 = new User();
		user1.setName("Εμμανουήλ Στειακάκης");
		user1.setUsername("panos");
		user1.setPassword("1234");*/
		
		Application [] catalog = new Application[30];
		
		Application application2 = new Application();
		application2.setApplicantID(7777);
		application2.setSubjectOfResearch("5G");
		application2.setProtocolNum(2);
		
		Application application3 = new Application();
		application3.setApplicantID(7778);
		application3.setSubjectOfResearch("IOT");
		application3.setProtocolNum(3);
		
		catalog[2] = application2;
		catalog[3] = application3;
		
		//Δημιουργία Αιτούντα
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
							catalog[i] = application1;
							//System.out.println(catalog[i].getApplicantID());
							
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
					int j = 2;
					int choice2 = 0;
					System.out.println("ΑΜ Αιτούντα " + "Θέμα Έρευνας " + "Αρ. Πρωτοκόλλου");
					for(j=2;j<4;j++) {
						System.out.printf((j-1) + catalog[j].getApplicantID() + " " + catalog[j].getSubjectOfResearch() + " " + catalog[j].getProtocolNum());
						System.out.println();
					}
					choice2 = in.nextInt();	
					if(choice2 == 2) {
						Evaluation eval2 = new Evaluation();
						eval2.setProtocolNum(application2.getProtocolNum());
						System.out.println("Αξιολογήστε εδώ γτχμ");
						eval2.setText(in.next());
						System.out.println("Εγκρίνεται ή Απορρίπτεται");
						eval2.setVerdict(in.next());
						System.out.println("Πραγματοποιήθηκε η αξιολόγηση με επιτυχία.");
					}
					else if (choice2 == 3) {
						Evaluation eval3 = new Evaluation();
						eval3.setProtocolNum(application3.getProtocolNum());
						System.out.println("Αξιολογήστε εδώ γτχμ");
						eval3.setText(in.next());
						System.out.println("Εγκρίνεται ή Απορρίπτεται");
						eval3.setVerdict(in.next());
						System.out.println("Πραγματοποιήθηκε η αξιολόγηση με επιτυχία.");
					}
					else {
						System.out.println("kati");
					}
				}
				else if(choice == 2) {
					System.out.println("kati allo");
				}
				
			}while(choice !=3);
			System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
			
		} 		
	}
}
