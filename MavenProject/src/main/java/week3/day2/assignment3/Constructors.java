package week3.day2.assignment3;

public class Constructors {
	
	
	/*to initialize the state of an object
	constuctor will not have any return type
	constuctor name and classname should be exeactly same
	1. Default 
	2. Parameterized or constructor overloading
	*/
	int empId;
	String empName;
	boolean empStatus;
	
	Constructors(){
		this(200, "Bala",true);
		System.out.println("Print Default Constructor");
	}
	
	public Constructors(int empId, String empName, boolean empStatus) {
		
		this.empId = empId;
		this.empName = empName;
		this.empStatus = empStatus;
			
		System.out.println("Parameterized Constructor");
	}
	

	public static void main(String[] args) {
		Constructors con = new Constructors();
		System.out.println(con.empId+ " "+con.empName+" " +con.empStatus);

	}

}
