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
         
          for(int j=1;j<=N;j++)
          {
              if(j==1 || i==N || j==i)
              
                   System.out.print("*");
              else
                   System.out.print(" ");
              
             
              
          }
          System.out.println();
      }
      
    }
}
