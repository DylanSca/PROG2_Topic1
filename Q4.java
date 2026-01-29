import java.util.Scanner;
/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
   

    /**
     * Constructor for objects of class Q4
     */
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int b[] = new int[10];
        
        System.out.println("input 10 numbers");
        for(int i=0;i<b.length;i++){
            b[i] = a.nextInt();
        }
        int sum=0;
        for(int i=0;i<b.length;i++){
            sum = b[i] + sum;
        }
        
        int avg = sum/10;
        for(int i=0;i<b.length;i++){
            if(b[i]>avg){
                System.out.println(b[i]);
            }
           
        }
        }
    }

    

