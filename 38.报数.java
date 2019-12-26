/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 *
 * https://leetcode-cn.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (53.68%)
 * Likes:    360
 * Dislikes: 0
 * Total Accepted:    64.1K
 * Total Submissions: 119.2K
 * Testcase Example:  '1'
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 
 * 注意：整数顺序将表示为一个字符串。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: 1
 * 输出: "1"
 * 
 * 
 * 示例 2:
 * 
 * 输入: 4
 * 输出: "1211"
 * 
 * 
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        
        return countHelper("1", n);
    }

    /**
     * 尾递归
     * @param str
     * @param n
     * @return
     */
    private static String countHelper(String str, int n) {
        if (n == 1) return str;
        else {
            //求下一个数
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            //一直读数
            while (i < str.length()) {
                int count = 1;
                //如果一直是同一个数
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                //下一个数更新
                stringBuilder.append(Integer.toString(count) + str.charAt(i));
                i++;
            }
            str = stringBuilder.toString();
        }
        return countHelper(str, n - 1);
    }

}

// @lc code=end

