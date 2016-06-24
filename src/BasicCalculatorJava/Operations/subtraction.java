package BasicCalculatorJava.Operations;

import java.util.ArrayList;

/**
 * This class is used for the subtraction operation. It has a property and a function
 * like the sum class.
 */
public class subtraction {
    private ArrayList<Integer> nums;

    public subtraction(ArrayList<Integer> nums) { this.nums = nums; }

    public int doSubtraction() {
        int sub = 0;
        for (Integer num : nums) sub -= num;

        return sub;
    }
}
