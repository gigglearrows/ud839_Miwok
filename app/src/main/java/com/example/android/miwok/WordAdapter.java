package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * mhm
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        Word currentWord = getItem(position);

        LinearLayout textLinearLayout = listItemView.findViewById(R.id.textLinearLayout);
        TextView defaultTranslation = listItemView.findViewById(R.id.default_text_view);
        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        ImageView image = listItemView.findViewById(R.id.image);

        defaultTranslation.setText(currentWord.getDefaultTranslation());
        miwokTranslation.setText(currentWord.getMiwokTranslation());
        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textLinearLayout.setBackgroundColor(color);

        return listItemView;
    }
}
