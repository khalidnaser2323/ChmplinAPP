package com.indeves.chmplinapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.indeves.chmplinapp.R;

public class MainActivity extends AppCompatActivity {
    Button proSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proSignUp = findViewById(R.id.splash_button_ProSignUp);
        proSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to pro home screen
                startActivity(new Intent(MainActivity.this, ProLandingPage.class));

            }
        });
    }
}
