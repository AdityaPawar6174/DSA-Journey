// Find missing number in array

#include <iostream>
#include <vector>
using namespace std;

// brute force
int findMissingNumber(vector<int>& a, int N){

    for(int i=1; i<=N; i++){
        int flag = 0;

        for(int j=0; j<N-1; j++){
            if(a[j] == i){
                flag = 1;
                break;
            }
        }

        if(flag == 0) return i;
    }

    return -1;
}

// optimised version
int missingNumber(vector<int>& a, int N){
    int sum = (N * (N + 1)) / 2;

    int s2 = 0;
    for(int i=0; i<N; i++){
        s2 += a[i];
    }
    return sum - s2;
}

int main(){
    int N = 5;
    vector<int> a = {1, 2, 3, 5};

    int ans = findMissingNumber(a, N);
    cout<<ans<<endl;

    int res = missingNumber(a, N);
    cout<<res<<endl;
    return 0;
}