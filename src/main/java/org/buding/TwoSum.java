package org.buding;

import org.buding.util.FastJsonUtils;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2019/7/22 0022
 * \* Time: 22:43
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();

        int[] result=twoSum.twoSum(new int[]{2,7,11,15},9);
        System.out.println(FastJsonUtils.toJSONNoFeatures(result));
    }
}
