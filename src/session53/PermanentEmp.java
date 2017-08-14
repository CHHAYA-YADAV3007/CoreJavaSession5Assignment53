/**
 * PermanentEmp.java
 * Compiled on 14th Aug 2017
 */
package session53;
/**
 * 
 * This class will illustrate the inheritance by extending the abstract class Employee.
 * 
 * Parent Class Constructors can be invoked from Child class via super keyword,although Parent Class objects can't be instantiated.
 * 
 * A child will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */

//Child class declaration

public class PermanentEmp extends Employee {
	
//Member Variable declaration
	
	public int paid_leave;
	public int sick_leave;
	public int casual_leave ;
	public double basic ; 
	public double hra ;
	public double pf ;
	
//Child Class Parameterized Constructor Declaration
	
     public PermanentEmp(int id, String name,double basic, int paid_leave, int sick_leave, int casual_leave){
		
//Invocation of Parent Class Parameterized Constructor by passing arguments from child class
	
		super(id,name);              

//Initialization of Child class object
		
		this.basic = basic ;
		
		this.paid_leave = paid_leave ;
		
		this.sick_leave = sick_leave ;
		
		this.casual_leave = casual_leave ;
		
	}

//Method definition for Abstract Parent Class Method to print leave details

	public void print_leave_details(){
		
		System.out.println("Paid Leaves of Permanent Employee "+ empId + ": " + paid_leave);
		System.out.println("Sick Leaves of Permanent Employee "+ empId + ": " + sick_leave);
		System.out.println("Casual Leaves of Permanent Employee "+ empId + ": " + casual_leave);
		System.out.println("Total Leaves of Permanent Employee "+ empId + ": " + total_leaves);
		
		
		
	}
	
//Method definition for Calculation of total balance leaves post Leave deduction
	
	public void calculate_balance_leaves()  {
		
		total_leaves = paid_leave  + sick_leave + casual_leave ;

		
	}
	
//Code logic to determine whether Employee can avail the leaves or not
	
	public  boolean avail_leave(int no_of_leaves,char type_of_leave) {
		
// Availing CASUAL Leaves		
		if(type_of_leave == 'C' || type_of_leave == 'c'){
		   
			if (no_of_leaves <= casual_leave ){
				
				casual_leave = casual_leave - no_of_leaves ;
			
				return true;
			}
			else{
				System.out.println("Insufficient Casual Leaves !");
				return false;}
		}
//Availing SICK Leaves	
		
		else if(type_of_leave == 'S' || type_of_leave == 's'){
			
			if (no_of_leaves <= sick_leave ){
				
				sick_leave = sick_leave - no_of_leaves ;
				
				return true;
			}
			else{
				System.out.println("Insufficient Sick Leaves !");
				return false;}
		}
//Availing Paid Leaves		
		else if(type_of_leave == 'P' || type_of_leave == 'p'){
			
			if (no_of_leaves <= paid_leave ){
				
				paid_leave = paid_leave - no_of_leaves ;
				
				return true;
			}
			else {
				System.out.println("Insufficient Paid Leaves !");
				return false; }
		}
//Invalid Types of Leaves for Permanent Staff
		
		else
			System.out.println("Invalid User Input for Type of leaves !");
		    return false ;
	}
	
	
//Method Definition for Calculation of Total Salary and Display of the Salary Components
	
	public void calculate_salary(){
		
//Calculate Total Salary, HRA ,PF based on basic salary		
		
		hra = 0.50  * basic ;
		
		pf =  0.12  * basic ;
		
		total_salary = basic + hra - pf ;
			
//Display the Employee details and corresponding salary details
		
        System.out.println("Permanent Employee id :" + empId);
		
        System.out.println("Permanent Employee Name :" + empName);
        
		System.out.println("Gross Salary  :" + total_salary +"$");
		
		System.out.println("Basic of Gross Salary  :" + basic +"$");
		
		System.out.println("HRA of Gross Salary  :" + hra +"$");
		
		System.out.println("PF of Gross Salary  :" + pf +"$");
		
		
	}
	

}
