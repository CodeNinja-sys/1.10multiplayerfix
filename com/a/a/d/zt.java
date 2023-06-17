/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adw;
import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.d.zr;
import com.a.a.d.zs;
import com.a.a.d.zu;
import java.util.Iterator;

final class zt
extends lo {
    final /* synthetic */ zr a;

    private zt(zr zr2) {
        this.a = zr2;
    }

    @Override
    public int size() {
        return this.a.n();
    }

    @Override
    public agi aO_() {
        return this.h().aO_();
    }

    @Override
    jl m() {
        return new zu(this);
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof adw) {
            adw adw2 = (adw)object;
            Object object2 = this.a.b(adw2.a(), adw2.b());
            return object2 != null && object2.equals(adw2.c());
        }
        return false;
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    /* synthetic */ zt(zr zr2, zs zs2) {
        this(zr2);
    }
}

