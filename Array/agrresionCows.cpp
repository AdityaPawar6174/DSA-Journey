// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:

    int solve(int n, int k, vector<int> &stalls) {
    
        // Write your code here
        int start=1, end=stalls.size(), mid, ans;
        //sort the array
        sort(stalls.begin(),stalls.end());
        
        end = stalls[n-1]-stalls[0];
        
        while(start <= end)
        {
            mid = start + (end-start)/2;
            
            int count=1, pos = stalls[0];
            for(int i=1; i<n; i++)
            {
                if(pos+mid <= stalls[i])
                {
                    count++;
                    pos = stalls[i];
                }
            }
            
            if(count<k)
            {

                end = mid - 1;
            }
            else
            {
                ans = mid;
                start = mid + 1;
            }
            
        }
        
        return ans;
    }
};

int main() {
    int t = 1;
    cin >> t;

    while (t--) {
        // Input

        int n, k;
        cin >> n >> k;

        vector<int> stalls(n);
        for (int i = 0; i < n; i++) {
            cin >> stalls[i];
        }
        // char ch;
        // cin >> ch;

        Solution obj;
        cout << obj.solve(n, k, stalls) << endl;

        // cout << "~\n";
    }
    // fclose(stdout);

    return 0;
}