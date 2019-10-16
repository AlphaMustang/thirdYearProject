package com.example.thirdyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // TODO: .Create Information Page
    // TODO: .Complete informationPage method to link to said information page
    // TODO: .Create a modulesPage fragment, and a listView which contains said fragment
    // TODO: .Complete modulesPage to link to that listView

    // Testing to see if git works
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void informationPage(View view) {
        Intent intent = new Intent(this, informationPage.class);
        startActivity(intent);
    }

    public void modulesPage(View view) {

    }
    


}
