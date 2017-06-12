package com.example.muhammadghozi41.day1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = (TextView)findViewById(R.id.text1);
        text.setAllCaps(true);
        final EditText input1 = (EditText) findViewById(R.id.input_nama);
        Button semangat = (Button) findViewById(R.id.button_semangat);
        semangat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text.setAllCaps(false);
                text.setText("Halo "+input1.getText()+"! Semangat ya!!");
            }
        });
    }
}