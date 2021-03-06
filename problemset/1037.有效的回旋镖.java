/*
 * @lc app=leetcode.cn id=1037 lang=java
 *
 * [1037] 有效的回旋镖
 *
 * https://leetcode-cn.com/problems/valid-boomerang/description/
 *
 * algorithms
 * Easy (37.84%)
 * Likes:    7
 * Dislikes: 0
 * Total Accepted:    2.3K
 * Total Submissions: 6.1K
 * Testcase Example:  '[[1,1],[2,3],[3,2]]'
 *
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
 * 
 * 给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：[[1,1],[2,3],[3,2]]
 * 输出：true
 * 
 * 
 * 示例 2：
 [[1,1],[2,3],[3,2]]
 [[1,1],[2,2],[3,3]]
 * 输入：[[1,1],[2,2],[3,3]]
 * 输出：false
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * points.length == 3
 * points[i].length == 2
 * 0 <= points[i][j] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isBoomerang(int[][] points) {
        if((points[1][1] - points[0][1]) == 0 &&  (points[1][0] - points[0][0]) ==0) return false;
        if((points[2][1] - points[0][1]) == 0 &&  (points[2][0] - points[0][0]) ==0) return false;
        if((points[2][1] - points[1][1]) == 0 &&  (points[2][0] - points[1][0]) ==0) return false;
       
        return  (points[1][1] - points[0][1])  * (points[2][0] - points[0][0]) 
                    != 
                (points[2][1] - points[0][1]) * (points[1][0]-points[0][0]);
        
    }
}
// @lc code=end

