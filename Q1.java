import java.util.Scanner;
/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    
    

    /**
     * Constructor for objects of class Q1
     */
    public Q1()
    {
      Scanner a = new Scanner(System.in);
      int b[] = new int[10];
      int i=0,ev=0,od=0;
      
      for(i=0;i<10;i++){
          System.out.println("Enter a #");
          b[i]=a.nextInt();
          if(b[i]%2==0) {
             ev++; 
          }
          else{
              od++;
          }
      }
      System.out.println("Count of even numbers:" + ev + ", and count of odd numbers: " + od);
    }

   
}
