package loops;
import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) 
	{
	/*------------declaration of array-----------*/
	int[] numbers;
	/*-----------initialize no.of elements-----*/
	numbers = new int[3];
	/*--------creating a variable for index---------*/
	int index;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers : ");
	for(index=0;index <numbers.length;index++)
	
	{
		/*---------------input through keyboard and store at given index--------*/
		numbers[index]=sc.nextInt();
	}
	int largeNo=numbers[0];
	/*--------loop used to check the largest number among the given numbers-----*/
	for (index=0;index<numbers.length;index++)
	{
		if(numbers[index]>numbers[0])
		{
			largeNo=numbers[index];
		}
	}
	System.out.println("Largest number is : "+largeNo);
		}
	}

	
