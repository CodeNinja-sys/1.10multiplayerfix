/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class cw
implements cs,
Serializable {
    private static final long c = -7046029254386353129L;
    protected final cs a;
    protected final Object b;

    protected cw(cs cs2, Object object) {
        if (cs2 == null) {
            throw new NullPointerException();
        }
        this.a = cs2;
        this.b = object;
    }

    protected cw(cs cs2) {
        if (cs2 == null) {
            throw new NullPointerException();
        }
        this.a = cs2;
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
    public boolean a(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.a(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int[] f() {
        Object object = this.b;
        synchronized (object) {
            return this.a.f();
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
    public int[] b(int[] arrn) {
        Object object = this.b;
        synchronized (object) {
            return this.a.b(arrn);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int[] a(int[] arrn) {
        Object object = this.b;
        synchronized (object) {
            return this.a.b(arrn);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(cs cs2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.a(cs2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(cs cs2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.b(cs2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean d(cs cs2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.d(cs2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean c(cs cs2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.c(cs2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(Integer n2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.add(n2);
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
    public Object[] toArray(Object[] arrobject) {
        Object object = this.b;
        synchronized (object) {
            return this.a.toArray(arrobject);
        }
    }

    @Override
    public dh a() {
        return this.a.a();
    }

    @Override
    public dh g() {
        return this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean e(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.e(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean f(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.f(n2);
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

    public /* synthetic */ boolean add(Object object) {
        return this.a((Integer)object);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

