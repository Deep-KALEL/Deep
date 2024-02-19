package JAVA_BASICS;

public class Memory_Management_In_JAVA {
	/*
	 * 1. Stack Memory_ All the local veriable, referance variable and methods are
	 * stored in the stack memory. It works in LIFO last in First out mechanism 2.
	 * HEAP Memory__ All the object referances are stored in the HEAP Memory. it has
	 * three memories a. EDEN space -- object referances are firstly stored in the
	 * EDEN Space. b. Survivor -1 __ After fullfllment of EDEN memory all the
	 * objects are referred to this memory c. Survivor-2__ After full space on
	 * Survivor-1 objects referances are referred to the survivor-2 space d. Garbage
	 * Collector __ Garbage collector automatically called when there is any no
	 * referred or null object and it destroy the object referance to manage empty
	 * space or to manage memory allocation 3.METASPACE __ all the static variables
	 * and methods are stored in the metaspace memory.
	 */

}
