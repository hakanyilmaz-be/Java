package day03ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 If it rains I will cancel the trip
		 If you study hard you will get offer in a month
		*/

		if(5>3) {
			System.out.println("Okay");
		}
		
		//If "if condition" is true, "if body" runs, otherwise "if body" does not run
	    if(5%4==1) {
	    	System.out.println("It is true");
	    }
	    
	    //Ask user to enter an integer, if the integer is odd, print "odd" on the console, otherwise
	    //print "even" on the console.
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter an integer to check if it is odd or even");
	    int num = scan.nextInt();
	    
	    if(num % 2 == 0) {
	    	System.out.println("Even");
	    }
	    
	    if(num % 2 == 1) {
	    	System.out.println("Odd");
	    }
	    
	    //Ask user to enter the width and the length of a rectangle. If they are equal to each other, print
	    //"Square", otherwise print "Rectangle" on the console
	    System.out.println("Enter the width of the rectangle");
	    int width = scan.nextInt();
	    System.out.println("Enter the length of the rectangle");
	    int length = scan.nextInt();
	    
	    if(width==length) {
	    	System.out.println("Square");
	    }
	    if(width!=length) {
	    	System.out.println("Rectangle");
	    }
	    
	  //Ask user to enter the initial of a day name in uppercase. Print the days on the console
	  		//if their initial is matching with user's.
	  		// S ==> Sunday, Saturday        F ==> Friday
	  		System.out.println("Enter the initial of any day in uppercase");
	  		//If you want to get a char from user use the following syntax
	  		char initial = scan.next().charAt(0);
	  		
	  		if(initial == 'S') {
	  			System.out.println("Saturday, Sunday");
	  		}
	  		if(initial == 'M') {
	  			System.out.println("Monday");
	  		}
	  		if(initial == 'T') {
	  			System.out.println("Tuesday, Thursday");
	  		}
	  		if(initial == 'W') {
	  			System.out.println("Wednesday");
	  		}
	  		if(initial == 'F') {
	  			System.out.println("Friday");
	  		}
	    scan.close();
	}

}
