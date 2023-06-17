/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.jt;
import com.a.a.d.jw;
import com.a.a.d.lo;
import java.util.Collection;
import java.util.Set;

final class jv
extends jt {
    private final jt a;

    jv(jt jt2) {
        this.a = (jt)cl.a(jt2);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    public lo a(Object object) {
        Object object2 = this.a.get(object);
        return object2 == null ? null : lo.d(object2);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    lo d() {
        return new jw(this);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return super.e();
    }

    @Override
    public /* synthetic */ Collection values() {
        return super.aU_();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return super.g();
    }

    static /* synthetic */ jt a(jv jv2) {
        return jv2.a;
    }
}

