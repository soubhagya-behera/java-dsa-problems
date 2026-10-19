package twopointers;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int length = 0;

        for (int num : nums) {
            if (length == 0 || nums[length - 1] != num) {
                nums[length] = num;
                length++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(nums, length)));
        System.out.println("Length: " + length);
    }
}