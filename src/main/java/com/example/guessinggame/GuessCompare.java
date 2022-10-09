package com.example.guessinggame;

import java.util.ArrayList;
import java.util.List;

public class GuessCompare {


    public void compare(List<Character> playerGuesses){
        RandomWordGenerator wordGenerator = new RandomWordGenerator();
        String randomWord = wordGenerator.generateWord();
        for (int i = 0; i < randomWord.length(); i++) {
            if ( playerGuesses.contains(randomWord.charAt(i))){
                System.out.println(randomWord);
               System.out.print("work");
            }
        }

    }
}
