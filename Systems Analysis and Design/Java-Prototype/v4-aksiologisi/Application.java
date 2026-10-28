import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	
	Scanner in = new Scanner(System.in);
	
	private int ProtocolNum;
	private String FolderName;
	private ArrayList AttachedFiles;
	private String SubjectOfResearch;
	private int ApplicantID;
	private ArrayList ReseachTeamIDs;
	private String Status;



	public void setID(int anID) {
		ApplicantID = anID;
	}
	
	public int getID() {
		return ApplicantID;
	}
	
	public void setSubjectOfResearch(String aSoR) {
			SubjectOfResearch = aSoR;
	}
	
	public String getSubjectOfResearch() {
		return SubjectOfResearch;
	}
	
	public void printinfo() {
		System.out.println("Θέμα : " + SubjectOfResearch);
		System.out.println("ΑΜ Αιτούντα : " + ApplicantID);
		System.out.println("Αριθμός Πρωτοκόλλου : 00"+ ProtocolNum);
		System.out.println("Κατάσταση : " + Status);
		System.out.println("");
	}
	
	public void setProtocolNum(int aProtocolNum) {
		ProtocolNum = aProtocolNum;
	}
	
	public int getProtocolNum() {
		return ProtocolNum;
	}

	public void setStatus(String aStatus) {
		this.Status = aStatus;
	}

	public String getStatus() {
		return Status;
	}

Application [] catalog = new Application[30];

	public void addApplicationtoCatalog(Application anApplication) {
		//System.out.println(anApplication.ProtocolNum);
		catalog[anApplication.ProtocolNum] = anApplication;
		//System.out.println(catalog[anApplication.ProtocolNum].ApplicantID);
	}
	
	/* public void addApplication(int ProtocolNum, ArrayList AttachedFiles, String SubjectOfResearch, int ApplicantID, ArrayList ResearchTeamIDs) {
		// TODO - implement Application.addApplication
				
		throw new UnsupportedOperationException();
	} */


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



	public int getApplicantID() {
		return ApplicantID;
	}

	/**
	 * 
	 * @param ApplicantID
	 */
	public void setApplicantID(int aApplicantID) {
		ApplicantID = aApplicantID;
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

	

	/**
	 * 
	 * @param Status
	 */
	
}