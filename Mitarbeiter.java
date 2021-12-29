package Person;

public class Mitarbeiter extends Employee {
	
	private float primie;


	public Mitarbeiter(String name, String emailadresse, String phone, String departement, String addresse,
			int yearofbirth, float primie) {
		super(name, emailadresse, phone, departement, addresse, yearofbirth);
		this.primie = primie;
	}


	
	

}
