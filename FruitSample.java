import java.util.Scanner;

public class FruitSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("Please Select your Fav Fruit");
            System.out.println("1. Apple");
            System.out.println("2. Banana");
            System.out.println("3. Orange");
            int fav = sc.nextInt();

            switch (fav) {
                case 1:
                    System.out.println("√ You Chose Apple!");
                    break;

                case 2:
                    System.out.println("√ You Chose Banana");
                    break;

                case 3:
                    System.out.println("√ You Chose Orange");
                    break;

                default:
                    System.out.println("∆ Please Type Between 1-3 numbers only");
            }
        }
        sc.close();
    }
}
