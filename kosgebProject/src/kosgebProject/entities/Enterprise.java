package kosgebProject.entities;

import java.time.LocalDate;
import java.util.List;

public class Enterprise extends Applicant {
	private String companyName;
	private String taxNumber;

	public Enterprise() {
	}

	public Enterprise(String companyName, String taxNumber) {
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}


	public Enterprise(int id, String email, String password, String address, LocalDate date, String applicantNumber,
			String projectNumber, String companyName, String taxNumber, List<BankUser> bankUsers,List<BlackList> blackLists,List<Application> applications) {
		super(id, email, password, address, date, applicantNumber, projectNumber, bankUsers,blackLists,applications);// user
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}
