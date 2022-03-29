package com;

public class Five {
    // Time complexity Worst case:
    // 5, 4, 3 ,2 , 1

    // j = i+1 ;
    // if(arr[j]<arr[j-1]) --> SWAP
    // so
    // for i = 0
    // after 1st pass - 4,3,2,1,5   --> total how many swaps - N-1 swaps
    // in the second pass ie for i = 1
    // we will be taking - 4 , 3 ,2 , 1
    //  so after 2nd pass - 3,2,1,4

    // after 2nd pass we will be excluding the elements which are at the right side
    // ie 5 and 4 will be excluded
    //

    // for i = 2 ie the 3rd pass
    // arr - 3,2,1,4,5
    // arr ne - 3,2,1
    // here the jth pointer or loop ran - < N - 2 ie <5-2 == <3 ie 2 times

    // after sorting--> 2,1,3, 4, 5

    //** how many times the inner loop j will run
    // <length - i  or <= lenght - i -1


    // for i = 3 ie for the 4th pass
    // arr - 2,1,3,4,5
    // new arr - 2,1 rest are excluded as they are sorted already
    //  after sorting 1, 2 , 3 ,4 ,5
    // how many times the loop ran - once cause <5-3 = <2 so 1


    // IMPORTANT : HOW MANY TIMES THE INTERNAL LOOP WILL RUN : <N-i times or <= N-i-1 times 



}
