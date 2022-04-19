package com.example.sweproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MathQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_quiz);



        DataBase dataBaseHelper = new DataBase(MathQuiz.this);
        List<question> returnList = dataBaseHelper.getrandQuestions(MainActivity.gradeLevel, "Math");

        TextView math = (TextView)findViewById(R.id.questionsMath);
        TextView math2 = (TextView)findViewById(R.id.question2);
        TextView math3 = (TextView)findViewById(R.id.question3);
        TextView math4 = (TextView)findViewById(R.id.question4);
        TextView math5 = (TextView)findViewById(R.id.question5);
        TextView math6 = (TextView)findViewById(R.id.question6);
        TextView math7 = (TextView)findViewById(R.id.question7);
        TextView math8 = (TextView)findViewById(R.id.question8);
        TextView math9 = (TextView)findViewById(R.id.question9);
        TextView math10 = (TextView)findViewById(R.id.question10);




       //Log.i("message",returnList.get(0).getQuestion() );
       // Log.i("message",returnList.get(0).getWrong_answer1() );
        String wrong1 = returnList.get(0).getWrong_answer1();
        String wrong2 = returnList.get(0).getWrong_answer2();
        String wrong3 = returnList.get(0).getWrong_answer3();
        String right = returnList.get(0).getRight_answer();
        String question1 = returnList.get(0).getQuestion() + "\n" + wrong1 +"\n" + wrong2 +"\n" + wrong3 +"\n" + right + "\n";


        math.setText(question1);

        String q2w1 = returnList.get(1).getWrong_answer1();
        String q2w2 = returnList.get(1).getWrong_answer2();
        String q2w3 = returnList.get(1).getWrong_answer3();
        String q2r = returnList.get(1).getRight_answer();
        String question2 = returnList.get(1).getQuestion() + "\n" + q2w1 +"\n" + q2w2 +"\n" + q2w3 +"\n" + q2r + "\n";

        math2.setText(question2);

        String q3w1 = returnList.get(2).getWrong_answer1();
        String q3w2 = returnList.get(2).getWrong_answer2();
        String q3w3 = returnList.get(2).getWrong_answer3();
        String q3r = returnList.get(2).getRight_answer();
        String question3 = returnList.get(2).getQuestion() + "\n" + q3w1 +"\n" + q3w2 +"\n" + q3w3 +"\n" + q3r + "\n";

        math3.setText(question3);


        String q4w1 = returnList.get(3).getWrong_answer1();
        String q4w2 = returnList.get(3).getWrong_answer2();
        String q4w3 = returnList.get(3).getWrong_answer3();
        String q4r = returnList.get(3).getRight_answer();
        String question4 = returnList.get(3).getQuestion() + "\n" + q4w1 +"\n" + q4w2 +"\n" + q4w3 +"\n" + q4r + "\n";

        math4.setText(question4);

        String q5w1 = returnList.get(4).getWrong_answer1();
        String q5w2 = returnList.get(4).getWrong_answer2();
        String q5w3 = returnList.get(4).getWrong_answer3();
        String q5r = returnList.get(4).getRight_answer();
        String question5 = returnList.get(4).getQuestion() + "\n" + q5w1 +"\n" + q5w2 +"\n" + q5w3 +"\n" + q5r + "\n";

        math5.setText(question5);


        String q6w1 = returnList.get(5).getWrong_answer1();
        String q6w2 = returnList.get(5).getWrong_answer2();
        String q6w3 = returnList.get(5).getWrong_answer3();
        String q6r = returnList.get(5).getRight_answer();
        String question6 = returnList.get(5).getQuestion() + "\n" + q6w1 +"\n" + q6w2 +"\n" + q6w3 +"\n" + q6r + "\n";

        math6.setText(question6);




        String q7w1 = returnList.get(6).getWrong_answer1();
        String q7w2 = returnList.get(6).getWrong_answer2();
        String q7w3 = returnList.get(6).getWrong_answer3();
        String q7r = returnList.get(6).getRight_answer();
        String question7 = returnList.get(6).getQuestion() + "\n" + q7w1 +"\n" + q7w2 +"\n" + q7w3 +"\n" + q7r + "\n";

        math7.setText(question7);


        String q8w1 = returnList.get(7).getWrong_answer1();
        String q8w2 = returnList.get(7).getWrong_answer2();
        String q8w3 = returnList.get(7).getWrong_answer3();
        String q8r = returnList.get(7).getRight_answer();
        String question8 = returnList.get(7).getQuestion() + "\n" + q8w1 +"\n" + q8w2 +"\n" + q8w3 +"\n" + q8r + "\n";

        math8.setText(question8);


        String q9w1 = returnList.get(8).getWrong_answer1();
        String q9w2 = returnList.get(8).getWrong_answer2();
        String q9w3 = returnList.get(8).getWrong_answer3();
        String q9r = returnList.get(8).getRight_answer();
        String question9 = returnList.get(8).getQuestion() + "\n" + q9w1 +"\n" + q9w2 +"\n" + q9w3 +"\n" + q9r + "\n";

        math9.setText(question9);

        String q10w1 = returnList.get(9).getWrong_answer1();
        String q10w2 = returnList.get(9).getWrong_answer2();
        String q10w3 = returnList.get(9).getWrong_answer3();
        String q10r = returnList.get(9).getRight_answer();
        String question10 = returnList.get(9).getQuestion() + "\n" + q10w1 +"\n" + q10w2 +"\n" + q10w3 +"\n" + q10r + "\n";

        math10.setText(question10);

        List<String> answerHolder = new ArrayList<String>();

