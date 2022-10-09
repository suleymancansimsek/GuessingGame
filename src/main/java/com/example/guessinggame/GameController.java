package com.example.guessinggame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    String tempWord = "temp";
    int  knowingLetterCount = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WordList.setWords();
    }

    @FXML
    private Label label;

    @FXML
    private TextField textField;
    @FXML
    private Button startButton;

    GuessCompare guessCompare = new GuessCompare();
    RandomWordGenerator wordGenerator = new RandomWordGenerator();

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
        startButton.setText("next word");
        tempWord = wordGenerator.generateWord();
        label.setText("your word have " +  tempWord.length() + " letters");
        System.out.println(tempWord);

    }




}