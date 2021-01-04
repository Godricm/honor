package org.buding;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: miaochen
 * \* @Date: 2020/12/28
 * \* @Time: 12:57
 * \* To change this template use File | Settings | File Templates.
 * \* @Description:
 * \
 */

/**
 * 分治法
 */
public class longestCommonPrefix3 {
    public  String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }

        return longestCommonPrefix(strs,0,strs.length-1);
    }


    public String longestCommonPrefix(String[] strs, int start, int end) {
        if (start == end) {
            return strs[start];
        } else {
            int mid = (end - start) / 2 + start;
            String lcpLeft=longestCommonPrefix(strs,start,mid);
            String lcpRight=longestCommonPrefix(strs,mid+1,end);
            return commonPrefix(lcpLeft,lcpRight);
        }
    }

    public String commonPrefix(String lcpLeft,String lcpRight){
        int length=Math.min(lcpLeft.length(),lcpRight.length());
        int index=0;
        while (index<length&&lcpLeft.charAt(index)==lcpRight.charAt(index)){
            index++;
        }
        return lcpLeft.substring(0,index);
    }
}
