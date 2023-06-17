/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.vd;
import com.a.a.d.ve;
import com.a.a.d.vf;
import com.a.a.d.vg;
import com.a.a.d.vh;
import com.a.a.d.yd;
import com.a.a.j.g;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class vc
extends AbstractQueue {
    private final vf b;
    private final vf c;
    final int a;
    private Object[] d;
    private int e;
    private int f;
    private static final int g = 0x55555555;
    private static final int h = -1431655766;
    private static final int i = 11;

    public static vc a() {
        return new ve(yd.d(), null).a();
    }

    public static vc a(Iterable iterable) {
        return new ve(yd.d(), null).a(iterable);
    }

    public static ve a(Comparator comparator) {
        return new ve(comparator, null);
    }

    public static ve a(int n2) {
        return new ve(yd.d(), null).a(n2);
    }

    public static ve b(int n2) {
        return new ve(yd.d(), null).b(n2);
    }

    private vc(ve ve2, int n2) {
        yd yd2 = ve.a(ve2);
        this.b = new vf(this, yd2);
        this.b.b = this.c = new vf(this, yd2.a());
        this.c.b = this.b;
        this.a = ve.b(ve2);
        this.d = new Object[n2];
    }

    @Override
    public int size() {
        return this.e;
    }

    @Override
    public boolean add(Object object) {
        this.offer(object);
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean bl2 = false;
        for (Object e2 : collection) {
            this.offer(e2);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean offer(Object object) {
        cl.a(object);
        ++this.f;
        int n2 = this.e++;
        this.l();
        this.g(n2).a(n2, object);
        return this.e <= this.a || this.e() != object;
    }

    @Override
    public Object poll() {
        return this.isEmpty() ? null : this.f(0);
    }

    Object c(int n2) {
        return this.d[n2];
    }

    @Override
    public Object peek() {
        return this.isEmpty() ? null : this.c(0);
    }

    private int k() {
        switch (this.e) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
        }
        return this.c.a(1, 2) <= 0 ? 1 : 2;
    }

    public Object b() {
        return this.poll();
    }

    public Object c() {
        return this.remove();
    }

    public Object d() {
        return this.peek();
    }

    public Object e() {
        return this.isEmpty() ? null : this.f(this.k());
    }

    public Object f() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f(this.k());
    }

    public Object g() {
        return this.isEmpty() ? null : this.c(this.k());
    }

    vg d(int n2) {
        cl.b(n2, this.e);
        ++this.f;
        --this.e;
        if (this.e == n2) {
            this.d[this.e] = null;
            return null;
        }
        Object object = this.c(this.e);
        int n3 = this.g(this.e).a(object);
        Object object2 = this.c(this.e);
        this.d[this.e] = null;
        vg vg2 = this.a(n2, object2);
        if (n3 < n2) {
            if (vg2 == null) {
                return new vg(object, object2);
            }
            return new vg(object, vg2.b);
        }
        return vg2;
    }

    private vg a(int n2, Object object) {
        int n3;
        vf vf2 = this.g(n2);
        int n4 = vf2.b(n3 = vf2.c(n2), object);
        if (n4 == n3) {
            return vf2.a(n2, n3, object);
        }
        return n4 < n2 ? new vg(object, this.c(n2)) : null;
    }

    private Object f(int n2) {
        Object object = this.c(n2);
        this.d(n2);
        return object;
    }

    private vf g(int n2) {
        return vc.e(n2) ? this.b : this.c;
    }

    static boolean e(int n2) {
        int n3 = n2 + 1;
        cl.b(n3 > 0, "negative index");
        return (n3 & 0x55555555) > (n3 & 0xAAAAAAAA);
    }

    boolean h() {
        for (int i2 = 1; i2 < this.e; ++i2) {
            if (vf.a(this.g(i2), i2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public Iterator iterator() {
        return new vh(this, null);
    }

    @Override
    public void clear() {
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.d[i2] = null;
        }
        this.e = 0;
    }

    @Override
    public Object[] toArray() {
        Object[] arrobject = new Object[this.e];
        System.arraycopy(this.d, 0, arrobject, 0, this.e);
        return arrobject;
    }

    public Comparator i() {
        return this.b.a;
    }

    int j() {
        return this.d.length;
    }

    static int a(int n2, int n3, Iterable iterable) {
        int n4;
        int n5 = n4 = n2 == -1 ? 11 : n2;
        if (iterable instanceof Collection) {
            int n6 = ((Collection)iterable).size();
            n4 = Math.max(n4, n6);
        }
        return vc.a(n4, n3);
    }

    private void l() {
        if (this.e > this.d.length) {
            int n2 = this.m();
            Object[] arrobject = new Object[n2];
            System.arraycopy(this.d, 0, arrobject, 0, this.d.length);
            this.d = arrobject;
        }
    }

    private int m() {
        int n2 = this.d.length;
        int n3 = n2 < 64 ? (n2 + 1) * 2 : com.a.a.j.g.g(n2 / 2, 3);
        return vc.a(n3, this.a);
    }

    private static int a(int n2, int n3) {
        return Math.min(n2 - 1, n3) + 1;
    }

    /* synthetic */ vc(ve ve2, int n2, vd vd2) {
        this(ve2, n2);
    }

    static /* synthetic */ Object[] a(vc vc2) {
        return vc2.d;
    }

    static /* synthetic */ int b(vc vc2) {
        return vc2.e;
    }

    static /* synthetic */ int c(vc vc2) {
        return vc2.f;
    }
}

