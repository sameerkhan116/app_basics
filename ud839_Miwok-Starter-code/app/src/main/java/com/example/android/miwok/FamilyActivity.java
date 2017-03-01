package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mMediaPLayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("әpә", "father", R.drawable.family_father, R.raw.family_father));
        family.add(new Word("әṭa", "mother", R.drawable.family_mother, R.raw.family_mother));
        family.add(new Word("angsi", "son", R.drawable.family_son, R.raw.family_son));
        family.add(new Word("tune", "daughter", R.drawable.family_daughter, R.raw.family_daughter));
        family.add(new Word("taachi", "older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        family.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        family.add(new Word("teṭe", "older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        family.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        family.add(new Word("ama", "grandmother", R.drawable.family_grandmother, R.raw.family_grandmother));
        family.add(new Word("paapa", "grandfather", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, family, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word families = family.get(i);
                mMediaPLayer = MediaPlayer.create(FamilyActivity.this, families.getAudioResourceId());
                mMediaPLayer.start();
            }
        });
    }
}
