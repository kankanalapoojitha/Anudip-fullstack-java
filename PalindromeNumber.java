package loops;
import java.util.Scanner;
 
public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num;
		num=sc.nextInt();
		int rem,sum,temp;
		sum=0;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a palindrome Number");
			
		}

	}

}
