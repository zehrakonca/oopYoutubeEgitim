package oopYoutubeEgitim.business;

public class TeacherCreditManager implements CreditService {
	
	@Override
	public void save() {
		System.out.println("��retmen kredisi kaydedildi.");
		
	}

	@Override
	public void calculate() {
		System.out.println("��retmen kredisi hesapland�.");
		
	}
}
