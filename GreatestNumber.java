package firstproject;
// Write a program to input any five number and find out the greatest number among them.

public class GreatestNumber {
     public static void main(String[] args) 
     {
    	 int a=20;
    	 int b=30;
    	 int c=50;
    	 int d=70;
    	 int e=50;
    	 if(a>b && a>c && a>d && a>e)
    	 {
    		 System.out.println("a is greater");
    	 }
    	 else if(b>c && b>d && b>e && b>a)
    	 {
    		 System.out.println("b is greater");
    	 }
    	 else if(c>d && c>e && c>b && c>a)
    	 {
    		 System.out.println("c is greater");
    	 }
    	 else if(d>a && d>b && d>c && d>e)
    	 {
    		 System.out.println("d is greater");
    	 }
    	 else
    	 {
    		 System.out.println("e is greater");
    	 }
		

	}

}
