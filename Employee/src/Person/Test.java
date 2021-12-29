package Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1 = new Developer("Andrias", "andri.as@hotmail.de", "0049175826934", "IT", "Frankfurt am Main", 1980, "IT_Entwickler_Proj");
		
		d1.setSalary(4000);
		
		System.out.println(d1.toString());
		System.out.println(d1.getSalary());

	}

}
