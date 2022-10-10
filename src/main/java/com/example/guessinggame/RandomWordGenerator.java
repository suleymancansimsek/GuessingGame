package com.example.guessinggame;

import java.util.Collections;
import java.util.Random;

public class RandomWordGenerator {

    Random random = new Random();

    public  String generateWord(int i){

        String word = WordList.words.get(i);

 /*
        int randomWordIndex = random.nextInt(WordList.words.size());
        int anotherRandomIndex = random.nextInt(WordList.words.size());
        String word = WordList.words.get(randomWordIndex);

        while (AskedWordsList.askedWords.contains(randomWordIndex)){
            System.out.println("this word asked before please next!");
            word = WordList.words.get(anotherRandomIndex);
            if (!AskedWordsList.askedWords.contains(randomWordIndex)){
                break;
            }
        }

        for (int i : AskedWordsList.askedWords){

            if (i == randomWordIndex){
                System.out.println("tekrar denenildi");
                generateWord();
            }
        }
/*
        AskedWordsList.addAskedWordsList(randomWordIndex);
        for (int i=0; i < AskedWordsList.askedWords.size() ; i++ ){
            System.out.println(AskedWordsList.askedWords.get(i));
        } */
        return word;
    }


}
