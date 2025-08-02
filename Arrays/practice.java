public class practice {
    //print unique number from a given sorted array array and sum of the unique elements
    public static void main(String[] args){
         int arr[]={1,1,2,3,3,4,4,5,6};
         int sum=0;
         for(int i=0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i]==arr[i+1]){
                continue;
            }
            else{
                System.out.print(arr[i]+" ");
                sum=sum+arr[i];
            }
         }
         System.out.println("\nSum of unique elements "+sum);
    }
}
