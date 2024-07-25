#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
// divide array into subarrays resulting thier sum equal to each other
bool divide(vector<int>arr)
{
    int maxi = INT8_MIN, prefix = 0, n=arr.size();
    //total sum
    int totalSum = 0;

    for(int i=0; i<n; i++)
    totalSum += arr[i];

    for(int i=0; i<n; i++)
    {
        prefix += arr[i];
        int ans = totalSum - prefix;
        if(ans == prefix)
        return 1;
    }
    return 0;
}

int main(){

    int n;
    cout<<"Enter the size of array: ";
    cin>>n;
    vector<int>v(n);
    cout<<"Enter the elements of array; ";
    for(int i=0; i<n; i++)
    cin>>v[i];

    cout<<divide(v);
}