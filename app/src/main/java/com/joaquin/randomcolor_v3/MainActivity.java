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

        TextView view = findViewById(R.id.textView);
        generateRandomColor(view);
    }

    public void generateRandomColor(View view) {
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                Log.i(TAG, "This will be red");
                view.setBackgroundResource(R.color.red);
                break;
            case 1:
                Log.i(TAG, "This will be green");
                view.setBackgroundResource(R.color.green);


                break;
            case 2:
                Log.i(TAG, "This will be blue");
                view.setBackgroundResource(R.color.blue);


                break;
            default:
                Log.d(TAG, "Something horrible has happened");
        }

//        Log.i(TAG, "Hey! The number is:" +rand);

    }


}