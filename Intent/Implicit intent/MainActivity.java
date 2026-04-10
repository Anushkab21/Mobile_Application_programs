package com.example.linear_layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText us, ps;

    String username = "Anushka";
    String password = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        us = findViewById(R.id.user);
        ps = findViewById(R.id.pass);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (us.getText().toString().equals(username) &&
                        ps.getText().toString().equals(password)) {

                    // Explicit Intent (safe)
                    Intent intent = new Intent(MainActivity.this,
                            com.example.linear_layout.MainActivity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this,
                            "Incorrect Credentials",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}