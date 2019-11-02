package com.example.thirdyearproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.app.FragmentTransaction;

public class modulesPage extends AppCompatActivity implements ModuleListFragment.ModuleListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules_page);
    }

    @Override
    public void itemClicked( int id ) {
        // TODO:
        //      Pass that using intents onto the next activity containing SubmoduleListFragment
        Intent intent = new Intent( this, submodulesPage.class );
        intent.putExtra( "moduleID", id );
        startActivity( intent );
    }

}
