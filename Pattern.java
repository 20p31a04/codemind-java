import java.util.Scanner;
class dem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();//row
        for(int i=1;i<=n;i++)//col
         {
             for(int j=1;j<=n;j++)
              System.out.print(i+" ");
                System.out.println();
               
         }
     
        
    }
}