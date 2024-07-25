#include <bits/stdc++.h>
using namespace std;
// finding maximum difference between two elements
int maxDifference(vector<int> &arr)
{
    // BRUTE FORCE METHOD: --------------->

    // int ans = INT8_MIN;
    // for(int i=0; i<arr.size()-1; i++)
    // {
    //     for(int j=i+1; j<arr.size(); j++)
    //     {
    //         ans = max(ans, arr[j]-arr[i]);
    //     }
    // }
    // return ans;

    // OPTIMIZED WAY: --------------------->
    int n = arr.size();
    if (n < 2)
        return INT_MIN;    // if array has less than 2 elements
    vector<int> suffix(n); // creating array of suffix maximum

    // 1. compute suffix maxs
    suffix[n - 1] = arr[n - 1];

    for (int j = n - 2; j >= 0; j--)
    {
        suffix[j] = max(suffix[j + 1], arr[j]);
    }

    // 2. calculate max difference
    int ans = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        ans = max(ans, suffix[i] - arr[i]);
    }

    return ans;
}

int main()
{
    vector<int> arr = {7, 9, 5, 6, 3, 2};
    int maxDiff = maxDifference(arr);
    cout << "Maximum difference between two elements: " << maxDiff << endl;

    return 0;
}