package kosgebProject.entities;

import java.time.LocalDate;
import java.util.List;

public class EnterPreneur extends Applicant {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public EnterPreneur() {
    }

    public EnterPreneur(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }


    public EnterPreneur(int id,String firstName, String lastName, LocalDate birthDate, String email, String password, String address,  LocalDate date, String applicantNumber, String projectNumber,	
    		List<BankUser> bankUsers, List<BlackList> blackLists,List<Application> applications) {
        super(id, email, password, address, date, applicantNumber, projectNumber,bankUsers,blackLists,applications);//aplicant
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
