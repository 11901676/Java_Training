package javaTrainingS3;

import java.util.*;
public class BookACabWithTernaryOperator 
{

	public static void main(String[] args)
	{
		// Assignment: 1. Implement Ternary Operators if possible in above scenario
		// 			   2. Whenever a wrong promo code is applied, tell the user what is the right promo code 
		//			   3. implement a use case i.e. Book a Cab by taking OLA/Uber as a case study
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Ola!! \nEnter the base fare");
		double fare = sc.nextDouble();
		
		int FIRST = 111;  // Flat 50% off on ride
		int SECOND = 222; // For 300 or more Flat 30% off upto 100 on ride
		
		System.out.println("Enter the PromoCode");
		int promoCode = sc.nextInt();
		
		System.out.println("Is it your first ride?\nif yes then type true otherwise type false");
		boolean firstRide = sc.nextBoolean();
		
		
		if(firstRide)
		{
			double final_fare = (promoCode==FIRST) ? (fare - fare * 0.5) : fare;
			String info = (final_fare!=fare) ? "Voila! You got your discount" : "Oops!! You can try Promocode 111 for your ride";
			System.out.println(info+"\nPlease Pay: "+final_fare);
			
		}
		else if(promoCode == 222 && fare>=300)
		{
			double final_fare = (promoCode==SECOND) ? (fare - fare * 0.3) : fare;
			String info = (final_fare!=fare) ? "Voila! You got your discount" : "Oops!! You can try Promocode 222 for your ride";
			System.out.println(info+"\nPlease Pay: "+final_fare);
			
		}
		else
		{
			System.out.println("Invalid PromoCode try 111 for your first ride and 222 if you have travelled with us before");
			System.out.println("Please Pay :"+fare);
		}
		
		
		sc.close();
		
	}
}
