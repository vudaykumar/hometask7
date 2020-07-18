package com.epam.design_patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Structural Design Pattern - Singleton Design Pattern
    	/* Having only single instance of a class at any given point of time */
    	Singleton single = Singleton.getInstance();
    	
    	System.out.println("Singleton ID = " + single.getId());
    	System.out.println("Singleton Data = " + single.getData());
    	
    	System.out.println();
    	
    	//Behavioral Design Pattern - Template Design Pattern
    	/* Different classes have different functionalities but may work in similar manner */
    	
    	CSE cse_students = new CSE();	//extends Template class
    	ECE ece_students = new ECE();	//extends Template class
    	
    	System.out.println("CSE Students");
    	cse_students.academics();
    	
    	System.out.println("ECE Students");
    	ece_students.academics();
    	
    }
}
