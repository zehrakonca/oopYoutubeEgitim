package oopYoutubeEgitim.entities;

public class Customer{
	
	public int id;
	public String city;
	
	public Customer()
	{
		
	}
	public Customer(int id,String city) {
		super();
		this.id = id;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city= city;
	}
}
