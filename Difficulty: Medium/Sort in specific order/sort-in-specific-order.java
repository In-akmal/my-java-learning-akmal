import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public void sortIt(int[] arr) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        // Step 1: Separate odds and evens
        for (int num : arr) {
            if (num % 2 != 0) {
                odds.add(num); // Odd
            } else {
                evens.add(num); // Even
            }
        }

        // Step 2: Sort odds descending and evens ascending
        Collections.sort(odds, Collections.reverseOrder());
        Collections.sort(evens);

        // Step 3: Merge them back into the original array
        int index = 0;

        // Put sorted odds first
        for (int num : odds) {
            arr[index++] = num;
        }

        // Put sorted evens next
        for (int num : evens) {
            arr[index++] = num;
        }
    }
}
