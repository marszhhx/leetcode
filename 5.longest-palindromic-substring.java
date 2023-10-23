/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    // return longest palindrome centered around s[l], s[r]
    // where l, r and be equal number;
    String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            } else {
                break;
            }
        }
        return s.substring(l + 1, r);
    }

    public String longestPalindrome(String s) {
        
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            // odd length;
            String odd = palindrome(s, i, i);
            // even length;
            String even = palindrome(s, i, i + 1);

            String tempRes = "";
            if (odd.length() > even.length()) {
                tempRes = odd;
            } else {
                tempRes = even;
            }
            if (res.length() < tempRes.length()) {
                res = tempRes;
            }
        }
        return res;
    }
}
// @lc code=end

