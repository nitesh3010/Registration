package StudentRegistration;

public class showAllProfile extends deleteProfile{
	String D_name() {
		return super.getName();
	}
	String D_add() {
		return super.getAddress();
		
	}
	long D_phone(){
		return super.getPhone();
	}
	String D_email() {
		return super.getEmail_id();
	}
	String D_pass() {
		return super.getPassword();
	}
	
}
