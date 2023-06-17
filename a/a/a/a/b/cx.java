/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class cx
implements cs,
Serializable {
    private static final long b = -7046029254386353129L;
    protected final cs a;

    protected cx(cs cs2) {
        if (cs2 == null) {
            throw new NullPointerException();
        }
        this.a = cs2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public boolean a(long l2) {
        return this.a.a(l2);
    }

    @Override
    public dh a() {
        return di.c(this.a.a());
    }

    @Override
    public dh g() {
        return this.a();
    }

    @Override
    public boolean e(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return this.a.toString();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return this.a.toArray(arrobject);
    }

    @Override
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override
    public long[] f() {
        return this.a.f();
    }

    @Override
    public long[] b(long[] arrl) {
        return this.a.b(arrl);
    }

    @Override
    public long[] a(long[] arrl) {
        return this.a.a(arrl);
    }

    @Override
    public boolean f(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean b(cs cs2) {
        return this.a.b(cs2);
    }

    @Override
    public boolean d(cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(cs cs2) {
        throw new UnsupportedOperationException();
    }

    public boolean a(Long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    public /* synthetic */ boolean add(Object object) {
        return this.a((Long)object);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

