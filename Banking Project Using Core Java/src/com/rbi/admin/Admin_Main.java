package com.rbi.admin;

import java.util.Scanner;

import com.rbi.operation.Operation;

public class Admin_Main
{
	
	public static void main(String[] args) {
		
		Operation op=new Operation();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
         System.out.println("Select your Choice");
         System.out.println("1.Create New Account.\n2.Show Account Details.");
       int x=sc.nextInt();
       
       switch (x) 
       {
	     case 1: op.createAccount();
		
		 break;
		
	    case 2:op.showAccount();
		   
		break;

	    default:
		break;
	   }
	
   
   }
	
	
	}
}
