package oopYoutubeEgitim.business;

import oopYoutubeEgitim.entities.Person;

public class PersonManager {
	public void save(Person person) {
		System.out.println("müþteri bilgileri kaydedildi. Bilgiler ; " +
						   "Adý : "+ person.firstName + 
						   ", Soyadý: " + person.lastName +
						   ", Vatandaþlýk Numarasý: "+ person.nationalIdentity+
						   ", Þehir: "+ person.city);
	}
}
