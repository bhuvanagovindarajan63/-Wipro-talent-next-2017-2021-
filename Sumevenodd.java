import java.util.Scanner;
class SumofEvenOdd 
{
	public static void main(String[] args) 
	{
		int number, i, evenSum = 0, oddSum = 0;
	        Scanner reader = new Scanner(System.in);
	        System.out.print(" Please Enter any Number : ");
		number = 10;	
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("\n The Sum of Even Numbers is");
		System.out.println("\n The Sum of Odd Numbers is");
	}
}