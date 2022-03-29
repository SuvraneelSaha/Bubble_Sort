package com;

import java.util.Arrays;
import java.util.Scanner;

public class CodeNew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements in the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("OG array is " + Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("New array is " + Arrays.toString(arr));



    }
    static void bubblesort(int[] arr)
    {
        // to counter the edge test case of the sorted array

        boolean swap ;

        // outer loop will run n-1 times
        for (int i = 0; i <arr.length ; i++)
        {
            // by default
            swap = false;
            // inner loop or j will run <length - i
            // cause the right hand elements will be sorted
            for (int j = 1; j <arr.length-i ; j++)
            {
                    if(arr[j] < arr[j-1])
                    {
                        // SWAP
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swap = true;
                    }
            }
            if(swap==false)
            {
                break;
            }

        }
    }
}
