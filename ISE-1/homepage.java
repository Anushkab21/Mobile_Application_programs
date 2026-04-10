package com.example.poe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class homepage extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.homepage);
        b1=findViewById(R.id.lab1);
        b2=findViewById(R.id.lab2);
        b3=findViewById(R.id.lab3);
        b4=findViewById(R.id.lab4);
        b5=findViewById(R.id.lab5);
        b6=findViewById(R.id.lab6);
        b7=findViewById(R.id.lab7);
        b8=findViewById(R.id.lab8);
        b9=findViewById(R.id.lab9);
    }
    public void Lab1(View v)
    {
        Intent i=new Intent(homepage.this,lab1.class);
        startActivity(i);
    }
    public void Lab2(View v)
    {
        Intent i=new Intent(homepage.this,lab2.class);
        startActivity(i);
    }
    public void Lab3(View v)
    {
        Intent i=new Intent(homepage.this,lab2.class);
        startActivity(i);
    }
    public void Lab4(View v)
    {
        Intent i=new Intent(homepage.this,lab2.class);
        startActivity(i);
    }
    public void Lab5(View v)
    {
        Intent i=new Intent(homepage.this,lab2.class);
        startActivity(i);
    }
    public void Lab6(View v)
    {
        Intent i=new Intent(homepage.this,lab2.class);
        startActivity(i);
    }
}
