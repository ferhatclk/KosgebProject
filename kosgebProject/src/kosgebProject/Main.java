package kosgebProject;


import java.time.LocalDate;
import java.util.*;

import kosgebProject.entities.Application;
import kosgebProject.entities.BankUser;
import kosgebProject.entities.BlackList;
import kosgebProject.entities.Credit;
import kosgebProject.entities.CreditFeature;
import kosgebProject.entities.Department;
import kosgebProject.entities.Employee;
import kosgebProject.entities.EnterPreneur;
import kosgebProject.entities.Enterprise;
import kosgebProject.entities.Feature;
import kosgebProject.entities.Permission;
import kosgebProject.entities.State;
import kosgebProject.entities.Title;
import kosgebProject.entities.TitlePermission;

public class Main {

	public static void main(String[] args) {
		
		List<BlackList> blackLists = new ArrayList<>();
		
		List<Application> applications= new ArrayList<>();
		
		List<BankUser> bankUsers= new ArrayList<>();
		
		List<CreditFeature> creditFeatures= new ArrayList<>();
		List<CreditFeature> creditFeatures1= new ArrayList<>();
		
		List<Employee> employees= new ArrayList<>();
		
		List<TitlePermission> titlePermissions= new ArrayList<>();
		
		EnterPreneur enterPreneur1 = new EnterPreneur(1,"Sedat", "Yýlmaz", LocalDate.parse("2022-09-02"),"sedat@email", "00232", "Ankara/Keçiören", LocalDate.parse("2022-09-02"), "201", "0955", bankUsers,blackLists,applications);
				
		Enterprise enterprise1 = new Enterprise(1, "sedat@email", "123456", "Ankara/Keçiören", LocalDate.parse("2022-09-02"), "201", "0955","Etiya","205", bankUsers,blackLists,applications);
		
		State state1 = new State(1, "Kabul");
		State state2 = new State(2, "Red");
		
		Credit credit1 = new Credit(1, "Erzurum Kredisi", LocalDate.parse("2022-09-02"),  applications, creditFeatures);
		Credit credit2 = new Credit(2, "Yüzbin Kobi Kredisi", LocalDate.parse("2022-09-02"), applications, creditFeatures1);
		
		Permission permission1 = new Permission(1, "Kredi Sorgulama", titlePermissions);
		Permission permission2 = new Permission(2, "Kredi Onaylama", titlePermissions);
		
		Title title = new Title(1,"Müdür",employees,titlePermissions);
		
		TitlePermission titlePermission1 = new TitlePermission(1, title, permission1);
		TitlePermission titlePermission2 = new TitlePermission(2, title, permission2);
		
		titlePermissions.add(titlePermission1);
		titlePermissions.add(titlePermission2);
		
		Department department =new Department(1,"Banka Þube",employees);
		Employee employee = new Employee(1,"sedat@email","55210","Ankara/Çankaya",title,department,"1254",bankUsers);
		
		System.out.println(employee.getRegistrationNumber()+" : "+employee.getTitle().getTitlePermissions().get(0).getPermission().getName());
		
		Feature feature1 = new Feature(1,"il","Erzurum",creditFeatures);
		Feature feature2 = new Feature(2,"alt limit","15000",creditFeatures);
		Feature feature3 = new Feature(3,"üst limit","50000",creditFeatures);
		Feature feature4 = new Feature(4,"kredi hacmi","250000",creditFeatures);
		Feature feature5 = new Feature(5,"yedek hacmi","100000",creditFeatures);
		Feature feature6 = new Feature(6,"Destek oraný","%25",creditFeatures);
		
		CreditFeature creditFeature1 = new CreditFeature(1,credit1,feature1);
		CreditFeature creditFeature2 = new CreditFeature(2,credit1,feature2);
		CreditFeature creditFeature3 = new CreditFeature(3,credit1,feature3);
		CreditFeature creditFeature4 = new CreditFeature(4,credit1,feature4);
		CreditFeature creditFeature5 = new CreditFeature(5,credit1,feature5);
		CreditFeature creditFeature6 = new CreditFeature(6,credit1,feature6);
		

		Feature feature7 = new Feature(7,"alt limit","25000",creditFeatures);
		Feature feature8 = new Feature(8,"üst limit","45000",creditFeatures);
		Feature feature9 = new Feature(9,"kredi hacmi","253000",creditFeatures);
		Feature feature10 = new Feature(10,"yedek hacmi","90000",creditFeatures);
		Feature feature11 = new Feature(11,"Destek oraný","%27",creditFeatures);
		Feature feature12 = new Feature(12,"ölçek","Orta",creditFeatures);
		
		CreditFeature creditFeature8 = new CreditFeature(7,credit2,feature7);
		CreditFeature creditFeature9 = new CreditFeature(8,credit2,feature8);
		CreditFeature creditFeature10 = new CreditFeature(9,credit2,feature9);
		CreditFeature creditFeature11 = new CreditFeature(10,credit2,feature10);
		CreditFeature creditFeature12 = new CreditFeature(11,credit2,feature11);
		CreditFeature creditFeature13 = new CreditFeature(12,credit2,feature12);
		
		Application application = new Application(1, credit1,  enterPreneur1,  state1);
		Application application1 = new Application(2, credit2,  enterprise1,  state2);
		
		applications.add(application);
		applications.add(application1);

		creditFeatures.add(creditFeature1);  creditFeatures1.add(creditFeature8);
		creditFeatures.add(creditFeature2);  creditFeatures1.add(creditFeature9);
		creditFeatures.add(creditFeature3);  creditFeatures1.add(creditFeature10);
		creditFeatures.add(creditFeature4);  creditFeatures1.add(creditFeature11);
		creditFeatures.add(creditFeature5);  creditFeatures1.add(creditFeature12);
		creditFeatures.add(creditFeature6);  creditFeatures1.add(creditFeature13);
		
		
		for(CreditFeature creditFeature: credit1.getCreditFeatures()) {
			System.out.println(creditFeature.getFeature().getName() +" : "+creditFeature.getFeature().getValue());
		}
		
		System.out.println("****************************************");
		
		System.out.println(enterprise1.getApplications().get(1).getCredit().getName());
		for(CreditFeature creditFeature: credit2.getCreditFeatures()) {
			System.out.println(creditFeature.getFeature().getName() +" : "+creditFeature.getFeature().getValue());
		}
	}

}

