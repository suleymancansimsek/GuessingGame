package com.example.guessinggame;

import java.util.ArrayList;
import java.util.List;

public class GuessCompare {

    static int correctLetterCounter=0;

    public int compare(String randomWord,List<Character> playerGuesses){

        for (int i = 0; i < randomWord.length(); i++) {
            if ( playerGuesses.contains(randomWord.charAt(i))){
                ++correctLetterCounter;
            }
        }

        return correctLetterCounter;
    }

    /*
    public boolean getResult(String word, String playerGuess){
        if (word.equals(playerGuess)){
            return true;
        }
        return false;
    }

    */

}
