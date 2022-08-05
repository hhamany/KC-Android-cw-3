package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView calculator = findViewById(R.id.calculate);
        EditText first = findViewById(R.id.number1);
        EditText second = findViewById(R.id.number2);
        Button clacolate_now = findViewById(R.id.calculate_now);
        TextView total = findViewById(R.id.total);


    }
}