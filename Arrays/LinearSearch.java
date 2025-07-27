public class LinearSearch {
    public static int LinearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int numbers[]={1,4,2,5,6,8,9};
        int key=6;
        int index=LinearSearch(numbers,key);
        if (index != -1) {
            System.out.println("Key is found at index " + index);
        } else {
            System.out.println("Key not found");
        }
        }
    }
    

