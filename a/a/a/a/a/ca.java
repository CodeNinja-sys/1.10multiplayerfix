/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ax;
import a.a.a.a.a.ay;
import a.a.a.a.a.bv;
import a.a.a.a.a.bx;
import a.a.a.a.a.cy;
import a.a.a.a.a.eb;
import a.a.a.a.a.eh;
import a.a.a.a.a.ei;
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

    protected ca(int n2, Object object, cy cy2) {
        super(n2, object);
        this.g = cy2;
    }

    protected ca(int n2, Object object) {
        this(n2, object, null);
    }

    final int a(int n2, int n3) {
        return this.g == null ? Integer.compare(n2, n3) : this.g.a(n2, n3);
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
    public eh g() {
        if (this.e == null) {
            this.e = ei.a(this.b, this.g);
        }
        return (eh)this.e;
    }

    @Override
    public bv b(int n2, int n3) {
        if (this.a(n2, this.b) <= 0 && this.a(this.b, n3) < 0) {
            return this;
        }
        return bx.a;
    }

    @Override
    public bv j(int n2) {
        if (this.a(this.b, n2) < 0) {
            return this;
        }
        return bx.a;
    }

    @Override
    public bv i(int n2) {
        if (this.a(n2, this.b) <= 0) {
            return this;
        }
        return bx.a;
    }

    @Override
    public int l() {
        return this.b;
    }

    @Override
    public int m() {
        return this.b;
    }

    @Override
    public bv a(Integer n2) {
        return this.j(n2);
    }

    @Override
    public bv b(Integer n2) {
        return this.i(n2);
    }

    @Override
    public bv a(Integer n2, Integer n3) {
        return this.b(n2, n3);
    }

    public Integer e() {
        return this.l();
    }

    public Integer f() {
        return this.m();
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

