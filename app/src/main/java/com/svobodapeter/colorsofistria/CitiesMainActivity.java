package com.svobodapeter.colorsofistria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;


public class CitiesMainActivity extends AppCompatActivity {

    public ProgressBar spinner;

    /**
     * Set-up on click listeners on views acc. to the cities and send information which city is opened
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_cities);

        //Will find view of spinner - loading bar
        spinner = findViewById(R.id.loading_spinner);
        spinner.setVisibility(View.INVISIBLE);

        FrameLayout umag = findViewById(R.id.city_umag);
        umag.setOnClickListener(new View.OnClickListener() {
            //Event where is listener activated
            @Override
            public void onClick(View v) {
                //Process after activation of event
                Intent intentInfoAboutCityUmag = new Intent(CitiesMainActivity.this, InfoAboutCityUmag.class);
                //Loading spinner will show and start activity
                handleSpinner();
                startActivity(intentInfoAboutCityUmag);
            }
        });

        FrameLayout brtonigla = findViewById(R.id.city_brtonigla);
        brtonigla.setOnClickListener(new View.OnClickListener() {
            //Event where is listener activated
            @Override
            public void onClick(View v) {
                //Process after activation of event
                Intent intentInfoAboutCityBrtonigla = new Intent(CitiesMainActivity.this, InfoAboutCityBrtonigla.class);
                //Loading spinner will show and start activity
                handleSpinner();
                startActivity(intentInfoAboutCityBrtonigla);
            }
        });

        FrameLayout novigrad = findViewById(R.id.city_novigrad);
        novigrad.setOnClickListener(new View.OnClickListener() {
            //Event where is listener activated
            @Override
            public void onClick(View v) {
                //Process after activation of event
                Intent intentInfoAboutCityNovigrad = new Intent(CitiesMainActivity.this, InfoAboutCityNovigrad.class);
                //Loading spinner will show and start activity
                handleSpinner();
                startActivity(intentInfoAboutCityNovigrad);
            }
        });

        FrameLayout buje = findViewById(R.id.city_buje);
        buje.setOnClickListener(new View.OnClickListener() {
            //Event where is listener activated
            @Override
            public void onClick(View v) {
                //Process after activation of event
                Intent intentInfoAboutCityBuje = new Intent(CitiesMainActivity.this, InfoAboutCityBuje.class);
                //Loading spinner will show and start activity
                handleSpinner();
                startActivity(intentInfoAboutCityBuje);

            }
        });

    }

    /**
     * Make loading spinner visible for 3 seconds
     */
    private void handleSpinner() {
        spinner.setVisibility(View.VISIBLE);
        spinner.postDelayed(new Runnable() {
            public void run() {
                spinner.setVisibility(View.INVISIBLE);
            }
        }, 3000);
    }

}
