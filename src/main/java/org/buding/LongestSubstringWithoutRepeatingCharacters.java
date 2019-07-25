package org.buding;

import java.util.HashSet;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2019/7/24 0024
 * \* Time: 23:30
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters=new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbbb"));

    }
    public int lengthOfLongestSubstring(String s) {
        //记录串的长度
        int len=s.length();
        int ans=0;
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j <= len; j++)
                //每一个串都计算，并与上次的值判断取大值
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s,int start,int end){
        Set<Character> set=new HashSet<Character>();
        for (int i=start;i<end;i++){
            Character ch=s.charAt(i);
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}
