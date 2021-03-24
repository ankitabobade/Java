/*
Triangle:-
     *
    **
   ***
  ****
 *****
******


 row :-6

*/

import java.util.*;

import java.util.Scanner.*;

import java.io.*;


class Pattern_3
{
	public static void main(String[] args) 
	{
		int row,k,i,j;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enetr row");
		row=sc.nextInt();

		for(i=1;i<=row;i++)
		{
			for(j=row-1;j>=i;j--)
			{
			    System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");	
			}
			System.out.println("");
		}		
	}	
}