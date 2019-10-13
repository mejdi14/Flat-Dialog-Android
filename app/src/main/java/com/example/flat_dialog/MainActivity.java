package com.example.flat_dialog;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flatdialoglibrary.dialog.FlatDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       FlatDialog flatDialog= new FlatDialog(MainActivity.this);



    }
}
