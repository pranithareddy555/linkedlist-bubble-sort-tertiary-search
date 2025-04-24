//Author : Pranitha Bojja - PXB210063

#include <iostream>
using namespace std;

// Recursive tertiary search function and return index at which its present.
// If number is not found return -1
// k is the number to be searched in the array
int ter_Search(int* array, int low, int high, int k){
    
    //Condition 1 
    if(low <= high){

        int node1 = low + ((high-low)/3);
        int node2 = low + (2*(high-low)/3);

        //Condition 2
        if(array[node1] == k) return node1;
        //Condition 3
        else if(array[node2] == k) return node2;

        if(k < array[node1]) return ter_Search(array, low, node1-1, k);

        else if (k < array[node2]) return ter_Search(array, node1+1, node2-1, k);

        else return ter_Search(array, node2+1, high, k);
    }
    return -1;
}

int main(){
    //Array of numbers
    int array[10] = {1,3,5,7,9,11,13,15,17,19}; 
    int len = sizeof(array)/sizeof(array[0]);
    cout<<"Given array is"<<endl;
    for(int i=0;i<len;i++) cout<<array[i]<<" ";
    cout<<endl;
    // Integer to be searched in the array should be given below
    int num_to_find = 10;

    int searchindex = ter_Search(array, 0, len-1, num_to_find);

    if(searchindex == -1) cout << "Number " << num_to_find << " is not found.";
    else cout << "Number " << num_to_find << " is found at index " << searchindex << " in array.";


    return 0;
}
