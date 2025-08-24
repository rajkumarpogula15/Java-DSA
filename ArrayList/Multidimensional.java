import java.util.ArrayList;

public class Multidimensional {
    public static void main(String[] args) {
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> MultiList = new ArrayList<>();

        // Creating and adding individual lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);//1 2 3 4 5
            list2.add(i * 2);//2 4 6 8 10
            list3.add(i * 3);//3 6 9 12 15
        }
        MultiList.add(list1);//adding list1 to MultiList
        MultiList.add(list2);//adding list2 to MultiList
        MultiList.add(list3);//adding list3 to MultiList

        // Displaying the 2D ArrayList
        System.out.println("MultiList : " + MultiList);

        // Accessing elements
        System.out.println("Element at (0,0): " + MultiList.get(0).get(0)); // 1

        //printing all elements of MultiList
        System.out.println("Printing MultiList elements:");
        for (int i = 0; i < MultiList.size(); i++) {
            for (int j = 0; j < MultiList.get(i).size(); j++) {
                System.out.print(MultiList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        //Removing element 10 from list2
        list2.remove(Integer.valueOf(10));
        System.out.println("After removing 10 from list2, list2: " + list2);
        System.out.println("After removing 10 from list2, MultiList: " + MultiList);

        //Remove element 8 directly from MultiList (list2 is at index 1)
        MultiList.get(1).remove(Integer.valueOf(8));
        System.out.println("After removing 8 using MultiList, list2: " + list2);
        System.out.println("After removing 8 using MultiList: " + MultiList);
    }
}
