package com.example.thirdyearproject;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    private submodulesListener listener;

    int moduleID;
    String[] submodules;

    public SubmoduleListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.submodules = Module.getSubModules(moduleID);
        if ( this.submodules != null ) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>( inflater.getContext(), android.R.layout.simple_list_item_1, submodules );
            setListAdapter(adapter);
        } else {
            // TODO:
            //      move onto test or lesson page
        }
        return super.onCreateView( inflater, container, savedInstanceState );
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (submodulesListener) activity;
    }

    public void setModuleID( int moduleID ) {
        this.moduleID = moduleID;
    }

}
