/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bw;
import com.a.a.d.iq;
import com.a.a.d.it;
import com.a.a.d.ka;
import com.a.a.d.lo;
import com.a.a.d.yx;
import com.a.a.d.yy;
import com.a.a.d.za;
import com.a.a.d.zc;

final class yz
extends it {
    final /* synthetic */ yx a;

    private yz(yx yx2) {
        this.a = yx2;
    }

    @Override
    public int size() {
        return this.a().size();
    }

    @Override
    public it a() {
        return this.a;
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = iq.a(object.hashCode()) & yx.c(this.a);
        for (ka ka2 = yx.d(this.a)[n2]; ka2 != null; ka2 = ka2.b()) {
            if (!object.equals(ka2.getValue())) continue;
            return ka2.getKey();
        }
        return null;
    }

    @Override
    lo d() {
        return new za(this);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    Object l() {
        return new zc(this.a);
    }

    @Override
    public /* synthetic */ bw aT_() {
        return this.a();
    }

    /* synthetic */ yz(yx yx2, yy yy2) {
        this(yx2);
    }
}

