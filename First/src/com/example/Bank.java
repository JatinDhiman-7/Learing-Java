package com.example;

class Bank {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void depositMoney(double money) {
		if (money<=0) {
			System.out.println("Invalid Deposit");
		} else {
		balance+=money;
	  }
	}
	
	public double withdrawMoney(double money) {
		if(money<=0) {
			System.out.println("Invalid Widthdrawal");
		}else if(balance>=money) {
			balance-=money;
		}else {
			money=balance;
			balance=0;
		}

		return money;
		
	}
	
	
	public Bank(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public static void main(String[] args) {
		
	}

}
