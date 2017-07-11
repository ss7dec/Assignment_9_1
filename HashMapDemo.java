//Assignment 9.1

//Create an application having a Generic HashMap with Empcode as key and EmpName as value.
//Expected Output
//Display only EmpNames as output.



package assignment_9_1;
import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.

/*
 * This Assignment helped me to master the concepts of HashMap and its use.
 */
public class HashMapDemo {
	
		public static void main(String[] args)        //main function declaration. and because it is static, program execution starts from main function.
		{
			HashMap<Integer,String> employeeDetails = new HashMap<Integer,String>();
			        //Creating HashMap to store the Employee details to store Integer as a code and String as a name.
			
			//Details of first Employee.
			Integer keyCode=new Integer(1);       //Creating first key or employee code.
			String valueName="Sameer";          //Creating String to map with the key.
			employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
			
			//Details of second Employee.
	        keyCode=new Integer(2);       //Creating second key or employee code.
		    valueName="Tejeswara Bonda";          //Creating String to map with the key.
		    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
		    
		  //Details of third Employee.
	        keyCode=new Integer(3);       //Creating third key or employee code.
		    valueName="Lumjing";          //Creating String to map with the key.
		    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
		    
		  //Details of fourth Employee.
	        keyCode=new Integer(4);       //Creating fourth key or employee code.
		    valueName="Mohammed Ashutosh";          //Creating String to map with the key.
		    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
		    
		  //Details of fifth Employee.
	        keyCode=new Integer(5);       //Creating fifth key or employee code.
		    valueName="Sheetal Tamta";          //Creating String to map with the key.
		    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
		    
		  //Details of sixth Employee.
	        keyCode=new Integer(6);       //Creating fifth key or employee code.
		    valueName="Naveen Kumar Reddy";          //Creating String to map with the key.
		    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
		    
		  //Details of seventh Employee.
	        keyCode=new Integer(7);       //Creating fifth key or employee code.
		    valueName="Harshada Chavan";          //Creating String to map with the key.
		    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
		    
		    
		    //Details of 7 Employees are added in HashMap.
		    
		    Iterator<Integer> listReader=employeeDetails.keySet().iterator();
		              //Iterator of type Integer and getting keySet() to iterate through the list.
		    
		    while(listReader.hasNext())        //While loop to iterate through the loop.
		    {
		    	Integer codeEncrypt = (Integer) listReader.next();      //Getting the key for the specific value.
		    	
		    	System.out.println("Employee ID is "+codeEncrypt.toString()+" and Name of Employee is "+employeeDetails.get(codeEncrypt));
		    	                 //Printing Statement.
		    }
		    
		}    //End of main function.


}	
