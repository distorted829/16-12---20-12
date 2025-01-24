package com.example.kozin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculatePerimeter(View v) {
        EditText inputField = findViewById(R.id.inputField);
        String input = inputField.getText().toString();
        TextView resultField = findViewById(R.id.resultField);


        if (input.isEmpty()) {
            resultField.setText("Введите радиус!");
            return;
        }


        double R = Double.parseDouble(input);
        double pi = 3.14;

        double L = 2 * pi * R;
        double S = pi * R * R;

        resultField.setText("Длина окружности: " + L + "\nПлощадь круга: " + S);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}

