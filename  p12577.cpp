#include <iostream>
using namespace std;

int main()
{
    string line;
    int count=1;

    while(cin>>line)
    {
        if(line[0]=='*')
        break;
        else if(line[0]=='H')
            cout<<"Case "<<count++<<": Hajj-e-Akbar"<<endl;
        else
            cout<<"Case "<<count++<<": Hajj-e-Asghar"<<endl;
    }
}
