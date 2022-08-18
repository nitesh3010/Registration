package StudentRegistration;

public class updateProfile extends showProfile{

	private String U_email_id;
	private String U_password;
	
	
	public String getU_email_id() {
		return U_email_id;
	}
	public String setU_email_id(String u_email_id) {
		return U_email_id = u_email_id;
	}
	public String getU_password() {
		return U_password;
	}
	public String setU_password(String u_password) {
		return U_password = u_password;
	}
	
	String update_email() {
		System.out.println(super.getEmail_id());
		return U_email_id;
	}
	String update_pass() {
		System.out.println(super.getPassword());
		return U_password;
	}
	
	
}
