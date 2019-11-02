package com.example.thirdyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // TODO: .Complete modulesPage to link to that listView

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
        Intent intent = new Intent(this, modulesPage.class);
        startActivity(intent);
    }
    


}
