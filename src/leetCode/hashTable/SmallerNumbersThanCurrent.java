package leetCode.hashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        SmallerNumbersThanCurrent obj = new SmallerNumbersThanCurrent();

        int[] nums = {8,1,2,2,3};
        int[] ints = obj.smallerNumbersThanCurrent(nums);
        for(int i : ints) {
            System.out.println(i);
        }

    }


    public int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();

        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }

        return copy;
    }
}
