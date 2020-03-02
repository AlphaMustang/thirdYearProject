package com.example.thirdyearproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class difficultySelection extends AppCompatActivity implements difficultyFragment.difficultyListener{

    private Intent intent;
    private int moduleID;
    private int submoduleID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_selection);
        intent = getIntent();
        moduleID = intent.getIntExtra("moduleID",0);
        submoduleID = intent.getIntExtra("submoduleID",0);
    }

    @Override
    public void itemClicked( int selectionID ) {
        Intent intent = new Intent(this, displayQuestion.class);
        intent.putExtra("moduleID", moduleID);
        intent.putExtra("submoduleID", submoduleID);
        intent.putExtra("difficulty", selectionID);
        startActivity(intent);
    }

}
