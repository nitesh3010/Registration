package StudentRegistration;

import java.util.Scanner;

public class showProfile extends Registration{
	
	private String C_email_id;
	private String C_password;
	
	
	
	public String getC_email_id() {
		return C_email_id;
	}
	public String setC_email_id(String c_email_id) {
		return C_email_id = c_email_id;
	}

	public String getC_password() {
		return C_password;
	}
	public String setC_password(String c_password) {
		return C_password = c_password;
	}	

	
	String show_email() {
		System.out.println(super.getEmail_id());
		return C_email_id;
	}
	String show_pass() {
		System.out.println(super.getPassword());
		return C_password;
	}
		 			
	}  
