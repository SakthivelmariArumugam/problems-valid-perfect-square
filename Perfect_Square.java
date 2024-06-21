import java.util.Scanner;

public class Perfect_Square {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        boolean s=true;
        for(int i=1;i<=n/2;i++)
        {
            if(i*i==n) {
                s=true;
                break;
            }
            if(i*i>=n)
            {
                s=false;
                break;
            }
        }
        if(s==true)
        {
            System.out.println("perfect Square");
        }
        else
        {
            System.out.println("Not Perfect Square");
        }
    }

}
