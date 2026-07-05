// Second Largest Element in an Array
// without sorting the array

// eg. array is [28, 74, 53, 96, 48, 32]    secondMax --> 74

#include <bits/stdc++.h>
using namespace std;

int secondLargest(int arr[], int n)
{

    if(n<2)
    {
        cout<<"You must have atleast 2 elements in the array";
        return -1;
    }

    int max1 = arr[0];
    int max2 = arr[1];

    if (max2 > max1){
        swap(max1, max2);
    }

    for (int i = 2; i < n; i++)
    {
        if (arr[i] > max1)
        {
            max2 = max1;
            max1 = arr[i];
        }
        else if (arr[i] > max2)
        {
            max2 = arr[i];
        }
    }
    return max2;
}

// another way -- with sorting

int getElement(int arr[], int n)
{
    if(n == 0 || n == 1){
        cout<<"Invalid Input";
        return -1;
    }

    sort(arr, arr + n);

    return arr[n - 2];
}

// 

int main()
{
    int arr[] = {28, 74, 53, 96, 48, 32};

    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<secondLargest(arr, n)<<endl;

    cout<<getElement(arr, n)<<endl;
}