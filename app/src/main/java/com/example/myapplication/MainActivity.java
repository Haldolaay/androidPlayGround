package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity; // used for backwords compatibility

import android.os.Bundle;// used for interacting with with the software
import android.util.Log; // to use the log, which is the equavelant of system I think
import android.view.View; // view is any button/box in the app

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View event){
        Log.i("info","everything is working");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
