/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.a;
import a.a.a.a.b.ac;
import java.io.Serializable;

public class ag
extends a
implements Serializable {
    private static final long d = -7046029254386353129L;
    protected final ac b;
    protected final Object c;

    protected ag(ac ac2, Object object) {
        if (ac2 == null) {
            throw new NullPointerException();
        }
        this.b = ac2;
        this.c = object;
    }

    protected ag(ac ac2) {
        if (ac2 == null) {
            throw new NullPointerException();
        }
        this.b = ac2;
        this.c = this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int size() {
        Object object = this.c;
        synchronized (object) {
            return this.b.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(long l2) {
        Object object = this.c;
        synchronized (object) {
            return this.b.b(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        Object object = this.c;
        synchronized (object) {
            return this.b.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            this.b.a(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a(long l2, Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.b.a(l2, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        Object object = this.c;
        synchronized (object) {
            this.b.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        Object object = this.c;
        synchronized (object) {
            return this.b.toString();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a(Long l2, Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.b.put(l2, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object get(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.b.get(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object remove(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.b.remove(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a(long l2) {
        Object object = this.c;
        synchronized (object) {
            return this.b.a(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object c(long l2) {
        Object object = this.c;
        synchronized (object) {
            return this.b.c(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsKey(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.b.containsKey(object);
        }
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((Long)object, object2);
    }
}

