import java.util.Scanner;
import java.util.Arrays;
public class array6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int n;
		
		System.out.print("\n\n\n\t\"SORTING AN ARRAY\"");
		System.out.print("\n\n\nEnter the Array length : ");

		n = input.nextInt();

		int[] num = new int[n];
		System.out.print ("\nPlease enter " + n + " numbers : ");

		
		
		for(int i = 0; i<n; i++)
		{
			num[i] = input.nextInt();
			

		}
		System.out.print("\nThe 1-d array is :       ");

		for(int i = 0; i<n; i++)
		{
			
			System.out.print(" " + num[i] + "  ");



		}

        Arrays.sort(num);
        System.out.print("\n\nAscending Order : ");
		for (int i = 0; i<n; i++)
		{
			System.out.print(" "+num[i]);
		}


     
		System.out.print("\n\nDescending Order : ");
		for (int i = n-1; i>=0; i--)
		{
			System.out.print(" "+num[i]);
		}
	}
}
