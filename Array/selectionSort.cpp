#include<iostream>
using namespace std;

int main()
{
    int arr[1000];
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;
    cout<<"Enter the Elements in array: ";
    for(int i=0; i<n; i++)
    cin>>arr[i];

    cout<<"Your array is: ";
    for(int i=0; i<n; i++)
    cout<<arr[i]<<" ";

   // int arr[6] = {10, 4, 1, 3, 7, 2};

    for(int i=0; i<n-1; i++)
    {
        int index = i;
        for(int j=i+1; j<n; j++)
        {
            if(arr[j]<arr[index])
            index = j;
        }

        swap(arr[i],arr[index]);
    }

    cout<<"\nSorted array is: ";
    for(int i=0; i<n; i++)
    {
        cout<< arr[i]<<" ";
    }

}