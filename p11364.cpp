#include <iostream>

using namespace std;
int main()
{
   int tem,len;
   cin >> tem;
   while (tem--)
   {
      cin >> len;
      int min = 100, max = 1, arr[len];

      for (int i = 0; i < len; i++)
      {
         cin >> arr[len];
         if (min > arr[len])
           min = arr[len];
         if (max < arr[len])
           max = arr[len];
      }
         cout << (max - min) * 2 << endl;
   }
   return 0;
}