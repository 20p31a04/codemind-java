import java.util.Scanner;
class dem
{
    public static boolean ispalindrome(int x)
    {
        int r,temp=x,sum=0;
        while(x>0)
        {
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(temp==sum)
           return true;
        else
           return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
          {
             if(ispalindrome(i))
              System.out.print(i+" ");
             
             
             
          }
      
    }
}