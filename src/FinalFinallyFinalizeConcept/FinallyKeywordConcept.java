package FinalFinallyFinalizeConcept;

public class FinallyKeywordConcept {
	// 1] Final is a keyword -- it used to declare method , variable or class as a
	// final. If variable is declared as final its value cannot be changed, method
	// declared as final it cannot be over-ridden in the next class, and if class
	// declared as final that class prevents from inheritance.
	// 2] Finally is a block-- it is used after the try catch block
	// 3] Finalize is a method -- which acts as a garbage collector
	public static void main(String[] args) {

	}

	public void test1() {
		try {
			System.out.println("Inside the test 1");
		} catch (Exception e) {
			System.out.println("Inside the catch block of test 1");
		} finally {
			System.out.println("Inside the Finally Block, It will execute always irrespective of the exception");
		}
	}

}
