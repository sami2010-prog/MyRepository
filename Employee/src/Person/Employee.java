package Person;


public class Employee {

	protected String name;
	protected String emailadresse;
	protected String phone;
	protected String departement;
	protected String addresse;
	protected int yearofbirth;
	protected float salary;

	public Employee() {
		System.out.println("No Parameter Constructor");
	}

	public Employee(String name, String emailadresse, String phone, String departement, String addresse,
			int yearofbirth) {
		this.name = name;
		this.emailadresse = emailadresse;
		this.phone = phone;
		this.departement = departement;
		this.addresse = addresse;
		this.yearofbirth = yearofbirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailadresse() {
		return emailadresse;
	}

	public void setEmailadresse(String emailadresse) {
		this.emailadresse = emailadresse;
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

}
