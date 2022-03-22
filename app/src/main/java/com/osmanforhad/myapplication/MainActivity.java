package com.osmanforhad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //__Hide Title__//
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //__Hide TitleBar__//
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
}