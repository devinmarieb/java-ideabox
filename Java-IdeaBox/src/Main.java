import java.util.Scanner;

//PRINTING OUT PRINT VS PRINTLN
//public class Main {
//    public static void main(String args[]) {
//        double tree;
//        tree = 5.25;
//
//        System.out.print("I want ");
//        System.out.println(tree);
//    }
//}

//VARIABLES
//class Main {
//    public static void main(String args[]) {
//        Scanner devin = new Scanner(System.in);
//        System.out.println(devin.nextLine());
//    }
//}

//CALCULATOR
class Main {
    public static void main(String args[]) {
        Scanner devin = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first number: ");
        fnum = devin.nextDouble();
        System.out.println("Enter second number: ");
        snum = devin.nextDouble();
        System.out.println(fnum + snum);
    }
}
