package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.List;
import static android.R.attr.resource;
import static android.R.attr.theme;

/**
 * Created by sav on 26.09.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColor;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> words, int backgroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        this.mBackgroundColor = backgroundColor;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            int color = ContextCompat.getColor(getContext(), mBackgroundColor);
            listItemView.findViewById(R.id.text_layout).setBackgroundColor(color);

        }
        // Get the object located at this position in the list
        Word currentWord = getItem(position);

        // Find TextView in the list_item.xml layout
        TextView miwokWordView = (TextView) listItemView.findViewById(R.id.miwok_word_view);
        TextView defaultWordView = (TextView) listItemView.findViewById(R.id.default_word_view);

        // Set text on the TextView
        miwokWordView.setText(currentWord.getMiwokWord());
        defaultWordView.setText(currentWord.getDefaultWord());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image4word);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
/*
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_layout);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
*/
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


