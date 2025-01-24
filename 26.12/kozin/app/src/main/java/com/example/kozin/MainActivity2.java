package com.example.kozin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void calculateCircleProperties(View v) {
        EditText inputX1 = findViewById(R.id.inputX1);
        EditText inputY1 = findViewById(R.id.inputY1);
        EditText inputX2 = findViewById(R.id.inputX2);
        EditText inputY2 = findViewById(R.id.inputY2);

        String x1Input = inputX1.getText().toString();
        String y1Input = inputY1.getText().toString();
        String x2Input = inputX2.getText().toString();
        String y2Input = inputY2.getText().toString();

        TextView resultField = findViewById(R.id.resultField);

        if (x1Input.isEmpty() || y1Input.isEmpty() || x2Input.isEmpty() || y2Input.isEmpty()) {
            resultField.setText("Пожалуйста, введите все координаты!");
            return;
        }


        double x1 = Double.parseDouble(x1Input);
        double y1 = Double.parseDouble(y1Input);
        double x2 = Double.parseDouble(x2Input);
        double y2 = Double.parseDouble(y2Input);

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        resultField.setText("Расстояние между точками: " + distance);


    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
