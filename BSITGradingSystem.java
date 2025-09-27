/**Good day! my name is Jaymark Vicente
 * BSIT Student section 1-E from OMSC
 * I made this code to enhance my java programming
 * This project is called Simple Grading System in Java
 * that calculates the grades of a student from BSIT 1st year
 * 1st semester
 * Thank you Have a Good day!
 */
import java.util.Scanner;//para makapag input si user
public class BSITGradingSystem {
    //Global Variables ng mga subjects
    static double CP1,WST1,ITC,UTS,MCT;
    static double ITF,NSTP1,MMW,KKF;
    static Scanner input = new Scanner(System.in);//Input object para sa lahat ng subject
    
    //para mag clear ng screen
    public static void Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();       
    }
    //Introduction ng Program
    public static void introduction() {
    
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");       
        System.out.println("•              Welcome to Simple             •");
        System.out.println("•          Grading System in Java!           •");
        System.out.println("•          Made by: Jaymark Vicente          •");
        System.out.println("•            BSIT-1-E OMSC Sablayan          •");
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.println("        °Please Press Enter to Proceed°");
        input.nextLine();
        input.nextLine();
        Clear();
        subject1st();//Proceed sa unang Subject        
    }
    //1ST Subject sa BSIT 1st Semester
    public static void subject1st() {
           
        CP1 = mismatch("°What is your Grade in Computer Programming 1?\n°Please Enter Your Grade");       
        double proceedCP1 = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back");
        if (proceedCP1 == 1) {
            Clear();
            subject2nd();//Proceed sa 2nd subject
            
        } else if (proceedCP1 == 2) { //para bumalik sa introduction
            Clear();
            introduction();
    }
    }
    //2nd Subject sa BSIT
    public static void subject2nd() {
        
        WST1 = mismatch("°What is your Grade in Web Systems and Technology 1?\n°Please Enter Your Grade:");        
        double proceedWST1 = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back\n °3.Back to menu");
        if (proceedWST1 == 1) {
            Clear();            
            subject3rd();//Proceed sa 3rd Subject
        } else if (proceedWST1 == 2) { //para bumalik sa 1st subject
            Clear();
            subject1st();
        } else if (proceedWST1 == 3) {
            Clear();
            introduction();//Para bumalik ulit sa menu
        }
    }
      //3rd Subject
    public static void subject3rd() {
        
        ITC = mismatch("°What is your Grade in Introduction to Computing?\n°Please Enter Your Grade:");
        double proceedITC = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back\n °3.Back to menu");
        if (proceedITC == 1) {    
            Clear();            
            subject4th();//Proceed sa 4th Subject
        } else if (proceedITC == 2) { //para bumalik sa 2nd subject
            Clear();
            subject2nd();
        } else if (proceedITC == 3) {
            Clear();
            introduction();           
        }
    }
     //4th Subject
    public static void subject4th() {
        
        UTS = mismatch("°What is your Grade in Understanding The Self?\nPlease Enter Your Grade:");       
        double proceedUTS = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back\n °3.Back to menu");
        if (proceedUTS == 1) { 
            Clear();
            subject5th();//Proceed sa 5th subject                      
        } else if (proceedUTS == 2) { //para bumalik sa 3rd subject
            Clear();
            subject3rd();//Balik sa 3rd Subject
        } else if (proceedUTS == 3) {
            Clear();
            introduction();//para bumalik sa introduction
    }
    }
     //5th Subject
    public static void subject5th() {
        
        MCT = mismatch("°What is your Grade in Movement Competency Training?\n°Please Enter Your Grade:");
        double proceedMCT = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back\n °3.Back to menu");
        if (proceedMCT == 1) {           
            Clear();
            subject6th();//Proceed sa 6th subject
        } else if (proceedMCT == 2) { //para bumalik sa 4th subject
            Clear();
            subject4th();//Balik sa 4th subject
        } else if (proceedMCT == 3) {
            Clear();
            introduction();//para bumalik sa introduction
    }
    }
    //6th Subject
    public static void subject6th() {
              
        ITF = mismatch("°What is your Grade in Information Technology Fundamentals?\n°Please Enter Your Grade:");
        double proceedITF = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back\n °3.Back to menu");
        if (proceedITF == 1) {           
            Clear();
            subject7th();
        } else if (proceedITF == 2) { //para bumalik sa 5th subject
            Clear();
            subject5th();//Balik sa 5th subject
        } else if (proceedITF == 3) {
            Clear();
            introduction();//para bumalik sa introduction
    }
    }
    //7th Subject
    public static void subject7th() {
        
        NSTP1 = mismatch("°What is your Grade in National Service Training Program 1?\n°Please Enter Your Grade:");
        double proceedNSTP1 = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back\n °3.Back to menu");
        if (proceedNSTP1 == 1) {           
            Clear();
            subject8th();
        } else if (proceedNSTP1 == 2) { //para bumalik sa 6th subject
            Clear();
            subject6th();//Balik sa 6th subject
        } else if (proceedNSTP1 == 3) {
            Clear();
            introduction();//para bumalik sa introduction
    }
    }
    //8th Subject
    public static void subject8th() {
        
        MMW = mismatch("°What is your Grade in Mathematics in the Modern World?\n°Please Enter Your Grade");
        double proceedMMW = mismatch("°Do you want to Proceed?\n °1.Proceed\n °2.Back\n °3.Back to menu");
        if (proceedMMW == 1) {           
            Clear();
            subject9th();
        } else if (proceedMMW == 2) { //para bumalik sa 7th subject
            Clear();
            subject7th();//Balik sa 7th subject
        } else if (proceedMMW == 3) {
            Clear();
            introduction();//para bumalik sa introduction
    }
    }
        //9th Subject
    public static void subject9th() {
        
        KKF = mismatch("°Last Subject:\n°What is your Grade in Kontekswalisadong Komunikasyon sa Filipino?\n°Please Enter Your Grade:");
        //Dito na lalabas ang total Average at kung pasado ba or hindi
        subjectResults();
        System.out.println("°Enter if you want to Proceed to your total Average");
        input.nextLine();
        Clear();
        gradecompute();
    }
    //Method sa pag compute ng Total Average ng Student
    public static void gradecompute() {
        double totalavg = CP1+WST1+ITC+UTS+MCT+ITF+NSTP1+MMW+KKF;
        double subjects = 9;
        double finalgrade = totalavg / subjects;
        System.out.println("•••••••••••••••••••••••••••••••••••••••••••");
        System.out.println("•°Your Total Average is: " + finalgrade +"•");
        System.out.println("•••••••••••••••••••••••••••••••••••••••••••");
        if (finalgrade >= 75) {
            System.out.println("°Congrats! You are Passed! Keep it up!");
            backtomenu();
        } else {
            System.out.println("°Sorry you are Failed Better luck next time!");
            backtomenu();
    }
    }
    //Para ibalik sa introduction 
    public static void backtomenu() {
        
        double option = mismatch("\n°Do you want to Compute Again?\n °1.Yes\n °2.No\n 3.View Resulst");
        if (option == 1) {
            Clear();
            introduction();
        } else if (option == 2) {
            Clear();
            System.out.println("°Thanks for using Simple Grading System in Java!");
        } else if (option == 3) {
            Clear();
            subjectResults();
            gradecompute();
        }
    }
    //Code para kapag iba or hindi exact number ang itype ni user
    //Para hindi mag Crash
    public static double mismatch(String message) {
        while (true) {
            System.out.println(message);
            String Sc = input.nextLine();
            try {
                double grade = Double.parseDouble(Sc);
                if (grade >= 0 && grade <= 100) {
                    return grade;
                } else {
                    System.out.println("Grade Must be between 0 and 100 numbers only");
                    input.nextLine();
                    Clear();
                }       
            } catch (NumberFormatException e) {
                System.out.println("Error! Please Type Numbers Only!");
                input.nextLine();
                Clear();
            }
        }
    }
    //Para malaman ng user kung ano mga grades nya sa bawat subject
    public static void subjectResults() {
        Clear();
        System.out.println("°Your Subjects Grades°");
        System.out.println(" °1.CP1:-" + CP1 + "-" + remarks(CP1));
        System.out.println(" °2.WST1:-" + WST1 + "-" + remarks(WST1));
        System.out.println(" °3.ITC:-" + ITC + "-" + remarks(ITC));
        System.out.println(" °4.UTS:-" + UTS + "-" + remarks(UTS));
        System.out.println(" °5.MCT:-" + MCT + "-" + remarks(MCT));
        System.out.println(" °6.UTF:-" + ITF + "-" + remarks(ITF));
        System.out.println(" °7.NSTP1:-" + NSTP1 + "-" + remarks(NSTP1));
        System.out.println(" °8.MMW:-" + MMW + "-" + remarks(MMW));
        System.out.println(" °9.KKF:-" + KKF + "-" + remarks(KKF));
    }
    //Para sa subjectresults at bawat ratings ng performance ng students
    public static String remarks(double grade) {
        if (grade >= 90) return "Excellent";
        if (grade >= 85) return "Very Good";
        if (grade >= 80) return "Good";
        if (grade >= 75) return "Passed";
        return "Failed";
    }
    public static void main(String[] args) {
        introduction();
    }
}
            
//End of Codes 
//If you want to copy my code please Search 
//Jaymark Vicente in Facebook for Permission
//Please do not steal my code beacause i'm a beginner
//please Respect me as your fellow Programmers Thank you!
