import java.util.*;
public class demo
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
       int i,j;
        for(i=1;i<=d;i++)
        {
            for(j=1;j<=d;j++)
            {
                if(i==1 || i==d || j==1 || j==d || i==j || i+j==d+1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}