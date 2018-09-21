
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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_list, container, false);


        // Create a list of details
        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.american_name, R.string.american_hours, R.string.american_address, R.string.american_about,
                R.drawable.american_1));

        details.add(new Detail(R.string.cooper_name, R.string.cooper_hours, R.string.cooper_address, R.string.cooper_about,
                R.drawable.cooper_1));

        details.add(new Detail(R.string.new_name, R.string.new_hours, R.string.new_address, R.string.new_about,
                R.drawable.new_1));

        details.add(new Detail(R.string.met_name, R.string.met_hours, R.string.met_address, R.string.met_about,
                R.drawable.met_1));

        details.add(new Detail(R.string.moma_name, R.string.moma_hours, R.string.moma_address, R.string.moma_about,
                R.drawable.moma_1));

        details.add(new Detail(R.string.moad_name, R.string.moad_hours, R.string.moad_address, R.string.moad_about,
                R.drawable.moad_1));

        details.add(new Detail(R.string.fit_name, R.string.fit_hours, R.string.fit_address, R.string.fit_about,
                R.drawable.fit_1));

        details.add(new Detail(R.string.sex_name, R.string.sex_hours, R.string.sex_address, R.string.sex_about,
                R.drawable.sex_1));

        details.add(new Detail(R.string.gugg_name, R.string.gugg_hours, R.string.gugg_address, R.string.gugg_about,
                R.drawable.gugg_1));

        details.add(new Detail(R.string.whitney_name, R.string.whitney_hours, R.string.whitney_address, R.string.whitney_about,
                R.drawable.whitney_1));


        // Create an {@link DetailAdapter}, whose data source is a list of {@link Detail}s. The
        // adapter knows how to create list items for each item in the list.
        DetailAdapter adapter = new DetailAdapter(getActivity(), details, R.color.category_museums);

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
