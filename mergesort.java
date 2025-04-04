public class mergesort {
    public static void main(String[] args){
        int[] arr={15,5,24,8,1,3,16,10,20};
        System.out.println("Unsorted");
        print(arr);
        divide(arr,0,arr.length-1);
        System.out.println("Sorted");
        print(arr);
    }
    public static void divide(int[] arr,int start,int end){
        if(start<end){
            int mid=start+((end-start)/2);
            divide(arr,start,mid);
            divide(arr,mid+1,end);
            conquer(arr,start,mid,end);
        }
    }
    public static void conquer(int[] arr,int start,int mid,int end){
        int[] merged= new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=end){
            if(arr[idx1]<arr[idx2]){
                merged[x]=arr[idx1];
                idx1++;
                x++;
            }else{
            merged[x]=arr[idx2];
            idx2++;
            x++;
        }
        }
        while(idx1<=mid){
            merged[x]=arr[idx1];
            idx1++;
            x++;
        }
        while(idx2<=end){
            merged[x]=arr[idx2];
            idx2++;
            x++;
        }
        for(int i=0;i<merged.length;i++){
            arr[start+i]=merged[i];
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
