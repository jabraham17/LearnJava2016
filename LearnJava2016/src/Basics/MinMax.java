package Basics;

public class MinMax
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = {5, 10, 38, 4, 7, 23, 45, 65, 78, 97, 34, 25, 67, 101, 789349349};
		int largest = arrayOfNumbers[0];
		int smallest = arrayOfNumbers[0];
		for(int i = 0; i < arrayOfNumbers.length; i++)
		{
			int n = arrayOfNumbers[i];
			if(n < smallest)
			{
				smallest = n;
			}
			else if(n > largest)
			{
				largest = n;
			}
		}
		System.out.println("The Largest Number is " + largest);
		System.out.println("The Smallest Number is " + smallest);
	}
}
