package com.i017114.tallernavigation.Fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.i017114.tallernavigation.R;


/**
 * Created by reyes on 03/09/2017.
 */

public class TresFragment extends Fragment {


    private int contentView;



    public TresFragment() {

        // Required empty public constructor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tres, container, false);
    }


    public void setContentView(int contentView) {
        this.contentView = contentView;
    }


}