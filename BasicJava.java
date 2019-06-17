import java.util.ArrayList;
import java.util.Arrays;

/**
 * BasicJava
 */
public class BasicJava {

    /*
     * Print 1-255
     * 
     * Write a method that prints all the numbers from 1 to 255.
     */
    public static void printNumbers() {

        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    /*
     * Print odd numbers between 1-255
     * 
     * Write a method that prints all the odd numbers from 1 to 255.
     */
    public static void printOddNumbers() {
        for (int i = 1; i <= 255; i += 2) {
            System.out.println(i);
        }
    }

    /*
     * Print Sum
     * 
     * Write a method that prints the numbers from 0 to 255, but this time print the
     * sum of the numbers that have been printed so far. For example, your output
     * should be something like this:
     * 
     * New number: 0 Sum: 0 New number: 1 Sum: 1 New number: 2 Sum: 3 New number: 3
     * Sum: 6 ... New number: 255 Sum: ___
     * 
     * Do NOT use an array to do this exercise.
     */
    public static void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    /*
     * Iterating through an array
     * 
     * Given an array X, say [1,3,5,7,9,13], write a method that would iterate
     * through each member of the array and print each value on the screen. Being
     * able to loop through each member of the array is extremely important.
     */

    public static void printArray(int[] arr) {
        for (int var : arr) {
            System.out.println(var);
        }
    }

    /*
     * Find Max
     * 
     * Write a method (sets of instructions) that takes any array and prints the
     * maximum value in the array. Your method should also work with a given array
     * that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive
     * numbers, negative numbers and zero.
     */
    public static void printMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    /*
     * Get Average
     * 
     * Write a method that takes an array, and prints the AVERAGE of the values in
     * the array. For example for an array [2, 10, 3], your method should print an
     * average of 5. Again, make sure you come up with a simple base case and write
     * instructions to solve that base case first, then test your instructions for
     * other complicated cases.
     */

    public static void printAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }

    /*
     * Array with Odd Numbers
     * 
     * Write a method that creates an array 'y' that contains all the odd numbers
     * between 1 to 255. When the method is done, 'y' should have the value of [1,
     * 3, 5, 7, ... 255].
     */

    public static ArrayList oddNumbers() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i += 2) {
            y.add(i);
        }
        return y;
    }

    /*
     * Greater Than Y
     * 
     * Write a method that takes an array and returns the number of values in that
     * array whose value is greater than a given value y. For example, if array =
     * [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there
     * are two values in the array that are greater than 3).
     */
    public static int greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int var : arr) {
            if (var > y) {
                count++;
            }
        }
        return count;
    }

    /*
     * Square the values
     * 
     * Given any array x, say [1, 5, 10, -2], write a method that multiplies each
     * value in the array by itself. When the method is done, the array x should
     * have values that have been squared, say [1, 25, 100, 4].
     */
    public static void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
    }

    /*
     * Eliminate Negative Numbers
     * 
     * Given any array x, say [1, 5, 10, -2], write a method that replaces any
     * negative number with the value of 0. When the method is done, x should have
     * no negative values, say [1, 5, 10, 0].
     */
    public static void replaceNegatives(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
    }

    /*
     * Max, Min, and Average
     * 
     * Given any array x, say [1, 5, 10, -2], write a method that returns an array
     * with the maximum number in the array, the minimum value in the array, and the
     * average of the values in the array. The returned array should be three
     * elements long and contain: [MAXNUM, MINNUM, AVG]
     */
    public static double[] maxMinAvg(int[] x) {
        double[] output = new double[3];
        int min = x[0], max = x[0], sum = 0;
        double avg = (double) x[0];
        int temp;
        for (int i = 1; i < x.length; i++) {
            temp = x[i];
            sum += temp;
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        avg = sum / x.length;

        output[0] = max;
        output[1] = min;
        output[2] = avg;
        return output;
    }

    /*
     * Shifting the Values in the Array
     * 
     * Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each
     * number by one to the front. For example, when the method is done, an x of [1,
     * 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is
     * 0. The method does not need to wrap around the values shifted out of bounds.
     */
    public static void shiftValues(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            arr[i] = arr[i+1];
            i++;
        }
        arr[i] = 0;
    }


    public static void main(String[] args) {
        int[] intArray = { 1, 3, 5, 7, 9, 13 };
        int[] findMax = { -3, -5, -7 };
        int[] average = { 2, 10, 3 };
        int[] greaterthan = {1, 3, 5, 7};
        int[] squareArray = {1, 5, 10, -2};
        int[] replaceNegativesArr = {1, 5, 10, -2};
        int[] minmaxavgArray = {1, 5, 10, -2};
        int[] shiftArray = {1, 5, 10, 7, -2};
        // printNumbers();
        // printOddNumbers();
        // printSum();
        // printArray(intArray);
        // printMax(findMax);
        // printAverage(average);
        // System.out.println(oddNumbers());
        // System.out.println(greaterThanY(greaterthan, 3));
        // square(squareArray);
        // System.out.println(Arrays.toString(squareArray));
        // replaceNegatives(replaceNegativesArr);
        // System.out.println(Arrays.toString(replaceNegativesArr));
        
        // System.out.println(Arrays.toString(maxMinAvg(minmaxavgArray)));
        
        shiftValues(shiftArray);
        System.out.println(Arrays.toString(shiftArray));
        // [5, 10, 7, -2, 0]
    }
}