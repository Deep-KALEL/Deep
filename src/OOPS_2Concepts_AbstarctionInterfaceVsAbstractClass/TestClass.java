package OOPS_2Concepts_AbstarctionInterfaceVsAbstractClass;

public class TestClass extends ICICIBank {

	public static void main(String[] args) {
		ICICIBank obj = new ICICIBank();
		obj.carLoan();
		obj.MutualFund();
		obj.credit();
		obj.homeLoan();
		obj.Insurance();

		USBank us = new ICICIBank();// we cannot create object of the Interface, this is reference variable of the
									// Interface, since class is implementing the class

		us.transfermoney();
		us.credit();
		us.debit();

		RBI rbi = new ICICIBank();// reference variable of the interface RBI since ICICIBank implementing the
									// interface.
		rbi.carLoan();
		rbi.educationLoan(); // object which was stored in the HEAP memory only allow the variable related to the RBI interface
		rbi.homeLoan();
		
	}

}
