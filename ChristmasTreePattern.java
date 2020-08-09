import java.util.*;
public class ChristmasTreePattern{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of days:");
		int day=s.nextInt();
		int n=day+1;
		int space=day;
		int star=1;
		if(day<1)
		{
			System.out.println("Tree haven't grown up");	
		}
		else if(day>=20)
		{
			System.out.println("Tree haven't grown up");	
		}
		else{
		for(int i=0;i<n;i++)
		{
			for(int j=space;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			star=star+2;
			space--;
			System.out.println();
		}
		n=n-2;
		for(int i=0;i<day-2;i++)
		{
		    space=day-1;
			star=3;
			for(int l=0;l<n;l++)
			{
				for(int j=space;j>0;j--)
				{
					System.out.print(" ");
				}
				for(int k=0;k<star;k++)
				{
					System.out.print("*");
				}
				star=star+2;
				space--;
				System.out.println();
			}
			n--;
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<day;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		}
	}
}