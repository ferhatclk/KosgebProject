package kosgebProject.entities;
import java.time.LocalDate;
import java.util.List;

public class Credit {
    private int id;
    private String name;
    private LocalDate startedDate;
    private List<Application> applications;
    private List<CreditFeature> creditFeatures;

    public Credit(int id, String name, LocalDate startedDate,List<Application> applications,List<CreditFeature> creditFeatures) {
        this.id = id;
        this.name = name;
        this.startedDate = startedDate;
        this.applications = applications;
        this.creditFeatures = creditFeatures;
    }

    

    public Credit() {
    }

    public Credit(int id, String name, LocalDate startedDate) {
        this.id = id;
        this.name = name;
        this.startedDate = startedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(LocalDate startedDate) {
        this.startedDate = startedDate;
    }

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public List<CreditFeature> getCreditFeatures() {
		return creditFeatures;
	}

	public void setCreditFeatures(List<CreditFeature> creditFeatures) {
		this.creditFeatures = creditFeatures;
	}

	
}
