package com.example.guessinggame;

import java.util.Random;

public class RandomWordGenerator {
    Random random = new Random();

    public String generateWord(){
        String word = WordList.words.get(random.nextInt(WordList.words.size()));
        return word;
    }


}
