import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        n=sc.nextInt();
        x=new int[n];
        int min=x[0];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]<min);
            min=x[i];
        }
        System.out.println(min);
    }
}