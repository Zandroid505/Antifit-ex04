package exercise04.base;
/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Zakaria Antifit
 */

import java.util.Scanner;

public class Solution04 {
    /*
     * print "Enter a noun: "
     * 'noun' = user input string
     * print "Enter a verb: "
     * 'verb' = user input string
     * print "Enter an adjective: "
     * 'adjective' = user input string
     * print "Enter an adverb: "
     * 'adverb' = user input string
     * print "Do you 'verb' your 'adjective' 'noun' 'adverb'? That's hilarious!
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
