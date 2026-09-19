class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // Base case: If low is less than high, the subarray has elements to sort
        if (low < high) {
            // Step 1: Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Step 2: Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);  // Left subarray
            quickSort(arr, pivotIndex + 1, high); // Right subarray
        }
    }

    private int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high]; 

        // Pointer for the greater element element
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the correct, fixed index position of the pivot
        return i + 1;
    }
}
