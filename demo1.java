import java.util.*;
public class demo1
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
       int i,j;
       for(i=1;i<d;i++)
       {
        for(j=1;j<(d*2)-i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
       for(int k=d;k>=1;k--)
       {
        for(int f=(d*2)-k;f>=1;f--)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
}