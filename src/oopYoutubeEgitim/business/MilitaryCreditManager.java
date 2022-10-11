package oopYoutubeEgitim.business;

public class MilitaryCreditManager implements CreditService {

	@Override
	public void save() {
		System.out.println("Asker kredisi kaydedildi.");
		
	}

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandý.");
		
	}

}
