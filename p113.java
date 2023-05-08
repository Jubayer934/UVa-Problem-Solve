package UVa;
import java.util.*;
import java.lang.Math;
public class p113 {
    public static void main(String[] ags){
        double num1=0,num2=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextDouble())
        {
            num1=sc.nextDouble();
            num2=sc.nextDouble();
            double tem=0;
            tem=1/num1;
            tem=Math.pow(num2,tem);

            System.out.println(+Math.round(tem));
        }

        sc.close();
    }
    
}
