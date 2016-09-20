package com.cocoricostudio.lib_minified;

import android.os.Bundle;

import com.cocoricostudio.library.activity.LibActivity;
import com.cocoricostudio.library.model.LibObject;

public class MainActivity extends LibActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saySomething("Hello !");
    }
}
