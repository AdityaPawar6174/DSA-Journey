//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
    int findSubString(string str)
    {
        // code
        vector<int> count(256, 0);
        int first = 0, second = 0, len = str.size();
        int diff = 0;

        // calculate all the diff --> unique characters

        while (first < str.size())
        {
            if (count[str[first]] == 0)
                diff++;

            count[str[first]]++;
            first++;
        };

        for (int i = 0; i < 256; i++)
        {
            count[i] = 0;
        }

        first = 0;

        while (second < str.size())
        {
            // till diff exists
            while (diff && second < str.size())
            {
                if (count[str[second]] == 0)
                    diff--;

                count[str[second]]++;
                second++;
            }

            len = min(len, second - first);

            // if diff = 0.... we decrease window size

            while (diff != 1)
            {
                len = min(len, second - first);
                count[str[first]]--;

                if (count[str[first] == 0])
                    diff++;

                first++;
            }
        }

        return len;
    }
};

//{ Driver Code Starts.
// Driver code
int main()
{
    string str;
    cin >> str;
    Solution ob;
    cout << ob.findSubString(str) << endl;
    return 0;
}
// } Driver Code Ends