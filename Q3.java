import java.util.Scanner;
/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
     
    /**
     * Constructor for objects of class Q3
     */
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       int b[] = new int[10];
       int c;
       
       
       System.out.println("Input 10 numbers");
    
       for(int i=0;i<b.length;i++){
           b[i] = a.nextInt();
       }
       System.out.println("Which number would you like to find");
       c = a.nextInt();
       for(int i=0;i<b.length;i++){
           if(c==b[i]){
               System.out.println("Found");
           }else{
               System.out.println("not found");
           }
       }
       
       
       
       
       
       
    }

    
}
