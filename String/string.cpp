#include <iostream>
#include <string>
using namespace std;

int main()
{
    // char arr[] = {'a','p','p','l','e'};
    // for(int i=0; i<5; i++)
    // cout<<arr[i];

    // char arr[10];
    // cin>>arr;
    // arr[2]='\0';
    // cout<<arr;

    // string s = "Aditya";
    // cout<<s;

    // string s;
    // cin>>s;
    // cout<<s;

    // string s;
    // getline(cin,s);
    // cout<<s;

    // string s = "Aditya";
    // cout<<s.size();

    // string s1 = "aditya", s2 = "pawar";
    // s1.push_back('a');
    // // s1 = s1+'p';
    // s1.pop_back();
    // string s3 = s1+s2;
    // // string s3 = s1.append(s2);
    // cout<<s3;

    // string s = "Rohit negi is \"best\" educator";
    // cout<<s;  // \ is escape character
    // string n = "\0";
    // cout<<n;  // \0 is Null character

    // reverse string
    /*
    string s;
    getline(cin,s);
    cout<<s;
    int start=0, end = s.size()-1;
    while(start<end)
    {
        swap(s[start],s[end]);
        start++,end--;
    }
    cout<<endl;
    cout<<s;
    */

    // find size
    /*
    string s;
    getline(cin,s);
    int size=0;
    while(s[size]!='\0')
    {
     size++;
    }
    cout<<endl;
    cout<<size<<" ";
    */

    // Palindrome?
    /*
    string s;
    cin>>s;
    int start=0, end=s.size()-1;
    while(start<end)
    {
      if(s[start]!=s[end])
      {
          cout<<"Not a Palindrome...";
          return 0;
      }
      start++, end--;
    }
    cout<<"Palindorme...";
    */
}   