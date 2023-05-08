#include<iostream>
using namespace std;
int main()
{
    int row,col;
    int n;
    cin>>n;
    while(n--)
    {
           cin>>row>>col;
           int result;
           result=((row/3)*(col/3));
           cout<<result<<endl;
    }
 
}