package com.example.guessinggame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.*;

public class GameController implements Initializable {

    String tempWord = "temp";
    int  knowingLetterCount = 0;
    int i = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        QuestionsList.setQuestions();
        Collections.shuffle(QuestionsList.animalQuestions);
    }


    @FXML
    private Label label,hintLabel;

    @FXML
    private TextField textField;
    @FXML
    private Button startButton;

    GuessCompare guessCompare = new GuessCompare();



    @FXML
    protected void onGuessButtonClick() {
        String word = textField.getText();
        List<Character> playerGuesses = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            playerGuesses.add(word.charAt(i));
        }
        knowingLetterCount = guessCompare.compare(tempWord,playerGuesses);
        label.setText("you know the "+ knowingLetterCount + " letter try more!");
        GuessCompare.correctLetterCounter = 0;
        if (textField.getText().equals(tempWord)){
            label.setText("you won!");

        }
    }

    @FXML
    protected void onStartButtonClick() {
        System.out.println(QuestionsList.words);
        startButton.setText("next word");
        hintLabel.setText(QuestionsList.animalQuestions.get(i).getValue1().toString());
       // for (int i=0; i<WordList.words.size(); i++ ){}
        tempWord = QuestionsList.animalQuestions.get(i).getValue0().toString();

        //tempWord = wordGenerator.generateWord();
        label.setText("your word have " +  tempWord.length() + " letters");
        System.out.println(tempWord);
        if (i+1 == QuestionsList.animalQuestions.size()){
            i=0;
        }
        i++;
    }




}