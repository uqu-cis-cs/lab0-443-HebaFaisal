package edu.uqu.cs;
import java.util.Scanner;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

    public static void twisters(){

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
 
 
 for (int i = 1; i <= 20; i++){

    if (i % 2 == 0){
    System.out.print("Tweetle");

    if (i % 4 == 0)
    System.out.print("Beetle");

    if (i % 6 == 0)
    System.out.print("Poodle");

    }else{
        System.out.print(i);
       // System.out.printf("%1d ",i);
       // System.out.print(" ");
    }

    System.out.print(" ");
    
    }
    }

    public static void phoneKeypad (String str){
         
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/

 String result ="";
 str = str.toUpperCase();

 for (int i = 0; i < str.length(); i++){

    if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C'){
    result += 2;

    }else if (str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F'){
    result += 3;

    }else if (str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I'){
    result += 4;

    }else if (str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L'){
    result += 5;

    }else if (str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O'){
    result += 6;

    }else if (str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S'){
    result += 7;

    }else if (str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V'){
    result += 8;

    }else if (str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'z'){
        result += 9;
    }

    }

    System.out.print(result);

    }


    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        twisters();
        System.out.println();

        System.out.print("Enter a string : ");
        String string = input.nextLine();
        phoneKeypad(string);


    }

}
