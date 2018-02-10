package com.pluralsight;

import java.util.Random;

public class Main {

    /*
    https://programmingbydoing.com/
    Exchange sort - Assignment #160
     */

    public static void exchange_sort( int[] arr )
    {
        for ( int a = 0; a < arr.length; a++ )
        {
            for ( int b = 0; b < arr.length ; b++)
            {
                if (arr[b] > arr[a])
                {
                    swap(arr, a, b);
                }
            }
        }
    }


    public static void swap( int[] a , int i, int j )
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main( String[] args )
    {
        Random r = new Random();
        int[] arr = new int[10];
        int i;

        // Fill up the array with random numbers
        for ( i=0; i<arr.length; i++ )
            arr[i] = 1 + r.nextInt(100);

        // Display it
        System.out.print("before: ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        // Sort it
        exchange_sort( arr );

        // Display it again to confirm that it's sorted
        System.out.print("after : ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
}
