public class quicksort {
    public static void main(String[] args){
        int[] arr={10,5,8,9,3,15,12,16};
        print(arr);
        sort(arr, 0,arr.length-1);
        System.out.println();
        System.out.print("Sorted array: ");
        print(arr);

    }
    public static void sort(int[] arr, int low,int high){
        if(low<high) {
            int j = partition(arr, low, high);
            sort(arr, low, j - 1);
            sort(arr, j+1, high);
        }
    }

    public static int partition(int[]arr, int low,int high){
        int mid=low+(high-low)/2;
        int pivot=arr[mid];
        swap(arr,low,high);
        int i=low;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,high);
        return i;
    }

    public static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}