package pattern;

//Pattern programming
import java.util.Scanner;
public class Pattern {
  public static void main (String args[]){
      int i,j,n,x;
      Scanner s = new Scanner(System.in);
      System.out.println("Please enter number of the rows for pattern 1:");
      n = s.nextInt();
      for(i=0;i<n;i++){
          for(j=0;j<=i;j++){
          System.out.print("* ");
          }
          System.out.println("");   
      }

      System.out.println("Please enter number of the rows for pattern 2:");
      n = s.nextInt();
      for(i=0;i<n;i++){
          for(j=0;j<n-i;j++){
          System.out.print("* ");
          }
          System.out.println("");   
      }

      System.out.println("Please enter number of the rows for pattern 3:");
      n = s.nextInt();
      for(i=0;i<n;i++){
          for(j=2*(n-i);j>=0;j--){
              System.out.print(" ");
          }

          for(x=0;x<=i;x++){
          System.out.print("* ");
          }

      System.out.println(""); 
      }

  }
}
//i=0 n=5
//j=8
//x=5 x
