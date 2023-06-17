/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.d;
import com.ibm.icu.a.ez;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ex
extends d {
    private ConcurrentHashMap a = new ConcurrentHashMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final Object a(Object object, Object object2) {
        ez ez2 = (ez)this.a.get(object);
        if (ez2 != null) {
            ez ez3 = ez2;
            synchronized (ez3) {
                Object object3 = ez.a(ez2).get();
                if (object3 != null) {
                    return object3;
                }
                object3 = this.b(object, object2);
                if (object3 != null) {
                    ez.a(ez2, new SoftReference(object3));
                }
                return object3;
            }
        }
        Object object4 = this.b(object, object2);
        if (object4 == null) {
            return null;
        }
        ez2 = this.a.putIfAbsent(object, new ez(object4, null));
        if (ez2 == null) {
            return object4;
        }
        return ez.a(ez2, object4);
    }
}

