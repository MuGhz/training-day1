package com.example.muhammadghozi41.day1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String nama = getIntent().getStringExtra("name");
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(nama);
    }
}
