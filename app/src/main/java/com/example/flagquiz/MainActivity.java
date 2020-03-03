package com.example.flagquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private QuestionBank question = new QuestionBank();

    private TextView ScoreView;
    private TextView questionView;

    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;

    private String answer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreView = findViewById(R.id.score);
        questionView = findViewById(R.id.questionCount);
        buttonChoice1 = findViewById(R.id.answerButton1);
        buttonChoice2 = findViewById(R.id.answerButton2);
        buttonChoice3 = findViewById(R.id.answerButton3);

        newQuestion();

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonChoice1.getText() == answer) {
                    mScore += 10;
                    updateScore(mScore);
                    newQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonChoice2.getText() == answer) {
                    mScore += 10;
                    updateScore(mScore);
                    newQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonChoice3.getText() == answer) {
                    mScore += 10;
                    updateScore(mScore);
                    newQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

        private void newQuestion () {
            questionView.setText(question.getQuestion(mQuestionNumber));
            buttonChoice1.setText(question.getChoice1(mQuestionNumber));
            buttonChoice2.setText(question.getChoice2(mQuestionNumber));
            buttonChoice3.setText(question.getChoice3(mQuestionNumber));

            answer = question.correctAnswer(mQuestionNumber);
            mQuestionNumber++;

            if (mQuestionNumber == question.questions.length) {
                Intent intent = new Intent(MainActivity.this, Results.class);
                startActivity(intent);
            }

        }

        private void updateScore ( int value){
            ScoreView.setText("Score: " + mScore);
        }
}


