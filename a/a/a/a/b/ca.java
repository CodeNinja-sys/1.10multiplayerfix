/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ax;
import a.a.a.a.b.ay;
import a.a.a.a.b.bv;
import a.a.a.a.b.bx;
import a.a.a.a.b.cy;
import a.a.a.a.b.ec;
import a.a.a.a.b.ei;
import a.a.a.a.b.ej;
import a.a.a.a.c.aq;
import a.a.a.a.c.aw;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;

public class ca
extends ax
implements bv,
Serializable,
Cloneable {
    private static final long h = -7046029254386353129L;
    protected final cy g;

    protected ca(long l2, Object object, cy cy2) {
        super(l2, object);
        this.g = cy2;
    }

    protected ca(long l2, Object object) {
        this(l2, object, null);
    }

    final int b(long l2, long l3) {
        return this.g == null ? Long.compare(l2, l3) : this.g.a(l2, l3);
    }

    @Override
    public cy n() {
        return this.g;
    }

    @Override
    public aw s() {
        if (this.d == null) {
            this.d = a.a.a.a.c.ax.a(new ay(this), bx.a(this.g));
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
            this.e = ej.a(this.b, this.g);
        }
        return (ei)this.e;
    }

    @Override
    public bv a(long l2, long l3) {
        if (this.b(l2, this.b) <= 0 && this.b(this.b, l3) < 0) {
            return this;
        }
        return bx.a;
    }

    @Override
    public bv g(long l2) {
        if (this.b(this.b, l2) < 0) {
            return this;
        }
        return bx.a;
    }

    @Override
    public bv f(long l2) {
        if (this.b(l2, this.b) <= 0) {
            return this;
        }
        return bx.a;
    }

    @Override
    public long l() {
        return this.b;
    }

    @Override
    public long m() {
        return this.b;
    }

    @Override
    public bv a(Long l2) {
        return this.g(l2);
    }

    @Override
    public bv b(Long l2) {
        return this.f(l2);
    }

    @Override
    public bv a(Long l2, Long l3) {
        return this.a((long)l2, (long)l3);
    }

    public Long e() {
        return this.l();
    }

    public Long f() {
        return this.m();
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

