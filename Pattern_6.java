/*
Pyramid:-

height=4;

*******
 *****
  ***
   *
*/

import java.util.*;

import java.util.Scanner.*;

import java.io.*;


class Pattern_6
{
	public static void main(String[] args) 
	{
		int space,height;
		int i,j,k;
		int max_star;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enetr height");
		height=sc.nextInt(); 

		space=height-1;

		max_star=height*2-1;

		for(i=height;i>=1;i--)
		{
			for (j=space;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for(k=1;k<=max_star;k++)
			{
				System.out.print("*");
			}
			max_star-=2;
			System.out.println(" ");
		}
	}	
}
