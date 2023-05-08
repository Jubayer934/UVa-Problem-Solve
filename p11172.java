package UVa;
import java.util.*;
public class p11172 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>=1)
        {
            n--;
           int num1=sc.nextInt();
           int num2=sc.nextInt();
           if(num1>num2)   
              System.out.println(">");
           else if(num1<num2)
           System.out.println("<");
           else  
           System.out.println("=");
        }

        sc.close();
    }

}