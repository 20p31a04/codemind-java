import java.util.Scanner;
class dem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        if(N<3)
           System.out.println(N-1);
        else
           System.out.println("2");
    }
}