package oopYoutubeEgitim.business;

public class TeacherCreditManager implements CreditService {
	
	@Override
	public void save() {
		System.out.println("Öðretmen kredisi kaydedildi.");
		
	}

	@Override
	public void calculate() {
		System.out.println("Öðretmen kredisi hesaplandý.");
		
	}
}
