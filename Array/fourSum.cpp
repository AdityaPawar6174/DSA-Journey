#include <iostream>
using namespace std;

bool threeSum(int arr[], int n, int x)
{
    // sort array - bubble sort
    for (int i = n - 2; i >= 0; i--)
    {
        for (int j = 0; j <= i; j++)
        {
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
        }
    }

    // implement it
    for (int i = 0; i < n - 2; i++)
    {
        int ans = x - arr[i];
        int start = i + 1, end = n - 1;

        while (start < end)
        {
            if (arr[start] + arr[end] == ans)
                return 1;
            else if (arr[start] + arr[end] > ans)
                end--;
            else
                start++;
        }
    }
    return 0;
}

int main()
{
}