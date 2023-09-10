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
        if(button1.getText()==""){
            button1.setText(cross);
            CheckerWin();
            MoveBot();}

    }


    public void clcBtn2(View view){
        if(button2.getText()==""){
            button2.setText(cross);
            CheckerWin();
            MoveBot();}
    }
    public void clcBtn3(View view){
        if(button3.getText()==""){
            button3.setText(cross);
            CheckerWin();
            MoveBot();}
    }
    public void clcBtn4(View view){
        if(button4.getText()==""){
            button4.setText(cross);
            CheckerWin();
            MoveBot();}
    }
    public void clcBtn5(View view){
        if(button5.getText()==""){
            button5.setText(cross);
            CheckerWin();
            MoveBot();}
    }
    public void clcBtn6(View view){
        if(button6.getText()==""){
            button6.setText(cross);
            CheckerWin();
            MoveBot();}
    }
    public void clcBtn7(View view){
        if(button7.getText()==""){
            button7.setText(cross);
            CheckerWin();
            MoveBot();}

    }
    public void clcBtn8(View view){
        if(button8.getText()==""){
            button8.setText(cross);
            CheckerWin();
            MoveBot();}

    }
    public void clcBtn9(View view){
        if(button9.getText()==""){
            button9.setText(cross);
            CheckerWin();
            MoveBot();}

    }
    public void CheckerWinBot(){
        if(button1.getText()== nul && button2.getText()== nul && button3.getText()== nul ){
            textResult.setText(R.string.message_loose);}
        if(button4.getText()== nul && button5.getText()== nul && button6.getText()== nul ){
            textResult.setText(R.string.message_loose);}
        if(button7.getText()== nul && button8.getText()==nul && button9.getText()== nul ){
            textResult.setText(R.string.message_loose);}
        if(button1.getText()== nul && button4.getText()== nul && button7.getText()== nul ){
            textResult.setText(R.string.message_loose);}
        if(button2.getText()== nul && button5.getText()== nul && button8.getText()== nul ){
            textResult.setText(R.string.message_loose);}
        if(button3.getText()== nul && button6.getText()== nul && button9.getText()== nul ){
            textResult.setText(R.string.message_loose);}
        if(button1.getText()== nul && button5.getText()== nul && button9.getText()== nul ){
            textResult.setText(R.string.message_loose);}
        if(button3.getText()== nul && button5.getText()== nul && button7.getText()== nul ){
            textResult.setText(R.string.message_loose);}
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
            case(1):if(button1.getText()=="") {
                button1.setText(nul);}
                else {
                    MoveBot();}
                break;
            case(2): if(button2.getText()==""){
                button2.setText(nul);}
            else {
                MoveBot();}
            break;
            case(3): if(button3.getText()==""){
                button3.setText(nul);}
            else {MoveBot();}
            break;
            case(4): if(button4.getText()==""){
                button4.setText(nul);}
            else {MoveBot();}
            break;
            case(5): if(button5.getText()==""){
                button5.setText(nul);}
            else {MoveBot();}
            break;
            case(6): if(button6.getText()==""){
                button6.setText(nul);}
            else {MoveBot();}
            break;
            case(7):if(button7.getText()==""){
                button7.setText(nul);}
            else {MoveBot();}
            break;
            case(8): if(button8.getText()==""){
                button8.setText(nul);}
            else {MoveBot();}
            break;
            case(9): if(button9.getText()==""){
                button9.setText(nul);}
            else {MoveBot();}
            break;
        }
        CheckerWinBot();
    }
}