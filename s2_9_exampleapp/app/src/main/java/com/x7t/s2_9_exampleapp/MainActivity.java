package com.x7t.s2_9_exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void onClick_start (View view) {
//        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("start","Let’s get started.");
//        Log.i("Username",nameEditText.getText().toString());
    }

    public void onClick_signup (View view) {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText pwEditText = (EditText) findViewById(R.id.pwEditText);
        String username = nameEditText.getText().toString();
        String password = pwEditText.getText().toString();
        if (username.equals("") || password.equals("")) {
            Log.e("Registration Failed", "Please enter both username and password.");
        } else {
            Log.i("","Signing you up...");
            Log.i("Registration Succeeded", "Username: " + username + "; Password: " + password + ".");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}