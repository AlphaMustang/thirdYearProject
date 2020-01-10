package com.example.thirdyearproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class displayQuestion extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_question);
        Intent intent = getIntent();
        this.intent = intent;
        changeQuestion(intent);
     }

     // need to sort out what happens when the app gets closed
    // I don't think this is useful ATM.
//     @Override
//     public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//     }

    public void imageChange(View view) {
        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.background2);
    }

     private void changeQuestion(Intent intent) {
         TextView questionTextBox = (TextView) findViewById(R.id.displayQuestionTextBox);
         int moduleID = intent.getIntExtra("moduleID", 0);
         int submoduleID = intent.getIntExtra("submoduleID", 0);
         String moduleName = Module.getModuleName(moduleID);
         String displayedText = moduleName + " is the module which has been selected.";
         questionTextBox.setText(displayedText);
     }
}
