package oopYoutubeEgitim.business;

import oopYoutubeEgitim.entities.Company;

public class CompanyManager {
	public void save(Company company) {
		System.out.println("m��teri kaydedildi. Bilgiler ; " +
						   "�irket Ad� : "+ company.companyName + 
						   ", Vergi Numaras�: " + company.taxNumber +
						   ", �ehir: "+ company.city);
	}
}
