/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */
package org.example;
import java.util.Scanner;
public class Exercise10
{
    public static void main( String[] args )
    {
        checkout();
    }

    public static void checkout()
    {
        int itemPrice[];
        itemPrice = new int[3];
        int itemQuantity[];
        itemQuantity = new int[3];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter the price of item " + (i+1) + ": ");
            itemPrice[i] = sc.nextInt();
            System.out.println("Enter the quantity of item " + (i+1) + ": ");
            itemQuantity[i] = sc.nextInt();
        }
        System.out.println("Subtotal: $" + sum(itemPrice,itemQuantity) + "\nTax: $" + tax(sum(itemPrice,itemQuantity)) + "\nTotal: $" + (sum(itemPrice,itemQuantity)+ tax(sum(itemPrice,itemQuantity))));
    }

    public static double sum(int itemPrice[], int itemQuantity[])
    {
        double sum = 0;
        for(int i = 0; i < 3; i++)
        {
            sum += itemPrice[i] * itemQuantity[i];
        }
        return sum;
    }

    public static double tax(double sum)
    {
        return sum * 0.055;
    }
}
