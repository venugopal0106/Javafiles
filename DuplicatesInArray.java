
// import java.util.Arrays;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        // Arrays.sort(arr);
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
            k++;
                }
                
            }
        }
        System.out.println(k);
    }
}
