package com.x7t.s2_9_exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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
            Toast.makeText(this,"Registration Failed! Please enter both username and password.",Toast.LENGTH_SHORT).show();
        } else {
            Log.i("","Signing you up...");
            Log.i("Registration Succeeded", "Username: " + username + "; Password: " + password + ".");
            Toast.makeText(this,"Welcome "+ username +" !",Toast.LENGTH_SHORT).show();
        }
    }

    Integer tag = 0;
    public void onClick_switchbg (View view) {
        Log.i("", "onClick_switchbg: clicked." + tag);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setTag(tag);
        Object imageViewTag = imageView.getTag();
        if (imageViewTag.equals(2)) {
            imageView.setImageResource(R.drawable.imglavender1);
            tag = 1;
        } else {
            imageView.setImageResource(R.drawable.imglavender2);
            tag = 2;
        }

        Log.i("", "onClick_switchbg: " + tag);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}