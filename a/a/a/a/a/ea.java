/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.cx;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.a.dt;
import a.a.a.a.a.du;
import a.a.a.a.a.dv;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ea
extends cx
implements dt,
Serializable {
    private static final long c = -7046029254386353129L;
    protected final dt b;

    protected ea(dt dt2) {
        super(dt2);
        this.b = dt2;
    }

    @Override
    public int q(int n2) {
        return this.b.q(n2);
    }

    @Override
    public int b(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int i(int n2) {
        return this.b.i(n2);
    }

    @Override
    public int j(int n2) {
        return this.b.j(n2);
    }

    public boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(int n2, int[] arrn, int n3, int n4) {
        this.b.b(n2, arrn, n3, n4);
    }

    @Override
    public void e(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, int[] arrn, int n3, int n4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, int[] arrn) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void k(int n2) {
        this.b.k(n2);
    }

    @Override
    public du d() {
        return this.e();
    }

    @Override
    public du e() {
        return di.a(this.b.e());
    }

    @Override
    public du h(int n2) {
        return di.a(this.b.h(n2));
    }

    @Override
    public du c() {
        return this.e();
    }

    @Override
    public du g(int n2) {
        return this.h(n2);
    }

    @Override
    public dt c(int n2, int n3) {
        return dv.b(this.b.c(n2, n3));
    }

    @Override
    public dt d(int n2, int n3) {
        return this.c(n2, n3);
    }

    @Override
    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public int a(List list) {
        return this.b.compareTo(list);
    }

    @Override
    public boolean a(int n2, cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(dt dt2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2, dt dt2) {
        throw new UnsupportedOperationException();
    }

    public Integer b(int n2) {
        return (Integer)this.b.get(n2);
    }

    public void a(int n2, Integer n3) {
        throw new UnsupportedOperationException();
    }

    public Integer b(int n2, Integer n3) {
        throw new UnsupportedOperationException();
    }

    public Integer c(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object object) {
        return this.b.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.b.lastIndexOf(object);
    }

    @Override
    public /* synthetic */ dh a() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.d();
    }

    public /* synthetic */ List subList(int n2, int n3) {
        return this.c(n2, n3);
    }

    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.h(n2);
    }

    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }

    public /* synthetic */ Object remove(int n2) {
        return this.c(n2);
    }

    public /* synthetic */ void add(int n2, Object object) {
        this.a(n2, (Integer)object);
    }

    public /* synthetic */ Object set(int n2, Object object) {
        return this.b(n2, (Integer)object);
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((List)object);
    }
}

