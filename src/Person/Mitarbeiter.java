package Person;

public class Mitarbeiter extends Employee {

	private float primie;
	private float stundenlohn;
	private float arbeitsstunden;

	public Mitarbeiter() {

	}

	public Mitarbeiter(String name, String email, String phone, String addresse, int yearofbirth, Department dep,
			float primie) {
		super(name, email, phone, addresse, yearofbirth, dep);
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
		return stundenlohn * arbeitsstunden + primie;
	}

	@Override
	public String toString() {
		return "Mitarbeiter_Id = " + id + "\tName = " + getName() + "\tE-Mail = " + getemail() + "\tPhone = "
				+ getPhone() + "\tAddresse = " + getAddresse()
				+ "\tYearofbirth = " + getYearofbirth() + dep + "\nGehalt = " + getSalary();
	}

	public void print() {
		System.out.println("MA Klasse");
	}

}
