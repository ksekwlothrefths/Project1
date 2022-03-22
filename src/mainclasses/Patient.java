package mainclasses;
import java.util.ArrayList;
import java.util.List;

public class Patient {
	private String firstName;
	private String lastName;
	private long amka;
	private List<String> presciptionPatient = new ArrayList<String>();

	public Patient(String firstName, String lastName, long AMKA) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.amka = AMKA;

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

	public long getAmka() {
		return amka;
	}

	public void setAmka(long amka) {
		this.amka = amka;
	}

}
