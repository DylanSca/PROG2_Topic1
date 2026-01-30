import java.util.Scanner;
/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Q7
     */
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       int b[] = new int[10];
       int p = 2;
       int flag = 0;
       
       System.out.println("Please input 10 #");
       for(int i=0;i<b.length;i++){
           b[i] = a.nextInt();
       }
       for(int i=0;i<b.length;i++){
            
                if(p<b[i]){
                    flag =1;
                    break;
                    
                }
                p++;
            
            if(flag==0){
                System.out.println(b[i] + " is prime");
            }
            if(flag!=0){
                System.out.println(b[i] + " is not prime");
            }
        }
        for(int i=0;i<b.length;i++){
            
        }
    }

    
}
