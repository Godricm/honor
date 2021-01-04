package org.buding;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: miaochen
 * \* @Date: 2020/12/11
 * \* @Time: 21:20
 * \* To change this template use File | Settings | File Templates.
 * \* @Description:
 * \
 */
public class longestCommonPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower","flow","flight"});
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
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
