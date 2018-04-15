package com.svobodapeter.colorsofistria;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pitrs on 31.03.2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private String tabTitles[] = new String[]{"Events", "Services"};

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    /**
     * Constructor for fragment adapter
     *
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
        switch (position) {
            case 0:
                return mContext.getString(R.string.tabLayout_city_info);
            case 1:
                return mContext.getString(R.string.tabLayout_city_events);
            case 2:
                return mContext.getString(R.string.tabLayout_city_services);
            default:
                return null;
        }
    }
}
