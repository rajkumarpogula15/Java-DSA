public class SearchSortedArray {
    public static boolean SearchSortedArray (int arr[][],int key) {
        int row=0,col=arr.length-1;
        while(row<arr.length-1 && col>=0){
            if (arr[row][col]==key){
                System.err.println("key found at row "+row+" col "+col);
                return true;
            }
            else if (arr[row][col]<key){
                row++;
            }
            else {
                col--;
            }
        }
        System.err.println("Not found");
        return false;

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int key=4;
        SearchSortedArray(arr,key);
    }
}
