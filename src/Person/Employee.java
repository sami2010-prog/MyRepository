package Person;

public class Employee {

	protected int id;
	protected String name;
	protected String email;
	protected String phone;
	protected String departement;
	protected String addresse;
	protected int yearofbirth;
	protected float salary;
	protected static int count = 1;

	public Employee() {
		// System.out.println("No Parameter Constructor");
	}

	public Employee(String name, String email, String phone, String departement, String addresse, int yearofbirth) {

		this.name = name;
		this.email = email;
		this.phone = phone;
		this.departement = departement;
		this.addresse = addresse;
		this.yearofbirth = yearofbirth;
		this.id = count;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public int getYearofbirth() {
		return yearofbirth;
	}

	public void setYearofbirth(int yearofbirth) {
		this.yearofbirth = yearofbirth;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Mitarbeiter_Id = " + id + "\tName = " + getName() + "\tE-Mail = " + getemail() + "\tPhone = "
				+ getPhone() + "\tDepartement = " + getDepartement() + "\tAddresse = " + getAddresse()
				+ "\tYearofbirth = " + getYearofbirth() + "\nGehalt = " + getSalary();
	}

	public void print() {
		System.out.println("Employee Klasse");
	}

}
