import java.util.LinkedList;
import java.util.List;

public class CodeSignal_first_duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 3, 2};

        int duplicate = -1;
        int duplicateIndex = Integer.MAX_VALUE;

        List<Integer> checked = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!checked.contains(arr[i])) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && j<duplicateIndex) {
                        duplicate = arr[i];
                        duplicateIndex = j;
                    }
                }
                checked.add(arr[i]);
            }
        }

        System.out.println(duplicate);
    }
}
