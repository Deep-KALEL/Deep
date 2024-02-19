package OOPS_2Concepts_AbstarctionInterfaceVsAbstractClass;

public interface RBI {

	// in interface no main method allowed. there is no point to create main method,
	// only method declaration
	// method prototype
	// can not create the object of the interface
	// no static methods
	// but interface variables are static in nature by default.
	//100% abstraction -- all these process called as abstraction.
	// Abstraction means method body declaration. No implementation code.
	// With interface 100% abstraction achieved.

	public void educationLoan();

	public void homeLoan();

	public void carLoan();

	

}
