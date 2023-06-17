/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class n
extends SoftReference {
    private Object a;

    n(Object object, Object object2, ReferenceQueue referenceQueue) {
        super(object2, referenceQueue);
        this.a = object;
    }

    Object a() {
        return this.a;
    }
}

