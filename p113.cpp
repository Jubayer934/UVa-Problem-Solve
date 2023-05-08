#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    long double  num1,num2;
    while(cin>>num1>>num2)
    {
        double tem;
        tem=1/num1;
        tem=pow(num2,tem);
        
        printf("%.0lf\n",tem);

    }
}