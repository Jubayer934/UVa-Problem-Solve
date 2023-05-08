#include <iostream>

using namespace std;

int main() {
	int num1,num2,i,rem,x,y;
 	while (cin>>num1>>num2)
    {
		int tem = 0,result=0;
        x=num1;
        y=num2;
        if (num1>num2)
        swap(num1,num2);
		for (i=num1;i<=num2;i++)
        {
            tem=1;
            rem=i;
           while(rem!=1)
           {
            if(rem%2==0)
            {
                rem=rem/2;
                tem++;
            }
            else
            {
                rem=rem*3+1;
                tem++;
            }
           }
            if(result<tem)
            result=tem;
        }
        cout<<x<<" "<<y<<" "<<result<<endl;
	}
    return 0;
}