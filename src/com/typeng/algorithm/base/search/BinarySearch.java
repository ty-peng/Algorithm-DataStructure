package com.typeng.algorithm.base.search;

/**
 * 二分查找.
 *
 * @author ty-peng
 * @since 2019/9/10 17:39
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            // 不能使用(high + low) / 2，如果low和high的总和大于最大正int值（2 ^ 31-1），总和溢出为负值，当除以2时，该值保持为负。
            int mid = (high + low) >>> 1;

            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
}
