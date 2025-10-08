/**My First Project Simple Calculator Program
 * Created by Jaymark Vicente
 * BSIT 1 E 
 */
 
import java.util.Scanner;//import a java class to perform inputting data
import java.awt.font

public class SimpleCalculator {
    
    public static void main(String[] arg) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("This is Simple Calculator ");
        //asking a user an numbers to calculate
        System.out.println("Enter First Number");
        double num1 = input.nextDouble();
        
        System.out.println("Enter Second Number");
        double num2 = input.nextDouble();
        
        System.out.println("Enter Operations +,x,-,/");
        char operation = input.next().charAt(0);
        //programming the operations
        double result;
        switch (operation) {
            
            case '+':
            result = num1 + num2;
            System.out.println("Result: " + result);
            
            break;
            
            case '-':
            result = num1 - num2;
            System.out.println("Result: " + result);
            
            break;
            
            case 'x':
            case '*':
            result = num1 * num2;
            System.out.println("Result " + result);
            
            break;
            
            case '/':
            if (num1 != 0) {
                result = num1 / num2;
                System.out.println("Result " + result);
                
            } else {
                System.out.println("Error Division By Zero");
                
            }
            break;
            default:
            System.out.println("Invalid Operation Please Use +,-,/,x");
            
        }
        input.close();
    }
}
            
            
        