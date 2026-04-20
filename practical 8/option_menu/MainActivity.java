package com.example.linear_layout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.pro)
        {
            Toast.makeText(this,"Profile Selected",Toast.LENGTH_LONG).show();
            return true;
        }
        if(id==R.id.share)
        {
            Toast.makeText(this,"Share Selected",Toast.LENGTH_LONG).show();
            return true;
        }
        if(id==R.id.search)
        {
            Toast.makeText(this,"Search Selected",Toast.LENGTH_LONG).show();
            return true;
        }
        if(id==R.id.setting)
        {
            Toast.makeText(this,"Settings Selected",Toast.LENGTH_LONG).show();
            return true;
        }
        return true;
    }
}