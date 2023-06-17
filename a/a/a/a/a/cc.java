/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ba;
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
    public eh g() {
        if (this.e == null) {
            this.e = ei.b(this.g.g());
        }
        return (eh)this.e;
    }

    @Override
    public bv b(int n2, int n3) {
        return new cc(this.g.b(n2, n3));
    }

    @Override
    public bv j(int n2) {
        return new cc(this.g.j(n2));
    }

    @Override
    public bv i(int n2) {
        return new cc(this.g.i(n2));
    }

    @Override
    public int l() {
        return this.g.l();
    }

    @Override
    public int m() {
        return this.g.m();
    }

    public Integer e() {
        return (Integer)this.g.firstKey();
    }

    public Integer f() {
        return (Integer)this.g.lastKey();
    }

    @Override
    public bv a(Integer n2, Integer n3) {
        return new cc(this.g.a(n2, n3));
    }

    @Override
    public bv a(Integer n2) {
        return new cc(this.g.a(n2));
    }

    @Override
    public bv b(Integer n2) {
        return new cc(this.g.b(n2));
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

