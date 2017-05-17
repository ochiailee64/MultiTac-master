package com.garrettshorr.multitac;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by g on 8/3/2016.
 */
public class HostOrJoinFragment extends Fragment implements View.OnClickListener {
    private Button hostButton, joinButton;
    private View rootView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_host_or_join, container, false);

        hostButton = (Button) rootView.findViewById(R.id.button_host);
        joinButton = (Button) rootView.findViewById(R.id.button_join);
        hostButton.setOnClickListener(this);
        joinButton.setOnClickListener(this);

        return rootView;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_host:
                ((MainActivity)getActivity()).startNetworkService();
                break;
            case R.id.button_join:
                ((MainActivity)getActivity()).joinNetwork();
                break;
        }
    }
}
