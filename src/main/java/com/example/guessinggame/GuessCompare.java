package com.example.guessinggame;

import java.util.ArrayList;
import java.util.List;

public class GuessCompare {
    public static List<String> secondTempLetterList = new ArrayList();
    public static Boolean a;

    public static String compare(String word, String secondWord){
        for (int i = 0; i < secondWord.length(); i++) {
            secondTempLetterList.add(String.valueOf(i));
        }

        for (int i = 0; i<word.length(); i++){
            for (int j = 0; j<word.length(); j++){
                a = GuessCalculate.tempLetterList.get(j).equals(secondTempLetterList.get(i));
            }

        }

        if (a == true) {
            return "working";
        }
        return "not working";
    }
}
