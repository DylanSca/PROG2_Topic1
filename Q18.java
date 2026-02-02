import java.util.Scanner;
/**
 * Write a description of class Q18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q18
{
   
    /**
     * Constructor for objects of class Q18
     */
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       int b[][] = new int[4][4];
       
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                b[i][j] = a.nextInt();
            }
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }

    
}
