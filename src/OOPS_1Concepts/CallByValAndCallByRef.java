package OOPS_1Concepts;

public class CallByValAndCallByRef {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swaping value of a :" + a);
		// b = (a + b) - b;

		System.out.println(b);
	}

}
