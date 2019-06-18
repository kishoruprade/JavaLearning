package control.statements;

import java.util.Scanner;

public class IfCondition {
	
	public static int age;

	public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   System.out.print("Enter the age of the person: ");
	    age = scn.nextInt();
	   
	    if(age>=18){
	    	System.out.println("He is an adult.");
	    }else {
	    System.out.println("Not an adult");}
	}

}
