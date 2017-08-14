/**
 * Employee.java
 * Compiled on 14th Aug 2017
 */
package session53;
/**
 * 
 * This class will illustrate the abstract class Employee and its methods may or may not be abstracts. Constructor can be declared for this class but it cannot be instantiated.
 * 
 * A child will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */

//Parent Class  declared as public ABSTRACT
public abstract class Employee {

//Member Variable declaration
	
	public int empId ; 
	
	public String empName ;
	
	public int total_leaves ;
	
	public double total_salary ;
	
//First Parameterized Constructor Declaration 	
	public Employee(int id, String name){
		
		empId    = id ;
		
		empName  = name ;
		
	}
//Second Parameterized Constructor Declaration 	
	public Employee(int empId, String empName, int total_leaves){
		
		this.empId        = empId ;
		
		this.empName      = empName ;
		
		this.total_leaves = total_leaves ;
		
	}
	
//Third Parameterized Constructor Declaration 	
	public Employee(int empId, String empName, int total_leaves, double total_salary){
		
		this.empId         = empId ;
		
		this.empName       = empName ;
		
		this.total_leaves  = total_leaves ;
		
		this.total_salary  = total_salary ;
	}
	
//Declaration of Abstract methods of Employee Class which will be implemented by children classes
	
	public abstract void calculate_balance_leaves();
	
	public abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
		
	public abstract void calculate_salary() ;
	
}	
	
	
		
	


