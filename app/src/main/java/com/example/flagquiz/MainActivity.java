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
    private ImageView questionView;

    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;

    private String answer;
    private int counter = 0;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreView = findViewById(R.id.score);

        questionView = findViewById(R.id.flagLabel);
        buttonChoice1 = findViewById(R.id.answerButton1);
        buttonChoice2 = findViewById(R.id.answerButton2);
        buttonChoice3 = findViewById(R.id.answerButton3);
        updateQuestionNum();
        newQuestion();

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonChoice1.getText() == answer) {
                    mScore += 1;
                    updateQuestionNum();
                    newQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    newQuestion();
                    updateQuestionNum();
                }
            }
        });

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonChoice2.getText() == answer) {
                    mScore += 1;
                    updateQuestionNum();
                    newQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    newQuestion();
                    updateQuestionNum();
                }
            }
        });

        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonChoice3.getText() == answer) {
                    mScore += 1;
                    updateQuestionNum();
                    newQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    newQuestion();
                    updateQuestionNum();
                }
            }
        });
    }

        private void newQuestion () {

            if (mQuestionNumber == question.questions.length) {
                Intent intent = new Intent(MainActivity.this, Results.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }
            else {

                questionView.setImageResource(question.getQuestion(mQuestionNumber));
                buttonChoice1.setText(question.getChoice1(mQuestionNumber));
                buttonChoice2.setText(question.getChoice2(mQuestionNumber));
                buttonChoice3.setText(question.getChoice3(mQuestionNumber));

                answer = question.correctAnswer(mQuestionNumber);
                mQuestionNumber++;
            }

        }

        private void updateQuestionNum (){
            counter++;
            ScoreView.setText("Question Number: " + counter);
        }
}


