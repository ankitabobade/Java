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


class Pattern_4
{
	public static void main(String[] args) 
	{
		int row,k,i,j;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enetr row");
		row=sc.nextInt();

		for(i=row;i>=1;i--)
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