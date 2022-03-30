package com.x7t.s3_39_appnumbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isTriangular() {
                /*
                generate ascending triangular numbers until the generated one is higher or equals the value of the number field
                 */
            int counter = 1;
            int triangular = 1;
            while (triangular < number) {
                counter++;
                triangular = triangular + counter; // 1+2, 3+3, 6+4, 10+5...
            }
            if (triangular == number) {
                return true;
            } else {
                return  false;
            }
        }

        public boolean isSquare() {
                /*
                generate ascending square numbers until the generated one is higher or equals the value of the number field
                 */
            int counter = 1;
            int square = 1;
            while (square < number) {
                counter++;
                square = counter * counter;
            }
            if (square == number) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void onClick_testNum (View view) {

        Log.i("", "testNum: Pressed.");

        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String message;
        //check if the field is empty to avoid the app from crashing
        if (editText.getText().toString().isEmpty()) {
            message = "Please enter a number.";
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } else { //only if the field is not empty, the following code will be called
            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(editText.getText().toString()); //parse the string from editText

            //Define how different messages for triangular, square, both or neither
            message = "Result: " + myNumber.number + " is ";
            if (myNumber.isSquare() && myNumber.isTriangular()) {
                message += "both.";
            } else if (myNumber.isTriangular() && !myNumber.isSquare()) {
                message += "only triangular.";
            } else if (myNumber.isSquare() && !myNumber.isTriangular()) {
                message += "only square.";
            } else {
                message += "neither triangular nor square.";
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}