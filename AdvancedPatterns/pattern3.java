package AdvancedPatterns;

public class pattern3 {
    public static void inverted_pyramid_numbers(int row,int col){
        int n = row;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        inverted_pyramid_numbers(5, 0);
    }
}
