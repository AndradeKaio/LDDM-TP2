package com.example.kaio.trabalho02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kaio on 20/09/2015.
 */
public class FragmentOne extends android.app.Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_one_layout, container, false);
    }
}
