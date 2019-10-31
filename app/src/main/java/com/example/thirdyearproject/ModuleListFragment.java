package com.example.thirdyearproject;


import android.app.ListFragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.thirdyearproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ModuleListFragment extends ListFragment {


    public ModuleListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // create an array to store each value which you wish to display in the list
        String[] moduleNames = new String[Module.moduleList.length];
        // iterate through the modules array adding the names of the module to the list you
        // have just created
        for ( int i = 0; i < moduleNames.length; i++ ) {
            moduleNames[i] = Module.moduleList[i].getName();
        }

        // create an ArrayAdapter to bind the array to the listFragment
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( inflater.getContext(), android.R.layout.simple_list_item_1, moduleNames );
        // bind the ArrayAdapter to the list fragment
        setListAdapter(adapter);

        return super.onCreateView( inflater, container, savedInstanceState );
    }

}
