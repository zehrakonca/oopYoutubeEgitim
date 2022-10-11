package oopYoutubeEgitim.business;

import oopYoutubeEgitim.entities.Company;

public class CompanyManager {
	public void save(Company company) {
		System.out.println("müþteri kaydedildi. Bilgiler ; " +
						   "Þirket Adý : "+ company.companyName + 
						   ", Vergi Numarasý: " + company.taxNumber +
						   ", Þehir: "+ company.city);
	}
}
