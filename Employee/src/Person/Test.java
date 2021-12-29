package Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******************Employee********************");
		Employee e1 = new Employee("Müller", "mueller@mail.com", "0125869543", "Management", "Hamburg", 1975);

		e1.setSalary(4000);
		System.out.println(e1.toString());

		System.out.println("******************Developer********************");
		Developer d1 = new Developer("Andrias", "andri.as@hotmail.de", "0049175826934", "IT", "Frankfurt am Main", 1980,
				"IT_Entwickler_Proj");

		d1.setSalary(4000);
		d1.setBonus(250);
		System.out.println(d1.toString());

		System.out.println("******************Mitarbeiter********************");
		Mitarbeiter m1 = new Mitarbeiter("Sandra", "sandra_007@hotmail.de", "004917528333", "Produktion", "Hamburg", 1990, 300);

		m1.setStundenlohn(10.0f);
		m1.setArbeitsstunden(150);
		System.out.println(m1.toString());
	}

}
