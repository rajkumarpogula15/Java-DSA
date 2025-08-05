

public class SortedArray {
    public static boolean isSorted(int array[],int i){
        if((array.length-1)==i){
            return true;
        }
        if(array[i]>array[i+1]){
            return false;
        }
        return isSorted(array, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.print("Array elements are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        boolean a=isSorted(arr,0);
        if(a){
            System.out.println("\nArray is sorted");
        }
        else
        {
            System.out.println("\nArray is Not sorted");
        }
    }
}
