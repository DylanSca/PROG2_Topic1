import java.util.Scanner;
/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
   
    /**
     * Constructor for objects of class Q2
     */
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int b[]= new int[10];
        int min,max,i=0;
        
        System.out.println("Enter 10 numbers"); 
        b[i]=a.nextInt();
        min=max=b[i];
        for(int j=1;j<b.length;j++){
            b[j] = a.nextInt();
            
            if(b[j]<min){
                min=b[j];
            }
            if(b[j]>max){
                max=b[j];
            }
        }
        System.out.println((max-min) + " " + "is the diffrence");
       
    }

   
}
