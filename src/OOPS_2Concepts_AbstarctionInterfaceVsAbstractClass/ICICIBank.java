package OOPS_2Concepts_AbstarctionInterfaceVsAbstractClass;

public class ICICIBank implements USBank, RBI {

	// RBI Bank Interface
	@Override
	public void educationLoan() {

		System.out.println("ICICI--Education Loan");

	}

	@Override
	public void homeLoan() {
		System.out.println("ICICI--home Loan");

	}

	@Override
	public void carLoan() {
		System.out.println("ICICI--Car Loan");

	}

	// USBank Interface
	@Override
	public void debit() {
		System.out.println("ICICI--Debit");
	}

	@Override
	public void credit() {
		System.out.println("ICICI--Credit");
	}

	@Override
	public void transfermoney() {
		System.out.println("ICICI--transfer Money");
	}

	@Override
	public void trading() {
		System.out.println("ICICI--Trading");

	}

	// ICICI Bank Methods
	public void MutualFund() {
		System.out.println("ICICI Bank --Mutual fund");
	}

	public void Insurance() {
		System.out.println("ICICI Bank -- Insurance");
	}

}