/**
        TextView field1 = (TextView)findViewById(R.id.answerfield1);
        TextView field2 = (TextView)findViewById(R.id.answerfield2);
        TextView field3 = (TextView)findViewById(R.id.answerfield3);
        TextView field4 = (TextView)findViewById(R.id.answerfield4);
        TextView field5 = (TextView)findViewById(R.id.answerfield5);
        TextView field6 = (TextView)findViewById(R.id.answerfield6);
        TextView field7 = (TextView)findViewById(R.id.answerfield7);
        TextView field8 = (TextView)findViewById(R.id.answerfield8);
        TextView field9 = (TextView)findViewById(R.id.answerfield9);
        TextView field10 = (TextView)findViewById(R.id.answerfield10);



        Button answerB1 = (Button)findViewById(R.id.Answer1);
        answerB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer1 = (TextView)findViewById(R.id.answerfield1);
                answerHolder.add(field1.toString());
                Log.i("Message", "Answer holder 1" + answerHolder.get(0));

            }
        });


        Button answerB2 = (Button)findViewById(R.id.Answer2);
        answerB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer2 = (TextView)findViewById(R.id.answerfield2);
                answerHolder.add(field2.toString());

            }
        });

        Button answerB3 = (Button)findViewById(R.id.Answer3);
        answerB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer3 = (TextView)findViewById(R.id.answerfield3);
                answerHolder.add(field3.toString());

            }
        });


        Button answerB4 = (Button)findViewById(R.id.Answer4);
        answerB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer4 = (TextView)findViewById(R.id.answerfield4);
                answerHolder.add(field4.toString());

            }
        });

        Button answerB5 = (Button)findViewById(R.id.Answer5);
        answerB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer5 = (TextView)findViewById(R.id.answerfield5);
                answerHolder.add(field5.toString());

            }
        });


        Button answerB6 = (Button)findViewById(R.id.Answer6);
        answerB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer6 = (TextView)findViewById(R.id.answerfield6);
                answerHolder.add(field6.toString());

            }
        });


        Button answerB7 = (Button)findViewById(R.id.Answer7);
        answerB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer7 = (TextView)findViewById(R.id.answerfield7);
                answerHolder.add(field7.toString());

            }
        });


        Button answerB8 = (Button)findViewById(R.id.Answer8);
        answerB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer8 = (TextView)findViewById(R.id.answerfield8);
                answerHolder.add(field8.toString());

            }
        });


        Button answerB9 = (Button)findViewById(R.id.Answer9);
        answerB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer9 = (TextView)findViewById(R.id.answerfield9);
                answerHolder.add(field9.toString());

            }
        });



        Button answerB10 = (Button)findViewById(R.id.Answer1);
        answerB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer10 = (TextView)findViewById(R.id.answerfield10);
                answerHolder.add(field10.toString());

            }
        });



**/

        Button Finish = (Button)findViewById(R.id.FinishMath);
        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText field1 = (EditText) findViewById(R.id.answerfield1);

                TextView field2 = (TextView)findViewById(R.id.answerfield2);
                TextView field3 = (TextView)findViewById(R.id.answerfield3);
                TextView field4 = (TextView)findViewById(R.id.answerfield4);
                TextView field5 = (TextView)findViewById(R.id.answerfield5);
                TextView field6 = (TextView)findViewById(R.id.answerfield6);
                TextView field7 = (TextView)findViewById(R.id.answerfield7);
                TextView field8 = (TextView)findViewById(R.id.answerfield8);
                TextView field9 = (TextView)findViewById(R.id.answerfield9);
                TextView field10 = (TextView)findViewById(R.id.answerfield10);

                List<String> answerHolder = new ArrayList<String>();
                answerHolder.add(field1.getText().toString());
                answerHolder.add(field2.getText().toString());
                answerHolder.add(field3.getText().toString());
                answerHolder.add(field4.getText().toString());
                answerHolder.add(field5.getText().toString());
                answerHolder.add(field6.getText().toString());
                answerHolder.add(field7.getText().toString());
                answerHolder.add(field8.getText().toString());
                answerHolder.add(field9.getText().toString());
                answerHolder.add(field10.getText().toString());

              //  Log.i("message", "list count: " + answerHolder.size());
                int count = 0;
                for(int i = 0; i < answerHolder.size(); i++){
                    if(answerHolder.get(i).equals("D") || answerHolder.get(i).equals("d")){
                        count++;
                    }
                }
                float score = count/10.0f;
                boolean add = false;
                if (dataBaseHelper.checkAssessmentTaken(MainActivity.Studentusername, "Math"))
                {
                    add = dataBaseHelper.changePerformance(MainActivity.Studentusername, score, "Math");
                }
                else
                {
                    add = dataBaseHelper.addPerformance(MainActivity.Studentusername, score, "Math");
                }
                if(add){
                    Log.i("message", "true");
                }else{
                    Log.i("message", "false");
                }
               /// Log.i("message", "Score: " + score);
               // Log.i("message", "count: " + count);


            }


        });













    }


}