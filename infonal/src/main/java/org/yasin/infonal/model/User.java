package main.java.org.yasin.infonal.model;

public class User {
	private String id;
	private String firstname;
	private String lastname;
	private String phone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	
	public String getLastname(){
		return lastname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}

}
