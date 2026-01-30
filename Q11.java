import java.util.Scanner;
/**
 * Write a description of class Q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q11
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Q11
     */
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
       int b[][] = new int[3][3];
       int sum=0;
       
       for(int i=0;i<3;i++){
           sum=0;
           for(int j=0;j<3;j++){
               b[i][j] = a.nextInt();
               sum=b[j][i] + sum;
           }
           System.out.println(sum);
       }
       
    }

    
}
