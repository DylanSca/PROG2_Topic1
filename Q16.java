
/**
 * Write a description of class Q16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q16
{
    
    /**
     * Constructor for objects of class Q16
     */
    public static void main(String[] args)
    {
       int a[] = {1,2,3,4,5};
       int b[] = {6,7,8,1,1,5};
       
       
       for(int i=0;i<a.length;i++){
           
           for(int j=0;j<b.length;j++){
               if(a[i] == b[j]){
                   System.out.println(a[i] + " and "+ b[j] + " are the same");
               }
           }
       }
    }

    
}
