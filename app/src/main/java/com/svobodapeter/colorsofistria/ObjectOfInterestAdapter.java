package com.svobodapeter.colorsofistria;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pitrs on 02.04.2018.
 */

public class ObjectOfInterestAdapter extends ArrayAdapter<ObjectOfInterest> {

    public ObjectOfInterestAdapter(Activity context, ArrayList<ObjectOfInterest> objectOfInterests) {
        super(context, 0, objectOfInterests);
    }

    /**
     * Will get position of view which is necessary to inflate with data from ObjectOfInterest.class
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.object_of_interest, parent, false);

        }

        ObjectOfInterest currentObjectofInterestAdapter = getItem(position);

        //Date of event - is gone when are no data accesible
        //Data are taken from arrayList through ObjecOfInterest.class and iflated into selected view
        TextView objectDate = listItemView.findViewById(R.id.date_object);
        if (currentObjectofInterestAdapter.hasString()) {
            objectDate.setText(currentObjectofInterestAdapter.getmDateObject());
            objectDate.setVisibility(View.VISIBLE);
        } else {
            objectDate.setVisibility(View.GONE);
        }

        //Preview image of object - is gone when are no data accesible
        //Data are taken from arrayList through ObjecOfInterest.class and iflated into selected view
        ImageView objectImagePreview = listItemView.findViewById(R.id.object_preview);
        if (currentObjectofInterestAdapter.hasImage()) {
            objectImagePreview.setImageResource(currentObjectofInterestAdapter.getImageResource());
            objectImagePreview.setVisibility(View.VISIBLE);
        } else {
            objectImagePreview.setVisibility(View.GONE);
        }

        //Icon of object
        //Data are taken from arrayList through ObjecOfInterest.class and iflated into selected view
        ImageView objectIconView = listItemView.findViewById(R.id.object_image_view);
        objectIconView.setImageResource(currentObjectofInterestAdapter.getmIconSourceID());

        //Name of object
        //Data are taken from arrayList through ObjecOfInterest.class and iflated into selected view
        TextView objectName = listItemView.findViewById(R.id.object_name);
        objectName.setText(currentObjectofInterestAdapter.getmNameOfObject());

        //Description of object
        //Data are taken from arrayList through ObjecOfInterest.class and iflated into selected view
        TextView objectDescription = listItemView.findViewById(R.id.object_description);
        objectDescription.setText(currentObjectofInterestAdapter.getmDescribeObject());

        //Return filled adapter with datas of views
        return listItemView;
    }
}
