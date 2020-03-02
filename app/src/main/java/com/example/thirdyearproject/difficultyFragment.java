package com.example.thirdyearproject;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class difficultyFragment extends ListFragment {


    static interface difficultyListener{
        void itemClicked(int selectionID );
    };

    private difficultyListener listener;

    public difficultyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] options = new String[2];
        options[0] = "Foundation";
        options[1] = "Higher";
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( inflater.getContext(), android.R.layout.simple_list_item_1, options );
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (difficultyListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked((int) id);
        }
    }

}
