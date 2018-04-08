package com.svobodapeter.colorsofistria;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by pitrs on 31.03.2018.
 */

public class CityListFragment extends Fragment {

    private Context context;
    private ObjectOfInterest objectSelected;
    private View rootView;

    /*
    Will fill the fragment City Info in info_about_city.xml acc. to called city.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.city_list, container, false);
        //Thanks to context we will get name of Activity a start the right array list
        final Context context = getContext();
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
     * Each view has own icon, image, name, description and GPS coordinates. Cn click listener will call Google Maps app and
     * insert coodrdinates with question on place.
     */
    private void callingBuje() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.buje_caffe, R.drawable.ic_caffe, getString(R.string.buje_caffe), getString(R.string.buje_caffe_description), "geo:45.4074704,13.658832?q=Caffe bar Istra"));
        object.add(new ObjectOfInterest(R.drawable.buje_church, R.drawable.ic_historical, getString(R.string.buje_church), getString(R.string.buje_church_description), "geo:45.4074704,13.658832?q=Crkva Majke Milosrđa"));
        object.add(new ObjectOfInterest(R.drawable.buje_konzum, R.drawable.ic_restaurant, getString(R.string.buje_konzum), getString(R.string.buje_konzum_description), "geo:45.4074704,13.658832?q=Konzum"));
        object.add(new ObjectOfInterest(R.drawable.buje_main_square, R.drawable.ic_historical, getString(R.string.buje_main_square), getString(R.string.buje_main_square_description), "geo:45.4074704,13.658832?q=Chiesa di San Servolo"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.best_of_city_list);
        listView.setAdapter(objectAdapter);
        //Creating of OnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ObjectOfInterest objectSelected = object.get(position);
                callAndStartIntent(objectSelected);
            }
        });
    }

    /**
     * Call will create a new array list and adapter for ListView - data for Novigrad
     * Each view has own icon, image, name, description and GPS coordinates. Cn click listener will call Google Maps app and
     * insert coodrdinates with question on place.
     */
    private void callingNovigrad() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.novigrad_church, R.drawable.ic_historical, getString(R.string.novigrad_church), getString(R.string.novigrad_church_description), "geo:45.3167211,13.5505102?q=Museo Lapidaroum"));
        object.add(new ObjectOfInterest(R.drawable.novigrad_murmaid, R.drawable.ic_historical, getString(R.string.novigrad_murmaid), getString(R.string.novigrad_murmaid_description), "geo:45.3167211,13.5505102?q=Rivarela Ul. 7-1"));
        object.add(new ObjectOfInterest(R.drawable.novigrad_pool, R.drawable.ic_historical, getString(R.string.novigrad_pool), getString(R.string.novigrad_pool_description), "geo:45.3167211,13.5505102?q=Pool Punto Mare"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.best_of_city_list);
        listView.setAdapter(objectAdapter);
        //Creating of OnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ObjectOfInterest objectSelected = object.get(position);
                callAndStartIntent(objectSelected);
            }
        });
    }

    /**
     * Call will create a new array list and adapter for ListView - data for Brtonigla
     * Each view has own icon, image, name, description and GPS coordinates. Cn click listener will call Google Maps app and
     * insert coodrdinates with question on place.
     */
    private void callingBrtonigla() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.brtonigla_church, R.drawable.ic_historical, getString(R.string.brtonigla_church), getString(R.string.brtonigla_church_description), "geo:?q=45.378452,13.626163?q=City Hall"));
        object.add(new ObjectOfInterest(R.drawable.brtonigla_krslina, R.drawable.ic_historical, getString(R.string.brtonigla_skarline), getString(R.string.brtonigla_skarline_description), "geo:?q=45.378452,13.626163?q=Skarline"));
        object.add(new ObjectOfInterest(R.drawable.brtonigla_rocco, R.drawable.ic_restaurant, getString(R.string.brtonigla_san_rocco), getString(R.string.brtonigla_san_rocco_description), "geo:?q=45.378452,13.626163?q=San Rocco Hotel"));

        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.best_of_city_list);
        listView.setAdapter(objectAdapter);
        //Creating of OnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ObjectOfInterest objectSelected = object.get(position);
                callAndStartIntent(objectSelected);
            }
        });
    }

    /**
     * Call will create a new array list and adapter for ListView - data for Umag
     * Each view has own icon, image, name, description and GPS coordinates. Cn click listener will call Google Maps app and
     * insert coodrdinates with question on place.
     */
    private void callingUmag() {
        final ArrayList<ObjectOfInterest> object = new ArrayList<>();
        object.add(new ObjectOfInterest(R.drawable.umag_amici, R.drawable.ic_caffe, getString(R.string.umag_amici), getString(R.string.umag_amici_description), "geo:45.433449,13.518128?q=Bar Buoni Amici"));
        object.add(new ObjectOfInterest(R.drawable.umag_old_town, R.drawable.ic_historical, getString(R.string.umag_town_center), getString(R.string.umag_town_center_description), "geo:45.433740,13.518317?q=Town Center"));
        object.add(new ObjectOfInterest(R.drawable.umag_americano, R.drawable.ic_caffe, getString(R.string.umag_americano), getString(R.string.umag_americano_description), "geo:45.433740,13.518317?q=American Bar"));
        object.add(new ObjectOfInterest(R.drawable.umag_main_square, R.drawable.ic_historical, getString(R.string.umag_main_square), getString(R.string.umag_main_square_description), "geo:45.432876,13.522037?q= Ul. 1. svobnja"));


        ObjectOfInterestAdapter objectAdapter = new ObjectOfInterestAdapter(getActivity(), object);
        final ListView listView = rootView.findViewById(R.id.best_of_city_list);
        listView.setAdapter(objectAdapter);
        //Creating of OnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ObjectOfInterest objectSelected = object.get(position);
                callAndStartIntent(objectSelected);
            }
        });
    }

    /**
     * Calling Google Maps app and taking GPS coordinates from object of arrayList
     */
    private void callAndStartIntent(ObjectOfInterest objectSelected) {
        Log.i("Selected Object", objectSelected.toString());
        // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse(objectSelected.getGpsOfObject());
        Log.i("GPS", gmmIntentUri.toString());
        // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");
        // Attempt to start an activity that can handle the Intent
        startActivity(mapIntent);
    }


}
