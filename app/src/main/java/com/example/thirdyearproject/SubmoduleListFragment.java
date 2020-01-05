package com.example.thirdyearproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.app.ListFragment;
import android.widget.ArrayAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubmoduleListFragment extends ListFragment {

    static interface submodulesListener{
        void itemClicked( int submoduleID );
    };

    static interface deliveringModuleID{
        int getModuleID();
    };

    private submodulesListener listener;
    private deliveringModuleID moduleIDFinder;

    int moduleID;
    String[] submodules;

    public SubmoduleListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        this.moduleID = moduleIDFinder.getModuleID();
        this.submodules = Module.getSubModules( moduleID );
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( inflater.getContext(), android.R.layout.simple_list_item_1, submodules );
        setListAdapter(adapter);
        return super.onCreateView( inflater, container, savedInstanceState );
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (submodulesListener) activity;
        this.moduleIDFinder = (deliveringModuleID) activity;
    }

    public void setModuleID( int moduleID ) {
        this.moduleID = moduleID;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
          listener.itemClicked((int) id);
        }
    }


}
