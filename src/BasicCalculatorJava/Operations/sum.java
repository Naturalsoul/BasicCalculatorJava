package BasicCalculatorJava.Operations;

import java.util.ArrayList;

/*
 * Sum class. It has an ArrayList variable who takes the variables for the sum.
 * I decide to not have a void constructor here 'cause may cause problems.
 *
 */

public class sum {
    private ArrayList<Integer> nums;

    public sum(ArrayList<Integer> nums) {
        this.nums = nums;
    }

    public int doSum() {
        int sum = 0;

        for (Integer num : nums) sum += num;

        return sum;
    }
}
