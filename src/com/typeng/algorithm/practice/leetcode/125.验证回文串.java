/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 *
 * https://leetcode-cn.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (46.22%)
 * Likes:    367
 * Dislikes: 0
 * Total Accepted:    222.4K
 * Total Submissions: 472K
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 
 * 示例 1:
 * 
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: "race a car"
 * 输出: false
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (Character.isLetterOrDigit(s.charAt(left))) {
                if (Character.isLetterOrDigit(s.charAt(right))) {
                    if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                        left++;
                        right--;
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    right--;
                    continue;
                }
            } else {
                left++;
            }
        }
        return true;
    }

}
// @lc code=end
