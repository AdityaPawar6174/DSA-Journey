#include<iostream>
using namespace std;

int main()
{
    int arr[1000];
    int n;
    cout<<"enter the size of array: ";
    cin>>n;
    cout<<"Enter the elements of array: ";
    for(int i=0; i<n; i++)
    cin>>arr[i];
    cout<<"Your Given array is: ";
    for(int i=0; i<n; i++)
    cout<<arr[i]<<" ";

    for(int i=1; i<n; i++)
    {
        for(int j=i; j>0; j--)
        {
            if(arr[j]<arr[j-1])
            swap(arr[j],arr[j-1]);
            else
            break;
        }
    }


    cout<<"\nSorted array is: ";
    for(int i=0; i<n; i++)
    cout<<arr[i]<<" ";
    cout<<endl;

    return 0;
}