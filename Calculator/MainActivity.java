package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;
    EditText n1, n2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.add);
        b2 = findViewById(R.id.sub);
        b3 = findViewById(R.id.mul);
        b4 = findViewById(R.id.div);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        t = findViewById(R.id.result);

        // ADD
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(n1.getText().toString()) +
                        Integer.parseInt(n2.getText().toString());
                t.setText("Addition = " + res);
            }
        });

        // SUBTRACT
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(n1.getText().toString()) -
                        Integer.parseInt(n2.getText().toString());
                t.setText("Subtraction = " + res);
            }
        });

        // MULTIPLY
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(n1.getText().toString()) *
                        Integer.parseInt(n2.getText().toString());
                t.setText("Multiplication = " + res);
            }
        });

        // DIVIDE
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(n1.getText().toString()) /
                        Integer.parseInt(n2.getText().toString());
                t.setText("Division = " + res);
            }
        });
    }
}