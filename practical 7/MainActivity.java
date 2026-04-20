package com.example.practical_7;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button startBtn;
    ProgressDialog progressDialog;

    ProgressBar progressBar2;
    RatingBar ratingBar;
    TextView textView;

    int progressStatus = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = findViewById(R.id.button);
        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
        progressBar2 = findViewById(R.id.progressBar2);

        progressBar2.setVisibility(View.GONE);

        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            textView.setText("Rating: " + rating);
        });

        startBtn.setOnClickListener(v -> showProgressDialog());
    }

    public void showProgressDialog() {

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Downloading Music");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(100);
        progressDialog.setProgress(0);
        progressDialog.show();

        progressStatus = 0;

        new Thread(() -> {

            while (progressStatus < 100) {

                progressStatus += 10;

                handler.post(() -> {
                    progressDialog.setProgress(progressStatus);
                });

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            handler.post(() -> progressDialog.dismiss());

        }).start();
    }

    public void download(View view) {

        progressBar2.setVisibility(View.VISIBLE);

        new Handler().postDelayed(() -> {

            progressBar2.setVisibility(View.GONE);

            Toast.makeText(
                    MainActivity.this,
                    "Loading Complete!",
                    Toast.LENGTH_SHORT
            ).show();

        }, 3000);
    }
}