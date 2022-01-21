package javaTrainingS3;

public class BitwiseOperatorAssisgnment {

	public static void main(String[] args) {

		// Signed right shift(Positive)
		// 8 >> 3
		// 0 0 0 0  1 0 0 0
		// >> 3
		// _ _ _ 0  0 0 0 1
		// 0 0 0 0  0 0 0 1  -> 1(Signed shift => fill the blanks with 0 as number is positive)
		
		System.out.println("8 >> 3 is: "+(8>>3));
				
		//Signed right shift(Negative)
		// -8 >> 3
		// 8 => 0 0 0 0  1 0 0 0
		//      1 1 1 1  0 1 1 1
		//                    +1
		//      1 1 1 1  1 0 0 0 => -8
		//      _ _ _ 1  1 1 1 1 => -8 >> 3
		//      1 1 1 1  1 1 1 1(Signed shift => fill the blanks with 1 to maintain the number as negative)
		//      0 0 0 0  0 0 0 0
	    //                   + 1
		//      0 0 0 0  0 0 0 1 => -1
				
		System.out.println("-8 >> 3 is: "+(-8>>3));
		
		
		
		// Signed left shift(Positive)
		// 8 << 3
		// 8 => 0 0 0 0  1 0 0 0
		//      0 1 0 0  0 _ _ _
		//      0 1 0 0  0 0 0 0 => 64
		System.out.println("8 << 3 is: "+(8<<3));
		
		
		// Signed left shift(Negative)
	    // -8 << 3
		// 8 => 0 0 0 0  1 0 0 0
		//      1 1 1 1  0 1 1 1
		//                   + 1
		//      1 1 1 1  1 0 0 0 => -8
		//      1 1 0 0  0 _ _ _
		//      1 1 0 0  0 0 0 0 => -8 << 3
		//      0 0 1 1  1 1 1 1
		//                   + 1
		//      0 1 0 0  0 0 0 0 => -64
		
		System.out.println("-8 << 3 is: "+(-8<<3));
		
		
		
		//Unsigned Right Shift(Positive)  =>  Same as Signed right shift(Positive)
		//Unsigned Right Shift(Negative)
		// -8 >>> 3
		// 8 => 0 0 0 0  1 0 0 0
		//      1 1 1 1  0 1 1 1
		//                   + 1
		//      1 1 1 1  1 0 0 0 => -8
		//      _ _ _ 1  1 1 1 1
		//      0 0 0 1  1 1 1 1 => -8>>>3 (Unsigned => always fill blanks with 0 irrespective of number sign)
		//      1 1 1 0  0 0 0 0
		//                   + 1
		//      1 1 1 0  0 0 0 1
		// Output will be as the size of an integer literal(32 bits)
		//      1 1 1 1   1 1 1 1   1 1 1 1  1 1 1 1  1 1 1 1  1 1 1 1  1 1 1 0  0 0 0 1 => 536870911
		
		System.out.println("-8 >>> 3 is: "+(-8>>>3));
		
		

	}

}
