
package com.example.android.manhattan_tour_guide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_list, container, false);


        // Create a list of details
        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.battery_name, R.string.battery_address,R.string.battery_hours, R.string.battery_about,
                R.drawable.battery_1));

        details.add(new Detail(R.string.bryant_name, R.string.bryant_address, R.string.bryant_hours,R.string.bryant_about,
                R.drawable.bryant_1));

        details.add(new Detail(R.string.central_name, R.string.central_address, R.string.central_hours,R.string.central_about,
                R.drawable.central_1));

        details.add(new Detail(R.string.highline_name, R.string.highline_address,R.string.highline_hours, R.string.highline_about,
                R.drawable.highline_1));

        details.add(new Detail(R.string.madison_name, R.string.madison_address, R.string.madison_hours,R.string.madison_about,
                R.drawable.madison_1));

        details.add(new Detail(R.string.washington_name, R.string.washington_address, R.string.washington_hours,R.string.washington_about,
                R.drawable.washington_1));


        // Create an {@link DetailAdapter}, whose data source is a list of {@link Detail}s. The
        // adapter knows how to create list items for each item in the list.
        DetailAdapter adapter = new DetailAdapter(getActivity(), details, R.color.category_parks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // detail_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link DetailAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Detail} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Detail} object at the given position the user clicked on
                Detail detail = details.get(position);
            }
        });

        return rootView;
    }
}
