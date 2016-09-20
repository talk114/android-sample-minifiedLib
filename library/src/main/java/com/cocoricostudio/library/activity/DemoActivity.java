package com.cocoricostudio.library.activity;

import android.support.annotation.Keep;
import android.widget.Toast;

/**
 * Created by Francois Rouault on 20/09/2016.
 */
public class DemoActivity extends LibActivity {

    @Override
    @Keep
    protected void saySomething(String what) {
        super.saySomething(what);
        String text = "Let me say something else ! " + what;
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
