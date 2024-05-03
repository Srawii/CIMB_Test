# Assignment Digital Technology CIMB TH


## Requirements
- There are 3 problems, plese complete it as much as you can.
- Solution can be implemented on your preferred language ( Big plus for Java / Kotlin ).
- Use Git for version control. We expect to see commit logs as well to see how you did with the solution.
- Please send us with your public git repository.
- Solve problem in the best efficiency way, Score will be calculated from 2 factor.
    - In term of time complexity Big(O).
    - In term of functionality.
    - Even you didn't complete the solution, but we still determine your style of coding, so please put the code as much as you can.
- For sending your solution, please share your public git repository.



## Q1
You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

You want to maximize your profit by choosing a **single** day to buy one stock and choosing a **different day in the future** to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return `0`.


### Example 1:

**Input**: prices = [7,1,5,3,6,4]  </br>
**Output**: 5 </br>
**Explanation**: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. </br>
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
### Example 2:

**Input**: prices = [7,6,4,3,1] </br>
**Output**: 0 </br>
**Explanation**: In this case, no transactions are done and the max profit = 0.
 

### Constraints:

- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`

## Q2
Given two version numbers, `version1` and `version2`, compare them.

Version numbers consist of **one or more revisions** joined by a dot `'.'`. Each revision consists of **digits** and may contain leading **zeros**. Every revision contains **at least one character**. Revisions are **0-indexed from left to right**, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example `2.5.33` and `0.1` are valid version numbers.

To compare version numbers, compare their revisions in **left-to-right order**. Revisions are compared using their **integer value ignoring any leading zeros**. This means that revisions 1 and 001 are considered **equal**. If a version number does not specify a revision at an index, then **treat the revision as** `0`. For example, version `1.0` is less than version `1.1` because their revision 0s are the same, but their revision 1s are `0` and `1` respectively, and `0 < 1`.

Return the following:

- If `version1 < version2`, return `-1`.
- If `version1 > version2`, return `1`.
- Otherwise, return `0`.
 

### Example 1:

**Input**: version1 = "1.01", version2 = "1.001" </br>
**Output**: 0 </br>
**Explanation**: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
### Example 2:

**Input**: version1 = "1.0", version2 = "1.0.0" </br>
**Output**: 0 </br>
**Explanation**: version1 does not specify revision 2, which means it is treated as "0".
### Example 3:

**Input**: version1 = "0.1", version2 = "1.1" </br>
**Output**: -1 </br>
**Explanation**: version1's revision 0 is "0", while version2's revision 0 is "1". 0 < 1, so version1 < version2.
 

### Constraints:

- `1 <= version1.length, version2.length <= 500`
- `version1` and `version2` only contain digits and `'.'`.
- `version1` and `version2` are valid version numbers.
- All the given revisions in `version1` and `version2` can be stored in a **32-bit integer**.

## Q3
You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

 

### Example 1:

**Input**: n = 2 </br>
**Output**: 2 </br>
**Explanation**: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
### Example 2:

**Input**: n = 3 </br>
**Output**: 3 </br>
**Explanation**: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

### Constraints:

- `1 <= n <= 45`

## Q4
What is the hardest question please explain
 - Why it is hard
 - What kind of solution that you solve it
