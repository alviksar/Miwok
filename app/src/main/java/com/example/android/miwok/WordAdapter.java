package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.List;

import static android.R.attr.resource;

/**
 * Created by sav on 26.09.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, List<Word>  words) {
        super(context, R.layout.list_item ,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
