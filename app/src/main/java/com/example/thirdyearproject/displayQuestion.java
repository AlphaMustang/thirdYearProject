package com.example.thirdyearproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class displayQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_question);
        Intent intent = getIntent();
        changeQuestion(intent);
     }


     private void changeQuestion(Intent intent) {
         TextView questionTextBox = (TextView) findViewById(R.id.displayQuestionTextBox);
         int moduleID = intent.getIntExtra("moduleID", 0);
         int submoduleID = intent.getIntExtra("submoduleID", 0);
         String moduleName = Module.getModuleName(moduleID);
         questionTextBox.setText(moduleName + " is the module which has been selected");
     }
}
