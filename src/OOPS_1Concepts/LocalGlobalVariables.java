package OOPS_1Concepts;

public class LocalGlobalVariables {
	// 1. Global Variable__ variables which are declared at the class known as
	// Global
	// variables. To access these variables inside the main method required to
	// create object of the class.
	// 2. Local Variables __ The Variables which are declared as soon as the method
	// ends or inside the method called as local variables. The scope of the local
	// variables is within the method
	static int b = 10;
	int a = 20;
	String s = "DIPAK";

	public static void main(String[] args) {
		String str="DIPAK KALEL";
		System.out.println(b);
		LocalGlobalVariables variable = new LocalGlobalVariables();
		variable.a = 10;
		System.out.println(variable.s);

	}

}
