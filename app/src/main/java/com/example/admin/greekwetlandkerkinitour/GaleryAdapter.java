package com.example.admin.greekwetlandkerkinitour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * {@link GaleryAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Galery} objects.
 */
public class GaleryAdapter extends ArrayAdapter<Galery> {

    /**
     * Resource ID for the background color for this list of benefits
     */
    private int mColorResourceId;

    /**
     * Create a new {@link GaleryAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param galeries        is the list of {@link Galery}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public GaleryAdapter(Context context, ArrayList<Galery> galeries, int colorResourceId) {
        super(context, 0, galeries);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

// Get the {@link Galery} object located at this position in the list
        Galery currentGalery = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_text_view);
        // Get the Title of Kerkini' s benefit  from the currentGalery object and set this text on
        // the Galery TextView.
        titleTextView.setText(currentGalery.getTitleBenefit());

        // Find the TextView in the list_item.xml layout with the ID adress_text_view.
        TextView defaultTextView = (TextView) convertView.findViewById(R.id.adress_text_view);
        // Get the adress of benefit from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentGalery.getAdressBenefit());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        // Check if an image is provided for this galery or not
        if (currentGalery.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentGalery.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews,1 image) so that it can be shown in
        // the ListView.
        return convertView;
    }
}