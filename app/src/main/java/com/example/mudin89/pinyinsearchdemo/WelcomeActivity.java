package com.example.mudin89.pinyinsearchdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        Button btnKeyboard = findViewById(R.id.btnKeyboard);

        Button btnSearch = findViewById(R.id.btnSearch);

        btnKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toKeyboard();

            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSearch();
            }
        });
    }

    public void toSearch(){
        Intent myIntent = new Intent(WelcomeActivity.this, PinyinSearchActivity.class);
        myIntent.putExtra("key", "search");
        WelcomeActivity.this.startActivity(myIntent);
    }

    public void toKeyboard(){
        Intent myIntent = new Intent(WelcomeActivity.this, MainActivity.class);
        myIntent.putExtra("key", "keyboard");
        WelcomeActivity.this.startActivity(myIntent);

    }

}
