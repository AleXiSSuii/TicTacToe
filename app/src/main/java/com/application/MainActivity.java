package com.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String cross,nul;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cross = "X";
        nul = "O";
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textResult = findViewById(R.id.textResult);

    }
    public void clcBtn1(View view){
        button1.setText(cross);
        CheckerWin();
        MoveBot();
    }


    public void clcBtn2(View view){
        button2.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void clcBtn3(View view){
        button3.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void clcBtn4(View view){
        button4.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void clcBtn5(View view){
        button5.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void clcBtn6(View view){
        button6.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void clcBtn7(View view){
        button7.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void clcBtn8(View view){
        button8.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void clcBtn9(View view){
        button9.setText(cross);
        CheckerWin();
        MoveBot();
    }
    public void CheckerWin(){
        if(button1.getText()== cross && button2.getText()== cross && button3.getText()== cross ){
            textResult.setText(R.string.message_win);}
        if(button4.getText()== cross && button5.getText()== cross && button6.getText()== cross ){
            textResult.setText(R.string.message_win);}
        if(button7.getText()== cross && button8.getText()== cross && button9.getText()== cross ){
            textResult.setText(R.string.message_win);}
        if(button1.getText()== cross && button4.getText()== cross && button7.getText()== cross ){
            textResult.setText(R.string.message_win);}
        if(button2.getText()== cross && button5.getText()== cross && button8.getText()== cross ){
            textResult.setText(R.string.message_win);}
        if(button3.getText()== cross && button6.getText()== cross && button9.getText()== cross ){
            textResult.setText(R.string.message_win);}
        if(button1.getText()== cross && button5.getText()== cross && button9.getText()== cross ){
            textResult.setText(R.string.message_win);}
        if(button3.getText()== cross && button5.getText()== cross && button7.getText()== cross ){
            textResult.setText(R.string.message_win);}
        }
    private void MoveBot(){
        Random random = new Random();
        int RandomClick = random.nextInt(9) + 1;
        Log.i("Movebot","RandomClick"+RandomClick);
        switch ((RandomClick)){
            case(1): button1.setText(nul); break;
            case(2): button2.setText(nul); break;
            case(3): button3.setText(nul); break;
            case(4): button4.setText(nul); break;
            case(5): button5.setText(nul); break;
            case(6): button6.setText(nul); break;
            case(7): button7.setText(nul); break;
            case(8): button8.setText(nul); break;
            case(9): button9.setText(nul); break;
        }

    }
}