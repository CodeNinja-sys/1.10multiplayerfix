/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.bx;
import java.lang.ref.WeakReference;

class bz
extends WeakReference {
    int a;
    private final bx b;

    bz(bx bx2, Object object) {
        this.b = bx2;
        super(object, bx.a(bx2));
        this.a = System.identityHashCode(object);
    }

    public int hashCode() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        bz bz2 = (bz)object;
        return this.get() == bz2.get();
    }
}

