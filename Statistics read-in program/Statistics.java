package q1;

import java.util.Scanner;


/**
 * <p>Statistics.java is a class which creates an array of integers from a
 * given input.  For assignment purposes, this was tested using a text file
 * with a varying amount of integers called from the command prompt.  
 * The array can hold a maximum of 50 integers.  Depending on how many integers
 * are entered, the calculations for average and standard deviation of the 
 * integers changes. Statistics.java then prints out the average of the integers
 * and the standard deviation.</p>
 *
 * @author Steven Ma
 * @version 1.0
 */
public class Statistics {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int max = 50;
        int[] array = new int[max];
        int count = 0;
        double average; 
        double temp = 0;
        double answer; 
        double x = 0;
        int i;
        while (scan.hasNextInt()) {
            array[count] = scan.nextInt();
            count++;
        }
        for (int value : array) {
            x = x + value;
        }
        average = x / count; // average
        System.out.println("The average is: " + average);
        for (i = 0; i < count; i++) {
            temp = temp + (average - array[i]) * (average - array[i]);
        }
        answer = temp / (count - 1);
        answer = Math.sqrt(answer);
        answer = Math.abs(answer);
        System.out.println("The standard deviation is: " + answer);
        System.out.println("Question one was called and ran sucessfully.");
    }

};
