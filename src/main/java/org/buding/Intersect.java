package org.buding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: miaochen
 * \* @Date: 2020/12/6
 * \* @Time: 16:30
 * \* To change this template use File | Settings | File Templates.
 * \* @Description:
 * \
 */
public class Intersect {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1}, nums2 = {2, 2};
        for (int i : intersect(nums1, nums2)) {
            System.out.println(i);
        }

    }

    /**
     * 350
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums1) {
            int count = map.getOrDefault(i, 0)+1;
            map.put(i,count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int i : nums2) {
            int count = map.getOrDefault(i, 0);
            if (count > 0) {
                intersection[index++] = i;
                count--;
                if (count > 0) {
                    map.put(i, count);
                } else {
                    map.remove(i);
                }

            }
        }

        return Arrays.copyOfRange(intersection, 0, index);
    }
}
