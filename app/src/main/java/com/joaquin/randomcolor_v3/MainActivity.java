package com.joaquin.randomcolor_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "TAG: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view = findViewById(R.id.textView);
        RadioGroup rg = findViewById(R.id.radioGroup);
        RadioButton checkedRadioButton = (RadioButton) rg.findViewById(rg.getCheckedRadioButtonId());

        int answer;
        answer = generateRandomColor(view);

        // Event listener on radio group and child buttons
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                RadioButton checkedRadioButton = (RadioButton) radioGroup.findViewById(id);
//
                evaluateAnswer(answer, checkedRadioButton.getId());

            }
        });


    }

    public int generateRandomColor(View view) {
        Random random = new Random();
        int rand = random.nextInt(3);
        int correctResponse = 0;
        switch (rand) {
            case 0:
                view.setBackgroundResource(R.color.red);
                correctResponse = 2131231214;
                break;
            case 1:
                view.setBackgroundResource(R.color.green);
                correctResponse = 2131231213;
                break;
            case 2:
                view.setBackgroundResource(R.color.blue);
                correctResponse = 2131231212;

                break;

            default:
                Log.d(TAG, "Something horrible has happened");
        }

        return correctResponse;

    }

    public void evaluateAnswer(int correctAnswer, int userAnswer) {
        Context context = getApplicationContext();
        CharSequence ifCorrect = "Yowza!";
        CharSequence ifWrong = "Nawwza!";
        int duration = Toast.LENGTH_SHORT;
        if (correctAnswer == userAnswer) {
            Toast.makeText(context, ifCorrect, duration).show();

        } else {
            Toast.makeText(context, ifWrong, duration).show();
        }

    }



}