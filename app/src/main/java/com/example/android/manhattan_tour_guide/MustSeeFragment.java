
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
public class MustSeeFragment extends Fragment {


    public MustSeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_list, container, false);


        // Create a list of details
        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.memorial_name, R.string.memorial_hours, R.string.memorial_address, R.string.memorial_about,
                R.drawable.memorial_1));

        details.add(new Detail(R.string.chelsea_name, R.string.chelsea_hours, R.string.chelsea_address, R.string.chelsea_about,
                R.drawable.chelsea_1));

        details.add(new Detail(R.string.chrysler_name, R.string.chrysler_hours, R.string.chrysler_address, R.string.chrysler_about,
                R.drawable.chrysler_1));

        details.add(new Detail(R.string.empire_name, R.string.empire_hours, R.string.empire_address, R.string.empire_about,
                R.drawable.empire_1));

        details.add(new Detail(R.string.flatiron_name, R.string.flatiron_hours, R.string.flatiron_address, R.string.flatiron_about,
                R.drawable.flatiron_1));

        details.add(new Detail(R.string.grand_name, R.string.grand_hours, R.string.grand_address, R.string.grand_about,
                R.drawable.grand_1));

        details.add(new Detail(R.string.msg_name, R.string.madison_hours, R.string.msg_address, R.string.msg_about,
                R.drawable.msg_1));

        details.add(new Detail(R.string.one_name, R.string.one_hours, R.string.one_address, R.string.one_about,
                R.drawable.one_1));

        details.add(new Detail(R.string.rocker_name, R.string.rocker_hours, R.string.rocker_address, R.string.rocker_about,
                R.drawable.rocker_1));

        details.add(new Detail(R.string.tsq_name, R.string.tsq_hours, R.string.tsq_address, R.string.tsq_about,
                R.drawable.tsq_1));


        // Create an {@link DetailAdapter}, whose data source is a list of {@link Detail}s. The
        // adapter knows how to create list items for each item in the list.
        DetailAdapter adapter = new DetailAdapter(getActivity(), details, R.color.category_must_see);

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
