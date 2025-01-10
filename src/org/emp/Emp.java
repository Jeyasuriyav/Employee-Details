package org.emp;

public class Emp {
	
	private void empID() {
		System.out.println("567");

	}
private void empId(String name,int salary) {
	System.out.println("Employee name is "+name+"\nEmployee salary is "+salary);
	

}
public static void main(String[] args) {
	Emp a=new Emp();
	a.empID();
a.empId("Raju", 200000);
}

}
