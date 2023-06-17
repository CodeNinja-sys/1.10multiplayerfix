/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cv;
import com.ibm.icu.a.cy;
import com.ibm.icu.util.dn;

abstract class cx {
    cx() {
    }

    public abstract cv a(dn var1);

    public static cx a(String string) {
        try {
            return (cx)Class.forName(string).newInstance();
        }
        catch (Throwable throwable) {
            cv cv2 = new cv();
            return new cy(cv2);
        }
    }
}

