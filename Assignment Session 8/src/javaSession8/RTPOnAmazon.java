package javaSession8;

import java.util.Scanner;
class Payment
{
	int amount;
	String paymentMethod;
	
	Payment()
	{
		System.out.println("[Payment] object constructed");
	}
	
	
	Payment(int amount, String paymentMethod) {
		this.amount = 10;
		this.paymentMethod = "Amazon pay balance";
		System.out.println("[Payment] object has constructed");
	}
	
	
	void showDetails(int amount,String paymentMethod)
	{
		System.out.println("You have selected "+paymentMethod+" as your payment method for payment of \u20b9"+amount);
		System.out.println("Thanks for shopping on Amazon");
	}
	
}


class UPI extends Payment
{
	int amount;
	String upiId;
	
	UPI(int amount, String upiId)
	{
		System.out.println("[UPI] object has been constructed");
		System.out.println("\u20b9"+amount+" has been successfully processed with "+upiId);
	}
	
	
	void showDetails(int amount,String paymentMethod)
	{
		System.out.println("You have selected "+paymentMethod+" as your payment method for payment of \u20b9"+amount);
		System.out.println("Thanks for shopping on Amazon");
	}
	
}



class AmazonPayBalance extends Payment
{
	
	int amount;
	int amazonPayBalance = 5000;
	
	AmazonPayBalance(int amount)
	{
		this.amount = amount;
		System.out.println("[Amazon Pay Balance] object constructed");
	}
	
	void showDetails(int amount,String paymentMethod)
	{
		if(amount<=amazonPayBalance)
		{
			System.out.println("You have selected "+paymentMethod+" as your payment method for payment of \u20b9"+amount);
			System.out.println("Your updated Amazon Pay Balance is "+(amazonPayBalance-amount));
			System.out.println("Thanks for shopping on Amazon");
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
	
	
}




class Card extends Payment
{
	int amount;
	String paymentMethod;
	
	Card()
	{
		System.out.println("[Card] object constructed");
	}
	
	
	Card(int amount, String paymentMetod)
	{
		this.amount = amount;
		this.paymentMethod = paymentMetod;
		System.out.println("[Card] object constructed");
	}
	
	
	void showDetails(int amount, String paymentMethod)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your card details");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter card number");
		String cardNumber = sc.nextLine();
		System.out.println("Enter expiry date of card");
		String expiry = sc.nextLine();
		System.out.println("Enter cvv of card");
		int cvv = sc.nextInt();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("Payment of \u20b9"+amount+" processed with "+paymentMethod+" card");
		System.out.println("Thanks for shopping on Amazon");
	}
	
}




class AmazonPaymentGateway
{
	static Payment payment(int type)
	{
		Scanner sc = new Scanner(System.in);
		Payment payment = null;
		// Taking input from user
		if(type==1)
		{
			System.out.println("Enter your UPI id");
			String upiId = sc.nextLine();
			
			
			payment = new UPI(2000,upiId);
			payment.showDetails(2000, "UPI");
		}
		
		else if(type==2)
		{
			payment = new AmazonPayBalance(2500);
			payment.showDetails(4700, "Amazon Pay Balance");
			
		}
		
		else if(type == 3)
		{
			payment = new Card(2600, "Card");
			payment.showDetails(3000, "Rupay");
		}
		
		else {
			System.out.println("Please enter a valid payment method");
		}
		
		return payment;
		
	}
}


public class RTPOnAmazon {
	public static void main(String[] args) {
		System.out.println("Enter the payment method");
		System.out.println("1. UPI    2. Amazon Pay Balance     3.Card");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		Payment payment = AmazonPaymentGateway.payment(input);
		scanner.close();
		
	}

}
