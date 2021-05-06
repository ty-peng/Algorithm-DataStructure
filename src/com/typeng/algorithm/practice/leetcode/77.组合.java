import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 *
 * https://leetcode-cn.com/problems/combinations/description/
 *
 * algorithms
 * Medium (76.69%)
 * Likes:    565
 * Dislikes: 0
 * Total Accepted:    157.2K
 * Total Submissions: 205K
 * Testcase Example:  '4\n2'
 *
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * 
 * 示例:
 * 
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * ⁠ [2,4],
 * ⁠ [3,4],
 * ⁠ [2,3],
 * ⁠ [1,2],
 * ⁠ [1,3],
 * ⁠ [1,4],
 * ]
 * 
 */

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k, new ArrayList<>());
        return result;
    }

    private void dfs(int start, int end, int k, List<Integer> currentList) {
        if (currentList.size() == k) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        if (currentList.size() + end - start + 1 < k) {
            return;
        }

        for (int i = start; i <= end; i++) {
            currentList.add(i);
            dfs(i + 1, end, k, currentList);
            currentList.remove(currentList.size() - 1);
        }
    }
}
// @lc code=end

