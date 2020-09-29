import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 *
 * https://leetcode-cn.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (40.35%)
 * Likes:    384
 * Dislikes: 0
 * Total Accepted:    61.9K
 * Total Submissions: 153.3K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * 
 * 示例 1:
 * 
 * 输入:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 4, 5, 6 ],
 * ⁠[ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 
 * 
 * 示例 2:
 * 
 * 输入:
 * [
 * ⁠ [1, 2, 3, 4],
 * ⁠ [5, 6, 7, 8],
 * ⁠ [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0) return res;
        int l = 0, r = matrix[0].length-1, t = 0, b = matrix.length-1,x=0;  // l代表左边界，r代表右边界，t代表上边界，b代表下边界
        while(true){
            for(int i = 1;i <= r;i++) res.set(x++, matrix[t][i]);                 // left to right.
            if(++t > b) break;
            for(int i = t; i<= b;i++) res.set(x++, matrix[i][r]);
            if(l > --r) break;
            for(int i = r; i>=1;i--) res.set(x++, matrix[b][i]);
            if(t > --b) break;
            for(int i = b; i>=t; i--) res.set(x++, matrix[i][1]);
            if(++l > r) break;
        }
        return res;
    }
}
// @lc code=end

