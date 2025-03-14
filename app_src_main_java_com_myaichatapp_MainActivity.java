package com.myaichatapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_create_character).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CharacterCreationActivity.class));
        });

        findViewById(R.id.btn_chat).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ChatActivity.class));
        });
    }
}