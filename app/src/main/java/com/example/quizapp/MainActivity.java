package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Question[]questions=new Question[]{
      //create question objects
            new Question(R.string.question_amendments,false),
            new Question(R.string.question_consitution,true),
            new Question(R.string.question_declaration,true),
            new Question(R.string.question_independence_rights,true),
            new Question(R.string.question_religion,true),
            new Question(R.string.question_goverment,false),
            new Question(R.string.question_govenment_feds,false),
            new Question(R.string.question_governmen_senators,true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}