package com.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String cross,nul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cross = "X";
        nul = "0";
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
    }
    public void clcBtn1(View view){
        button1.setText(cross);
    }
    public void clcBtn2(View view){
        button2.setText(cross);
    }
    public void clcBtn3(View view){
        button3.setText(cross);
    }
    public void clcBtn4(View view){
        button4.setText(cross);
    }
    public void clcBtn5(View view){
        button5.setText(cross);
    }
    public void clcBtn6(View view){
        button6.setText(cross);
    }
    public void clcBtn7(View view){
        button7.setText(cross);
    }
    public void clcBtn8(View view){
        button8.setText(cross);
    }
    public void clcBtn9(View view){
        button9.setText(cross);
    }
}