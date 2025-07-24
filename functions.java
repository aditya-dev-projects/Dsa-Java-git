import java.util.*;
public class functions{ 
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }

    // Find the factorial 0f n (take input n)
    
        public static int factorial(int n){
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f*i;
                
            }
            return f;
        }
    
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        

    }
    
}


