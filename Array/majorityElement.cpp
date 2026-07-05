// Majority Element

#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

int bruteforce(vector<int> &nums)
{
    int n = nums.size();

    for (int i = 0; i < n; i++)
    {
        int count = 0;
        for (int j = 0; j < n; j++)
        {
            if (nums[j] == nums[i])
            {
                count++;
            }
        }
        if (count > n / 2)
        {
            return nums[i];
        }
    }
    return -1;
}

int hashmap(vector<int> &nums)
{

    int n = nums.size();

    unordered_map<int, int> mp;

    for (int num : nums)
    {
        mp[num]++;
    }

    for (auto &pair : mp)
    {
        if (pair.second > n / 2)
        {
            return pair.first;
        }
    }

    return -1;
}

// Boyer-Moore Voting Algorithm
// Time Complexity: O(N)
// Space Complexity: O(1)
int majorityElement(vector<int> &nums)
{

    int n = nums.size();

    int cnt = 0;

    int el;

    for (int i = 0; i < n; i++)
    {
        if (cnt == 0)
        {
            cnt = 1;
            el = nums[i];
        }
        else if (el == nums[i])
        {
            cnt++;
        }
        else
        {
            cnt--;
        }
    }

    int cnt1 = 0;
    for (int i = 0; i < n; i++)
    {
        if (nums[i] == el)
        {
            cnt1++;
        }
    }

    if (cnt1 > (n / 2))
    {
        return el;
    }

    return -1;
}

int main()
{
    vector<int> nums = {2, 2, 1, 1, 1, 2, 2};

    cout << "Majority Element (Brute Force): " << bruteforce(nums) << endl;
    cout << "Majority Element (Hash Map): " << hashmap(nums) << endl;
    cout << "Majority Element (Boyer-Moore Voting Algorithm): " << majorityElement(nums) << endl;

    return 0;
}