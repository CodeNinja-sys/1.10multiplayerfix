/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.b;

class ag
implements b {
    ag() {
    }

    public void a(Callback callback, Throwable throwable) {
        System.err.println("JNA: Callback " + callback + " threw the following exception:");
        throwable.printStackTrace();
    }
}

