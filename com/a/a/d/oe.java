/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.jc;
import com.a.a.d.oh;

final class oe
extends jc
implements oh {
    final int a;
    oe b;
    oh c;
    oh d;
    oe g;
    oe h;

    oe(Object object, Object object2, int n2, oe oe2) {
        super(object, object2);
        this.a = n2;
        this.b = oe2;
    }

    boolean a(Object object, int n2) {
        return this.a == n2 && cc.a(this.getValue(), object);
    }

    @Override
    public oh a() {
        return this.c;
    }

    @Override
    public oh b() {
        return this.d;
    }

    @Override
    public void a(oh oh2) {
        this.c = oh2;
    }

    @Override
    public void b(oh oh2) {
        this.d = oh2;
    }

    public oe c() {
        return this.g;
    }

    public oe d() {
        return this.h;
    }

    public void a(oe oe2) {
        this.h = oe2;
    }

    public void b(oe oe2) {
        this.g = oe2;
    }
}

