package com.example.guessinggame;

import java.util.ArrayList;
import java.util.List;

public class AskedWordsList {

    static List<Integer> askedWords = new ArrayList<>();

    public static void addAskedWordsList(int index){
        askedWords.add(index);
    }

}
