package kosgebProject.entities;

import java.time.LocalDate;
import java.util.List;

public class Applicant extends User {
	private LocalDate date;
	private String applicantNumber;
	private String projectNumber;
	private List<Application> applications;
	private List<BlackList> blackLists;

	public Applicant() {
	}

	
	

	public Applicant(int id, String email, String password, String address,  LocalDate date, String applicantNumber,
			String projectNumber, List<BankUser> bankUsers, List<BlackList> blackLists,List<Application> applications) {
		super(id, email, password, address, bankUsers);
		this.date = date;
		this.applicantNumber = applicantNumber;
		this.projectNumber = projectNumber;
		this.blackLists = blackLists;
		this.applications = applications;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getApplicantNumber() {
		return applicantNumber;
	}

	public void setApplicantNumber(String applicantNumber) {
		this.applicantNumber = applicantNumber;
	}

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}


	public List<BlackList> getBlackLists() {
		return blackLists;
	}


	public void setBlackLists(List<BlackList> blackLists) {
		this.blackLists = blackLists;
	}
	
	
}
