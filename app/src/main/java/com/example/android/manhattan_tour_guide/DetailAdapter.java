package com.example.android.manhattan_tour_guide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailAdapter extends ArrayAdapter<Detail> {

    /**Resource ID for the background color for this list of words*/
    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param details A List of AndroidFlavor objects to display in a list
     * @param colorResourceId is the resource ID for the background color for this list of details
     */
    public DetailAdapter(Context context, ArrayList<Detail> details, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, details);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Detail currentDetail = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentDetail.getNameId());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.hours_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        hoursTextView.setText(currentDetail.getHoursId());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressTextView.setText(currentDetail.getAddressId());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView aboutTextView = (TextView) listItemView.findViewById(R.id.about_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        aboutTextView.setText(currentDetail.getAboutId());



        //find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageView =(ImageView) listItemView.findViewById(R.id.image);

        if(currentDetail.hasImage()) {

            // Set the ImageView to the image resource specified in the current Detail
            imageView.setImageResource(currentDetail.getImageResourceId());

            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);

        }
        else{
            //otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);

        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
       // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
