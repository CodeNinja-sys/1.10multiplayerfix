/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.bs;
import com.a.a.c.bv;
import com.a.a.c.cg;
import java.lang.ref.ReferenceQueue;

final class cn
extends bv {
    final int b;

    cn(ReferenceQueue referenceQueue, Object object, bs bs2, int n2) {
        super(referenceQueue, object, bs2);
        this.b = n2;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public cg a(ReferenceQueue referenceQueue, Object object, bs bs2) {
        return new cn(referenceQueue, object, bs2, this.b);
    }
}

