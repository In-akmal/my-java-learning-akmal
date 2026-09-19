class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // Base case: If the window has 1 or 0 elements, it is already sorted
        if (l >= r) {
            return;
        }

        // Step 1: Find the middle point to split the array
        int mid = l + (r - l) / 2;

        // Step 2: Recursively sort the left and right halves
        mergeSort(arr, l, mid);      // Left half
        mergeSort(arr, mid + 1, r);  // Right half

        // Step 3: Merge the two sorted halves together
        merge(arr, l, mid, r);
    }

    private void merge(int arr[], int l, int mid, int r) {
        // Find sizes of the two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temporary arrays to hold the divided segments
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy original array data into temporary arrays
        for (int i = 0; i < n1; ++i) left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) right[j] = arr[mid + 1 + j];

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
