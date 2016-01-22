package com.hankarun.movietvguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;

public class TvFragment extends Fragment{
    private String title;
    private int page;

    public static MovieFragment newInstance(int page, String title) {
        MovieFragment fragmentFirst = new MovieFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }
}
