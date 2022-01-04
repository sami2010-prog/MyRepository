package Person;

import java.util.Iterator;

public class Test {
	static void p(Employee e) {
		e.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department depart_it = new Department(100, "IT");
		Department depart_ma = new Department(200, "Management");
		Department depart_log = new Department(300, "Logistik");

		System.out.println("******************Employee********************");
		Employee e1 = new Employee("Müller", "mueller@mail.com", "0125869543", "Hamburg", 1975, depart_ma);
		e1.setSalary(4000);
		System.out.println(e1.toString());

		Employee e2 = new Employee("Alex", "alex_x1@mail.com", "0125869543", "Hamburg", 1983, depart_ma);
		e2.setSalary(5200);
		System.out.println(e2.toString());

		System.out.println("******************Developer********************");
		Developer d1 = new Developer("Andrias", "andri.as@hotmail.de", "0049175826934", "Frankfurt am Main", 1980, depart_it,
				"IT_Entwickler_Proj");
		d1.setSalary(4000);
		d1.setBonus(250);
		System.out.println(d1.toString());

		Developer d2 = new Developer("Lina", "lina003@hotmail.de", "004917584442", "Frankfurt am Main", 1979, depart_it,
				"IT_Entwickler_Proj");
		d2.setSalary(4500);
		d2.setBonus(200);
		System.out.println(d2.toString());

		System.out.println("******************Mitarbeiter********************");
		Mitarbeiter m1 = new Mitarbeiter("Sandra", "sandra_007@hotmail.de", "004917528333", "Hamburg",
				1990,depart_log, 300);

		m1.setStundenlohn(10.0f);
		m1.setArbeitsstunden(150);
		System.out.println(m1.toString());
		
		System.out.println("******************Test********************");
		
		Employee [] empref = new Employee[] {new Employee(), new Developer(), new Mitarbeiter()};
		
		for (Employee emp : empref) {
			p(emp);
		}
//		empref[0] = new Employee();
//		empref[1] = new Developer();
//		empref[2] = new Mitarbeiter();
//		
//		for (int i = 0; i < empref.length; i++) {
//			empref[i].print();
//			}
		

	}

}
