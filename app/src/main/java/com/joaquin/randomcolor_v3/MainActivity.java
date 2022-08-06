package com.joaquin.randomcolor_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "TAG: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int answer;

        TextView view = findViewById(R.id.textView);
        answer = generateRandomColor(view);
        Log.i(TAG, "correct answer is: " + answer);
    }

    public int generateRandomColor(View view) {
        Random random = new Random();
        int rand = random.nextInt(3);
        int correctResponse=0;
        switch (rand) {
            case 0:
                view.setBackgroundResource(R.color.red);
       correctResponse = R.color.red;
                break;
            case 1:
                view.setBackgroundResource(R.color.green);
                correctResponse = R.color.green;                break;
            case 2:
                view.setBackgroundResource(R.color.blue);
                correctResponse = R.color.blue;
                break;
            default:
                Log.d(TAG, "Something horrible has happened");
        }

        return correctResponse;

    }

    public void handleUserSelection(View view) {
//        Log.i(TAG, "R.id is " + R.id.radio_red);
//        Log.i(TAG, "R.color is " + R.color.red);

    }

    ;


}