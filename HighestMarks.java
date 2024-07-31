package Arrays;
import java.util.Scanner;
public class HighestMarks {
  public static void main(String[] args) 
	{
		/*-----------------------------------------------*/
		/*-----declaration of array--------------------*/
		int[] marks;
		/*-------initialize no.of elements----------*/
		marks = new int[5];
		/*----------creating a variable for index---------*/
		int index;
		/*--------------------------------------------*/
		/*-------object of scanner class----------*/
		Scanner sc = new Scanner(System.in);
		/*-----------------------------------------------------------*/
		System.out.println("Enter 15 numbers :");
		for(index=0;index <marks.length;index++)
		{
			/*---------input through keyboard and store at given index-----*/
			marks[index]=sc.nextInt();
		}
		/*---------------------------------------------------------*/
		/*-----------------Displaying data--------------------------*/
		System.out.println("--------------------------------------");
		System.out.println("Numbers are : ");
		for(index=0;index <marks.length;index++)
		{
			System.out.println(marks[index]+",");
		}
		int highestMarks = marks[0];
		for(index=0;index<marks.length;index++)
		{
			if(marks[index]>highestMarks)
			{
				highestMarks = marks[index];
			}
			
		}
		System.out.println("\n The highest marks is : "+highestMarks);

	}

}
