package com.example.thirdyearproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class submodulesPage extends AppCompatActivity implements SubmoduleListFragment.deliveringModuleID, SubmoduleListFragment.submodulesListener {

    private int moduleID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Intent stuff needs to be before the setting content view otherwise the fragment
        // cannot access the correct moduleID as the fragment code takes over and the intent
        // code doesn't get run.
        Intent intent = getIntent();
        this.moduleID = intent.getIntExtra( "moduleID" , 0 );
        setContentView(R.layout.activity_submodules_page);
    }

    @Override
    public int getModuleID() {
        return this.moduleID;
    }

    @Override
    public void itemClicked( int submoduleID ) {
     // fill in later
        Intent intent = new Intent(this, difficultySelection.class);
        intent.putExtra("submoduleID", submoduleID);
        intent.putExtra("moduleID", moduleID);
        startActivity(intent);
    }

}
