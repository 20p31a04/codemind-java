import java.util.Scanner;
class dem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i;
        n=sc.nextInt();
        arr=new int[n];
         for(i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         for(i=n-1;i>=0;i--)
          {
              if(arr[i]%2!=0)
              {
                  System.out.println(i);
                  break;
              }
          }
         
    }
}