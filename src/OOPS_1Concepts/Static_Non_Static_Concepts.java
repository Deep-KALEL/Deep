package OOPS_1Concepts;

public class Static_Non_Static_Concepts {

	String name = "Tom";// non static global variable
	static int age = 20;// static global variables

	public static void main(String[] args) {
		sum();
		Static_Non_Static_Concepts con = new Static_Non_Static_Concepts();
		con.sendMail();
	}

	public void sendMail() {// non static method
		System.out.println("Send Mail Method");
		System.out.println(age);
		System.out.println(name);
	}

	public static void sum() {
		System.out.println("Sum Method");
		System.out.println(age);
		
	}
}
