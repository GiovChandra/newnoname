package simpleCRUD.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

	@JsonProperty("fullName")
	private String name;
	
	@JsonProperty("age")
	private int age;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("sekolah")
	private String[] sekolah;
	
	@JsonProperty("cars")
	private Car[] cars;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getSekolah() {
		return sekolah;
	}
	public void setSekolah(String[] sekolah) {
		this.sekolah = sekolah;
	}
	public Car[] getCars() {
		return cars;
	}
	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	
	
	
	
}
