package com.example.android.cairoguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Activity context, ArrayList<Location> Shops) {
        super(context, 0, Shops);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);

        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getLocationName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.address);
        descriptionTextView.setText(currentLocation.getAddress());
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentLocation.hasImage()) {

            image.setImageResource(currentLocation.getImageResourceId());
            image.setVisibility(View.VISIBLE);

        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
