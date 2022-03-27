package com.x7t.s2_22_currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickConvert (View view) {
        Log.i("", "onClickConvert: clicked");
        EditText editTextNumberDecimal = (EditText) findViewById(R.id.editTextNumberDecimal);
        double amountCAD = Double.parseDouble(editTextNumberDecimal.getText().toString());
        double spot = .8;
        double amountUSD = spot * amountCAD;
        Toast.makeText(this, "CAD"+amountCAD+" is USD" + amountUSD +".", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}