/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.bs;
import com.a.a.c.cg;
import java.lang.ref.ReferenceQueue;

class cd
implements cg {
    final Object a;

    cd(Object object) {
        this.a = object;
    }

    @Override
    public Object get() {
        return this.a;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public bs b() {
        return null;
    }

    @Override
    public cg a(ReferenceQueue referenceQueue, Object object, bs bs2) {
        return this;
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

    @Override
    public void a(Object object) {
    }
}

