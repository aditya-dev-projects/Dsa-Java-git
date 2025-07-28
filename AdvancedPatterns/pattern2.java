package AdvancedPatterns;

public class pattern2 {
    public static void invertedPyramid(int rows,int cols){
        for (int i = 1; i <=rows; i++) {
            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
                
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }System.out.println();
            }
            
        }public static void main(String[] args) {
        invertedPyramid(4, 0);
    }


    }
    
