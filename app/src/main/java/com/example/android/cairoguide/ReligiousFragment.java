package com.example.android.cairoguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ReligiousFragment extends Fragment {

    public ReligiousFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.azhar), getString(R.string.azhar_address)));
        locations.add(new Location(getString(R.string.magra_oyoon), getString(R.string.magra_oyoon_address)));
        locations.add(new Location(getString(R.string.Ali_mosque), getString(R.string.Ali_mosque_address)));
        locations.add(new Location(getString(R.string.Papylon_Castle), getString(R.string.Papylon_Castle_address)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
