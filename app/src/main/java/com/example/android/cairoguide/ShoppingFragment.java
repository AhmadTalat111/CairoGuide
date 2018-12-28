package com.example.android.cairoguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.carfour), getString(R.string.carfour_address)));
        locations.add(new Location(getString(R.string.Hyper), getString(R.string.Hyper_address)));
        locations.add(new Location(getString(R.string.citystars), getString(R.string.citystars_address)));
        locations.add(new Location(getString(R.string.Khan), getString(R.string.Khan_address)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }
}
