package com.example.sweproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ViewScoreReportsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_score_reports_page);


        Button enter = (Button)findViewById(R.id.Enter);
        String username;

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView eduUsername = (TextView)findViewById(R.id.usernameEdu);
                String username = eduUsername.getText().toString();

                DataBase dataBaseHelper = new DataBase(ViewScoreReportsPage.this);
                List<scoreReport> reportsList = dataBaseHelper.getReportsForEachTeacher(username);
                String studentReport = "";

                TextView reports = (TextView)findViewById(R.id.Report);
                //username, name, score
                //String studentReport = "Math Assessment Grade 1 "+ "\n" +"Username: StudentExample" + "\n" +  "Name: Example Name" +"\n" + "Math Score: " + "80%";

                if (reportsList.isEmpty()) {
                    studentReport = "No assessments taken";
                } else {
                    for (int i = 0; i < reportsList.size(); i++) {
                        String subject = reportsList.get(i).getSubject();
                        String studentN = reportsList.get(i).getStudent_name();
                        String studentU = reportsList.get(i).getStudent_user();
                        int studentScoreInt = (int) (reportsList.get(i).getScore() * 100);
                        String studentScoreString = Integer.toString(studentScoreInt);
                        studentReport += subject + "\n" + "Student Name: " + studentN + "\n" + "Student Username: " + studentU + "\n" + "Score: " + studentScoreString + "%" + "\n" + "\n";
                    }
                }
                reports.setText(studentReport);
               // reports.setText(reportsList.get(0).getStudent_name());
            }
        });








    }
}