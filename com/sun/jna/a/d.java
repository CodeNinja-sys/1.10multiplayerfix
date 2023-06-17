/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.a;
import com.sun.jna.a.d.do;

class d {
    public static final a a;

    private d() {
    }

    static {
        String string = System.getProperty("os.name");
        if (!string.startsWith("Windows")) {
            throw new Error("FileMonitor not implemented for " + string);
        }
        a = new do();
    }
}

