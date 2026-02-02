import java.util.Scanner;
/**
 * Write a description of class Q17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q17
{
   

    /**
     * Constructor for objects of class Q17
     */
    public static void main(String[] args)
    {
        Scanner b = new Scanner(System.in);
        int a[][] = new int [4][4];
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j] = b.nextInt();
            }
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}
