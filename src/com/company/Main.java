package com.company;

import java.util.Scanner;

import static com.company.Palindrome.isPalindrome;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();
        boolean palindrome = isPalindrome(input);
        System.out.println("Is it a palindrome? " + palindrome);

    //boundary condition: <= letter - always a palindrome
        // start and end with the same letter - might be palindrome
        //start and end with different letters - definitely not a palindrome. so we do a check: take first and last letter and check.
        // if they are the same, we take the next first and last letter and compare them etc

    }
    //subtring refers to word that is getting smaller and smaller
    }

