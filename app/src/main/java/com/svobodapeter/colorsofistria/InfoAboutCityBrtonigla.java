package com.svobodapeter.colorsofistria;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by pitrs on 30.03.2018.
 */

public class InfoAboutCityBrtonigla extends AppCompatActivity {

    /**
     * Activity w
     *
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_about_city);

        ViewPager cityPager = findViewById(R.id.city_pager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), this);

        // Set the adapter onto the view pager
        cityPager.setAdapter(adapter);
        cityPager.setBackgroundColor(getResources().getColor(R.color.background_orange));

        //Upper navigation through fragments - will call sources from SimpleFragmentPagerAdapter.class
        //Will change also the background color of Tablayout and selected Text
        TabLayout tabLayout = findViewById(R.id.tablayout_menu);
        tabLayout.setupWithViewPager(cityPager);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.orange));
        tabLayout.setTabTextColors(getResources().getColor(R.color.white), getResources().getColor(R.color.background_orange));

        //Will change in info_about_city.xml header image
        ImageView cityHeader = findViewById(R.id.city_header_image);
        cityHeader.setImageResource(R.drawable.brtonigla);


    }


}
