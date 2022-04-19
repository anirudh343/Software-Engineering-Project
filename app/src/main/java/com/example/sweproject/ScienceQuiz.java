package com.example.sweproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ScienceQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_quiz);

        DataBase dataBaseHelper = new DataBase(ScienceQuiz.this);
        List<question> returnList = dataBaseHelper.getrandQuestions(MainActivity.gradeLevel, "Science");

        TextView science1 = (TextView)findViewById(R.id.questionS1);


        TextView science2 = (TextView)findViewById(R.id.questionS2);
        TextView science3 = (TextView)findViewById(R.id.questionS3);
        TextView science4 = (TextView)findViewById(R.id.questionS4);
        TextView science5 = (TextView)findViewById(R.id.questionS5);
        TextView science6 = (TextView)findViewById(R.id.questionS6);
        TextView science7 = (TextView)findViewById(R.id.questionS7);
        TextView science8 = (TextView)findViewById(R.id.questionS8);
        TextView science9 = (TextView)findViewById(R.id.questionS9);
        TextView science10 = (TextView)findViewById(R.id.questionS10);




        //Log.i("message",returnList.get(0).getQuestion() );
        // Log.i("message",returnList.get(0).getWrong_answer1() );
        String wrong1 = "A. " + returnList.get(0).getWrong_answer1();
        String wrong2 = "B. " + returnList.get(0).getWrong_answer2();
        String wrong3 = "C. " +returnList.get(0).getWrong_answer3();
        String right = "D. " +returnList.get(0).getRight_answer();
        String question1 = "1. " + returnList.get(0).getQuestion() + "\n" + wrong1 +"\n" + wrong2 +"\n" + wrong3 +"\n" + right + "\n";


        science1.setText(question1);

        String q2w1 = "A. " + returnList.get(1).getWrong_answer1();
        String q2w2 = "B. " +returnList.get(1).getWrong_answer2();
        String q2w3 = "C. " + returnList.get(1).getWrong_answer3();
        String q2r = "D. " + returnList.get(1).getRight_answer();
        String question2 = "2. " + returnList.get(1).getQuestion() + "\n" + q2w1 +"\n" + q2w2 +"\n" + q2w3 +"\n" + q2r + "\n";

        science2.setText(question2);

        String q3w1 = "A. " +returnList.get(2).getWrong_answer1();
        String q3w2 = "B. " +returnList.get(2).getWrong_answer2();
        String q3w3 = "C. " + returnList.get(2).getWrong_answer3();
        String q3r = "D. " + returnList.get(2).getRight_answer();
        String question3 ="3. " +  returnList.get(2).getQuestion() + "\n" + q3w1 +"\n" + q3w2 +"\n" + q3w3 +"\n" + q3r + "\n";

        science3.setText(question3);


        String q4w1 = "A. " +returnList.get(3).getWrong_answer1();
        String q4w2 = "B. " + returnList.get(3).getWrong_answer2();
        String q4w3 = "C. " +returnList.get(3).getWrong_answer3();
        String q4r = "D. " +returnList.get(3).getRight_answer();
        String question4 = "4. " + returnList.get(3).getQuestion() + "\n" + q4w1 +"\n" + q4w2 +"\n" + q4w3 +"\n" + q4r + "\n";

        science4.setText(question4);

        String q5w1 = "A. " +returnList.get(4).getWrong_answer1();
        String q5w2 = "B. " +returnList.get(4).getWrong_answer2();
        String q5w3 = "C. " +returnList.get(4).getWrong_answer3();
        String q5r = "D. " +returnList.get(4).getRight_answer();
        String question5 = "5. " + returnList.get(4).getQuestion() + "\n" + q5w1 +"\n" + q5w2 +"\n" + q5w3 +"\n" + q5r + "\n";

        science5.setText(question5);


        String q6w1 = "A. " +returnList.get(5).getWrong_answer1();
        String q6w2 = "B. " +returnList.get(5).getWrong_answer2();
        String q6w3 = "C. " +returnList.get(5).getWrong_answer3();
        String q6r = "D. " + returnList.get(5).getRight_answer();
        String question6 = "6. " + returnList.get(5).getQuestion() + "\n" + q6w1 +"\n" + q6w2 +"\n" + q6w3 +"\n" + q6r + "\n";

        science6.setText(question6);



        String q7w1 = "A. " +returnList.get(6).getWrong_answer1();
        String q7w2 = "B. " +returnList.get(6).getWrong_answer2();
        String q7w3 = "C. " +returnList.get(6).getWrong_answer3();
        String q7r = "D. " +returnList.get(6).getRight_answer();
        String question7 ="7. " +  returnList.get(6).getQuestion() + "\n" + q7w1 +"\n" + q7w2 +"\n" + q7w3 +"\n" + q7r + "\n";

        science7.setText(question7);


        String q8w1 = "A. " +returnList.get(7).getWrong_answer1();
        String q8w2 = "B. " +returnList.get(7).getWrong_answer2();
        String q8w3 = "C. " +returnList.get(7).getWrong_answer3();
        String q8r = "D. " +returnList.get(7).getRight_answer();
        String question8 = "8. " + returnList.get(7).getQuestion() + "\n" + q8w1 +"\n" + q8w2 +"\n" + q8w3 +"\n" + q8r + "\n";

        science8.setText(question8);


        String q9w1 = "A. " +returnList.get(8).getWrong_answer1();
        String q9w2 = "B. " +returnList.get(8).getWrong_answer2();
        String q9w3 = "C. " +returnList.get(8).getWrong_answer3();
        String q9r = "D. " +returnList.get(8).getRight_answer();
        String question9 = "9. " + returnList.get(8).getQuestion() + "\n" + q9w1 +"\n" + q9w2 +"\n" + q9w3 +"\n" + q9r + "\n";

        science9.setText(question9);

        String q10w1 = "A. " +returnList.get(9).getWrong_answer1();
        String q10w2 = "B. " +returnList.get(9).getWrong_answer2();
        String q10w3 = "C. " +returnList.get(9).getWrong_answer3();
        String q10r = "D. " +returnList.get(9).getRight_answer();
        String question10 = "10. " + returnList.get(9).getQuestion() + "\n" + q10w1 +"\n" + q10w2 +"\n" + q10w3 +"\n" + q10r + "\n";

        science10.setText(question10);


        //startActivity(new Intent(ScienceQuiz.this, studentscorepage.class));





    }
}