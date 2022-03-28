package com.x7t.s3_33_higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void generateRandNum() {
        //the random number should be generated before the button is clicked
        Random rand = new Random();
        randInt = rand.nextInt(20) + 1;
    }
    //the int should be declared before the button is clicked
    int randInt;
    //20 is the maximum and the 1 is our minimum
    public void onClickGuess (View view) {
        Log.i("", "onClickGuess: " + randInt);
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        int guessInt = Integer.parseInt(editTextNumber.getText().toString());
        Log.i("", "Guess: " + guessInt);
        String msg;
        if (guessInt > randInt) {
            msg = "Go lower";
        } else if (guessInt < randInt) {
            msg = "Go higher";
        } else {
            msg = "Congrats, you got it! Start a new round.";
            generateRandNum();
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandNum();
    }
}