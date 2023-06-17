/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ae;
import a.a.a.a.c.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class ab
implements w,
Serializable {
    private static final long b = -7046029254386353129L;
    protected final w a;

    protected ab(w w2) {
        if (w2 == null) {
            throw new NullPointerException();
        }
        this.a = w2;
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
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public ad a() {
        return ae.a(this.a.a());
    }

    @Override
    public ad g() {
        return this.a();
    }

    public boolean add(Object object) {
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
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

