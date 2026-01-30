import java.util.Scanner;
/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    

    /**
     * Constructor for objects of class Q6
     */
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int b[] = new int[10];
       
        
        
        System.out.println("Input 10 #");
        for(int i=0;i<b.length;i++){
            b[i] = a.nextInt();
        }
        for(int i=0;i<b.length-1;i++){
            for(int y=0;y<b.length-1;y++){
                if(b[y]>b[y+1]){
                    
                    int temp= b[y];
                    b[y] = b[y+1];
                    b[y+1] = temp;
                }
                
                
                
                
                
            }
        }
        for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
    }
}
    
}
