package UVa;

import java.util.*;
public class p11364 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>=1)
        {
            n--;
            int len=sc.nextInt();
            int arr[]=new int[len];
            int max=0,min=100;
            for(int i=0;i<len;i++)
            {
                arr[i]=sc.nextInt();
                
                if(max<arr[i])
                max=arr[i];

                if(min>arr[i])
                min=arr[i];
            }

            System.out.println(+((max-min)*2));
        }

        sc.close();
    }
}
