/*Author: Jaymark Vicente
 * School: OMSC BSIT-1-E
 * Project: Simple Calculator
 * Programming level: Beginner
 */

import java.util.Scanner;
public class Vicente_SimpleCalculator {
    
    //declaring global variables
    static double num1,num2,proceed,proceed1,again,mdas;
    static Scanner input = new Scanner(System.in);
    
    //Function for clearing a screen
    private static void Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
    }
    //Function if User Type Wrong Statements
    private static double mismatch(String message) {
        while (true) {
            System.out.println(message);
            String Sc = input.nextLine();
        try {
            double re =Double.parseDouble(Sc);
            return re;         
        } catch (NumberFormatException e) {
            System.out.println("∆Error Please Type Numbers Only!\n √Enter Again");
            input.nextLine();
            Clear();
        }
    }
    }
    //Opening of program
    private static void intro() {
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°    Welcome to Simple Calculator in Java!  °");
        System.out.println("°        Made by Jaymark Vicente            °");
        System.out.println("°            BSIT-1-E OMSC                  °");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("        √Please Enter Twice to Proceed       ");
        input.nextLine();
        input.nextLine();
        Clear();
        num1st();
    }
    //Function for 1st Number
    private static void num1st(){
        num1 = mismatch("•Please Enter First Number");
        proceed = limitnum2(" •1.Proceed\n •2.Back");
        if (proceed == 1) {
            Clear();
            num2nd();
        } else if (proceed == 2){
            Clear();
            intro();
        }      
    }
    //Function For 2nd Number
    private static void num2nd() {
        num2 = mismatch("•Please Enter Second Number");
        proceed1 = limitnum2(" •1.Proceed\n •2.Back\n •3.Back to Menu");
        if (proceed1 == 1) {
            Clear();
            operators();
        } else if (proceed1 == 2) {
            Clear();
            num1st();
        } else if(proceed1 == 3) {
            Clear();
            intro();
        }
    }
    //Function For Operators
    private static void operators() {
        System.out.println("•Please Enter Operator (*,/,+,-)");
        char mdas = input.next().charAt(0);
        double result;
        switch (mdas) {
            case '*':
            result = num1 * num2;
            Clear();
            input.nextLine();
            System.out.println("•Result: " + result);
            again = mismatch("•Do you want to Calculate Again?\n •1.Yes\n •2.No");
            if (again == 1) {
                Clear();
                intro();
            } else if (again == 2) {
                
                Clear();
                System.out.println("•Thanks For Using Simple Calculator!");
                input.nextLine();
                input.nextLine();
                input.close();
                Clear();
            break;
        }
            case '+':
            result = num1 + num2;
            Clear();
            input.nextLine();
            System.out.println("•Result: " + result);
            again = mismatch("•Do you want to Calculate Again?\n •1.Yes\n •2.No");
            if (again == 1) {
                Clear();
                intro();
            } else if (again == 2) {
                
                Clear();
                System.out.println("•Thanks For Using Simple Calculator!\n√Please Enter Twice To Exit");
                input.nextLine();
                input.nextLine();
                input.close();
                Clear();
            break;
        }
            case '-':
            result = num1 - num2;
            Clear();
            input.nextLine();
            System.out.println("•Result: " + result);
            again = mismatch("•Do you want to Calculate Again?\n •1.Yes\n •2.No");
            if (again == 1) {
                Clear();
                intro();
            } else if (again == 2) {
                
                Clear();
                System.out.println("•Thanks For Using Simple Calculator!");
                input.nextLine();
                input.nextLine();
                input.close();
                Clear();
            break;
        }
            case '/':
            if (num2 == 0) {
                System.out.println("∆Error Cannot be Divide by Zero!\n√Enter Again");
                input.nextLine();
                input.nextLine();
                Clear();
                operators();
            } else {             
                result = num1 / num2;
                Clear();
                input.nextLine();
                System.out.println("•Result: " + result);
                again = mismatch("•Do you want to Calculate Again?\n •1.Yes\n •2.No");
                if (again == 1) {
                    Clear();
                    intro();
                } else if (again == 2) {
                    Clear();
                    System.out.println("•Thanks For Using Simple Calculator!\n√Please Enter Twice to exit");
                    input.nextLine();
                    input.nextLine();
                    input.close();
                    Clear();
                    
            }
            }
            default:
                System.out.println("∆Please Type Operators Only!\n√Enter Again");
                input.nextLine();
                input.nextLine();
                Clear();
                operators();
    }
    }
                
     //function to limit number of choices
    private static int limitnum(String msg) {
        while(true) {
            System.out.println(msg);
            String sc = input.nextLine();
            try {
                int limit = Integer.parseInt(sc);
                if (limit > 0 && limit <= 2) {
                    return limit;
                } else {
                    System.out.println("∆Please Type 1-2 Numbers Only!\n√Enter Again");
                    input.nextLine();
                    Clear();
                }
            } catch (NumberFormatException e) {
                System.out.println("∆Please Type Numbers Only!\n√Enter Again");
                input.nextLine();
                Clear();
            }
        }
    }
    //Function Number Limit Choices For Function Num2
    private static int limitnum2(String msg) {
        while(true) {
            System.out.println(msg);
            String sc = input.nextLine();
            try {
                int limit = Integer.parseInt(sc);
                if (limit > 0 && limit <= 3) {
                    return limit;
                } else {
                    System.out.println("∆Please Type 1-3 Numbers Only!\n√Enter Again");
                    input.nextLine();
                    Clear();
                }
            } catch (NumberFormatException e) {
                System.out.println("∆Please Type Numbers Only!\n√Enter Again");
                input.nextLine();
                Clear();
            }
        }
    }
    //Main entry Point of Program
    public static void main(String[] args) {
        intro();      
    }
}
    
