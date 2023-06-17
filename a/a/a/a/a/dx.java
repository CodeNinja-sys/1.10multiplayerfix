/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.cs;
import a.a.a.a.a.cu;
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

public class dx
extends cu
implements dt,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected dx() {
    }

    @Override
    public void a(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean e(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int i(int n2) {
        return -1;
    }

    @Override
    public int j(int n2) {
        return -1;
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Integer b(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean a(cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(dt dt2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2, cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2, dt dt2) {
        throw new UnsupportedOperationException();
    }

    public void a(int n2, Integer n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(Integer n2) {
        throw new UnsupportedOperationException();
    }

    public Integer b(int n2, Integer n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int q(int n2) {
        throw new IndexOutOfBoundsException();
    }

    public Integer c(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object object) {
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        return -1;
    }

    @Override
    public dh g() {
        return di.a;
    }

    @Override
    public du e() {
        return di.a;
    }

    @Override
    public du d() {
        return di.a;
    }

    @Override
    public du h(int n2) {
        if (n2 == 0) {
            return di.a;
        }
        throw new IndexOutOfBoundsException(String.valueOf(n2));
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
        if (n2 == 0 && n3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public dt d(int n2, int n3) {
        return this.c(n2, n3);
    }

    @Override
    public void b(int n2, int[] arrn, int n3, int n4) {
        if (n2 == 0 && n4 == 0 && n3 >= 0 && n3 <= arrn.length) {
            return;
        }
        throw new IndexOutOfBoundsException();
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
        throw new UnsupportedOperationException();
    }

    public int a(List list) {
        if (list == this) {
            return 0;
        }
        return list.isEmpty() ? 0 : -1;
    }

    private Object b() {
        return dv.a;
    }

    public Object clone() {
        return dv.a;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof List && ((List)object).isEmpty();
    }

    @Override
    public String toString() {
        return "[]";
    }

    @Override
    public /* synthetic */ cr bF_() {
        return this.d();
    }

    @Override
    public /* synthetic */ dh a() {
        return this.d();
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        return this.a((Integer)object);
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

