package BasicCalculatorJava.Operations;

import java.util.ArrayList;

/**
 * Multiplication operation. It has a property and a function.
 */

public class multiplication {
    private ArrayList<Integer> nums;

    public multiplication (ArrayList<Integer> nums) { this.nums = nums; }

    public int doMultiplication() {
        int mult = 0;
        for (Integer num : nums) {
            if (mult == 0) { mult = num; }
            else { mult *= num; }
        }

        return mult;
    }
}
