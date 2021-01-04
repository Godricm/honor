package org.buding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: miaochen
 * \* @Date: 2020/12/11
 * \* @Time: 21:11
 * \* To change this template use File | Settings | File Templates.
 * \* @Description:
 * \
 */
public class Intersect2 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1}, nums2 = {2, 2};
        for (int i : intersect(nums1, nums2)) {
            System.out.println(i);
        }

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int length = Math.max(length1, length2);
        int[] intersection = new int[length];

        int index = 0, index1 = 0, index2 = 0;
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index] = nums1[index1];
                index++;
                index1++;
                index2++;
            }
        }

        return Arrays.copyOfRange(intersection, 0, index);
    }
}
