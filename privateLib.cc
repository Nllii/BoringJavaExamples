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

