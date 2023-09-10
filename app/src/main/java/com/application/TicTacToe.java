package com.application;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class TicTacToe extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,restart;
    String cross,nul;
    TextView textResult,PointsPlayer,PointsBot;
    int pointsPlayer,pointsBot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        restart = findViewById(R.id.restart);
        textResult = findViewById(R.id.textResult);
        PointsPlayer = findViewById(R.id.PointsPlayer);
        PointsBot = findViewById(R.id.PointsBot);
        cross = "X";
        nul = "O";
        pointsPlayer = 0;
        pointsBot = 0;
        textResult.setText("");

    }
    public void clcBtn1(View view){
        if(button1.getText()=="" && textResult.getText()==""){
            button1.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }
    }

    public void clcBtn2(View view){
        if(button2.getText()==""&& textResult.getText()==""){
            button2.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }
    }
    public void clcBtn3(View view){
        if(button3.getText()==""&& textResult.getText()==""){
            button3.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }
    }
    public void clcBtn4(View view){
        if(button4.getText()==""&& textResult.getText()==""){
            button4.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }
    }
    public void clcBtn5(View view){
        if(button5.getText()==""&& textResult.getText()==""){
            button5.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }
    }
    public void clcBtn6(View view){
        if(button6.getText()==""&& textResult.getText()==""){
            button6.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }
    }
    public void clcBtn7(View view){
        if(button7.getText()==""&& textResult.getText()==""){
            button7.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }

    }
    public void clcBtn8(View view){
        if(button8.getText()==""&& textResult.getText()==""){
            button8.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }

    }
    public void clcBtn9(View view){
        if(button9.getText()==""&& textResult.getText()==""){
            button9.setText(cross);
            CheckerWin();
            if(textResult.getText()==""){
                MoveBot();
            }
        }

    }
    public void clcRestart(View view){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button1.setBackgroundColor(getColor(R.color.purple500));
        button2.setBackgroundColor(getColor(R.color.purple500));
        button3.setBackgroundColor(getColor(R.color.purple500));
        button4.setBackgroundColor(getColor(R.color.purple500));
        button5.setBackgroundColor(getColor(R.color.purple500));
        button6.setBackgroundColor(getColor(R.color.purple500));
        button7.setBackgroundColor(getColor(R.color.purple500));
        button8.setBackgroundColor(getColor(R.color.purple500));
        button9.setBackgroundColor(getColor(R.color.purple500));




        textResult.setText("");



    }
    public void CheckerWinBot(){
        if(button1.getText()== nul && button2.getText()== nul && button3.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button1.setBackgroundColor(Color.rgb(255,192,203));
            button2.setBackgroundColor(Color.rgb(255,192,203));
            button3.setBackgroundColor(Color.rgb(255,192,203));}
        if(button4.getText()== nul && button5.getText()== nul && button6.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button4.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button6.setBackgroundColor(Color.rgb(255,192,203));}
        if(button7.getText()== nul && button8.getText()==nul && button9.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button7.setBackgroundColor(Color.rgb(255,192,203));
            button8.setBackgroundColor(Color.rgb(255,192,203));
            button9.setBackgroundColor(Color.rgb(255,192,203));}
        if(button1.getText()== nul && button4.getText()== nul && button7.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button1.setBackgroundColor(Color.rgb(255,192,203));
            button4.setBackgroundColor(Color.rgb(255,192,203));
            button7.setBackgroundColor(Color.rgb(255,192,203));}
        if(button2.getText()== nul && button5.getText()== nul && button8.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button2.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button8.setBackgroundColor(Color.rgb(255,192,203));}
        if(button3.getText()== nul && button6.getText()== nul && button9.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button3.setBackgroundColor(Color.rgb(255,192,203));
            button6.setBackgroundColor(Color.rgb(255,192,203));
            button9.setBackgroundColor(Color.rgb(255,192,203));}
        if(button1.getText()== nul && button5.getText()== nul && button9.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button1.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button9.setBackgroundColor(Color.rgb(255,192,203));}
        if(button3.getText()== nul && button5.getText()== nul && button7.getText()== nul ){
            textResult.setText(R.string.message_loose);pointsBot++;PointsBot.setText(""+pointsBot);
            button3.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button7.setBackgroundColor(Color.rgb(255,192,203));}
    }
    public void CheckerWin(){
        if(button1.getText()== cross && button2.getText()== cross && button3.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button1.setBackgroundColor(Color.rgb(255,192,203));
            button2.setBackgroundColor(Color.rgb(255,192,203));
            button3.setBackgroundColor(Color.rgb(255,192,203));}
        if(button4.getText()== cross && button5.getText()== cross && button6.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button4.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button6.setBackgroundColor(Color.rgb(255,192,203));}
        if(button7.getText()== cross && button8.getText()== cross && button9.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button7.setBackgroundColor(Color.rgb(255,192,203));
            button8.setBackgroundColor(Color.rgb(255,192,203));
            button9.setBackgroundColor(Color.rgb(255,192,203));}
        if(button1.getText()== cross && button4.getText()== cross && button7.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button1.setBackgroundColor(Color.rgb(255,192,203));
            button4.setBackgroundColor(Color.rgb(255,192,203));
            button7.setBackgroundColor(Color.rgb(255,192,203));}
        if(button2.getText()== cross && button5.getText()== cross && button8.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button2.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button8.setBackgroundColor(Color.rgb(255,192,203));}
        if(button3.getText()== cross && button6.getText()== cross && button9.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button3.setBackgroundColor(Color.rgb(255,192,203));
            button6.setBackgroundColor(Color.rgb(255,192,203));
            button9.setBackgroundColor(Color.rgb(255,192,203));}
        if(button1.getText()== cross && button5.getText()== cross && button9.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button1.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button9.setBackgroundColor(Color.rgb(255,192,203));}
        if(button3.getText()== cross && button5.getText()== cross && button7.getText()== cross ){
            textResult.setText(R.string.message_win);pointsPlayer++;PointsPlayer.setText(""+pointsPlayer);
            button3.setBackgroundColor(Color.rgb(255,192,203));
            button5.setBackgroundColor(Color.rgb(255,192,203));
            button7.setBackgroundColor(Color.rgb(255,192,203));}
        else if(button1.getText()!="" && button2.getText()!=""&&button3.getText()!=""&&
                button4.getText()!=""&& button5.getText()!=""&&button6.getText()!=""&&
                button7.getText()!=""&& button8.getText()!=""&&button9.getText()!=""){
            textResult.setText(R.string.message_draw);
        }
    }
    private void MoveBot(){
        Random random = new Random();
        int RandomClick = random.nextInt(9) + 1;
        Log.i("Movebot","RandomClick"+RandomClick);
        switch ((RandomClick)){
            case(1):if(button1.getText()=="") {
                button1.setText(nul);CheckerWinBot();}
            else {
                MoveBot();}
                break;
            case(2): if(button2.getText()==""){
                button2.setText(nul);CheckerWinBot();}
            else {
                MoveBot();}
                break;
            case(3): if(button3.getText()==""){
                button3.setText(nul);CheckerWinBot();}
            else {MoveBot();}
                break;
            case(4): if(button4.getText()==""){
                button4.setText(nul);CheckerWinBot();}
            else {MoveBot();}
                break;
            case(5): if(button5.getText()==""){
                button5.setText(nul);CheckerWinBot();}
            else {MoveBot();}
                break;
            case(6): if(button6.getText()==""){
                button6.setText(nul);CheckerWinBot();}
            else {MoveBot();}
                break;
            case(7):if(button7.getText()==""){
                button7.setText(nul);CheckerWinBot();}
            else {MoveBot();}
                break;
            case(8): if(button8.getText()==""){
                button8.setText(nul);CheckerWinBot();}
            else {MoveBot();}
                break;
            case(9): if(button9.getText()==""){
                button9.setText(nul);CheckerWinBot();}
            else {MoveBot();}
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TicTacToe.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}





