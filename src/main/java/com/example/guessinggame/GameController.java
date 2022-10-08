package com.example.guessinggame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WordList.setWords();
    }

    @FXML
    private Label label;

    @FXML
    private TextField textField;



    @FXML
    protected void onGuessButtonClick() {
        label.setText("Welcome to JavaFX Application!");
        GuessCalculate.guess(WordList.words.get(0));
        String word = textField.getText();
        GuessCompare.compare(WordList.words.get(0),word);
    }




}