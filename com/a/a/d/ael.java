/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.d.abu;
import com.a.a.d.aem;
import com.a.a.d.aen;
import com.a.a.d.aeo;
import com.a.a.d.aep;
import com.a.a.d.agi;
import com.a.a.d.mq;
import com.a.a.d.nj;
import com.a.a.d.yd;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class ael
extends abu {
    private final Comparator c;
    private static final long d = 0L;

    public static ael o() {
        return new ael(yd.d(), yd.d());
    }

    public static ael a(Comparator comparator, Comparator comparator2) {
        cl.a(comparator);
        cl.a(comparator2);
        return new ael(comparator, comparator2);
    }

    public static ael a(ael ael2) {
        ael ael3 = new ael(ael2.q(), ael2.s());
        ael3.a(ael2);
        return ael3;
    }

    ael(Comparator comparator, Comparator comparator2) {
        super(new TreeMap(comparator), (dx)new aeo(comparator2));
        this.c = comparator2;
    }

    public Comparator q() {
        return this.i().comparator();
    }

    public Comparator s() {
        return this.c;
    }

    public SortedMap f(Object object) {
        return new aep(this, object);
    }

    @Override
    public SortedSet i() {
        return super.i();
    }

    @Override
    public SortedMap j() {
        return super.j();
    }

    @Override
    Iterator m() {
        Comparator comparator = this.s();
        agi agi2 = nj.a(mq.a(this.a.values(), new aem(this)), comparator);
        return new aen(this, agi2, comparator);
    }

    @Override
    public /* synthetic */ Map r() {
        return this.j();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.i();
    }

    @Override
    public /* synthetic */ Map e(Object object) {
        return this.f(object);
    }
}

