/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.bs;
import com.a.a.c.cg;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class bv
extends SoftReference
implements cg {
    final bs a;

    bv(ReferenceQueue referenceQueue, Object object, bs bs2) {
        super(object, referenceQueue);
        this.a = bs2;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public bs b() {
        return this.a;
    }

    @Override
    public void a(Object object) {
    }

    @Override
    public cg a(ReferenceQueue referenceQueue, Object object, bs bs2) {
        return new bv(referenceQueue, object, bs2);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public Object e() {
        return this.get();
    }
}

