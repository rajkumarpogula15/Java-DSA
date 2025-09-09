public class ChocolaProblem {
    public static void main(String[] args) {
        
        int[] horizontalCuts = {2, 1, 3}; // costs for horizontal cuts
        int[] verticalCuts = {1, 2, 3, 1}; // costs for vertical cuts
        System.out.println("Horizontal Cuts: " + java.util.Arrays.toString(horizontalCuts));
        System.out.println("Vertical Cuts: " + java.util.Arrays.toString(verticalCuts));
        // Sort the cut costs in descending order
        java.util.Arrays.sort(horizontalCuts);
        java.util.Arrays.sort(verticalCuts);
        
        // Reverse the arrays to have them in descending order
        horizontalCuts = reverseArray(horizontalCuts);
        verticalCuts = reverseArray(verticalCuts);

        //Greedily select the cuts
        int hIndex = 0, vIndex = 0;
        int hPieces = 1, vPieces = 1;
        int totalCost = 0;

        while (hIndex < horizontalCuts.length && vIndex < verticalCuts.length) {
            if (horizontalCuts[hIndex] > verticalCuts[vIndex]) {
                totalCost += horizontalCuts[hIndex] * vPieces;
                hPieces++;
                hIndex++;
            } else {
                totalCost += verticalCuts[vIndex] * hPieces;
                vPieces++;
                vIndex++;
            }
        }

        // Process remaining horizontal cuts
        while (hIndex < horizontalCuts.length) {
            totalCost += horizontalCuts[hIndex] * vPieces;
            hPieces++;
            hIndex++;
        }

        // Process remaining vertical cuts
        while (vIndex < verticalCuts.length) {
            totalCost += verticalCuts[vIndex] * hPieces;
            vPieces++;
            vIndex++;
        }

        System.out.println("Minimum cost to cut the chocolate: " + totalCost);
    }

    private static int[] reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

}
