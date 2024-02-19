package OOPS_1Concepts;

public class Method_Overloading {
// Same method name with different arguments called as method overloading.
	// Same method with same arguments used in another class called as method
	// overloading
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading mmm = new Method_Overloading();
		mmm.sum(10, 20);

	}

	public void sum(int i) {
		int sum = i;
		System.out.println(sum);

	}

	public void sum(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println(sum);

	}

	public void sum(double x, double y) {
		double sum;
		sum = x + y;
		System.out.println(sum);
	}

}
