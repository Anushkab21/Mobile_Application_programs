package com.example.linear_layout;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, email;
    RadioGroup genderGroup;
    CheckBox java, android, python;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        genderGroup = findViewById(R.id.genderGroup);
        java = findViewById(R.id.java);
        android = findViewById(R.id.android);
        python = findViewById(R.id.python);
        registerBtn = findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = name.getText().toString().trim();
                String userEmail = email.getText().toString().trim();
                if (userName.isEmpty()) {
                    name.setError("Enter name");
                    return;
                }

                if (userEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(userEmail).matches()) {
                    email.setError("Enter valid email");
                    return;


                }
                int selectedId = genderGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "Select Gender", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton selectedGender = findViewById(selectedId);
                String gender = selectedGender.getText().toString();


                String skills = "";

                if (java.isChecked()) skills += "Java ";
                if (android.isChecked()) skills += "Android ";
                if (python.isChecked()) skills += "Python ";

                if (skills.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Select at least one skill", Toast.LENGTH_SHORT).show();
                    return;
                }


                String result = "Name: " + userName +
                        "\nEmail: " + userEmail +
                        "\nGender: " + gender +
                        "\nSkills: " + skills;

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}