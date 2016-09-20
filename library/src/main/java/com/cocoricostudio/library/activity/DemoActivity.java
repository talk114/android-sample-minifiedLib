package com.cocoricostudio.library.activity;

import android.widget.Toast;

/**
 * Created by Francois Rouault on 20/09/2016.
 */

public class DemoActivity extends LibActivity {

    @Override
    protected void saySomething(String what) {
        String text = "I want to say something else, and not '" + what + "'";
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
