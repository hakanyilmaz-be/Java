package day03ifstatement;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
	
		
		/*
		 Modulus: Modulus returns the remainder in division operation
		          Modulus operator sign is %
		*/
		
		int f = 13;
		int g = 5;
		System.out.println(f % g);//3
		
		
		
		System.out.println(13 % 5);
		System.out.println(241 % 7);
		
		int a = 12;
		int b = 13;
		int c = 14;
		
	    System.out.println(a * b % (b + c)); //?
	    
	    //Check if a number is odd or even. 
	    //odd numbers: Give 1 as remainder when you divide them by 2
	    //even numbers: Give 0 as remainder when you divide them by 2 
	    
	    int d = 2345324;
	    System.out.println(d % 2);//if the result is 0,  I understand it is even
	    
	    int e = 12345;
	    System.out.println(e % 2);//if the result is 1,  I understand it is odd

	  //Ask user to enter 2 integers. Print the reminder on the console if you divide
	  		//the integer by the second.
	  		Scanner scan = new Scanner(System.in);
	  		System.out.println("Enter 2 integers:");
	  		int t = scan.nextInt();
	  		int k = scan.nextInt();
	  		System.out.println("Remainder: " + t % k);
	  		
	  		//Ask user to enter an integer and check if it is "odd" or "even"
	  		//Note:When you divide an integer by 2, if the remainder is 1 then the integer is odd.
	  		//     When you divide an integer by 2, if the remainder is 0 then the integer is even.
	  		System.out.println("Enter an integer");
	  		int l = scan.nextInt();
	  		
	  		System.out.println("If the remainder is 0 the integer is even otherwise ir is odd: " + l % 2);
	 
	  		scan.close();
	    
	    
	    
	    
	    
	}

}
