package com.example.muhammadghozi41.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = (TextView)findViewById(R.id.text1);
        text.setAllCaps(true);
        final EditText input1 = (EditText) findViewById(R.id.input_nama);
        Button semangat = (Button) findViewById(R.id.button_semangat);

        final Intent intent = new Intent(this, HomeActivity.class);
        final Context ctx = getApplicationContext();


        semangat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text.setAllCaps(false);
                text.setText("Halo "+input1.getText()+"! Semangat ya!!");
                intent.putExtra("name", input1.getText().toString());

                ctx.startActivity(intent);
            }
        });
    }
}
