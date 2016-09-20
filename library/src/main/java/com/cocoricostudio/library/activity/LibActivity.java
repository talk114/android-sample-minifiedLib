package com.cocoricostudio.library.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.cocoricostudio.library.model.LibObject;

/**
 * Created by Francois Rouault on 20/09/2016.
 */
public class LibActivity extends AppCompatActivity {

    private static final String TAG = LibActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.v(TAG, "FROM LIB : onCreate");
        saySomethingPrivatly();
    }

    private void saySomethingPrivatly() {
        String text = "Hey hey";
        LibObject object = new LibObject("Hello");
        Log.v(TAG, object.methodPublic("str", 5));
    }

    protected void saySomething(String what) {
        String text = new InnerClass(what).saySomething();
        String textPrivate = new InnerClassPrivatePackaged(what).saySomething();
        Toast.makeText(this, "From public class : " + text + "\nFrom private class : " + textPrivate, Toast.LENGTH_SHORT).show();
    }

    public static class InnerClass {
        private final String mAnythingToDeclare;

        InnerClass(String anythingToDeclare) {
            mAnythingToDeclare = anythingToDeclare;
        }

        String saySomething() {
            return mAnythingToDeclare;
        }
    }

    static class InnerClassPrivatePackaged extends InnerClass {
        InnerClassPrivatePackaged(String anythingToDeclare) {
            super(anythingToDeclare);
        }
    }

}
