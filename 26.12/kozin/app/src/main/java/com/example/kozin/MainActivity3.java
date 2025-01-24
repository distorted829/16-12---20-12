package com.example.kozin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void calculateCost(View v) {

        EditText inputA = findViewById(R.id.inputA);
        EditText inputX = findViewById(R.id.inputX);
        EditText inputY = findViewById(R.id.inputY);

        String aInput = inputA.getText().toString();
        String xInput = inputX.getText().toString();
        String yInput = inputY.getText().toString();

        if (aInput.isEmpty() || xInput.isEmpty() || yInput.isEmpty()) {
            TextView resultField = findViewById(R.id.resultField);
            resultField.setText("Пожалуйста, введите все данные!");
            return;
        }


        double A = Double.parseDouble(aInput);
        double X = Double.parseDouble(xInput);
        double Y = Double.parseDouble(yInput);


        double pricePerKg = A / X;
        double priceForYKg = pricePerKg * Y;


        TextView resultField = findViewById(R.id.resultField);
        resultField.setText("Цена 1 кг: " + pricePerKg + " рублей\nЦена " + Y + " кг: " + priceForYKg + " рублей");
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }
}