package oopYoutubeEgitim.business;

public class BusinessCreditManager implements CreditService {

	@Override
	public void save() {
		System.out.println("Esnaf kredisi kaydedildi.");
		
	}

	@Override
	public void calculate() {
		System.out.println("Esnaf kredisi hesaplandý.");
		
	}

}

