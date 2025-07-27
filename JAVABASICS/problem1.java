import java.util.*;

public class problem1 {
    // Enter 3 numbers from the user & make a function to print their average
    public static void main(String[] args) {
        avgNum();

    }

    public static void avgNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        double a = sc.nextDouble();
        System.out.println("Enter the number b:");
        double b = sc.nextDouble();
        System.out.println("Enter the number c:");
        double c = sc.nextDouble();
        double sum = a + b + c;
        double avg = sum / 3;
        System.out.println("The average of a,b,c is:"+avg);

    }

}