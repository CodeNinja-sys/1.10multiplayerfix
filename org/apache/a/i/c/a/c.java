/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.a.i.c.a.b;
import org.apache.a.o.a;

public class c
extends WeakReference {
    private final org.apache.a.f.b.b a;

    public c(b b2, ReferenceQueue referenceQueue) {
        super(b2, referenceQueue);
        org.apache.a.o.a.a(b2, "Pool entry");
        this.a = b2.d();
    }

    public final org.apache.a.f.b.b a() {
        return this.a;
    }
}

