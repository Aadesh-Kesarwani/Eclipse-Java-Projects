package com.rockpaper_CWH_08;
//import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	 public static void main(String args[])
	    {
//	        // define the range
//	        int max = 3;
//	        int min = 1;
//	        int range = max - min + 1;
//	 
//	        // generate random numbers within 1 to 10
//	        for (int i = 0; i < 10; i++) {
//	            int rand = (int)(Math.random() * range) + min;
//	           
//	            // Output is different everytime this code is executed
//	            System.out.println(rand);
//	        }
		 
//				 double rand = Math.random();
//				 System.out.println(rand);
		 	System.out.println("Press 1 for Stone \n 2 for Paper \n 3 for Scissor");
		 	
		 	Scanner sc = new Scanner(System.in);
		 	int userInput = sc.nextInt();
		 	
		 	
		 	Random random = new Random();

	        // Generate a random number between 1 and 3
	        int randomNumber = random.nextInt(3) + 1;

	        // Print the random number
	      //  System.out.println("Random number between 1 and 3: " + randomNumber);
	        if (randomNumber == 1) {
	        	System.out.println("opponent chooses Stone");
	        }else if (randomNumber == 2) {
	        	System.out.println("opponent chooses Paper");
	        }else {
	        	System.out.println("opponent chooses Scissor");
	        }
	        
	        if (userInput==1) {
	        	if (randomNumber == 1) {
	        		System.out.println("Match is Tie");
	        	}else if (randomNumber == 2 ) {
	        		System.out.println("opponent wins");
	        	}else {
	        		System.out.println("you win");
	        	}
		 	}else if (userInput==2) {
		 		switch (randomNumber) {
		 			case 1:
		 				System.out.println("you win");
		 				break;
		 			
		 			case 2:
		 				System.out.println("tie");
		 				break;
		 			
		 			case 3:
		 				System.out.println("opponent wins");
		 				break;
		 		}
		 	}else if (userInput==3) {
		 		switch (randomNumber) {
	 			case 1:
	 				System.out.println("opponent wins");
	 				break;
	 			
	 			case 2:
	 				System.out.println("you win");
	 				break;
	 			
	 			case 3:
	 				System.out.println("tie");
		 			break;
		 		}
		 	}else {
	        System.out.println("Please enter a valid number");
		 	}
	        
	    }
	}
