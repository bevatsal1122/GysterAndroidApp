package com.example.gyster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText inputData;
    private TextView outputValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertButton = findViewById(R.id.convertButton);
        inputData = findViewById(R.id.inputKmValue);
        outputValue = findViewById(R.id.showMilesValue);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Input Passed", Toast.LENGTH_SHORT).show();
                String input = inputData.getText().toString();
                if (input.equals(""))
                {
                    outputValue.setText("Null Input");
                }
                else
                {
                    double km = Double.parseDouble(input);
                    double rawOutput = km * 0.62137;
                    String output = String.format("%.4f", rawOutput);
                    outputValue.setText(String.format("%s Km  =  %s Mile", km, output));
                }

            }
        });
    }
}