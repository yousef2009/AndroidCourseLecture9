package com.example.lecture9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lecture9.fragments.loginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frContainer, new loginFragment()).commit();
    }
}