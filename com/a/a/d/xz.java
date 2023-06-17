/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.yd;
import com.a.a.d.zw;
import java.io.Serializable;

final class xz
extends yd
implements Serializable {
    static final xz a = new xz();
    private static final long b = 0L;

    public int a(Comparable comparable, Comparable comparable2) {
        cl.a(comparable);
        cl.a(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override
    public yd a() {
        return zw.a;
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private xz() {
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Comparable)object, (Comparable)object2);
    }
}

