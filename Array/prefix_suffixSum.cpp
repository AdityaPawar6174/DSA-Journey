#include <bits/stdc++.h>
using namespace std;

vector<int> prefixSum(int arr[], int n)
{
    vector<int> prefix(n);
    prefix[0] = arr[0];
    for (int i = 1; i < n; i++)
    {
        prefix[i] = prefix[i - 1] + arr[i];
    }
    return prefix;
}

vector<int> suffixSum(int arr[], int n)
{
    vector<int> suffix(n);
    suffix[n - 1] = arr[n - 1];
    for (int j = n - 2; j >= 0; j--)
    {
        suffix[j] = suffix[j + 1] + arr[j];
    }
    return suffix;
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    vector<int> resultp = prefixSum(arr, n);
    vector<int> results = suffixSum(arr, n);

    // Output the prefix sums
    cout << "Prefix sums: ";
    for (int i = 0; i < n; i++) {
        cout << resultp[i] << " ";
    }
    cout << endl;
    
    cout << "Suffix sums: ";
    for (int i = 0; i < n; i++) {
        cout << results[i] << " ";
    }
    cout << endl;

    return 0;

}