public class binarysearch {
    public static int binarysearch(int numbers[],int key){
        int start =0,end = numbers.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            // Comparisions 
            if (numbers[mid]==key) {
                return mid;
                
            }
            if (numbers[mid]<key) {
                start = mid+1;
                
            }else{
                end=mid-1;
            }
            
        }return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key =100;
        int index =binarysearch(number, key);
        if (index==-1) {
            System.out.println("The key not found");
            
        } else {
            System.out.println("The index of key is in :"+index);
           
            
        }
        
    }
    
}
// BY TIME COMPLEXITY BINARY SEARCH IS BETTER THAN LINEAR SEARCH 