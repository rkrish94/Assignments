package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposits in Axis are reliable");
	}
	public static void main(String[] args) {

		AxisBank axisBankObject = new AxisBank();

		System.out.println("BankInfo methods - 'saving' and 'fixed' are inherited and called");
		axisBankObject.saving();
		axisBankObject.fixed();
		System.out.println("----------");

		System.out.println("BankInfo method - 'deposit' being overriden and called");
		axisBankObject.deposit();
	}

}
