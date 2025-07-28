package AdvancedPatterns;

public class pattern4 {
    public static void floydsTriangle(int row,int col){
        int n = row;
        int counter =1;
        for (int i = 1; i<=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        floydsTriangle(5, 0);
        
    }
}
