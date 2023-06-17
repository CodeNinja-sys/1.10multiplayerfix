/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.gs;
import com.a.a.d.jt;
import com.a.a.m.ad;
import com.a.a.m.ae;
import com.a.a.m.i;
import com.a.a.m.j;
import java.util.Map;

public final class h
extends gs
implements ad {
    private final jt a;

    public static h b() {
        return new h(jt.m());
    }

    public static j c() {
        return new j(null);
    }

    private h(jt jt2) {
        this.a = jt2;
    }

    @Override
    public Object a(ae ae2) {
        return this.b(ae2.m());
    }

    @Override
    public Object a(ae ae2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object a(Class class_) {
        return this.b(ae.a(class_));
    }

    @Override
    public Object a(Class class_, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected Map a() {
        return this.a;
    }

    private Object b(ae ae2) {
        return this.a.get(ae2);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }

    /* synthetic */ h(jt jt2, i i2) {
        this(jt2);
    }
}

