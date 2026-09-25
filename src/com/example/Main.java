package com.example;

import com.example.util.ReverseLetter;

public class Main {
    public static void main(String[] args) {
        ReverseLetter reverseLetter = new ReverseLetter();
        String letter = reverseLetter.ReverseLetter("J@va the be$t!123".toCharArray());
        System.out.println(letter);
    }
}
