/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.cs;
import a.a.a.a.b.cu;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import a.a.a.a.b.dw;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class dy
extends cu
implements du,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected dy() {
    }

    @Override
    public void a(int n2, long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean e(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long b(int n2, long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(long l2) {
        return -1;
    }

    @Override
    public int c(long l2) {
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

    public Long a(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean a(cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(du du2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2, cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2, du du2) {
        throw new UnsupportedOperationException();
    }

    public void a(int n2, Long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(Long l2) {
        throw new UnsupportedOperationException();
    }

    public Long b(int n2, Long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long l(int n2) {
        throw new IndexOutOfBoundsException();
    }

    public Long b(int n2) {
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
    public dv e() {
        return di.a;
    }

    @Override
    public dv d() {
        return di.a;
    }

    @Override
    public dv f(int n2) {
        if (n2 == 0) {
            return di.a;
        }
        throw new IndexOutOfBoundsException(String.valueOf(n2));
    }

    @Override
    public dv c() {
        return this.e();
    }

    @Override
    public dv e(int n2) {
        return this.f(n2);
    }

    @Override
    public du a(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public du b(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public void b(int n2, long[] arrl, int n3, int n4) {
        if (n2 == 0 && n4 == 0 && n3 >= 0 && n3 <= arrl.length) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void c(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, long[] arrl, int n3, int n4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, long[] arrl) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void g(int n2) {
        throw new UnsupportedOperationException();
    }

    public int a(List list) {
        if (list == this) {
            return 0;
        }
        return list.isEmpty() ? 0 : -1;
    }

    private Object b() {
        return dw.a;
    }

    public Object clone() {
        return dw.a;
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
    public /* synthetic */ cr bH_() {
        return this.d();
    }

    @Override
    public /* synthetic */ dh a() {
        return this.d();
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        return this.a((Long)object);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.d();
    }

    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.f(n2);
    }

    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }

    public /* synthetic */ Object remove(int n2) {
        return this.b(n2);
    }

    public /* synthetic */ void add(int n2, Object object) {
        this.a(n2, (Long)object);
    }

    public /* synthetic */ Object set(int n2, Object object) {
        return this.b(n2, (Long)object);
    }

    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((List)object);
    }
}

