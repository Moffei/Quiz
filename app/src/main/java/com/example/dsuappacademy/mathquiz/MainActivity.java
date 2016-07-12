package com.example.dsuappacademy.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void submittest(View view) {

        EditText submitAnswerEditText = (EditText) findViewById(R.id.answer);
        int answer = Integer.parseInt(submitAnswerEditText.getText().toString());

                if (answer ==9) {
                    Toast.makeText(MainActivity.this,"Right!Congratulations!You're smart!",
                            Toast.LENGTH_SHORT).show();
                    //todo add toast
                } else {
                    Toast.makeText(MainActivity.this, "Wrong!Try Again", Toast.LENGTH_SHORT).show();
                }




}}
