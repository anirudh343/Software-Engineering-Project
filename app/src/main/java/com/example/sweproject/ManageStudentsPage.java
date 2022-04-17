package com.example.sweproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ManageStudentsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_students_page);



        Button addStudent = (Button)findViewById(R.id.addStudent);
        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataBase dataBaseHelper = new DataBase(ManageStudentsPage.this);


                TextView edit = (TextView) findViewById(R.id.enterStudentName); //get name from user input
                String editT = edit.toString();
                TextView username = (TextView) findViewById(R.id.setstudentUser);
                TextView password = (TextView) findViewById(R.id.setStudentPassword);
                String userN = username.getText().toString();
                String userP = password.getText().toString();
                TextView teacherUser = (TextView) findViewById(R.id.enterteacheruser);
                String teacherString = teacherUser.toString();


                //creating student
                //public User(String username, String password, int grade, String teacher_user, String actual_name)
                User temp = new User(userN, userP, MainActivity.gradeLevel, teacherString, editT);
                //gradeLevel = gradeInt;
                //adding educator to database
                dataBaseHelper.addUser(true, temp);


                int check = dataBaseHelper.validateUser(userN, userP, false);

                if(check > 0){
                    Toast.makeText(ManageStudentsPage.this, "Student Added", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ManageStudentsPage.this, "Student Not Added", Toast.LENGTH_SHORT).show();
                }



                //startActivity(new Intent(EducatorHomepage.this, ManageStudentsPage.class));
            }
        });



    }



}