package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        // Set a click listener on the numbers view
        if (numbers != null) {
            numbers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });
        }

        // Find the View that shows the family members category
        TextView familyMembers = (TextView) findViewById(R.id.family);
        // Set a click listener on the family members view
        if (familyMembers != null) {
            familyMembers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(familyIntent);
                }
            });
        }

        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        // Set a click listener on the colors view
        if (colors != null) {
            colors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent colorsIntent = new Intent(MainActivity.this, ColorActivity.class);
                    startActivity(colorsIntent);
                }
            });
        }

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        // Set a click listener on the phrases view
        if (phrases != null) {
            phrases.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                }
            });
        }
    }

}
