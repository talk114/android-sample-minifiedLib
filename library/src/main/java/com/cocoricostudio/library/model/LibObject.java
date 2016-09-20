package com.cocoricostudio.library.model;

import android.support.annotation.NonNull;

/**
 * Created by Francois Rouault on 20/09/2016.
 */
public class LibObject {

    private final String mName;

    public LibObject(String name) {
        mName = name;
    }

    public String methodPublic(String publicStr, int publicInt) {
        // will proguard remove comments ? YES
        String mergeText = publicStr + publicInt; // will proguard change mergeText var name ? YES
        String uselessString = mergeText + publicStr + publicInt; // Will proguard keep unless var ? YES
        return createString(publicStr, publicInt);
    }

    protected String methodProtected(String protectedString, int protectedInt) {
        return createString(protectedString, protectedInt);
    }

    private String methodPrivate(String privateString, int privateInt) {
        return createString(privateString, privateInt);
    }

    @NonNull
    String createString(String str, int integer) {
        methodProtected(str, integer);
        methodPrivate(str, integer);
        return "[" + mName + " | " + str + integer + "]";
    }

}
