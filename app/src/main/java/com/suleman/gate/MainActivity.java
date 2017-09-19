package com.suleman.gate;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button answer1,answer2,answer3,answer4;
    TextView question;
    TextView tvscore;
    private ControlActivity controlActivity=new ControlActivity();
    private int score=0;
    private String answer;
    private int questionLength=controlActivity.questions.length;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1=(Button)findViewById(R.id.btnop1);
        answer2=(Button)findViewById(R.id.btnop2);
        answer3=(Button)findViewById(R.id.btnop3);
        answer4=(Button)findViewById(R.id.btnop4);
        question=(TextView)findViewById(R.id.tvqn);
        tvscore=(TextView)findViewById(R.id.tvscore);
        r=new Random();
        updateQuestion(r.nextInt(questionLength));
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText()==answer)
                {
                    score++;
                    tvscore.setText("Score:"+score);
                    updateQuestion(r.nextInt(questionLength));
                }
                else
                {
                    gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText()==answer)
                {
                    score++;
                    tvscore.setText("Score:"+score);
                    updateQuestion(r.nextInt(questionLength));
                }
                else
                {
                    gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText()==answer)
                {
                    score++;
                    tvscore.setText("Score:"+score);
                    updateQuestion(r.nextInt(questionLength));
                }
                else
                {
                    gameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText()==answer)
                {
                    score++;
                    tvscore.setText("Score:"+score);
                    updateQuestion(r.nextInt(questionLength));
                }
                else
                {
                    gameOver();
                }
            }
        });
    }
    private void updateQuestion(int num)
    {
        question.setText(controlActivity.getQuestion(num));
        answer1.setText(controlActivity.getChoice1(num));
        answer2.setText(controlActivity.getChoice2(num));
        answer3.setText(controlActivity.getChoice3(num));
        answer4.setText(controlActivity.getChoice4(num));
        answer=controlActivity.getAnswer(num);
    }
    private void gameOver()

    {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Game Over Your Score is "+score+" points")
                .setCancelable(false)
                .setPositiveButton("NEW Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(MainActivity.this,MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
