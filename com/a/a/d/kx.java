/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.ku;
import com.a.a.d.kv;
import com.a.a.d.ky;
import com.a.a.d.kz;
import com.a.a.d.lo;
import com.a.a.d.xd;
import java.util.Iterator;

final class kx
extends lo {
    private static final long c = 0L;
    final /* synthetic */ ku a;

    private kx(ku ku2) {
        this.a = ku2;
    }

    @Override
    boolean a() {
        return this.a.a();
    }

    @Override
    public agi aO_() {
        return this.h().aO_();
    }

    @Override
    jl m() {
        return new ky(this);
    }

    @Override
    public int size() {
        return this.a.d().size();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof xd) {
            xd xd2 = (xd)object;
            if (xd2.b() <= 0) {
                return false;
            }
            int n2 = this.a.a(xd2.a());
            return n2 == xd2.b();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    Object aR_() {
        return new kz(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    /* synthetic */ kx(ku ku2, kv kv2) {
        this(ku2);
    }
}

