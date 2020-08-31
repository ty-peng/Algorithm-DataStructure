package com.typeng.algorithm.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * </p>
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * </p>
 * <p>
 * 示例: 给定 nums = [2, 7, 11, 15], target = 9 <br/>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1].
 * </p>
 *
 * @author ty-peng
 * @date 2020-08-31 18:54
 */
public class Q0001TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int toAdd = target - nums[i];
            if (map.containsKey(toAdd)) {
                return new int[] { map.get(toAdd), i };
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("Not Found");
    }

    public static void main(String[] args) {
        Q0001TwoSum q = new Q0001TwoSum();
        int[] nums = { 1, 0, 1, 2 };
        int target = 2;
        System.out.println(Arrays.toString(q.twoSum(nums, target)));
    }
}
