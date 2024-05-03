// ## Q3
// You are climbing a staircase. It takes `n` steps to reach the top.

// Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

 

// ### Example 1:

// **Input**: n = 2 </br>
// **Output**: 2 </br>
// **Explanation**: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// ### Example 2:

// **Input**: n = 3 </br>
// **Output**: 3 </br>
// **Explanation**: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step
 

// ### Constraints:

// - `1 <= n <= 45`

import java.util.Scanner;

public class Test_q3 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int ways = 0;
        int steps;
        Scanner a = new Scanner(System.in);
        
        do {
            System.out.print("Enter steps: ");
            steps = a.nextInt();
        } while (steps < 1 || steps > 45);
        

        for (int i = 2; i < steps; i++) {
            ways = n1 + n2;
            n1 = n2;
            n2 = ways;
        }

        System.out.printf("%d ways", ways);
    }
}
