import java.util.Scanner;

public class problems {
    // Write a method maxOfThree(int a, int b, int c) that returns the largest number.
    public static int maxOfThree(int a,int b,int c){
        int max = a;
        if (b>a) {
            max =b;
            
        } else {
            max =c;
        }

         
            return max;
       
        }
        
      
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       
       int max = maxOfThree(a, b, c);

        // Print the result
        System.out.println("The maximum number is: " + max);
    }
    
}
