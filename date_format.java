package digits;

import java.util.Scanner;

public class day_year {
public static void main(String args[])
{
	int d,m,year;
	System.out.println("Enter date(dd/mm/year):");
	Scanner sc=new Scanner(System.in);
	d=sc.nextInt();
	m=sc.nextInt();
	year=sc.nextInt();
	if((d>=1 && d<=31) &&(m>=1 && m<=12)&& (year>=999))
	{
		System.out.println("true");
	}
	System.out.println(" false");
	
}}
