package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLOutput;


public class MainActivity extends AppCompatActivity {

    TextView infoBox;
    EditText inputBox;
    Button Guess;
    Button SetSecretNum;
    private int secretNum;
    private int guessint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Guess = (Button) findViewById(R.id.Guess);
        SetSecretNum = (Button) findViewById(R.id.SetSecretNum);
        infoBox = (TextView) findViewById(R.id.infoBox);
        inputBox = (EditText) findViewById(R.id.inputBox);

    }

    public void onClick_setSecretNumber (View v){

        secretNum = (int) (Math.random() * 100);


            System.out.println(secretNum);
            infoBox.setText("A secret number has been chosen. Try to guess it now");
            Guess.setText("Submit my guess");
            SetSecretNum.setEnabled(false);


    }


    public void onClick_guessNumber (View v){

        guessint = Integer.valueOf(inputBox.getText().toString());
        if(secretNum > guessint){
            infoBox.setText("Your guess is low. Guess higher.");
            System.out.println(guessint);
        }else if(secretNum < guessint){
            infoBox.setText("Your guess is high. Guess lower.");
            System.out.println(guessint);
        }else if(secretNum == guessint){
            infoBox.setText("You guessed it!" + secretNum);

        }else{
            infoBox.setText("default");
        }

    }

    }
