package com.example.basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        System.out.println("check here");
        System.out.println("we did it I guess");
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
}