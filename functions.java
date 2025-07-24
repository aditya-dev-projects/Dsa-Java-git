import java.util.*;
public class functions{ 

     // Find the factorial 0f n (take input n)
    
        public static int factorial(int n){
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f*i;
                
            }
            return f;
        }
        // find binomial co-efficent of n 
        public static int coeff(int n,int r){
           

            int a = factorial(n);
            int b = factorial(r);
            int c = factorial(n-r);
                 int coeff=a/(b*c);
        
                 return coeff;
            
        }
    
    public static void main(String[] args) {
        
       
       
     
            System.out.println(coeff(5, 2));
   

    }
    
}


   

