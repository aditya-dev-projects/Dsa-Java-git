import java.util.Scanner;

public class problem2 {
    // Write a method isEven(int num) that returns true if the number is even, else false.
    public static int isEven(int n){
        if (n%2==0) {
    System.out.println("Given number is even");
    
   } else {
    System.out.println("Given number is odd");
   }
  return 2;     
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check");
    int n = sc.nextInt();
   
    isEven(n);

 }   
}
