/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looprecusion;

/**
 *
 * @author Zhel
 */
public class LoopRecusion {

    // Part A: Loop version
    // Counts how many grades in the array are greater than or equal to passingMark
    public static int countPassing(int[] grades, int passingMark) {
        // Variable to keep track of how many passing grades we find
        int count = 0;

        // Loop through every single grade in the 'grades' array one by one
        for (int grade : grades) {
            // Check if the current grade meets or beats the passing mark
            if (grade >= passingMark) {
               count++; // Add 1 to our total passing count
            }
        }
        // Send back the final total after checking the whole array
        return count;
    }

  // Part B: Recursive version (no loop, index starts at 0)
    // Solves the same problem by checking one index at a time and calling itself for the rest
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        // BASE CASE: Stop when 'index' reaches the length of the array (no elements left to check).
        // Also immediately returns 0 if the array is empty {}.
        if (index == grades.length) {
            return 0;
        }
        // Check only the grade at the current 'index':
      // Gives 1 if grades[index] is passing, or 0 if it is failing
       int countCurrent = (grades[index] >= passingMark) ? 1 : 0;
        // RECURSIVE CASE: Add current grade's score (1 or 0) to the result of the remaining grades.
        // 'index + 1' moves to the next element, making the problem smaller each call.
        return countCurrent + countPassingRecursive(grades, passingMark, index + 1);
    }

    public static void main(String[] args) {
        // Sample array of grades and the minimum mark needed to pass
        int[] grades = {60, 75, 88, 74, 91};
        int passingMark = 75;
       // Call Part A (uses a for-loop)
        System.out.println("Part A (Loop): " + countPassing(grades, passingMark));
     // Call Part B (starts recursion at index 0, the first element)
        System.out.println("Part B (Recursive): " + countPassingRecursive(grades, passingMark, 0));
    }
}
     //QUESTIONS
     // 1.  Recursive call add to the index inorder for it to move to the next element.  
     //     It must change so the method shrinks the problem and reaches easily in the 
     //     base case ratehr than running forever.
     // 2.  If you delete the base case, the index kepp increasing past the end od the 
     //     array and crashes the program.