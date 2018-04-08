package com.svobodapeter.colorsofistria;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pitrs on 31.03.2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"City Info", "Events", "Services"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Constructor for fragment adapter
     * @param position - coresponding with position of TabLayout and selecting right Fragment to show
     * @return
     */
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new CityListFragment();
        } else if (position == 1) {
            return new CityEventsFragment();
        } else {
            return new CityServiceFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
