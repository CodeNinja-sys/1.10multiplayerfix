/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.eh;
import com.a.a.d.jt;
import com.a.a.d.lo;

abstract class eg
extends jt {
    private final int a;

    eg(int n2) {
        this.a = n2;
    }

    abstract jt a();

    private boolean i() {
        return this.a == this.a().size();
    }

    Object c(int n2) {
        return this.a().g().h().get(n2);
    }

    abstract Object a(int var1);

    @Override
    lo aV_() {
        return this.i() ? this.a().g() : super.aV_();
    }

    @Override
    public int size() {
        return this.a;
    }

    @Override
    public Object get(Object object) {
        Integer n2 = (Integer)this.a().get(object);
        return n2 == null ? null : this.a(n2);
    }

    @Override
    lo d() {
        return new eh(this);
    }
}

