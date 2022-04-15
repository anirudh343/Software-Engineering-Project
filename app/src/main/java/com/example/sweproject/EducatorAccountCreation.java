package com.example.sweproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class EducatorAccountCreation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educator_account_creation);


        MaterialButton createAcc = (MaterialButton)findViewById(R.id.setEducatorLogin);
        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //database constructor

                 DataBase dataBaseHelper = new DataBase(EducatorAccountCreation.this);
                 TextView edit = (TextView) findViewById(R.id.enterName); //get name from user input
                 String editT = edit.toString();
                 TextView username = (TextView) findViewById(R.id.username);
                 TextView password = (TextView) findViewById(R.id.password);
                 String userN = username.getText().toString();
                 String userP = password.getText().toString();
                 Spinner gradeSpinner = (Spinner) findViewById(R.id.gradeLevelDropDown);
                 String grade = gradeSpinner.getSelectedItem().toString();
                 int gradeInt = Integer.parseInt(grade);

                 //creating educator
                 User temp = new User(userN, userP, gradeInt, editT);
                 //gradeLevel = gradeInt;
                 //adding educator to database
                 dataBaseHelper.addUser(false, temp);


                 //once educator account is created, go back to log in page
                startActivity(new Intent(EducatorAccountCreation.this, ManageStudentsPage.class));
            }
        });





        //Drop Down Menu Functionality for Educator to Set Grade Level for Students
        Spinner gradeLevelMenu = findViewById(R.id.gradeLevelDropDown);
        ArrayAdapter<CharSequence> gradeLevelAdapter = ArrayAdapter.createFromResource(this, R.array.gradeLevels, android.R.layout.simple_spinner_item);
        gradeLevelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gradeLevelMenu.setAdapter(gradeLevelAdapter);
        gradeLevelMenu.setOnItemSelectedListener(this);
    }






    //What Happens When Drop Down Menu (Grade Level Selection for Educators) Is Selected
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}