package AdvancedPatterns;

class pattern1 {
// Print Hollow Rectangle Pattern
public static void hollowPattern(int totrow,int totcol){
    for (int i = 1; i <= totrow; i++) {
    for (int j = 1; j <= totcol; j++) {
        if (i == 1 || i == totrow || j == 1 || j == totcol) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println(); // <-- This should be inside the outer loop
}

}
    public static void main(String[] args) {
        hollowPattern(4, 5);
    }
}
