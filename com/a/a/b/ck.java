/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.as;
import com.a.a.b.cg;
import com.a.a.b.m;
import java.lang.ref.WeakReference;

final class ck {
    private ck() {
    }

    static long a() {
        return System.nanoTime();
    }

    static m a(m m2) {
        return m2.c();
    }

    static cg a(Class class_, String string) {
        WeakReference weakReference = (WeakReference)as.b(class_).get(string);
        return weakReference == null ? cg.f() : cg.b(class_.cast(weakReference.get()));
    }
}

