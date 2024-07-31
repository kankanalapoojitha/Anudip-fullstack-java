package Arrays;
import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) 
	{
		//creating an array of 15 numbers
		int[] numbers;
		numbers = new int[15];
		/*creating a variable for index*/
		int index,sum;
		float average;
		sum=0;
		/*creating object of Scanner class*/
		Scanner sc = new Scanner(System.in);
		/*input of data through keyboard*/
		System.out.println("Entry any 15 numbers: ");
		for(index=0; index<numbers.length; index++)
		{
			numbers[index]= sc.nextInt();
		}
		/*---------------------------------------------------*/
		/*Displaying elements of array*/
		System.out.println("----------------------------");
		System.out.println("Numbers are:");
		for(index=0; index<numbers.length; index++)
		{
			System.out.println(numbers[index]+",");
		}
		/*Displaying average of all given numbers*/
		for(index=0;index<numbers.length; index++)
		{
			sum += numbers[index];
		}
		average= sum/numbers.length;
		System.out.println("-------------------------------------");
		System.out.println("/n average=" + average);
		
			
		}

	}


