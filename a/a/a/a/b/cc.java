/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ba;
import a.a.a.a.b.bv;
import a.a.a.a.b.cy;
import a.a.a.a.b.ec;
import a.a.a.a.b.ei;
import a.a.a.a.b.ej;
import a.a.a.a.c.aq;
import a.a.a.a.c.aw;
import a.a.a.a.c.ax;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;

public class cc
extends ba
implements bv,
Serializable {
    private static final long h = -7046029254386353129L;
    protected final bv g;

    protected cc(bv bv2) {
        super(bv2);
        this.g = bv2;
    }

    @Override
    public cy n() {
        return this.g.n();
    }

    @Override
    public aw s() {
        if (this.d == null) {
            this.d = ax.b(this.g.s());
        }
        return (aw)this.d;
    }

    @Override
    public aw h() {
        return this.s();
    }

    @Override
    public ei g() {
        if (this.e == null) {
            this.e = ej.b(this.g.g());
        }
        return (ei)this.e;
    }

    @Override
    public bv a(long l2, long l3) {
        return new cc(this.g.a(l2, l3));
    }

    @Override
    public bv g(long l2) {
        return new cc(this.g.g(l2));
    }

    @Override
    public bv f(long l2) {
        return new cc(this.g.f(l2));
    }

    @Override
    public long l() {
        return this.g.l();
    }

    @Override
    public long m() {
        return this.g.m();
    }

    public Long e() {
        return (Long)this.g.firstKey();
    }

    public Long f() {
        return (Long)this.g.lastKey();
    }

    @Override
    public bv a(Long l2, Long l3) {
        return new cc(this.g.a(l2, l3));
    }

    @Override
    public bv a(Long l2) {
        return new cc(this.g.a(l2));
    }

    @Override
    public bv b(Long l2) {
        return new cc(this.g.b(l2));
    }

    @Override
    public /* synthetic */ aq d() {
        return this.h();
    }

    @Override
    public /* synthetic */ ec b() {
        return this.g();
    }

    @Override
    public /* synthetic */ aq bG_() {
        return this.s();
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return this.h();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.g();
    }

    public /* synthetic */ Object lastKey() {
        return this.f();
    }

    public /* synthetic */ Object firstKey() {
        return this.e();
    }

    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.b((Long)object);
    }

    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a((Long)object);
    }

    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }

    public /* synthetic */ Comparator comparator() {
        return this.n();
    }
}

