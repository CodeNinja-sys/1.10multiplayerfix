/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.cw;
import a.a.a.a.a.dh;
import a.a.a.a.a.dt;
import a.a.a.a.a.du;
import a.a.a.a.a.dv;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class dz
extends cw
implements dt,
Serializable {
    private static final long d = -7046029254386353129L;
    protected final dt c;

    protected dz(dt dt2, Object object) {
        super(dt2, object);
        this.c = dt2;
    }

    protected dz(dt dt2) {
        super(dt2);
        this.c = dt2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int q(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.q(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int b(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            return this.c.b(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            this.c.a(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int d(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.d(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int i(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.i(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int j(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.j(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean addAll(int n2, Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.c.addAll(n2, collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(int n2, int[] arrn, int n3, int n4) {
        Object object = this.b;
        synchronized (object) {
            this.c.b(n2, arrn, n3, n4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void e(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            this.c.e(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n2, int[] arrn, int n3, int n4) {
        Object object = this.b;
        synchronized (object) {
            this.c.a(n2, arrn, n3, n4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n2, int[] arrn) {
        Object object = this.b;
        synchronized (object) {
            this.c.a(n2, arrn);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void k(int n2) {
        Object object = this.b;
        synchronized (object) {
            this.c.k(n2);
        }
    }

    @Override
    public du d() {
        return this.c.e();
    }

    @Override
    public du e() {
        return this.c.e();
    }

    @Override
    public du h(int n2) {
        return this.c.h(n2);
    }

    @Override
    public du c() {
        return this.e();
    }

    @Override
    public du g(int n2) {
        return this.h(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public dt c(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            return dv.a(this.c.c(n2, n3), this.b);
        }
    }

    @Override
    public dt d(int n2, int n3) {
        return this.c(n2, n3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.b;
        synchronized (object) {
            return this.a.hashCode();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(List list) {
        Object object = this.b;
        synchronized (object) {
            return this.c.compareTo(list);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(int n2, cs cs2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.a(n2, cs2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(int n2, dt dt2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.a(n2, dt2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(dt dt2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.a(dt2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Integer b(int n2) {
        Object object = this.b;
        synchronized (object) {
            return (Integer)this.c.get(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, Integer n3) {
        Object object = this.b;
        synchronized (object) {
            this.c.add(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Integer b(int n2, Integer n3) {
        Object object = this.b;
        synchronized (object) {
            return this.c.set(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Integer c(int n2) {
        Object object = this.b;
        synchronized (object) {
            return (Integer)this.c.remove(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int indexOf(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.c.indexOf(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int lastIndexOf(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.c.lastIndexOf(object);
        }
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

