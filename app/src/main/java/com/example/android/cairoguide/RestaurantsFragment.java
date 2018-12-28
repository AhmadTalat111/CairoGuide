package com.example.android.cairoguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.Felela), getString(R.string.Felela_address)));
        locations.add(new Location(getString(R.string.Tahrir_Koshari), getString(R.string.Tahrir_Koshari_address)));
        locations.add(new Location(getString(R.string.prince), getString(R.string.prince_address)));
        locations.add(new Location(getString(R.string.Sobhi_Kaber), getString(R.string.Sobhi_Kaber_address)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
