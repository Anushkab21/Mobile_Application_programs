package com.example.linear_layout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(v -> {

            PopupMenu popupMenu =
                    new PopupMenu(MainActivity.this, btnMenu);

            popupMenu.getMenuInflater().inflate(
                    R.menu.menu1,
                    popupMenu.getMenu()
            );

            popupMenu.setOnMenuItemClickListener(item -> {

                if (item.getItemId() == R.id.view) {

                    Toast.makeText(
                            MainActivity.this,
                            "View clicked",
                            Toast.LENGTH_SHORT
                    ).show();

                    return true;
                }

                else if (item.getItemId() == R.id.edit) {

                    Toast.makeText(
                            MainActivity.this,
                            "Edit clicked",
                            Toast.LENGTH_SHORT
                    ).show();

                    return true;
                }

                else if (item.getItemId() == R.id.delete) {

                    Toast.makeText(
                            MainActivity.this,
                            "Delete clicked",
                            Toast.LENGTH_SHORT
                    ).show();

                    return true;
                }

                return false;
            });

            popupMenu.show();

        });
    }
}