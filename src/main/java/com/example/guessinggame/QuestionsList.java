package com.example.guessinggame;

import java.util.ArrayList;
import java.util.List;
import org.javatuples.Pair;

public class QuestionsList {
    static List<String> words = new ArrayList<>();
    static ArrayList<Pair> animalQuestions = new ArrayList<>();


    static Pair<String,String> question1 = Pair.with("elephant","Biggest land animal in the world");
    static Pair<String,String> question2 = Pair.with("bee","they are make colony and manifacturing");
    static Pair<String,String> question3 = Pair.with("snake","if you see this animal , you would scared");

    public static void setQuestions() {

        animalQuestions.add(question1);
        animalQuestions.add(question2);
        animalQuestions.add(question3);
        words.add(question1.getValue0());
        words.add(question2.getValue0());
        words.add(question3.getValue0());
//        words.add("crocodile");
//        words.add("bee");
      //  words.add("bear");
       // words.add("rabbit");

    }

    public static String getHints(){

        return ";";
    }

}
