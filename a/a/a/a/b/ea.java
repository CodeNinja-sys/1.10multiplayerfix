/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cs;
import a.a.a.a.b.cw;
import a.a.a.a.b.dh;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import a.a.a.a.b.dw;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ea
extends cw
implements du,
Serializable {
    private static final long d = -7046029254386353129L;
    protected final du c;

    protected ea(du du2, Object object) {
        super(du2, object);
        this.c = du2;
    }

    protected ea(du du2) {
        super(du2);
        this.c = du2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long l(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.l(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long b(int n2, long l2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.b(n2, l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n2, long l2) {
        Object object = this.b;
        synchronized (object) {
            this.c.a(n2, l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long d(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.d(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int b(long l2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.b(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int c(long l2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.c(l2);
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
    public void b(int n2, long[] arrl, int n3, int n4) {
        Object object = this.b;
        synchronized (object) {
            this.c.b(n2, arrl, n3, n4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            this.c.c(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n2, long[] arrl, int n3, int n4) {
        Object object = this.b;
        synchronized (object) {
            this.c.a(n2, arrl, n3, n4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n2, long[] arrl) {
        Object object = this.b;
        synchronized (object) {
            this.c.a(n2, arrl);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void g(int n2) {
        Object object = this.b;
        synchronized (object) {
            this.c.g(n2);
        }
    }

    @Override
    public dv d() {
        return this.c.e();
    }

    @Override
    public dv e() {
        return this.c.e();
    }

    @Override
    public dv f(int n2) {
        return this.c.f(n2);
    }

    @Override
    public dv c() {
        return this.e();
    }

    @Override
    public dv e(int n2) {
        return this.f(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public du a(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            return dw.a(this.c.a(n2, n3), this.b);
        }
    }

    @Override
    public du b(int n2, int n3) {
        return this.a(n2, n3);
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
    public boolean a(int n2, du du2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.a(n2, du2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(du du2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.a(du2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Long a(int n2) {
        Object object = this.b;
        synchronized (object) {
            return (Long)this.c.get(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, Long l2) {
        Object object = this.b;
        synchronized (object) {
            this.c.add(n2, l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Long b(int n2, Long l2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.set(n2, l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Long b(int n2) {
        Object object = this.b;
        synchronized (object) {
            return (Long)this.c.remove(n2);
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

