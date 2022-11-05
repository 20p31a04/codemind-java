import java.util.Scanner;
class dem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  n,a,b,sum=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            sum=a+b;
            System.out.println(sum);
        }
        
    
    }
}