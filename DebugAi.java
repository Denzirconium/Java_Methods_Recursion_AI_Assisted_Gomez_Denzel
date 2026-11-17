/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debugai;

/**
 *
 * @author Zhel
 */
public class DebugAi {
// Fixed recursive method to calculate n! (n factorial)
    public static int factorial(int n) {
       // FIXED BASE CASE:
     // Previously, "if (n == 1)" skipped 0 and caused infinite recursion for factorial(0).
      // Using "n <= 1" stops safely at both 1 and 0 (since 0! = 1 and 1! = 1).
        if (n <= 1) {
            return 1;
        }
       // RECURSIVE CASE:
        // Multiplies the current number 'n' by the factorial of the next smaller number (n - 1).
      // Subtracting 1 each call ensures 'n' moves toward the base case.
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
     // Boundary test 1: 0! should return 1 instead of crashing with StackOverflowError
        System.out.println("factorial(0): " + factorial(0));
        // Boundary test 2: 1! should immediately hit the base case and return 1
      System.out.println("factorial(1): " + factorial(1));
        // Standard test: 4! = 4 * 3 * 2 * 1 = 24
       System.out.println("factorial(4): " + factorial(4));
        // Custom test: 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("factorial(5): " + factorial(5));
    }
}
   // QUESRIONS
   // 1. One wrong can cause everything wrong because every recursive cal multiplies its numbers 
   // by the result returned from the call below it, that is why one wrong will corrupt all chain.
   // 2. With my corrected code, it returns to 1 because -2  <= 1 triggers the base case on the first call, even if
   // negative factorials are undefined. 