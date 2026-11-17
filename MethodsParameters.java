/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsparameters;

/**
 *
 * @author Zhel
 */
public class MethodsParameters {
 // 'double' return type handles decimals
    // 'double total' and 'int count' are the two parameters
    public static double Averagetotal(double total, int count) {
        if (count <= 0) {
            return 0.0; // Guard clause prevents dividing by zero or negative numbers
        }
        return total / count; // Divides total by count and sends the average back
    }

    public static void main(String[] args) {
        // Call the method
        double averagetotal = Averagetotal(150.50, 7);

        System.out.println("Average: " + averagetotal); // Print average
    }
}

       // QUESTRIONS
       // 1. The method uses double, because without the word double decimals 
       //    would not be included in the method een if 'int' is present.
       // 2. The count <= 0 this prevents the division to 0 and also prevents 
       //    the negative counts from giving false and negative average.

