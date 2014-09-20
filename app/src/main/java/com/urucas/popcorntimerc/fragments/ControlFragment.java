package com.urucas.popcorntimerc.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.urucas.popcorntimerc.R;
import com.urucas.popcorntimerc.activities.SplashActivity;

/**
 * Created by Urucas on 8/20/14.
 */
public class ControlFragment extends android.support.v4.app.Fragment {

    private View view;
    private ImageButton leftBtt;
    private ImageButton rigthBtt;
    private ImageButton upBtt;
    private ImageButton downBtt;
    private ImageButton enterBtt;
    private Button moviesBtt;
    private Button seriesBtt;
    private ImageButton backBtt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        SplashActivity.clearVolumeKeys();

        view = inflater.inflate(R.layout.fragment_control, container, false);

        leftBtt = (ImageButton) view.findViewById(R.id.leftBtt);
        rigthBtt = (ImageButton) view.findViewById(R.id.rightBtt);
        upBtt = (ImageButton) view.findViewById(R.id.upBtt);
        downBtt = (ImageButton) view.findViewById(R.id.downBtt);
        enterBtt = (ImageButton) view.findViewById(R.id.enterBtt);

        moviesBtt = (Button) view.findViewById(R.id.showMoviesBtt);
        seriesBtt = (Button) view.findViewById(R.id.showSeriesBtt);
        backBtt = (ImageButton) view.findViewById(R.id.backBtt);

        leftBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().moveLeft();
            }
        });

        rigthBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().moveRight();
            }
        });

        upBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().moveUp();
            }
        });

        downBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().moveDown();
            }
        });

        enterBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().enter();
            }
        });

        moviesBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().showMoviesList();
            }
        });

        seriesBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().showSeriesList();
            }
        });

        backBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashActivity.getRemoteControl().escape();
            }
        });

        return view;
    }
}
