package BasicCalculatorJava.Operations;

import java.util.ArrayList;

/**
 * Division class for the division operation.
 */
public class division {
    private ArrayList<Integer> nums;

    public division (ArrayList<Integer> nums) { this.nums = nums; }

    public int doDivision() {
        int div = 0;
        for (Integer num : nums) {
            if (div == 0) { div = num; }
            else if (num == 0) { return 0; }
            else { div /= num; }
        }

        return div;
    }
}
