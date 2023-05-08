package UVa;
import java.util.*;
public class p11044 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        while(n>=1)
        {
            n--;
            int row=0,col=0;
            row=sc.nextInt();
            col=sc.nextInt();
            int result=0;
            row=row/3;
            col=col/3;

            result=(row*col);
            System.out.println(+result);
        }

        sc.close();

    }
}
