package com.example.myquizzapp;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verifyAnswer(View view) {

// Get user's name
        EditText nameField = findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String Username = nameEditable.toString();

//        checks if checkboxes for question 1 are ticked and shows correct answers
        CheckBox question1ChkBx1 = findViewById(R.id.question1ChkBx1);
        boolean question1ChkBx1_ischecked = question1ChkBx1.isChecked();
        CheckBox question1ChkBx2 = findViewById(R.id.question1ChkBx2);
        boolean question1ChkBx2_ischecked = question1ChkBx2.isChecked();
        CheckBox question1ChkBx3 = findViewById(R.id.question1ChkBx3);
        boolean question1ChkBx3_ischecked = question1ChkBx3.isChecked();
        CheckBox question1ChkBx4 = findViewById(R.id.question1ChkBx4);
        boolean question1ChkBx4_ischecked = question1ChkBx4.isChecked();

//    checks if radio button for question 2 is checked
        RadioButton question2radio1 = findViewById(R.id.question2radio1);
        boolean question2radio1_ischecked = question2radio1.isChecked();
        RadioButton question2radio2 = findViewById(R.id.question2radio2);
        boolean question2radio2_ischecked = question2radio1.isChecked();

//    checks for user entered variable in question 3

        EditText question3answer = findViewById(R.id.question3answer);
        Editable answer3editable = question3answer.getText();
        String answer3 = answer3editable.toString();

//    checks for radio check in question 4

        RadioButton question4radio1 = findViewById(R.id.question4radio1);
        boolean question4radio1_ischecked = question4radio1.isChecked();
        RadioButton question4radio2 = findViewById(R.id.question4radio2);
        boolean question4radio2_ischecked = question4radio2.isChecked();

//    predetermined answers for each question
//    answers for question 1
        if (question1ChkBx1_ischecked && question1ChkBx2_ischecked && question1ChkBx4_ischecked) {
            score += 20;
        } else if (question2radio1_ischecked && question2radio2_ischecked) {
            score += 20;
        } else if (answer3.equals("A")) {
            score += 20;
        } else if (question4radio1_ischecked) {
            score += 20;
        }
        Toast.makeText(getApplicationContext(), String.format(Username + " your score is  %s ", score), Toast.LENGTH_LONG).show();
    }

}
