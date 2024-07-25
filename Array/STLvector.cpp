#include <iostream>
#include <vector>
#include<algorithm>
using namespace std;

int main()
{
    // // creating vector
    // vector<int>v;
    // vector<int>v1(5,1);
    // // size and capacity
    // cout<<"size of v: "<<v.size()<<endl;
    // cout<<"capacity of v: "<<v.capacity()<<endl;
    // v.push_back(2);
    // v.push_back(3);
    // v.push_back(10);
    // cout<<"size of v: "<<v.size()<<endl;
    // cout<<"capacity of v: "<<v.capacity()<<endl;
    // // update value
    // v[1]=5;
    // cout<<"size of v1: "<<v1.size()<<endl;
    // cout<<"capacity of v1: "<<v1.capacity()<<endl;
    // v1.push_back(8);
    // cout<<"size of v1: "<<v1.size()<<endl;
    // cout<<"capacity of v1: "<<v1.capacity()<<endl;

    // // delete value from vector
    // vector<int>vnew;
    // vnew.push_back(40);
    // vnew.push_back(41);
    // vnew.push_back(42);
    // vnew.push_back(43);
    // vnew.push_back(44);
    // vnew.pop_back();
    // cout<<"size of vnew: "<<vnew.size()<<endl;
    // cout<<"capacity of vnew: "<<vnew.capacity()<<endl;
    // cout<<vnew.size();
    // vnew.erase(vnew.begin()+1);
    // cout<<"size of vnew: "<<vnew.size()<<endl;
    // cout<<"capacity of vnew: "<<vnew.capacity()<<endl;

    // for(int i=0; i<vnew.size(); i++)
    // cout<<vnew[i]<<" ";
    // //insert value
    // vnew.insert(vnew.begin()+1,50);
    // cout<<endl;
    // for(int i=0; i<vnew.size(); i++)
    // cout<<vnew[i]<<" ";
    // cout<<endl;
    // vnew[0]=37;
    // for(int i=0; i<vnew.size(); i++)
    // cout<<vnew[i]<<" ";
    // cout<<endl;

    // // clearing all elements
    // vnew.clear();
    // cout<<"size of vnew: "<<vnew.size()<<endl;
    // cout<<"capacity of vnew: "<<vnew.capacity()<<endl;
    // for(int i=0; i<vnew.size(); i++)
    // cout<<vnew[i]<<" ";
    // cout<<endl;

    // vector<int> arr;
    // arr.push_back(2);
    // arr.push_back(12);
    // arr.push_back(21);
    // arr.push_back(212);
    // cout << arr[0] << endl;
    // cout << arr.front() << endl;
    // cout<< arr[arr.size()-1] << endl;
    // cout << arr.back() << endl;

    // // vector copy
    // vector<int>a;
    // a = arr;
    // cout<<a.size();
    // cout<<endl;
    // for(auto it=arr.begin(); it!=arr.end(); it++)
    // {
    //     cout<<*it<<" ";
    // }
    // cout<<endl;
    // for(auto i: arr)
    // cout<<i<<" ";

    // sorting vector
    vector<int>ans;
    ans.push_back(5);
    ans.push_back(455);
    ans.push_back(56);
    ans.push_back(574);
    ans.push_back(578);

    // sorting in ascending order
    sort(ans.begin(),ans.end());
    for(int i=0; i<ans.size(); i++)
    cout<<ans[i]<<" ";
    cout<<endl;
    // sorting in descending order
    // sort(ans.rbegin(),ans.rend());
    // for(int i=0; i<ans.size(); i++)
    // cout<<ans[i]<<" ";
    // cout<<endl;

    // search in binary search
    cout<<binary_search(ans.begin(),ans.end(),56)<<endl;;

    cout<<find(ans.begin(),ans.end(),56)-ans.begin()<<endl;;



    return 0;
}