package com;

public class Four {
    // time complexity -- Best Case
    // 1 , 2 ,3 , 4 ,5
    // for i=0 ;
    // how many times did the loop run - only 1 time
    // do we need to check it again noooo
    // note : when j never swwapped for a value of i
    // it means the arrays is sorted hence we can end the program

    // when the array will be sorted there wont be any passes
    // just one pass cause it wont be going to the next pass as the array is already sorted and also no swapping takes place

    // IMPORTANT POINTS :
    // 1: FOR A PARTICULAR VALUE OF I IF THE J POINTER IS NOT SWAPPING THEN IT MEANS THAT THE ARRAY IS SORTED AND WE CAN END THE PROGRAM
    // SO
    // ith pointer only ran once and jth pointer ran n times cause n is the size of the array

    // best case comparisons -- N -1 but in case of time complexity the constants are ignored
    // so N

    // SO BEST CASE WILL BE WHEN WE ARE GIVEN AN ALREADY SORTED ARRAY TO SORT
}
