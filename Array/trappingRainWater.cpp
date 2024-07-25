#include<iostream>
#include<vector>

using namespace std;

int trap(vector<int>&height)
{
    int n = height.size();
    int leftmax = 0, rightmax = 0, maxheight = height[0], index=0;
    int water = 0;
    // max height of boulding
    for(int i=0; i<n; i++)
    {
        if(maxheight < height[i])
        {
            maxheight = height[i];
            index = i;
        }
    }
    // left part

    for(int i=0; i<index; i++)
    {
        if(leftmax > height[i])
        {
            water+=leftmax-height[i];
        }
        else
        leftmax = height[i];
    }

    // right part

     for(int i=n-1; i>index; i--)
    {
        if(rightmax > height[i])
        {
            water+=rightmax-height[i];
        }
        else
        rightmax = height[i];
    }

    return water;
    
}

int main()
{
}