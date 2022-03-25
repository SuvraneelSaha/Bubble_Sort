package com;

public class One {
    // Sorting does not happen in a single step
    // it happens in a step by step format
    // ex - 3 , 1, 2 ,5, 7
    // sorted format - 1 , 2 , 3 ,5 ,7

}
// Steps in bubble sort
// 1] In every step we are comparing adjacent elements
// question may come to our mind what are we doing and why we are doing it ?
// first focus on the what it is doing ?
// ex - array given -- 3 ,1 ,5 , 4,2 ;
// we are going to start with the first 2 elements
// question - is the first element > the second element then SWAP it
// current array --> 1,3,5,4,2
// now we take the next two elements 3 ,5
// is 3 > 5  -- NA
// then no SWAP
// 1,3,5,4,2
// is 5>4 -- swap yes
// 1,3,4,5,2
// again if 5>2  yes -- swap
// 1,3,4,2,5
//  THIS is pass no. 1


// NOW the 2nd part WHY ?
// 1] 1st point
// as you can see with the first pass through the array, the largest element came in the end
// lets do a 2nd pass
// current new array is -> 1,3,4,2,5
// is 1>3 - no
// is 3>4 - no
// is 4>2 - yes -- Swap
// new array - 1 , 3 , 2 , 4 , 5
// is 4>5 NA

// OBSERVATION :
// With the pass no. 2
// the 2nd largest element is at the 2nd from last index position

// current new array is 1 , 3 , 2 , 4 , 5
// is 1>3 -- NO
// is 3>2 -- yes -- SWAP
// so the new array is 1 , 2 , 3 , 4 , 5

// Conclusion :
// With every step the largest element remaining in the array coming at the last
//  ex - when we run the array 1st time , the largest element of the array will be at the last index
// here that is 5
// when we run the array for the 2nd time , the 2nd largest element will be at the last index -1 position
// ie at the last index for the current array

// Bubble sort is also known as syncing sort and exchange sort 

