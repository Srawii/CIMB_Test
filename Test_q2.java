// ## Q2
// Given two version numbers, `version1` and `version2`, compare them.

// Version numbers consist of **one or more revisions** joined by a dot `'.'`. Each revision consists of **digits** and may contain leading **zeros**. Every revision contains **at least one character**. Revisions are **0-indexed from left to right**, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example `2.5.33` and `0.1` are valid version numbers.

// To compare version numbers, compare their revisions in **left-to-right order**. Revisions are compared using their **integer value ignoring any leading zeros**. This means that revisions 1 and 001 are considered **equal**. If a version number does not specify a revision at an index, then **treat the revision as** `0`. For example, version `1.0` is less than version `1.1` because their revision 0s are the same, but their revision 1s are `0` and `1` respectively, and `0 < 1`.

// Return the following:

// - If `version1 < version2`, return `-1`.
// - If `version1 > version2`, return `1`.
// - Otherwise, return `0`.
 

// ### Example 1:

// **Input**: version1 = "1.01", version2 = "1.001" </br>
// **Output**: 0 </br>
// **Explanation**: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
// ### Example 2:

// **Input**: version1 = "1.0", version2 = "1.0.0" </br>
// **Output**: 0 </br>
// **Explanation**: version1 does not specify revision 2, which means it is treated as "0".
// ### Example 3:

// **Input**: version1 = "0.1", version2 = "1.1" </br>
// **Output**: -1 </br>
// **Explanation**: version1's revision 0 is "0", while version2's revision 0 is "1". 0 < 1, so version1 < version2.
 

// ### Constraints:

// - `1 <= version1.length, version2.length <= 500`
// - `version1` and `version2` only contain digits and `'.'`.
// - `version1` and `version2` are valid version numbers.
// - All the given revisions in `version1` and `version2` can be stored in a **32-bit integer**.

import java.util.Scanner;

public class Test_q2 {
    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);
        Scanner v2 = new Scanner(System.in);

        System.out.print("Version 1 = ");
        String ver1 = v1.next();
        System.out.print("Version 2 = ");
        String ver2 = v2.next();

        String[] vers1 = ver1.split("[.]");
        String[] vers2 = ver2.split("[.]");
        
        try {
            int version1 = Integer.valueOf(vers1[0]);
            int version2 = Integer.valueOf(vers2[0]);

            if (version1 < version2) {
                System.out.println("-1");
            } else if (version1 > version2) {
                System.out.println("1");
            } else System.out.println("0");
        } catch (Exception e) {
            System.out.println("Input integer and dot(.) only eq. 1.0.1");
        }
    }
}