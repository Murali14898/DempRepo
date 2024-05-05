package Adapter;

public class PhonePe {
	public void currentBalance() {
		Bank b=new YesBankAdapter();
		System.out.println(b.balance());
	}
}
