package StudentRegistration;


import java.util.Scanner;

public class Registration{
	
	
	public String name;
	public String address;
	public long phone;
	public static String email_id;
	public static String password;
	
	
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		 return this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	public String setAddress(String address) {
		 return this.address = address;
	}
	
	
	public long getPhone() {
		return phone;
	}
	public long setPhone(long phone) {
		 return this.phone = phone;
	}	
	
	
	public String getEmail_id() {
		return email_id;
	}
	public String setEmail_id(String email_id) {
		 return this.email_id = email_id;
		
	}
	
	
	public String getPassword() {
		return password;
	}
	public String setPassword(String password) {
		 return this.password = password;
		
	}
	
	
}
