package oopYoutubeEgitim.business;

import oopYoutubeEgitim.entities.Customer;

public class CustomerManager{
	
	private Customer customer;
	private CreditService creditService;
	
	public CustomerManager(Customer customer,CreditService creditService) {
		this.customer = customer;
		this.creditService= creditService;
	}

	public void calculate() {
		System.out.println("kredi hesaplandý.");
		
	}
	
	public void giveCredit()
	{
		creditService.calculate();
		System.out.println("kredi verildi.");
	}
}
