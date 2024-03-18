
public class arrayindex{
    public static void main(String[] args){
        int target=5;
        int[] arr={1,2,3,4,7,9};
        for(int i=0;i<arr.length;i++){
            if(target==arr[i])
            {
                System.out.println(i);
            }
            else if(arr[i]>target){
                System.out.println(i);
                break;
            }
            else if (arr[arr.length-1]<target){
                System.out.println(arr.length+1);
                break;
            }
            else  {
                continue;
            }
        }
        }
    } 