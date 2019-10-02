package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * CIS 3515 - Lab 3 Color Activity
 * Toi Do 9/27/2019
 */
public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner;

        spinner = findViewById(R.id.spinner);

        final String [] colors = {"WHITE", "TEAL", "AQUA", "BLUE", "CYAN", "GREEN", "LIME", "YELLOW", "RED", "BLACK"};

        ColorAdapter adapter = new ColorAdapter(this, colors);
        spinner.setAdapter(adapter);


        final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                layout.setBackgroundColor(Color.parseColor((String)colors[i]));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
                layout.setBackgroundColor(Color.WHITE);
            }
        });
    }
}
