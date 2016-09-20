package com.cocoricostudio.lib_minified;

import android.os.Bundle;

import com.cocoricostudio.library.activity.DemoActivity;

public class MainActivity extends DemoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saySomething("Hello !");
    }
}
