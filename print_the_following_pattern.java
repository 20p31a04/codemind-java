import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
      Scanner scr=new Scanner(System.in);
      int N;
      N=scr.nextInt();
      for(int i=1;i<=N;i++)
      {
          int k=1;
          for(int j=N;j>=i;j--)
          {
              System.out.print(k);
              k++;
              
          }
          System.out.println();
      }
      
    }
}
