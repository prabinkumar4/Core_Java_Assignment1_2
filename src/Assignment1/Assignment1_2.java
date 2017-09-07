package Assignment1;

import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;    // variable declaration
	
		Scanner sc= new Scanner(System.in);          // Scanner class initiation
		
		System.out.print("Enter the value of a: ");  // print "Enter the vale of a:"
		
	    a=sc.nextInt();                               //accepts value of variable a from user
	    
	    System.out.print("Enter the value of b: ");   // print "Enter the vale of b:"
	    
	    b=sc.nextInt();                                //accepts value of variable b from user
	
	
	   c=a-(-b);                                       //Definition of sum of a and b 
	   
	   System.out.print("The sum of a and b is "  +c); // print "The sum of a and b is:" value of c
	   sc.close(); 
	}
}
