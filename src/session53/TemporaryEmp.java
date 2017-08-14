/**
 * TemporaryEmp.java
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

public class TemporaryEmp extends Employee{
	
//Member Variables declaration	
	
	private int noOfLeavesAvailed ;
	
	private float base ;
	
	
//Parameterized Constructor Declaration
	
    public TemporaryEmp(int id, String name,int total_leaves  ){
		
//Invocation of Parent Class Parameterized Constructor by passing arguments from child class
    	
		super(id,name,total_leaves);
		
//Initialization of Child class object		
		
		noOfLeavesAvailed = 0 ;
		
		base = 10000.8f ;
				
	}

//Method definition for calculation and display of Total Leaves left post earned leaves deduction
    
	public void calculate_balance_leaves(){
		
		total_leaves = total_leaves - noOfLeavesAvailed  ;
		
		System.out.println("Total Earned Leaves of Temporary Employee "+ empId + ": " + total_leaves);
		
	}
	
//Code logic to determine whether the Temporary Employee can avail the leaves or not.
	
	public boolean avail_leave(int no_of_leaves, char type_of_leave){
		
		noOfLeavesAvailed = no_of_leaves ;
		
//Check whether the leaves are earned leaves or not		
		
		if(type_of_leave == 'E' || type_of_leave == 'e'){
			   
			   if (noOfLeavesAvailed <= total_leaves ){
			       System.out.println("Earned Leaves can be availed by Temporary Staff !");
				   return true;
			   }
			   else{
				   System.out.println("Insufficient Earned Leaves ! Cannot be availed by Temporary Staff !");
				   return false;
			    }
		

		}
		else
			System.out.println("Invalid User Input provided for Earned leaves ! Temporary Staff can have only Earned Leaves ! ");
		    return false ;
		
		
	}
	
//Method definition to calculate and display the Temporary Staff Salary
	
	public void calculate_salary(){
		
		
//Calculation of total salary,hra & pf based on base salary
		
		double hra   = 0.30  * base ;
		
		double pf    =  0.10  * base ;
		
		total_salary = base + hra - pf ;
		
//display the employee details along with salary details		
		
	    System.out.println("Temporary Employee id :" + empId);
			
	    System.out.println("Temporary Employee Name :" + empName);
	        
        System.out.println("Gross Salary  :" + (float) total_salary +"$");
		

	}

}
