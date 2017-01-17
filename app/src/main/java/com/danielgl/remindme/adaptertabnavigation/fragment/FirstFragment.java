package com.danielgl.remindme.adaptertabnavigation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.danielgl.remindme.R;

/**
 * Created by dedbob5 on 17.01.2017.
 */

public class FirstFragment extends Fragment{
    private static final int LAYOUT = R.layout.fragment_first;

    private View view;

    public static FirstFragment getInstance(){
        Bundle args = new Bundle();
        FirstFragment fragment = new FirstFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }
}
