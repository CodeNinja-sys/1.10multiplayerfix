/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.az;
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

public class cb
extends az
implements bv,
Serializable {
    private static final long i = -7046029254386353129L;
    protected final bv h;

    protected cb(bv bv2, Object object) {
        super(bv2, object);
        this.h = bv2;
    }

    protected cb(bv bv2) {
        super(bv2);
        this.h = bv2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public cy n() {
        Object object = this.c;
        synchronized (object) {
            return this.h.n();
        }
    }

    @Override
    public aw s() {
        if (this.e == null) {
            this.e = ax.a(this.h.s(), this.c);
        }
        return (aw)this.e;
    }

    @Override
    public aw h() {
        return this.s();
    }

    @Override
    public ei g() {
        if (this.f == null) {
            this.f = ej.a(this.h.g(), this.c);
        }
        return (ei)this.f;
    }

    @Override
    public bv a(long l2, long l3) {
        return new cb(this.h.a(l2, l3), this.c);
    }

    @Override
    public bv g(long l2) {
        return new cb(this.h.g(l2), this.c);
    }

    @Override
    public bv f(long l2) {
        return new cb(this.h.f(l2), this.c);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long l() {
        Object object = this.c;
        synchronized (object) {
            return this.h.l();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long m() {
        Object object = this.c;
        synchronized (object) {
            return this.h.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Long e() {
        Object object = this.c;
        synchronized (object) {
            return (Long)this.h.firstKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Long f() {
        Object object = this.c;
        synchronized (object) {
            return (Long)this.h.lastKey();
        }
    }

    @Override
    public bv a(Long l2, Long l3) {
        return new cb(this.h.a(l2, l3), this.c);
    }

    @Override
    public bv a(Long l2) {
        return new cb(this.h.a(l2), this.c);
    }

    @Override
    public bv b(Long l2) {
        return new cb(this.h.b(l2), this.c);
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

