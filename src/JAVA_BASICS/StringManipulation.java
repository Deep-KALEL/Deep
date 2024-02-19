package JAVA_BASICS;

import javax.swing.Action;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Selenium tool available free in the market";
		String str1 = "JAVA";
		System.out.println("Length of the string :" + str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.substring(5));
		System.out.println(str.substring(9, 15));
		System.out.println(str.replace(" ", ""));
		System.out.println(str.contains(str1));
		System.out.println(str.replaceAll("Selenium", str1));

	}

}
