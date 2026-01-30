import java.util.Scanner;
/**
 * Write a description of class Q10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q10
{
   

    /**
     * Constructor for objects of class Q10
     */
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       int b[][] = new int[3][3];
       int sum=0;
       
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               b[i][j] = a.nextInt();
               sum=b[i][j] + sum;
           }
           System.out.println(sum);
           sum=0;
       }
    }

   
}
