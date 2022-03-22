package mainclasses;
import otherclasses.Address;

public class Pharmacy {
	private String Name;
	private Address[] address;
	private String phoneNumber;
	private Medicine medicine;
	private Patient patient;
	
	

	public Pharmacy(String name, String phone) {
		this.Name = name;
		this.phoneNumber = phone;
		
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	

	
}
