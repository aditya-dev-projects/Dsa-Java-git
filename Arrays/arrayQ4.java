public class arrayQ4{
    // Print Subarrays Of Given Array
    public static void subArrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start =i;//Optional
            for(int j=i;j<numbers.length;j++){
                int end =j;//Optional
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+"");
                    
                }System.out.println();
                ts++;
            }System.out.println();
            
        }System.out.println("Total Subarrays are:"+ts);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArrays(numbers);
    }
}