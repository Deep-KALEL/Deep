package OOPS_1Concepts;

public class COnstructorConceptThisSuperKeyword {

	// Class variables
	String name;
	int age;

	public static void main(String[] args) {
		COnstructorConceptThisSuperKeyword obj = new COnstructorConceptThisSuperKeyword();
		COnstructorConceptThisSuperKeyword obj1 = new COnstructorConceptThisSuperKeyword(10);
		COnstructorConceptThisSuperKeyword obj2 = new COnstructorConceptThisSuperKeyword(10, 2);
		COnstructorConceptThisSuperKeyword obj3 = new COnstructorConceptThisSuperKeyword("DIPAK", 30);
		System.out.println(obj3.name);
		System.out.println(obj3.age);

	}
	

	// Constructor name is same as that of the class name. Constructor does not
	// return any value.
	//When object of class created there is a default constructor.(Means when object is created default constructor is called)
	//Parameterised constructor ---- when constructor is created and some parameters are passed to it then its called paramerised costructor.
	// parameters means passed the data types also called as signatures(it is combination of parameters and data types)

	public COnstructorConceptThisSuperKeyword() {// default constructor, 0 parameter constructor

		System.out.println("Default Constructor");
	}

	public COnstructorConceptThisSuperKeyword(int i) {
		System.out.println("1 Parameter constructor");
		System.out.println(i);
	}

	public COnstructorConceptThisSuperKeyword(int i, int j) {
		System.out.println("2 Parameter constructor");
		System.out.println(i + " " + j);
	}

	public COnstructorConceptThisSuperKeyword(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
