package oopYoutubeEgitim.business;

import oopYoutubeEgitim.entities.Person;

public class PersonManager {
	public void save(Person person) {
		System.out.println("m��teri bilgileri kaydedildi. Bilgiler ; " +
						   "Ad� : "+ person.firstName + 
						   ", Soyad�: " + person.lastName +
						   ", Vatanda�l�k Numaras�: "+ person.nationalIdentity+
						   ", �ehir: "+ person.city);
	}
}
