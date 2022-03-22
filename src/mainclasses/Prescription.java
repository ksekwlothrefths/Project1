package mainclasses;
import java.time.LocalDate;

public class Prescription {
	private int id;
	private Doctor doctor;
	private Patient patient;
	private LocalDate date;

	public Prescription(int id) {
		this.id = id;

	}

}
