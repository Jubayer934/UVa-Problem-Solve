package UVa;
import java.util.*;
public class p100 {    

    public static void main(String[] args){
      Scanner s=new Scanner(System.in);

      while(s.hasNextInt())
      {
        int num1=s.nextInt();
        int num2=s.nextInt();

        s.close();
        int tem1=num1;
        int tem2=num2;

        if(num1>num2)
        {
          int t=num1;
          num1=num2;
          num2=t;
        }
        int result=0;
        for(int i=num1;i<=num2;i++)
        {
          int n=cycle(i);
          if(result<n)
          {
            result=n;
          }
        }
        System.out.println(tem1+" "+tem2+" "+result);
      }
    }
    public static int cycle(int x)
    {
      int tem=1;
      while(x!=1)
      {
      if(x%2==0)
      {
        x=x/2;
        tem++;
      }
      else
      {
        x=3*x+1;
        tem++;
      }
    }
    return tem;

  }

  }