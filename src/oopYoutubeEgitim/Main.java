package oopYoutubeEgitim;

import oopYoutubeEgitim.business.CompanyManager;
import oopYoutubeEgitim.business.CustomerManager;
import oopYoutubeEgitim.business.PersonManager;
import oopYoutubeEgitim.business.VacationCreditManager;
import oopYoutubeEgitim.entities.Company;
import oopYoutubeEgitim.entities.Customer;
import oopYoutubeEgitim.entities.Person;

public class Main {


	public static void main(String[] args) {
		
		Person person = new Person();
		person.id = 1;
		person.firstName = "Monkey D.";
		person.lastName = "Luffy";
		person.nationalIdentity = "123456789";
		person.city = "unknown location on the sea";
		
		Company company = new Company();
		company.id=2;
		company.companyName="One Piece Develop & Smart Systems";
		company.city = "Grand Line";
		company.taxNumber = "12345678963";
		
		CompanyManager companyManager = new CompanyManager();
		companyManager.save(company);
		
		PersonManager personManager = new PersonManager();
		personManager.save(person);
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new VacationCreditManager());
		customerManager.giveCredit();
		

	}

}
