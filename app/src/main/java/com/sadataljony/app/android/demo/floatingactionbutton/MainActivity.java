package com.sadataljony.app.android.demo.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialize FloatingActionButton
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);//implementation 'com.google.android.material:material:1.0.0' dependency needed for Floating Action Button
        // set OnClickListener to FloatingActionButton
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // show Snackbar after clicking FloatingActionButton
                Snackbar.make(view, "Floating Action Button working", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
