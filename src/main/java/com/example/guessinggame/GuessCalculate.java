package com.example.guessinggame;

import java.util.ArrayList;
import java.util.List;

public class GuessCalculate {

    static List<String> tempLetterList = new ArrayList();

    public static void guess(String word){
        word.split("(?!^)");

        for (int i = 0; i < word.length(); i++) {
            tempLetterList.add(String.valueOf(i));
        }

    }

}
