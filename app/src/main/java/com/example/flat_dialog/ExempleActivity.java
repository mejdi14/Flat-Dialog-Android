package com.example.flat_dialog;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flatdialoglibrary.dialog.FlatDialog;

public class ExempleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new FlatDialog(ExempleActivity.this).setFirstButtonColor(Color.parseColor("#000000"))
                .setFirstButtonTextColor(Color.parseColor("#FFFFFF"))
                .setFirstButtonText("hello baby")
                .setBackgroundColor(Color.parseColor("#f7be16"))
                .show();



    }
}
