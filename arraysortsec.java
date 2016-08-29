package digits;

import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
System.out.println("enter size of array");
int n=in.nextInt();
	int arr[]=new int[n];
	
	System.out.println("Enter the element of array");
	
	for(int i=0;i<n;i++)
	{
	arr[i]=in.nextInt();
	
	}
	Arrays.sort(arr);
	for(int i:arr){
 System.out.println(i);
}System.out.println("second array :" +arr[1]);
	}
}
