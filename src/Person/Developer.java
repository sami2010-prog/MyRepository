package Person;

public class Developer extends Employee {

	private String projectname;
	private float bonus;

	public Developer() {

	}

	public Developer(String name, String email, String phone, String departement, String addresse, int yearofbirth,
			String projectname) {
		super(name, email, phone, departement, addresse, yearofbirth);
		this.projectname = projectname;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public float getSalary() {
		return salary + bonus;
	}

	@Override
	public String toString() {
		return "Mitarbeiter_Id = " + id + "\tName = " + getName() + "\tE-Mail = " + getemail() + "\tPhone = "
				+ getPhone() + "\tDepartement = " + getDepartement() + "\tAddresse = " + getAddresse()
				+ "\tYearofbirth = " + getYearofbirth() + "\tProjekt_Name = " + getProjectname() + "\nGehalt = "
				+ getSalary();
	}

	public void print() {
		System.out.println("Developer Klasse");
	}

}
