package Person;


public class Developer extends Employee {
	
	private String projectname;
	
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

	@Override
	public String toString() {
		return "Developer [" + "Name = " + getName() + ", Emailadresse = "
				+ getEmailadresse() + ", Phone = " + getPhone() + ", Departement = " + getDepartement()
				+ ", Addresse = " + getAddresse() + ", Yearofbirth = " + getYearofbirth() + ", Projectname = " + getProjectname() + "]" ;
	}
	
	// 10 % Bonus auf Mitarbeiter gehalt
	public void setSalary(float salary) {
		this.salary = salary + (salary * 10/100);
	}

	
	

}
