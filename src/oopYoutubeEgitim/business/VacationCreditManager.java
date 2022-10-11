package oopYoutubeEgitim.business;

public class VacationCreditManager implements CreditService {
	
	@Override
	public void save() {
		System.out.println("Tatil kredisi verildi.");
		
	}

	@Override
	public void calculate() {
		System.out.println("Tatil kredisi hesaplandý.");
		
	}
	
	

}
