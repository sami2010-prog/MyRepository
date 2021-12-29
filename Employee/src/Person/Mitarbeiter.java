package Person;

public class Mitarbeiter extends Employee {

	private float primie;
	private float stundenlohn;
	private float arbeitsstunden;

	public Mitarbeiter(String name, String emailadresse, String phone, String departement, String addresse,
			int yearofbirth, float primie) {
		super(name, emailadresse, phone, departement, addresse, yearofbirth);
		this.primie = primie;
	}

	public float getPrimie() {
		return primie;
	}

	public void setPrimie(float primie) {
		this.primie = primie;
	}

	public float getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(float stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public float getArbeitsstunden() {
		return arbeitsstunden;
	}

	public void setArbeitsstunden(float arbeitsstunden) {
		this.arbeitsstunden = arbeitsstunden;
	}
	
	@Override
	public float getSalary() {
		return stundenlohn*arbeitsstunden + primie;
	}
	
	@Override
	public String toString() {
		return "Mitarbeiter_Id = "+ id +  ", Name = " + getName() + ", Emailadresse = "
				+ getEmailadresse() + ", Phone = " + getPhone() + ", Departement = " + getDepartement()
				+ ", Addresse = " + getAddresse() + ", Yearofbirth = " + getYearofbirth() + "\nGehalt = "+ getSalary();
	}

}
