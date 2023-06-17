/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class aa
implements w,
Serializable {
    private static final long c = -7046029254386353129L;
    protected final w a;
    protected final Object b;

    protected aa(w w2, Object object) {
        if (w2 == null) {
            throw new NullPointerException();
        }
        this.a = w2;
        this.b = object;
    }

    protected aa(w w2) {
        if (w2 == null) {
            throw new NullPointerException();
        }
        this.a = w2;
        this.b = this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int size() {
        Object object = this.b;
        synchronized (object) {
            return this.a.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isEmpty() {
        Object object = this.b;
        synchronized (object) {
            return this.a.isEmpty();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean contains(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.contains(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object[] toArray() {
        Object object = this.b;
        synchronized (object) {
            return this.a.toArray();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object[] toArray(Object[] arrobject) {
        Object object = this.b;
        synchronized (object) {
            return this.a.toArray(arrobject);
        }
    }

    @Override
    public ad a() {
        return this.a.a();
    }

    @Override
    public ad g() {
        return this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean add(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.add(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.remove(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean remove(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.remove(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean addAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.addAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean containsAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.containsAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean removeAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.removeAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean retainAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.retainAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        Object object = this.b;
        synchronized (object) {
            this.a.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        Object object = this.b;
        synchronized (object) {
            return this.a.toString();
        }
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

