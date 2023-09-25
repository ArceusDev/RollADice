package com.example.rolladice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView diceImage;
    Button rollButton;
    Random randomVal = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.dice_image);
        rollButton = findViewById(R.id.roll_btn);

        rollButton.setOnClickListener(v -> RollDice());
    }

    private void RollDice(){
        int num = randomVal.nextInt(20) + 1;

        switch (num){
            case 1:
                diceImage.setImageResource(R.drawable.c1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.c2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.c3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.c4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.c5);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.c6);
                break;
            case 7:
                diceImage.setImageResource(R.drawable.c7);
                break;
            case 8:
                diceImage.setImageResource(R.drawable.c8);
                break;
            case 9:
                diceImage.setImageResource(R.drawable.c9);
                break;
            case 10:
                diceImage.setImageResource(R.drawable.c10);
                break;
            case 11:
                diceImage.setImageResource(R.drawable.c11);
                break;
            case 12:
                diceImage.setImageResource(R.drawable.c12);
                break;
            case 13:
                diceImage.setImageResource(R.drawable.c13);
                break;
            case 14:
                diceImage.setImageResource(R.drawable.c14);
                break;
            case 15:
                diceImage.setImageResource(R.drawable.c15);
                break;
            case 16:
                diceImage.setImageResource(R.drawable.c16);
                break;
            case 17:
                diceImage.setImageResource(R.drawable.c17);
                break;
            case 18:
                diceImage.setImageResource(R.drawable.c18);
                break;
            case 19:
                diceImage.setImageResource(R.drawable.c19);
                break;
            case 20:
                diceImage.setImageResource(R.drawable.c20);
                break;
            default:
                Log.d("Bug", "Something went wrong with control flow of RollDice method");
        }
    }


}