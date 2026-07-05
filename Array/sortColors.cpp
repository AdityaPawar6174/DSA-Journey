// Sort Colors
// Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

#include <iostream>
#include <vector>
using namespace std;

void sortColors(vector<int> &nums)
{
    int red = 0;
    int white = 0;
    int blue = nums.size() - 1;

    while (white <= blue)
    {
        if (nums[white] == 0)
        {
            swap(nums[white], nums[red]);
            white++;
            red++;
        }
        else if (nums[white] == 1)
        {
            white++;
        }
        else
        {
            swap(nums[white], nums[blue]);
            blue--;
        }
    }
}

int main()
{
    vector<int> nums = {1, 0, 2, 1, 0, 2, 1, 1, 0, 2, 1, 1, 0};
    cout << "Sorting colors using array: (red=0, white=1, blue=2) ";
    sortColors(nums);

    for (int num : nums)
    {
        cout << num << " ";
    }
    return 0;
}
