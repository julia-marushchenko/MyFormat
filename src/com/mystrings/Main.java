/**
 *  Java program to use format to modify string.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating strings.
        String str = "Hello";
        String str1 = "World!";

        // Printing a new string to console.
        System.out.format("We say always %s  %s", str, str1);

    }
}