package JAVA_BASICS;

public class Functions_in_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions_in_JAVA obj = new Functions_in_JAVA();
		obj.str("SELENIUM");
		obj.Integer();
		System.out.println(obj.Integer());
		System.out.println(obj.division(50, 20));

	}

	public void test() {
		System.out.println("Inside the Test Method");
	}

	public int Integer() {
		String str = "123";
		int a = 10;
		int b = 20;
		int d = Integer.parseInt(str);
		System.out.println(d);

		System.out.println(b);
		return a;
	}

	public String str(String abc) {
		System.err.println(abc);
		return abc;
	}

	public double division(double a, double b) {
		System.out.println("Divisin Method");
		double d = a / b;
		return d;
	}
}
