package com.svobodapeter.colorsofistria;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by pitrs on 31.03.2018.
 */

public class CityEventsFragment extends android.support.v4.app.Fragment {

    private Context context;
    private View rootView;

    /*
    Will fill the fragment Events in info_about_city.xml acc. to called city.
    This fragment take care about events in certain city.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.city_events, container, false);
        //Thanks to context we will get name of Activity a start the right array list
        Context context = getContext();
        this.context = context;
        //rootView will be inflated with data for Umag
        if (this.context instanceof InfoAboutCityUmag) {
            Log.i("CityListFragment", "Umag");
            callingUmag();

            //rootView will be inflated with data for Brtonigla
        } else if (this.context instanceof InfoAboutCityBrtonigla) {
            Log.i("CityListFragment", "Brtonigla");
            callingBrtonigla();

            //rootView will be inflated with data for Novigrad
        } else if (this.context instanceof InfoAboutCityNovigrad) {
            Log.i("CityListFragment", "Novigrad");
            callingNovigrad();

            //rootView will be inflated with data for Buje
        } else {
            Log.i("CityListFragment", "Buje");
            callingBuje();
        }
        return rootView;
    }

    /**
     * Call will create a new array list and adapter for ListView - data for Buje
     */
    private void callingBuje() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();

        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.events_list);
        listView.setAdapter(objectAdapter);
    }

    /**
     * Call will create a new array list and adapter for ListView - data for Novigrad
     */
    private void callingNovigrad() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();

        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.events_list);
        listView.setAdapter(objectAdapter);
    }

    /**
     * Call will create a new array list and adapter for ListView - data for Brtonigla
     */
    private void callingBrtonigla() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();

        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.events_list);
        listView.setAdapter(objectAdapter);
    }

    /**
     * Call will create a new array list and adapter for ListView - data for Umag
     */
    private void callingUmag() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));
        object.add(new ObjectOfInterest("4. 12.", "Object", "Object description"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.events_list);
        listView.setAdapter(objectAdapter);
    }
}
