
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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_list, container, false);


        // Create a list of details
        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.absolute_name, R.string.absolute_hours, R.string.absolute_address, R.string.absolute_about,
                R.drawable.absolute_1));

        details.add(new Detail(R.string.artichoke_name, R.string.artichoke_hours, R.string.artichoke_address, R.string.artichoke_about,
                R.drawable.artichoke_1));

        details.add(new Detail(R.string.zaiya_name, R.string.zaiya_hours, R.string.zaiya_address, R.string.zaiya_about,
                R.drawable.zaiya_1));

        details.add(new Detail(R.string.halal_name, R.string.halal_hours, R.string.halal_address, R.string.halal_about,
                R.drawable.halal_1));

        details.add(new Detail(R.string.ladym_name, R.string.ladym_hours, R.string.ladym_address, R.string.ladym_about,
                R.drawable.ladym_1));

        details.add(new Detail(R.string.los_name, R.string.los_hours, R.string.los_address, R.string.los_about,
                R.drawable.los_1));

        details.add(new Detail(R.string.mighty_name, R.string.mighty_hours, R.string.mighty_address, R.string.mighty_about,
                R.drawable.mighty_1));

        details.add(new Detail(R.string.mimi_name, R.string.mimi_hours, R.string.mimi_address, R.string.mimi_about,
                R.drawable.mimi_1));

        details.add(new Detail(R.string.momo_name, R.string.momo_hours, R.string.momo_address, R.string.momo_about,
                R.drawable.momo_1));

        details.add(new Detail(R.string.nonono_name, R.string.nonono_hours, R.string.nonono_address, R.string.nonono_about,
                R.drawable.nonono_1));


        // Create an {@link DetailAdapter}, whose data source is a list of {@link Detail}s. The
        // adapter knows how to create list items for each item in the list.
        DetailAdapter adapter = new DetailAdapter(getActivity(), details, R.color.category_food);

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
