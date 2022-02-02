package com.bridgelabz;


 class Bank
 {
	 int getRateofInterest()
	 {
		 return 0;
	 }
 }
 class SBI extends Bank
 {
	 int getRateofInterest() {
		 return 8;
	 }
 }
 class HDFC extends Bank
 {
	int getRateofInterest() {
		return 5;
	}
 }
 class YES extends Bank
 {
	 int getRateofInterest() {
		 return 9;
	 }
 }
 public class MethodOverrideConcept
 {

 	public static void main(String[] args) 
 	{
 		Bank sbibank = new SBI();
 		Bank hdfcbank = new HDFC();
 		Bank yesbank = new YES();
 		System.out.println("SBI Bank Rate of Interest is: " + sbibank.getRateofInterest());
 		System.out.println("HDFC Bank Rate of Interest is: " + hdfcbank.getRateofInterest());
 		System.out.println("Yes Bank Rate of Interest is: " + yesbank.getRateofInterest());
 	}

 }