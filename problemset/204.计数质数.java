/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 *
 * https://leetcode-cn.com/problems/count-primes/description/
 *
 * algorithms
 * Easy (30.44%)
 * Likes:    212
 * Dislikes: 0
 * Total Accepted:    30.4K
 * Total Submissions: 99.4K
 * Testcase Example:  '10'
 *
 * 统计所有小于非负整数 n 的质数的数量。
 * 
 * 示例:
 * 
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 
 * 
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        // 这个方法，我还是不太熟悉
        boolean[] tags = new boolean[n+1];

        for(int i=2;i<=n/2;i++) {
            if(!tags[i]) {
                for(int j=2;j<=n/i;j++) {
                    tags[i*j] = true;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++) {
            if(!tags[i]) count++;
        }
        return count;
    }
}
// @lc code=end

