import java.util.Scanner;
class GCD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,M;
        N=sc.nextInt();
        M=sc.nextInt();
        int g=0;
       for(int i=1;i<=N;i++)
        {
            if(N%i==0 && M%i==0)
              g=i;
        }
        System.out.println(g);
    }
}