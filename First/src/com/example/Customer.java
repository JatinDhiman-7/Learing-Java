package com.example;

public class Customer {

	public static void main(String[] args) {
		Bank bankaccount=new Bank("12123212312","Jatin");
		bankaccount.depositMoney(100);
		System.out.println(bankaccount.withdrawMoney(200));
		bankaccount.depositMoney(-40);
		bankaccount.withdrawMoney(0);
		}

}
 