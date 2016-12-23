/**
 * Created by Shankar on 11/5/2016.
 */
public class TestMain {
    public static void main(String[] args) {
        Solution soln1 = new Solution();

        int[] arr = {1,2,3,9,5,4};

        System.out.println("Min Moves = " + soln1.minMoves(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
