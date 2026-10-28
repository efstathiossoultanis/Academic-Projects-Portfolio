import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	private int ProtocolNum;
	private String FolderName;
	private ArrayList AttachedFiles;
	private String SubjectOfResearch;
	private int ApplicantID;
	private ArrayList ReseachTeamIDs;
	private String Status;

	Scanner in = new Scanner(System.in);
	
	/*public Application(int an_applicant, String a_subjectOfResearch) {
		// TODO Auto-generated constructor stub
		ApplicantID = an_applicant;
		SubjectOfResearch = a_subjectOfResearch; 
	}*/

	public Application(int UserID) {
		// TODO Auto-generated constructor stub
		ApplicantID = UserID;
	}

	/**
	 * 
	 * @param ProtocolNum
	 * @param AttachedFiles
	 * @param SubjectOfResearch
	 * @param ApplicantID
	 * @param ResearchTeamIDs
	 */
	public void create_app() {
		
		System.out.println("Δώσε Θέμα Έρευνας");
		String SubjectOfResearch = in.next();
		ap.
		
		
		System.out.println();
	}
	
	public void addApplication(int ApplicantID, String SubjectOfResearch) {
		
	}
	
	/* public void addApplication(int ProtocolNum, ArrayList AttachedFiles, String SubjectOfResearch, int ApplicantID, ArrayList ResearchTeamIDs) {
		// TODO - implement Application.addApplication
		
		Application app = new Application();
		
		
		throw new UnsupportedOperationException();
	} */

	public int getProtocolNum() {
		// TODO - implement Application.getProtocolNum
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ProtocolNum
	 */
	public void setProtocolNum(int ProtocolNum) {
		// TODO - implement Application.setProtocolNum
		throw new UnsupportedOperationException();
	}

	public String getFolderName() {
		// TODO - implement Application.getFolderName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param FolderName
	 */
	public void setFolderName(String FolderName) {
		// TODO - implement Application.setFolderName
		throw new UnsupportedOperationException();
	}

	public ArrayList getAttachedFiles() {
		// TODO - implement Application.getAttachedFiles
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param AttachedFiles
	 */
	public void setAttachedFiles(ArrayList AttachedFiles) {
		// TODO - implement Application.setAttachedFiles
		throw new UnsupportedOperationException();
	}

	public String getSubjectOfResearch() {
		// TODO - implement Application.getSubjectOfResearch
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SubjectOfResearch
	 */
	public void setSubjectOfResearch(String SubjectOfResearch) {
		// TODO - implement Application.setSubjectOfResearch
		throw new UnsupportedOperationException();
	}

	public int getApplicantID() {
		// TODO - implement Application.getApplicantID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ApplicantID
	 */
	public void setApplicantID(int ApplicantID) {
		// TODO - implement Application.setApplicantID
		throw new UnsupportedOperationException();
	}

	public ArrayList getReseachTeamIDs() {
		// TODO - implement Application.getReseachTeamIDs
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ReseachTeamIDs
	 */
	public void setReseachTeamIDs(ArrayList ReseachTeamIDs) {
		// TODO - implement Application.setReseachTeamIDs
		throw new UnsupportedOperationException();
	}

	public String getStatus() {
		// TODO - implement Application.getStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Status
	 */
	public void setStatus(String Status) {
		// TODO - implement Application.setStatus
		throw new UnsupportedOperationException();
	}

}