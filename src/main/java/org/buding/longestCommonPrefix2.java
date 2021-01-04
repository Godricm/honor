package org.buding;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: miaochen
 * \* @Date: 2020/12/28
 * \* @Time: 12:49
 * \* To change this template use File | Settings | File Templates.
 * \* @Description:
 * \
 */

/**
 * 纵向扫描
 */
public class longestCommonPrefix2 {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for(int j=1;j<count;j++){
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        //字符比较
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }

        return str1.substring(0, index);
    }
}
