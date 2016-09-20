package com.cocoricostudio.library;

/**
 * Created by Francois Rouault on 20/09/2016.
 */

public class LibUtils {

    public static String methodPublic(String publicStr, int publicInt) {
        String res = publicStr + publicInt + LibUtilsPrivate.methodPublic();
        return res;
    }

    protected static String methodProtected(String protectedString, int protectedInt) {
        return "Method Protected";
    }

    private static String methodPrivate(String privateString, int privateInt) {
        return "Method Private";
    }

    static String methodPackage(String packageString, int packageInt) {
        return "Method Package";
    }

}
