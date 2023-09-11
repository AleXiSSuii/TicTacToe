package com.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
   Button Start;
    @Override
    protected void onCreate(Bundle savedInstantScate){
        super.onCreate(savedInstantScate);
        setContentView(R.layout.start_screen);
        Start =  findViewById(R.id.Start);
    }
    public void clcStart(View view){
        startActivity(new Intent(MainActivity.this,TicTacToe.class));

    }

}
