package Day4;

import java.util.Scanner;

public class PatternProblem2 {
	 public static void main(String[] args) 
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows:");
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println(" ");
		}
		sc.close();
	  }
}
