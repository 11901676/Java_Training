package javaTrainingS3;

import java.util.*;
public class UseCasesOfBitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		// Use Case 1(Bitwise &) => To check whether a number is even or odd
		// 1 => 01
		// 2 => 10
		// 3 => 11
		// 4 => 100
		// Even => LSB => 0
		// Odd => LSB => 1
		
		
		if((number1 & 1) == 1)
		{
			System.out.println(number1+" is odd");
		}
		else {
			System.out.println(number1+" is even");
		}
		
		if((number2 & 1) == 1)
		{
			System.out.println(number2+" is odd");
		}
		else {
			System.out.println(number2+" is even");
		}
		
		
		// Use Case 2(Bitwise xor)=> For swapping the values of two numbers
		// number1 = 8 =>1000
		// number2 = 15 =>1111
		number1 = number1 ^ number2; // 1000^1111 => 0111 = 7(number1 = number1-number2)
		number2 = number1 ^ number2; // 0111^1111 => 1000 = 8(number2 = number2-number1)
		number1 = number1 ^ number2; // 0111^1000 => 1111 = 15(number1 = number1-number2)
		
		System.out.println("After swapping the new values of numbers are "+number1+" "+number2);
		
		sc.close();

	}

}
