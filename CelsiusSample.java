import java.util.Scanner; 
public class CelsiusSample {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Temperature Checker"); 
        // Nagpi-print ng title o heading
        
        System.out.println("Enter Temperature in Celsius"); 
        // Nagpi-print ng instruction para sa user
        
        int celcius = sc.nextInt(); 
        // Nagbabasa ng integer input mula sa user at ise-save sa variable na "celcius"
        
        if (100 >= celcius && -100 <= celcius) {
            // Ichi-check kung ang input ng user ay nasa pagitan ng -100 hanggang 100
            // (ibig sabihin valid ang temperature kapag nasa range na ito)
            
            System.out.println("The Temperature is Valid");
            // Kung nasa range, ito ang ipapakita
        } else {
            System.out.println("The Temperature is not Valid");
            // Kung hindi pasok sa range, ito naman ang ipapakita
        }
        
        sc.close(); 
        // Sinasara ang Scanner para hindi na gumamit ng unnecessary memory/resources
    }
}
