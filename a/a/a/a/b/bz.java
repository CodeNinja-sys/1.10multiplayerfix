/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.aw;
import a.a.a.a.b.bv;
import a.a.a.a.b.bx;
import a.a.a.a.b.cy;
import a.a.a.a.b.ec;
import a.a.a.a.b.ei;
import a.a.a.a.b.ej;
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
    public ei g() {
        return ej.a;
    }

    @Override
    public bv a(long l2, long l3) {
        return bx.a;
    }

    @Override
    public bv g(long l2) {
        return bx.a;
    }

    @Override
    public bv f(long l2) {
        return bx.a;
    }

    @Override
    public long l() {
        throw new NoSuchElementException();
    }

    @Override
    public long m() {
        throw new NoSuchElementException();
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

