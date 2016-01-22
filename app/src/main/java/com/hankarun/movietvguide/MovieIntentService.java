package com.hankarun.movietvguide;

import android.app.IntentService;
import android.content.Intent;

public class MovieIntentService extends IntentService {
    public final static String DEFAULT_NAME = "movieFetch";

    public MovieIntentService(String name) {
        super(name);
    }

    public MovieIntentService(){
        super(DEFAULT_NAME);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
