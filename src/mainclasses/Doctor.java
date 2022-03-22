package mainclasses;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String firstName;
	private String lastName;
	private int am;
	private List<String> prescriptiondoc = new ArrayList<String>();

	public Doctor(String firstName, String lastName, int AM) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.am = AM;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAm() {
		return am;
	}

	public void setAm(int am) {
		this.am = am;
	}

}
