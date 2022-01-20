package javaTrainingS3;
import java.util.*;
public class Chessboard {

	public static void main(String[] args) {


		// Assignment: Place the n-queens on the chessboard by taking input form the User
		//			   eg: User says row -> 1 and col -> 1 as input -> replace it with queen
		//			   a total of 4 inputs can be taken to place 4 queens in the chessboard
		//			   no queen can be placed in the same row again or same column again :)
		//
		
		char blackSquare = '\u25A1';	// 1
		char whiteSquare = '\u25A0';	// 0
		char queen = '\u2655';
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 4 positions where you want to place your queen");
			int row1 = sc.nextInt();
			int column1 = sc.nextInt();
			int row2 = sc.nextInt();
			int column2 = sc.nextInt();
			int row3 = sc.nextInt();
			int column3 = sc.nextInt();
			int row4 = sc.nextInt();
			int column4 = sc.nextInt();
			
			
			
			for(int i = 0;i < 8;i++)
			{
				
				//Checking the necessary condition for rows and column place of queen
				if((row1==row2||row1==row3||row1==row4||row2==row3||row2==row4||row3==row4)||(column1==column2||column1==column3||column1==column4||column2==column3||column2==column4||column3==column4))
				{
						System.out.println("More than one queens are not allowed in a single row or column");
						break;
				}
				for(int j = 0;j < 8;j++)
				{
					
					//If user enters valid inputs then for user's inputs replace the boxes with queens
					if((i == row1 && j == column1)||(i == row2 && j == column2)||(i == row3 && j == column3)||(i == row4 && j == column4))
					{
						System.out.print(queen+" ");
					}
					//Otherwise print boxes
					else if(i%2==0)
					{
						char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
						System.out.print(square+" ");
					}else {
						char square = (j % 2) == 0 ? blackSquare : whiteSquare;
						System.out.print(square+" ");
					}
				}
				System.out.println();
			}
			
		
		sc.close();
		
	}

}
