import java.util.Scanner;
/**
 * Write a description of class q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q9
{
   

    /**
     * Constructor for objects of class q9
     */
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int b[][] = new int[4][4];
        int sum=0;
        int average=0;
        
        
        System.out.println("16 #");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                b[i][j] = a.nextInt();
            }
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum= sum + b[i][j];
                average= sum%16;
            }
        }
        System.out.println(average);
        
    }

   
}
