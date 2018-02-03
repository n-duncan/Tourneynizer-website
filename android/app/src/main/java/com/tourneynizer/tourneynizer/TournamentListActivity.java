package com.tourneynizer.tourneynizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class TournamentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament_list);
        ListView tournamentListView = findViewById(R.id.tournamentList);
        tournamentListView.addView(new TournamentListItemView(this));
    }
}
