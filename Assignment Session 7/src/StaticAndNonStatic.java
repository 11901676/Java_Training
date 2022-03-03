
class Dish
{
	
	// Non-Static attributes
	String name;
	int price;
	int quantity;
	
	
	// Static attributes
	static int totalQuantity;
	static int totalPrice;
	static int numberOfDishes;
	Dish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		totalQuantity++;
		System.out.println(name +" "+ price +" "+ quantity);
		numberOfDishes++;
		
	}
	
	void increment()
	{
		quantity++;
		totalQuantity++;
	}
	
	
	void decrement()
	{
		quantity--;
		totalQuantity--;
	}
	
	
	static void showDishData(int totalPrice)
	{
		
		System.out.println("Total Quantity :"+totalQuantity);
		System.out.println("Total Price is :"+totalPrice);
		
	}
	
	
	static int[] showDish(int []arr)
	{
		for(int i = 0;i < arr.length-1;i++)
		{
			for(int j = 0;j < arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
		return arr;
	}
	
	
	
}
public class StaticAndNonStatic {

	public static void main(String[] args) {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Dish dish1 = new Dish("Burger",100,1);
		Dish dish2 = new Dish("Pizza",500,1);
		Dish dish3 = new Dish("Momos",70,1);
		Dish dish4 = new Dish("Fries", 80, 2);
		Dish dish5 = new Dish("Noodles",60,1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		
		
		dish1.increment();
		dish1.increment();
		
		dish2.increment();
		dish2.increment();
		dish2.increment();
		
		dish1.decrement();
		
		
		Dish[] array = new Dish[5];
		array[0] = dish1;
		array[1] = dish2;
		array[2] = dish3;
		array[3] = dish4; 
		array[4] = dish5;
		
		
		int[] priceArray = new int[array.length];
		
		for(int i = 0;i < array.length;i++)
		{
			priceArray[i] = array[i].price;
		}
		
		int[] sortedPriceArray = new int[array.length];
		sortedPriceArray = Dish.showDish(priceArray);
		
		//System.out.println(Arrays.toString(sortedPriceArray));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i = 0;i < sortedPriceArray.length;i++)
		{
			int dishPrice = sortedPriceArray[i];
			for(int j = 0; j < array.length;j++)
			{
				if(array[j].price == dishPrice)
				{
					System.out.println(array[j].quantity+" pack of "+array[j].name+" is/are orderered with price "+array[j].price);
				}
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Number of dishes are :"+Dish.numberOfDishes);
		for(int i = 0;i < array.length;i++)
		{
			System.out.println("Quantit of dish"+(i+1)+ " is :"+array[i].quantity);
		}
		
		
		for(int i = 0;i < array.length;i++)
		{
			Dish.totalPrice = Dish.totalPrice + (array[i].quantity * array[i].price);
		}
		
		Dish.showDishData(Dish.totalPrice);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
	}
	
		
}


