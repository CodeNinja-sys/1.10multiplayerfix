/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ey;
import java.lang.ref.SoftReference;

final class ez {
    private SoftReference a;

    private ez(Object object) {
        this.a = new SoftReference<Object>(object);
    }

    private synchronized Object a(Object object) {
        Object t2 = this.a.get();
        if (t2 == null) {
            this.a = new SoftReference<Object>(object);
            return object;
        }
        return t2;
    }

    static /* synthetic */ SoftReference a(ez ez2) {
        return ez2.a;
    }

    static /* synthetic */ SoftReference a(ez ez2, SoftReference softReference) {
        ez2.a = softReference;
        return ez2.a;
    }

    /* synthetic */ ez(Object object, ey ey2) {
        this(object);
    }

    static /* synthetic */ Object a(ez ez2, Object object) {
        return ez2.a(object);
    }
}

