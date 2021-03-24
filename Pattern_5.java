/*
Pyramid:-
    *
   ***
  *****
 *******
*********
***********

height=5;
*/

import java.util.*;

import java.util.Scanner.*;

import java.io.*;


class Pattern_5
{
	public static void main(String[] args) 
	{
		int min_star=1;
		int i,j,k;
		int hight,space;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enetr hight");
		hight=sc.nextInt(); //5

		space=hight-1;

		for (i=0;i<=hight;i++) 
		{
			for (j=space;j>i;j--) 
			{
				System.out.print(" ");
			}	
			for (k=0;k<min_star;k++) 
			{
				System.out.print("*");	
			}
			min_star+=2;
			System.out.println(" ");
		}
				
	}	
}
