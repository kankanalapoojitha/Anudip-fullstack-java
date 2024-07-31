package javapractice;
import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		//*------------------------------------------------------------------------------*/
		/*---- declaration of array ---------*/
		int[] numbers;
		/*--- initialize number of elements i.e, 15 */
		numbers = new int[15];
		/*----- creating a variable for index -----*/
		int index;
		/*-------------------------------------------------------------------*/
		/*---- Object of Scanner class ------*/
		Scanner sc = new Scanner(System.in);
		/*-----------------------------------------------------------*/
		System.out.println("Enter any 15 number : ");
		for(index = 0; index < numbers.length; index++)
		{
			/*----- input through keyboard and store at given index -----*/
			numbers[index] = sc.nextInt();
		}
		/*----------------------------------------------------------------*/
		/*----- Displaying data -----*/
		System.out.println("---------------------------------------------------");
		System.out.println("Numbers are : ");
		for(index = 0; index < numbers.length ;index++)
		{
			System.out.print(numbers[index] + " ,");
		}
	}
}


	
