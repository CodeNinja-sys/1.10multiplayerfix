/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import java.util.Iterator;
import java.util.Map;

class an {
    an() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void finalize() {
        Map map = Native.h();
        synchronized (map) {
            Iterator iterator = Native.h().entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                Native.a((Class)entry.getKey(), (long[])entry.getValue());
                iterator.remove();
            }
        }
    }
}

