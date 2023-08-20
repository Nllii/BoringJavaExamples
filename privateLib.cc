#include <iostream>

using namespace std;


extern "C" int addition(int a , int b){
    int  total_value = a + b; 
    return total_value;

}

extern "C" int subtraction(int a , int b){
    int  total_value = a - b; 
    return total_value;

}



// extern "C" int sort(int numbers[] , int size){
//     // sort the values from least to greatest if 

//     int number_length, sum = 0;
//     double average;
//     for (numbers = 0 ; number_length < size; ++number_length){
//         sum += numbers[number_length];
//     }
//     average = double(sum)/ size ;
//     return average;
// }





