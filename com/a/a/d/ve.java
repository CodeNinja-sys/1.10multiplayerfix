/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.vc;
import com.a.a.d.vd;
import com.a.a.d.yd;
import java.util.Collections;
import java.util.Comparator;

public final class ve {
    private static final int a = -1;
    private final Comparator b;
    private int c = -1;
    private int d = Integer.MAX_VALUE;

    private ve(Comparator comparator) {
        this.b = (Comparator)cl.a(comparator);
    }

    public ve a(int n2) {
        cl.a(n2 >= 0);
        this.c = n2;
        return this;
    }

    public ve b(int n2) {
        cl.a(n2 > 0);
        this.d = n2;
        return this;
    }

    public vc a() {
        return this.a(Collections.emptySet());
    }

    public vc a(Iterable iterable) {
        vc vc2 = new vc(this, vc.a(this.c, this.d, iterable), null);
        for (Object t2 : iterable) {
            vc2.offer(t2);
        }
        return vc2;
    }

    private yd b() {
        return yd.a(this.b);
    }

    /* synthetic */ ve(Comparator comparator, vd vd2) {
        this(comparator);
    }

    static /* synthetic */ yd a(ve ve2) {
        return ve2.b();
    }

    static /* synthetic */ int b(ve ve2) {
        return ve2.d;
    }
}

