public class arrayQ2 {
    // REVERSE A GIVEN ARRAY;
    public static void reverse(int numbers[]){
         int i=0;//First Element Of Array
        int j=numbers.length -1;//Last Element Of Array
        while (i<j) {
            int temp = numbers[j];
            numbers[j]=numbers[i];
            numbers[i]=temp;
            i++;
            j--;

            
        }
        

        }
        public static void main(String[] args) {
            int numbers[]={2,4,6,8,10};
            reverse(numbers);
            // For Printing The Array
            for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
        }


    }
    

