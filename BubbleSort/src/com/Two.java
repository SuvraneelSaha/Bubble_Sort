package com;

public class Two {
    public static void main(String[] args) {
        // ex array - 3 , 1 ,5 4, 2
        // how the code will run
        // the index value or the starting pointer will be at the starting point
        // ie i = 0 ;
        // and the jth pointer will be at i + 1 position
        // STEPS : Compare the two elements at j and j-1th position and swap them
        // ie if(arr[j] < arr[j-1] --> SWAP
        // if not then no swap

        // HERE 2ND POINTER J IS THE INTERNAL LOOP
        //ITS SORTING THE ARRAY STEP BY STEP

        // NO OF STEPS TO SORT THE ARRAY IS N -1 TIMES
        // CAUSE N --> IS THE NO. OF ELEMENTS PRESENT IN THE ARRAY
        // REASON -  all the elements will be compared except the last element which is at the first position
        // so the no, of steps required is n-1 to sort the array

        // here the OUTER LOOP i acts as  COUNTER FOR THE NO. OF PASSES DONE

        // i =0 --> first pass
        // i =1 --> 2nd pass
        // i =2 --> 3rd pass
        // and so on

        // Iteration --
        //   og array - 3 , 1 , 5 , 4 , 2
        // after 1st pass - 1,3,4,2,5  -- after the 1st pass the largest element is in the last index position
        // after 2nd pass - 1,3,2,4,5 -- after the 2nd pass the second largest element is in the 2nd last index position
        // the j pointer will run till 1 , 3 , 2 leaving the 4 , 5 as both are sorted
        // the j will only check this cause the right hand side elements are already sorted
        // after 3rd pass - 1,2,3,4,5 -- after the 3rd pass the third largest element is in the 3rd last index position
        //

        // Traversal of the jth pointer with respect to the ith pointer
        //
        // j is actually going till   < (lenght -i)
        // or <=(lenght - i -1)


    }
}
