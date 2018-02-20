/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Ojha
 */
public class Merge {
    public static void main (String [] args)
{
	int a [] = {11, 13, 15, 17, 19, 21};
	int b [] = {12, 14, 16, 18, 20, 21};
	int res [] =new int [a.length+b.length];
	int j=0;
	for (int i = 0; i < a.length; i++, j++) 
	{
		res[j] =a [i];
	}
	for (int i = 0; i < b.length; i++, j++) 
	{
		res[j] =b [i];
	}
	
	for (int i = 0; i < res.length; i++) 
	{
		System.out.println (res[i]);
	}
}
}

