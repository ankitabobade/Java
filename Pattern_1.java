/*
Triangle:-
*
**
***
****
*****
******
 row * clo:- 6*6

*/

import java.util.*;

import java.util.Scanner.*;

import java.io.*;


class Pattern_1
{
	public static void main(String[] args) 
	{
		int row,col,i,j;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enetr row");
		row=sc.nextInt();

		System.out.println("Enetr col");
		col=sc.nextInt();

		for(i=1;i<=row;i++)
		{
			for(j=col;j>=1;j--)
			{
				if((j==col)||(i>j))
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}		
	}	
}

/*

alternative:-
for(i=1;i<=row;i++)
		{
			for(j=col;j>=1;j--)
			{
				if((j==1)||(i>j))
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}

*/