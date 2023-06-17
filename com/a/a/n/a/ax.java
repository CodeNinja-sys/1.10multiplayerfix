/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ax {
    private ax() {
    }

    public static AtomicReference a() {
        return new AtomicReference();
    }

    public static AtomicReference a(Object object) {
        return new AtomicReference<Object>(object);
    }

    public static AtomicReferenceArray a(int n2) {
        return new AtomicReferenceArray(n2);
    }

    public static AtomicReferenceArray a(Object[] arrobject) {
        return new AtomicReferenceArray<Object>(arrobject);
    }
}

