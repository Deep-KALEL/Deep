package java_Programs;

public class String_Programs {

	public static void main(String[] args) {
		StringReverse();

	}

	static void StringReverse() {
		String str = "Deepak is my Name";

		String[] str1 = str.split(" ");
		String reverse = " ";
		for (int i = str1.length - 1; i >= 0; i--) {
			reverse = reverse + str1[i] + " ";
		}
		System.out.println(reverse);
	}

}
