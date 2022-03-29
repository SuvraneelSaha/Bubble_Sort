package com;

import java.util.Arrays;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements within the array");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG array is "+ Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println("New arrays is "+Arrays.toString(arr));


    }
    // we are not returning any array so void and also we are not taking any extra variables as
    // the time complexity is constant
    // also it is an inplace sorting algo
    // its just sorting the array and giving out the array in a sorted format
    static void BubbleSort(int[] arr)
    {
        boolean swap ;
        // the ith pointer will run n-1 times
        for (int i = 0; i <arr.length ; i++)
        {
            swap = false;
            // FOR EACH step the max element will come at the last respective index position
            for (int j = 1; j <arr.length-i ; j++)
            // cause the last element from the right hand side will be sorted so no need to re evaluate the item or element
                // again and again
            {
                    // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1])
                {
                    // SWAP
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                    swap = true;
                }
            }
            // if you did not swap for a particular value of i which means that the
            // array is already sorted
            // hence stop the program
            if(!swap)
            {
                break;
            }
//            if(swap==false)
//            {
//                break;
//            }

            // same as the above one

        }
    }
    // EDGE test case :
    // if the array is already sorted then there wouldnt be any swapping
    //
}
// all test cases are working
// in case of sorted array
// only 1 time the outer loop ie ith loop will run
// cause of the boolean swap variable
