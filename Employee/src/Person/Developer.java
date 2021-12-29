package Person;


public class Developer extends Employee {
	
	private String projectname;
	private float bonus;
	
	public Developer(String name, String emailadresse, String phone, String departement, String addresse,
			int yearofbirth, String projectname) {
		super(name, emailadresse, phone, departement, addresse,
			 yearofbirth);
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
		return "Mitarbeiter_Id = "+ id +  ", Name = " + getName() + ", Emailadresse = "
				+ getEmailadresse() + ", Phone = " + getPhone() + ", Departement = " + getDepartement()
				+ ", Addresse = " + getAddresse() + ", Yearofbirth = " + getYearofbirth() + "Projekt_Name = "+ getProjectname() + "\nGehalt = "+ getSalary();
	}

	

}
