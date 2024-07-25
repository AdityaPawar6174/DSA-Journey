#include<iostream>
using namespace std;

/*
// Decreasing order

int main()
{
    int arr[5] = {3, 1, 2, 4, 5};

    for(int i=0; i<5; i++)
    {
        for(int j=i; j>0; j--)
        {
            if(arr[j]>arr[j-1])
            swap(arr[j],arr[j-1]);
            else
            break;
        }
    }

    for(int i=0; i<5; i++)
    cout<<arr[i]<<" ";
}
*/

// Increasing order but reverse implementation

int main()
{
    int arr[5] = {7, 5, 2, 4, 3};

    for(int i=4; i>=0; i--)
    {
        for(int j=1; j<=i; j++)
        {
            if(arr[j]<arr[j-1])
            swap(arr[j],arr[j-1]);
        }
    }

    for(int i=0; i<5; i++)
    cout<<arr[i]<<" ";
}