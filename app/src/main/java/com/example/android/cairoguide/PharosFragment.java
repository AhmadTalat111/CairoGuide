package com.example.android.cairoguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PharosFragment extends Fragment {

    public PharosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.pyramids), getString(R.string.pyramids_address),
                R.drawable.ic_pyramids));
        locations.add(new Location(getString(R.string.sphynix), getString(R.string.sphynix_address),
                R.drawable.ic_sphynix));
        locations.add(new Location(getString(R.string.Egyptian_Museum), getString(R.string.museum_address),
                R.drawable.ic_egyptian_muesum));
        locations.add(new Location(getString(R.string.zoser), getString(R.string.zoser_address),
                R.drawable.ic_zoser));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }
}
