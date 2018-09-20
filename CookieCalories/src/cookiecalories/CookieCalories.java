package cookiecalories;
import java.util.Scanner;
/**
 *
 * @author Joshua Fiedler
 */
public class CookieCalories 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int cookies;     // User tells me number of cookies
       int calories;    // Number of calories consumed
       Scanner input = new Scanner(System.in);
       
       final double CALORIES_PER_COOKIE = 300 / (40.0/10);
       
       System.out.print("How many cookies did you eat?  ");
       
       cookies = input.nextInt();
       
       
       System.out.println("You consumed " + 
               cookies * CALORIES_PER_COOKIE + 
               " calories.");
       
    }
    
}
