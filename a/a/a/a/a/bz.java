/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.aw;
import a.a.a.a.a.bv;
import a.a.a.a.a.bx;
import a.a.a.a.a.cy;
import a.a.a.a.a.eb;
import a.a.a.a.a.eh;
import a.a.a.a.a.ei;
import a.a.a.a.c.aq;
import a.a.a.a.c.ax;
import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

public class bz
extends aw
implements bv,
Serializable,
Cloneable {
    private static final long b = -7046029254386353129L;

    protected bz() {
    }

    @Override
    public cy n() {
        return null;
    }

    @Override
    public a.a.a.a.c.aw s() {
        return ax.a;
    }

    @Override
    public a.a.a.a.c.aw h() {
        return ax.a;
    }

    @Override
    public eh g() {
        return ei.a;
    }

    @Override
    public bv b(int n2, int n3) {
        return bx.a;
    }

    @Override
    public bv j(int n2) {
        return bx.a;
    }

    @Override
    public bv i(int n2) {
        return bx.a;
    }

    @Override
    public int l() {
        throw new NoSuchElementException();
    }

    @Override
    public int m() {
        throw new NoSuchElementException();
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

