import java.util.*;
public class array
{
		public static void main(String args[])
	{
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number");
		
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
				
		for(int i=0;i<10;i++)
		{
			System.out.println("arr"+arr[i]);
		}
		
		System.out.println("Array length"+arr.length);
		
	}
}