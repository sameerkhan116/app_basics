package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("weṭeṭṭi", "red"));
        colors.add(new Word("chokokki", "green"));
        colors.add(new Word("ṭakaakki", "brown"));
        colors.add(new Word("ṭopoppi", "gray"));
        colors.add(new Word("kululli", "black"));
        colors.add(new Word("kelelli", "white"));
        colors.add(new Word("ṭopiisә", "dusty yellow"));
        colors.add(new Word("chiwiiṭә", "mustard yellow"));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.colors);
        listView.setAdapter(adapter);
    }
}
