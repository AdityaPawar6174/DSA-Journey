#include<iostream>
using namespace std;

/*
// Descending approach

int main()
{
    int arr[5] = {10, 4, 3, 2, 8};

    for (int i = 0; i < 4; i++)
    {
        int index = i;
        for(int j=i+1; j < 5; j++)
        {
            if(arr[j]>arr[index])
            index = j;
        }
        swap(arr[i], arr[index]);
    }


    for(int i=0; i<5; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
*/

// alternative way to ascending order

int main()
{
    int arr[5] = {10, 4, 3, 2, 8};

    for (int i = 4; i > 0; i--)
    {
        int index = i;
        for(int j = i-1; j >= 0; j--)
        {
            if(arr[j]>arr[index])
            index = j;
        }
        swap(arr[i], arr[index]);
    }

    
    for(int i=0; i<5; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}