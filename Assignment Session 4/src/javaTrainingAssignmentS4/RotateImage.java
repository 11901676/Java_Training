package javaTrainingAssignmentS4;


//Assignment: 1. Rotate the Image to Right -> 90 degrees
//			   2. Rotate the Image to Left  -> 180 degrees
//			   3. GrayScale the image
//					for a pixel sum up all values and divide by 3
//				    eg: for pixel1 -> 12+45+78/3 -> 45
//					pixel1 = {45, 45, 45}
//					do it for all pixels on the image
public class RotateImage 
{
	
	public static int[][][] rotateImage90(int[][][] image)
	{
		// Copying the values of image into tempImage so that there will not be any effect of operations in 
		// whatever we will do in our original image
		int tempImage[][][] = new int[image.length][image.length][image.length];
		
		for(int i = 0;i<tempImage.length;i++)
		{
			for(int j = 0;j<tempImage[i].length;j++)
			{
				
				//1st row => Last column
				if(i==0)
				{
					tempImage[j][2]=image[0][j];
				}
				
				//Last row => First column
				else if(i==1)
				{
					tempImage[j][0]=image[2][j];
				}
				
				//Middle row => Middle Column
				else
				{
					tempImage[j][1]=image[1][j];
				}
			}
		}
		return tempImage;
	}
	
	
	public static int[][][] rotateImage180(int[][][] image)
	{
		// Copying the values of image into tempImage so that there will not be any effect of operations in 
		// whatever we will do in our original image
		int tempImage[][][] = new int[image.length][image.length][image.length];
		
		for(int i = 0;i<tempImage.length;i++)
		{
			for(int j = 0;j<tempImage[i].length;j++)
			{
				
				//1st column => Last row
				if(i==0)
				{
					tempImage[2][j]=image[j][0];
				}
				
				//Last column => First row
				else if(i==1)
				{
					tempImage[0][j]=image[j][2];
				}
				
				//Middle column => Middle row
				else
				{
					tempImage[1][j]=image[j][1];
				}
			}
		}
		return tempImage;
	}
	
	
	public static int[][][] grayscaleImage(int[][][] image)
	{
		// Copying the values of image into tempImage so that there will not be any effect of operations in 
		// whatever we will do in our original image
		int tempImage[][][] = new int[image.length][image.length][image.length];
		
		for(int i = 0;i<image.length; i++)
		{
			int grayscale = 0;
			for(int j = 0;j<image[i].length;j++)
			{
				int sum = 0;
				
				//Adding the values of every pixel in our original image
				for(int k = 0; k<image[i][j].length;k++)
				{
					sum = sum + image[i][j][k];
				}
				// Calculating the average of pixels values of original image
				grayscale = sum/3;
				
				
				// Updating the pixel values in tempImage
				for(int k = 0; k<image[i][j].length;k++)
				{
					tempImage[i][j][k]=grayscale;
				}
			}
		}
		
		return tempImage;
	}
	
	public static void main(String[] args)
	{
		
		int[] pixel1 = {12, 45, 78};
	 	int[] pixel2 = {34, 12, 90};
	 	int[] pixel3 = {0, 234, 56};
	 	
	 	int[] pixel4 = {12, 45, 78};
	 	int[] pixel5 = {12, 45, 78};
	 	int[] pixel6 = {12, 45, 78};
	 	
	 	int[] pixel7 = {12, 45, 78};
	 	int[] pixel8 = {12, 45, 78};
	 	int[] pixel9 = {12, 45, 78};
	 	
	 	// Representation of an Image
	 	int[][][] image = {
	 						{pixel1, pixel2, pixel3},
	 						{pixel4, pixel5, pixel6},
	 						{pixel7, pixel8, pixel9},
	 					};
	 	
	 	
	 	// Original image
	 	System.out.println("RGB values of pixels of our original image is:");
	 	for(int[][] ele1 : image)
	 	{
	 		for(int[] ele2 : ele1)
	 		{
	 			for(int ele3 : ele2)
	 			{
	 				System.out.print(ele3+" ");
	 			}
	 		
	 		}
	 		System.out.println();
	 	}
	 	System.out.println("\n");
	 	
	 	
	 	
	 	// 90 degree rotation
	 	System.out.println("Image after rotating it 90 degrees is: ");
	 	int rotatedImage90[][][]=rotateImage90(image);
	 	
	 	
	 	for(int[][] ele11 : rotatedImage90)
	 	{
	 		for(int[] ele2 : ele11)
	 		{
	 			for(int ele3 : ele2)
	 			{
	 				System.out.print(ele3+" ");
	 			}
	 	
	 		}
	 		System.out.println();
	 	}
	 	System.out.println("\n");
	 	
	 	
	 	
	 	// 180 degree rotation
	 	System.out.println("Image after rotating it 180 degrees is: ");
	 	int rotatedImage180[][][]=rotateImage180(image);
	 	
	 	
	 	for(int[][] ele11 : rotatedImage180)
	 	{
	 		for(int[] ele2 : ele11)
	 		{
	 			for(int ele3 : ele2)
	 			{
	 				System.out.print(ele3+" ");
	 			}
	 	
	 		}
	 		System.out.println();
	 	}
	 	System.out.println("\n");
	 	
	 	
	 	
	 	//Grayscaling
	 	int grayscaleImage[][][] = grayscaleImage(image);
	 	System.out.println("Image after grayscaling is: ");
	 	
	 	for(int[][] ele11 : grayscaleImage)
	 	{
	 		for(int[] ele2 : ele11)
	 		{
	 			for(int ele3 : ele2)
	 			{
	 				System.out.print(ele3+" ");
	 			}
	 	
	 		}
	 		System.out.println();
	 	}
	 	
	 	
	 	
	}

}
