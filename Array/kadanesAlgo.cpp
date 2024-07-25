#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
// Kadane's Algorithm to find the longest sum of the subarray from the given array

long long maxSubarraySum(vector<int> &arr)
{
    // Function to find the sum of contiguous subarray with maximum sum.
    long long maxi = INT64_MIN, prefix = 0;

    for (int i = 0; i < arr.size(); i++)
    {
        prefix += arr[i];
        maxi = max(maxi, prefix);
        if (prefix < 0)
            prefix = 0;
    }

    return maxi;
}

int main()
{
    int n;
    cin >> n;
    vector<int>v(n);
    for (int i = 0; i < n; i++)
        cin >> v[i];

    cout << maxSubarraySum(v);
    return 0;
}






















// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1