package javapractice;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) 
	{
		/*creating an array of 10 numbers*/
		int[] numbers;
		numbers = new int[10];
		/*creating an variable for index*/
		int index;
		/*creating object of scanner*/
		Scanner sc = new Scanner(System.in);
		/*--input of data through keyboard----*/
		System.out.println("Enter any 10 numbers");
		for(index =0; index<numbers.length;index++)
		{
			numbers[index]=sc.nextInt();
		}
			/*-------------------------------*/
			/*Displaying elements of array*/
			System.out.println("------------------");
				System.out.println("Numbers ar:");
				for(index =0; index<numbers.length;index++)
				{
					System.out.print(numbers[index]+",");
				}
				/*---Displaying Even numbers only---*/
	            System.out.println("\n--------------------");
	            System.out.println("Even Numbers are:");
	            for(index =0; index<numbers.length; index++)
	            {
	            	/*checking element of array is even*/
	            	if(numbers[index]%2==0)
	            	{
	            		System.out.print(numbers[index]+",");
	            	}
	            }
	          }
             }
