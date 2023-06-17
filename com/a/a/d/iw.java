/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.ck;
import com.a.a.d.gs;
import com.a.a.d.ix;
import com.a.a.d.iy;
import com.a.a.d.jt;
import java.io.Serializable;
import java.util.Map;

public final class iw
extends gs
implements ck,
Serializable {
    private final jt a;

    public static iy b() {
        return new iy();
    }

    public static iw a(Map map) {
        if (map instanceof iw) {
            iw iw2 = (iw)map;
            return iw2;
        }
        return new iy().a(map).a();
    }

    private iw(jt jt2) {
        this.a = jt2;
    }

    @Override
    protected Map a() {
        return this.a;
    }

    @Override
    public Object a(Class class_) {
        return this.a.get(cl.a(class_));
    }

    @Override
    public Object a(Class class_, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }

    /* synthetic */ iw(jt jt2, ix ix2) {
        this(jt2);
    }
}

