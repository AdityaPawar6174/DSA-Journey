// Max consecutive ones in an array

#include <iostream>
#include <vector>
using namespace std;

// Iterative approach
int maxConsecutiveOnes(const vector<int>& nums) {
    int result = 0;
    int count = 0;

    for(int i=0; i<nums.size(); i++){
        if(nums[i] == 0){
            count = 0;
        } else {
            count++;
        }

        // result = max(result, count);
        if(result < count){
            result = count;
        }
    }
    return result;
}

// Sliding window approach
int maxConsecutiveOnes_slidingWindow(const vector<int>& nums) {
    int left = 0, right = 0;
    int result = 0;
    while(right < nums.size()){
        if(nums[right] == 1){
            right++;
        } else {
            left = right + 1;
            right++;
        }
        result = max(result, right - left);
    }
    return result;
}

int main() {
    vector<int> nums = {1, 1, 0, 1, 1, 1};
    cout << "Max consecutive ones: " << maxConsecutiveOnes(nums) << endl;

    cout << "Max consecutive ones (sliding window): " << maxConsecutiveOnes_slidingWindow(nums) << endl;
    return 0;
}