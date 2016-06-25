package BasicCalculatorJava.Operations;

import java.util.ArrayList;

/**
 * Division class for the division operation.
 */
public class division {
    private ArrayList<Double> nums;

    public division (ArrayList<Double> nums) { this.nums = nums; }

    public double doDivision() {
        double div = 0;
        for (double num : nums) {
            if (div == 0) { div = num; }
            else if (num == 0) { return 0; }
            else { div /= num; }
        }

        return div;
    }
}
