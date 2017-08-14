/**
 * MainClass.java
 * Compiled on 14th Aug 2017
 */
package session53;
/**
 * 
 * This class will illustrate the MainClass class for instantiation of Children Class Objects
 * 
 * @author Chhaya yadav
 *
 */

public class MainClass {

//Main Method definition for MainClass class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ae ;
		
		System.out.println("_______________________DETAILS OF FIRST EMPLOYEE_________________________ ");
		
//Instantiation of first object of Child class PermanentEmp who is a Permanent Employee in organization		

		PermanentEmp pe1 = new PermanentEmp(111,"CHHAYA",12000,5,4,3);
		
		pe1.calculate_salary();
		
	    ae = pe1.avail_leave(6,'P');
	    
	    if(ae){ 
	    	
	    	pe1.calculate_balance_leaves();
	    	pe1.print_leave_details();
	    }
	    
	    System.out.println("_______________________DETAILS OF SECOND EMPLOYEE_________________________ ");
	    
//Instantiation of second object of Child class PermanentEmp who is a Permanent Employee in organization	    

		PermanentEmp pe2 = new PermanentEmp(112,"MANOJ",40000,8,7,9);
		
		pe2.calculate_salary();
		
	    
	    
	    if(pe2.avail_leave(6,'T')){ 
	    	
	    	pe2.calculate_balance_leaves();
	    	pe2.print_leave_details();
	    }
   
	    System.out.println("_______________________DETAILS OF THIRD EMPLOYEE_________________________ ");
	    
//Instantiation of third object of Child class PermanentEmp who is a Permanent Employee in organization		
	    
		PermanentEmp pe3 = new PermanentEmp(114,"MANOJ YADAV",40000,8,7,9);
		
		pe3.calculate_salary();
		
	    if(pe3.avail_leave(6,'C')){ 
	    	
	    	pe3.calculate_balance_leaves();
	    	pe3.print_leave_details();
	    }

	    System.out.println("_______________________DETAILS OF FOURTH EMPLOYEE_________________________ ");
	    
//Instantiation of first object of Child class TemporaryEmp who is a Temporary Employee in organization		    
	    
	    TemporaryEmp te1 = new TemporaryEmp(222,"AKSHAY",6) ;
	    
	    te1.calculate_salary();
	    
	    if(te1.avail_leave(2,'E')){
	    	    	te1.calculate_balance_leaves();
	    
	    }
	    
		
	    System.out.println("_______________________DETAILS OF FIFTH EMPLOYEE_________________________ ");
	    
//Instantiation of second object of Child class TemporaryEmp who is a Temporary Employee in organization
	    
	    TemporaryEmp te2 = new TemporaryEmp(333,"AKSHAY BAJAJ ",6) ;
	    
	    te2.calculate_salary();
	    
	    if(te2.avail_leave(7,'E')){
	    	    	te2.calculate_balance_leaves();
	    
	    }
	    
	
			
	}

}
