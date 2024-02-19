package OOPS_1Concepts;

public class Wraper_Classes_in_JAVA {
	// Data Conversion using wrapper class in java
	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);// string concatination.
		// DATA conversion from string to integer

		// Many wrapper classes are there in java used for data conversion.
//		1. Integer
//		2. Double
//		3. Character
//		4. Boolean

		// Data Conversion of string to integer
		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// Data conversion of string to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);

		// Data conversion from string to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// Integer to String conversion
		int j = 200;
		System.out.println(j + 20);

		String s = String.valueOf(j);
		System.out.println("Integer to String Conversion_String Concatination :" + s);

		// Number Format exception

		String str = "100A";
		char c[] = str.toCharArray();

		int a = Integer.parseInt(str);
		System.out.println(a);

	}

}
