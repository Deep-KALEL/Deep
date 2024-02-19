package JAVA_BASICS;

public class Array {
//Types of an array
	// 1. Static Array/One Dimensional Array
	// 2. Object Array--Stores data of different data types
	// 3. Two Dimensional Array
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//1__Static Array/ One dimensional array_________________________________________________
		// Array are used to store the data of similar data types
		// Lower bound index =0
		// length of array (n-1), n is the size of the array

		// Disadvantages of a Array
		// 1. Size is fixed ---static array --- to overcome this problem we use
		// collections---ArrayList, HashTable etc
		// 2. Stores only similar data types -- to overcome this problem we use Object
		// array.

		// 1. integer Array
		// static array stores data of a similar data types also called as a one
		// dimensional array
		int Array[] = new int[4];
		Array[0] = 2;
		Array[1] = 6;
		Array[2] = 8;
		Array[3] = 3;
		System.out.println("Length of array is : " + Array.length);
		for (int i = 0; i < Array.length; i++) {
			System.out.println("Array elements are :" + Array[i]);

			// 2. Double Array
			double arr[] = new double[3];
			arr[0] = 12.54;
			arr[1] = 10.09;
			arr[2] = 1.34;
			System.out.println(arr[2]);
			System.out.println("Length of an array is :" + arr.length);

			// 3. Character Array
			char rrr[] = new char[5];
			rrr[0] = 'a';
			rrr[1] = 'e';
			rrr[2] = 'x';
			rrr[3] = 'b';
			rrr[4] = '1';
			System.out.println("Lenght of Character array is :" + rrr.length);
			System.out.println(rrr[2]);

			// 4. Boolean Array
			boolean Barr[] = new boolean[2];
			Barr[0] = true;
			Barr[1] = false;
			System.out.println(Barr[1]);
			System.out.println("Length of Boolean Array is :" + Barr.length);

			// 5. String Array
			String S_arr[] = new String[4];
			S_arr[0] = "DIPAK";
			S_arr[1] = "DEEP";
			S_arr[2] = "KALEL";
			S_arr[3] = "ARUSHI";
			System.out.println("Length of a String array :" + S_arr.length);
			System.out.println(S_arr[1]);

			// 6. Object array
			// The array stores data of a different data types called object array.
			Object obj[] = new Object[7];
			obj[0] = "DIPAK";
			obj[1] = "Deep";
			obj[2] = 25;
			obj[3] = 'c';
			obj[4] = 12.43;
			obj[5] = 24 / 10 / 1993;
			obj[6] = "Jambhulani";

			System.out.println("Lenght of an Object array is : " + obj.length);
			System.out.println(obj[5]);
			for (int j = 0; j < obj.length; j++) {

				System.out.println("Elements of an Object array are :" + obj[j]);

				// 2__Two Dimensional Array-------
				// Array which has rows and columns called as a two dimensional array
				// Data is stored in rows and columns

				String abc[][] = new String[3][5];
				abc[0][0] = "DIPAK";
				abc[0][1] = "ANNA";
				abc[0][2] = "KALEL";
				abc[0][3] = "AT";
				abc[0][4] = "POST";
				abc[1][0] = "JAMBHULANI";
				abc[1][1] = "POST";
				abc[1][2] = "PULKOTI";
				abc[1][3] = "TALUKA";
				abc[1][4] = "MAN";
				abc[2][0] = "DIST";
				abc[2][1] = "SATARA";
				abc[2][2] = "STATE";
				abc[2][3] = "MAHARASHTRA";
				abc[2][4] = "INDIA";
				System.out.println(abc[0][3]);
				for (int a = 0; a < abc.length; a++) {
					for (int b = 0; b < abc[0].length; b++) {
						System.out.println(abc[a][b]);
						char x[][] = new char[1][2];
						Object xyz[][] = new Object[1][3];
					}
				}
			}
		}
	}

}
