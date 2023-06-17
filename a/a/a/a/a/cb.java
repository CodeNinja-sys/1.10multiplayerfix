/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.az;
import a.a.a.a.a.bv;
import a.a.a.a.a.cy;
import a.a.a.a.a.eb;
import a.a.a.a.a.eh;
import a.a.a.a.a.ei;
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
    public eh g() {
        if (this.f == null) {
            this.f = ei.a(this.h.g(), this.c);
        }
        return (eh)this.f;
    }

    @Override
    public bv b(int n2, int n3) {
        return new cb(this.h.b(n2, n3), this.c);
    }

    @Override
    public bv j(int n2) {
        return new cb(this.h.j(n2), this.c);
    }

    @Override
    public bv i(int n2) {
        return new cb(this.h.i(n2), this.c);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int l() {
        Object object = this.c;
        synchronized (object) {
            return this.h.l();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int m() {
        Object object = this.c;
        synchronized (object) {
            return this.h.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Integer e() {
        Object object = this.c;
        synchronized (object) {
            return (Integer)this.h.firstKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Integer f() {
        Object object = this.c;
        synchronized (object) {
            return (Integer)this.h.lastKey();
        }
    }

    @Override
    public bv a(Integer n2, Integer n3) {
        return new cb(this.h.a(n2, n3), this.c);
    }

    @Override
    public bv a(Integer n2) {
        return new cb(this.h.a(n2), this.c);
    }

    @Override
    public bv b(Integer n2) {
        return new cb(this.h.b(n2), this.c);
    }

    @Override
    public /* synthetic */ aq d() {
        return this.h();
    }

    @Override
    public /* synthetic */ eb b() {
        return this.g();
    }

    @Override
    public /* synthetic */ aq bD_() {
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
        return this.b((Integer)object);
    }

    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a((Integer)object);
    }

    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }

    public /* synthetic */ Comparator comparator() {
        return this.n();
    }
}

