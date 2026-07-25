class Solution {

    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        // Your code here
        A.add(x);

        // Just add, don't print anything
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {

        
        // Your code here
        Collections.sort(A);
        // Just sort, don't print anything
    }

        
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        Collections.reverse(A);
        // Just reverse, don't print anything
    }
        

    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        // Your code here
        return A.size();
        // Return the size of ArrayList
        
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here
        Collections.sort(A, Collections.reverseOrder());
        // Just sort in desc order, don't print anything
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Print the elements of A, don't add new line
        for(int num : A){
            System.out.print(num + " ");
        }
    }
}
