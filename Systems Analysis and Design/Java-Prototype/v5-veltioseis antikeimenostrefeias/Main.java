import java.util.Scanner;

public class Main {

	private static Application_Catalog generateAppCat() {
		Application_Catalog appCatalog = new Application_Catalog();

		Application application1 = new Application();
		application1.setApplicantID(7777);
		application1.setSubjectOfResearch("5G");
		application1.setProtocolNum(1);

		Application application2 = new Application();
		application2.setApplicantID(7778);
		application2.setSubjectOfResearch("IOT");
		application2.setProtocolNum(2);

		appCatalog.addNewApplication(application1);
		appCatalog.addNewApplication(application2);
		return appCatalog;
	}

	private static Credentials_Catalog generateCredsCat() {
		Credentials_Catalog credsCatalog = new Credentials_Catalog();

		User user1 = new User();
		user1.setName("Tasos");
		user1.setUsername("tasos");
		user1.setPassword("1234");
		user1.setUserID(20138);

		User user2 = new User();
		user2.setName("Panos");
		user2.setUsername("panos");
		user2.setPassword("1234");
		user2.setUserID(20139);

		credsCatalog.addNewUser(user1);
		credsCatalog.addNewUser(user2);
		return credsCatalog;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Application_Catalog appCatalog = generateAppCat();
		Credentials_Catalog credsCatalog = generateCredsCat();

		User user1 = credsCatalog.getUser(0);
		Applicant applicant = new Applicant(user1);

		User user2 = credsCatalog.getUser(1);
		Member member1 = new Member(user2);

		Evaluation eval = new Evaluation();

		int flag = 0;
		// Βρόγχος για Σελίδα login
		while (true) {
			flag = user1.login();
			int choice = 0;
			if (flag == 1) {
				do {
					// Εμφάνιση Κεντρικού μενού αιτούντα
					choice = applicant.showmenu();

					if (choice == 1) {
						Application application3 = new Application();
						application3.setID(applicant.getUserID());
						System.out.println("Συμπληρώστε τα στοιχεία της αίτησης : ");
						System.out.println("Θέμα Έρευνας : ");
						application3.setSubjectOfResearch(in.next());

						while (true) {
							System.out.println("Πατήστε 1 για Υποβολή και 2 για Προσωρινή Αποθηκευση.");
							choice = in.nextInt();
							if (choice == 1) {
								// Θεωρούμε ότι η Γραμματεία έκανε τον έλεγχο πληρότητας, η αίτηση
								// χαρακτηρίζεται πλήρης, και πρωτοκολλείται
								application3.setStatus("Πλήρης");
								application3.setProtocolNum(3);

								// Προσθήκη αίτησης στον κατάλογο αιτήσεων
								appCatalog.addNewApplication(application3);

								// εκτύπωση στοιχείων αίτησης
								application3.printinfo();

								System.out.println(
										"Η αίτηση σας καταχωρήθηκε επιτυχώς και θα περάσει στο στάδιο Αξιολόγησης.");
								break;
							} else if (choice == 2) {
								System.out.println(
										"Η αίτησή σας αποθηκέυτηκε. Μπορείτε να συνεχίσετε την επεξεργασία της σε δεύτερο χρόνο.");
								application3.setStatus("Εκκρεμμεί");
								applicant.showmenu();
								break;
							} else {
								System.out.println("Παρακαλώ πληκτρολογείστε 1 ή 2");
							}
						}

					}
					/*
					 * else if (choice == 2) { ..... } else if (choice == 3) { ..... } else if
					 * (choice == 4) { ..... }
					 */

				} while (choice != 5);
				System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
			} else if (flag == 2) {
				do {
					choice = member1.showmenu();
					int appChoice = 0;
					if (choice == 1) {
						System.out.println("Edo tha fainontai oi aitiseis se lista");
						appCatalog.printApplications();
						System.out.println("Επιλέξτε αίτηση για Αξιολόγηση");
						appChoice = in.nextInt();
						Application chosen = appCatalog.getApp(appChoice);
						eval = eval.evaluate(chosen);
						System.out.println(
								"H Αξιολόγηση με Αρ Πρωτ." + chosen.getProtocolNum() + " αξιολογήθηκε ως εξής:");
						System.out.println(eval.getVerdict());
						System.out.println(eval.getText());
					} else if (choice == 2) {
						System.out.println("Εδώ θα εμφανίζονται οι ειδιποιήσεις");
					}
				} while (choice != 3);
				System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
			}

			else
				System.out.println("Λάθος στοιχεία! Παρακαλώ επαναλάβετε.");
		}
	}
}
