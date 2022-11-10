package com.rbi.operation;

import java.util.Scanner;

import com.rbi.model.Account;

public class Operation {
	
	Account ac=new Account();
	Scanner sc=new Scanner(System.in);
	
	public void createAccount()
	{
		System.out.println("Enter the Customer Name");
		ac.setCostumerName(sc.nextLine()); 
		
		System.out.println("Enter the costumer Id");
		ac.setCostumerId(sc.nextInt());
		
		System.out.println("Enter the Customer PAN no");
		ac.setPanNo(sc.next());
		
		System.out.println("Enter trhe customer Mobile No");
		ac.setMoNo(sc.next());
		
		System.out.println("Enter the Customer Address");
		ac.setAddress(sc.next());
		
		System.out.println("Enter the Password");
		ac.setPassword(sc.next());
		
		while(true)
		 {
			System.out.println("Enter the Deposit Money");
	    	double money=sc.nextDouble();
	    	 if(money>=500)
	    	 {
	    		 ac.setMoney(money);
	    		 break;
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Deposited money must be Greater than or Equel to 500");
	    	 }
		 }
		
	     	System.out.println("Account Created Successfully");	
		
	 }
	
	
	public void showAccount()
	{
		System.out.println("To check your Account Details Please Insert Bellow Information");
		while(true)
		{
		System.out.println("Enter PAN Number");
		String pan=sc.next();
		
		if(ac.getPanNo().equals(pan) )
		{
			System.out.println(ac.getCostumerId());
			System.out.println(ac.getCostumerName());
			System.out.println(ac.getAddress());
			System.out.println(ac.getMoNo());
			System.out.println(ac.getPassword());
			System.out.println(ac.getPanNo());
			System.out.println(ac.getMoney());
			break;
		}
		else if(pan==null)
		{
			System.out.println("Your Are not Exesting Customer ,Please Create the Account");
		}
		else 
		{
			System.out.println("Please Enter the currect PAN number");
		}
	  }
	}
}
