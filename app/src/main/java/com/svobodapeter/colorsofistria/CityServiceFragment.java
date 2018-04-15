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

public class CityServiceFragment extends android.support.v4.app.Fragment {

    private Context context;
    private View rootView;

    /*
    Will fill the fragment in info_about_city.xml acc. to called city.
    This fragment take care about events in certain city.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.city_service, container, false);

        //Condition will select method according to the context.
        Context context = getContext();
        this.context = context;
        if (this.context instanceof InfoAboutCityUmag) {
            Log.i("CityListFragment", "Umag");
            callingUmag();

        } else if (this.context instanceof InfoAboutCityBrtonigla) {
            Log.i("CityListFragment", "Brtonigla");
            callingBrtonigla();

        } else if (this.context instanceof InfoAboutCityNovigrad) {
            Log.i("CityListFragment", "Novigrad");
            callingNovigrad();

        } else {
            Log.i("CityListFragment", "Buje");
            callingBuje();
        }
        return rootView;
    }

    //Method which will fill create array with adapter and fill with data - for city Buje
    private void callingBuje() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.services_list);
        listView.setAdapter(objectAdapter);
    }

    //Method which will fill create array with adapter and fill with data - for city Novigrad
    private void callingNovigrad() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.services_list);
        listView.setAdapter(objectAdapter);
    }

    //Method which will fill create array with adapter and fill with data - for city Brtonigla
    private void callingBrtonigla() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.services_list);
        listView.setAdapter(objectAdapter);
    }

    //Method which will fill create array with adapter and fill with data - for city Umag
    private void callingUmag() {

        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));
        object.add(new ObjectOfInterest(R.drawable.blank_image, R.drawable.ic_caffe,  getString(R.string.NameOfObject), getString(R.string.objectDescription), "geo:0,0"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.services_list);
        listView.setAdapter(objectAdapter);

    }
}
