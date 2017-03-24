package ru.pflb.dev.inagumanov;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        
        try(Scanner scanner = new Scanner(System.in)) {
        	System.out.println("Provoide a non numeric String:");
        	
        	String input;
        	while(scanner.hasNextLine()) {
        		input = scanner.nextLine();
        		
        		if(input.equals("exit")) {
            		System.out.println("Closing the program");
            		break;
            	} else if(isNumeric(input)) {
            		System.out.println("Thr provided String is numeric!");
            	} else {
            		System.out.println("Thr provided String is valid.");        		
            	}
        	}

        }
    }

	private static boolean isNumeric(String nextLine) {
		
		return false;
	}
}
