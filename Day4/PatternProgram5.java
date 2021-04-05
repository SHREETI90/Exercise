package Day4;

import java.util.Scanner;

public class PatternProgram5 
{
	public static void main(String[] args) 
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows:");
		int n = sc.nextInt();
		int x=n;
		int y=n;
		for (int i=1; i<=n; i++)   
		{       
			for (int j=1;j<n*2;j++)   
			{
				if(j==x||j==y||i==n)   
				{        
					System.out.print("*");   
				}
				else
				{
					System.out.print(" "); 
				}  
			}   
			x--;
			y++;
			System.out.println();
		}
		sc.close();
	  }
}
