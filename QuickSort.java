
public class QuickSort{
    static void QuickSort(int arr[],int low,int high){
        int mid = (low+high)/2;
        int i=low;
        int j=high;
        int pivot = arr[mid];
        while(i<=j){
        while(arr[i]<pivot){
            i++;
        }
        while (arr[j]>pivot){
            j--;
        }
        if (i>=j){
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        }
        if(low<j)
        QuickSort(arr,low,j);
        
        if (high>i)
            QuickSort(arr,high,i);
    }

         
        public static void main (String[] args)
        {
            int arr[] ={9,6,2,8,4,90,24};
            System.out.println("Before sorting the elements are:");
            for(int i=0;i<arr.length;i++)
            {
            System.out.println(arr[i]);
         }
            QuickSort(arr,0,arr.length-1);
            System.out.println("After sorting the elements are:");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }

