package com.example.muhammadghozi41.day1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String nama = getIntent().getStringExtra("name");
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Hi, "+nama+"!");
        AlertDialog.Builder builder =  new AlertDialog.Builder(HomeActivity.this);
        builder.setTitle(R.string.dialog_title)
                .setMessage("Notice me, "+nama+" !")
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        Toast.makeText(HomeActivity.this,R.string.hehe,Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .create().show();
    }
}
