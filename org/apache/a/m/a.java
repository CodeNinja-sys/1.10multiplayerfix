/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.m;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.a.m.b;
import org.apache.a.m.c;
import org.apache.a.m.d;
import org.apache.a.m.e;
import org.apache.a.m.f;
import org.apache.a.m.g;
import org.apache.a.m.h;
import org.apache.a.m.i;
import org.apache.a.m.j;
import org.apache.a.m.k;
import org.apache.a.m.l;
import org.apache.a.m.m;

public abstract class a
implements g,
h {
    private final Lock a;
    private final f b;
    private final Map c;
    private final Set d;
    private final LinkedList e;
    private final LinkedList f;
    private final Map g;
    private volatile boolean h;
    private volatile int i;
    private volatile int j;

    public a(f f2, int n2, int n3) {
        this.b = (f)org.apache.a.o.a.a(f2, "Connection factory");
        this.i = org.apache.a.o.a.b(n2, "Max per route value");
        this.j = org.apache.a.o.a.b(n3, "Max total value");
        this.a = new ReentrantLock();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.g = new HashMap();
    }

    protected abstract i a(Object var1, Object var2);

    protected void a(i i2) {
    }

    protected void b(i i2) {
    }

    public boolean a() {
        return this.h;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.a.lock();
        try {
            for (Object object : this.e) {
                ((i)object).f();
            }
            for (Object object : this.d) {
                ((i)object).f();
            }
            for (Object object : this.c.values()) {
                ((m)object).h();
            }
            this.c.clear();
            this.d.clear();
            this.e.clear();
        }
        finally {
            this.a.unlock();
        }
    }

    private m c(Object object) {
        m m2 = (m)this.c.get(object);
        if (m2 == null) {
            m2 = new b(this, object, object);
            this.c.put(object, m2);
        }
        return m2;
    }

    public Future a(Object object, Object object2, org.apache.a.d.c c2) {
        org.apache.a.o.a.a(object, "Route");
        org.apache.a.o.b.a(!this.h, "Connection pool shut down");
        return new c(this, this.a, c2, object, object2);
    }

    public Future b(Object object, Object object2) {
        return this.a(object, object2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private i a(Object object, Object object2, long l2, TimeUnit timeUnit, k k2) {
        Date date = null;
        if (l2 > 0L) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(l2));
        }
        this.a.lock();
        try {
            m m2 = this.c(object);
            i i2 = null;
            while (i2 == null) {
                int n2;
                int n3;
                org.apache.a.o.b.a(!this.h, "Connection pool shut down");
                while ((i2 = m2.b(object2)) != null && (i2.e() || i2.a(System.currentTimeMillis()))) {
                    i2.f();
                    this.e.remove(i2);
                    m2.a(i2, false);
                }
                if (i2 != null) {
                    this.e.remove(i2);
                    this.d.add(i2);
                    i i3 = i2;
                    return i3;
                }
                int n4 = this.d(object);
                int n5 = Math.max(0, m2.e() + 1 - n4);
                if (n5 > 0) {
                    i i4;
                    for (n3 = 0; n3 < n5 && (i4 = m2.f()) != null; ++n3) {
                        i4.f();
                        this.e.remove(i4);
                        m2.a(i4);
                    }
                }
                if (m2.e() < n4 && (n2 = Math.max(this.j - (n3 = this.d.size()), 0)) > 0) {
                    Object object3;
                    Object object4;
                    int n6 = this.e.size();
                    if (n6 > n2 - 1 && !this.e.isEmpty()) {
                        object4 = (i)this.e.removeLast();
                        ((i)object4).f();
                        object3 = this.c(((i)object4).h());
                        ((m)object3).a((i)object4);
                    }
                    object4 = this.b.a(object);
                    i2 = m2.c(object4);
                    this.d.add(i2);
                    object3 = i2;
                    return object3;
                }
                n3 = 0;
                try {
                    m2.a(k2);
                    this.f.add(k2);
                    n3 = k2.a(date) ? 1 : 0;
                }
                finally {
                    m2.b(k2);
                    this.f.remove(k2);
                }
                if (n3 != 0 || date == null || date.getTime() > System.currentTimeMillis()) continue;
                break;
            }
            throw new TimeoutException("Timeout waiting for connection");
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(i i2, boolean bl2) {
        this.a.lock();
        try {
            if (this.d.remove(i2)) {
                m m2 = this.c(i2.h());
                m2.a(i2, bl2);
                if (bl2 && !this.h) {
                    this.e.addFirst(i2);
                    this.b(i2);
                } else {
                    i2.f();
                }
                k k2 = m2.g();
                if (k2 != null) {
                    this.f.remove(k2);
                } else {
                    k2 = (k)this.f.poll();
                }
                if (k2 != null) {
                    k2.a();
                }
            }
        }
        finally {
            this.a.unlock();
        }
    }

    private int d(Object object) {
        Integer n2 = (Integer)this.g.get(object);
        if (n2 != null) {
            return n2;
        }
        return this.i;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2) {
        org.apache.a.o.a.b(n2, "Max value");
        this.a.lock();
        try {
            this.j = n2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int d() {
        this.a.lock();
        try {
            int n2 = this.j;
            return n2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(int n2) {
        org.apache.a.o.a.b(n2, "Max per route value");
        this.a.lock();
        try {
            this.i = n2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int e() {
        this.a.lock();
        try {
            int n2 = this.i;
            return n2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Object object, int n2) {
        org.apache.a.o.a.a(object, "Route");
        org.apache.a.o.a.b(n2, "Max per route value");
        this.a.lock();
        try {
            this.g.put(object, n2);
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int b(Object object) {
        org.apache.a.o.a.a(object, "Route");
        this.a.lock();
        try {
            int n2 = this.d(object);
            return n2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public l f() {
        this.a.lock();
        try {
            l l2 = new l(this.d.size(), this.f.size(), this.e.size(), this.j);
            return l2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public l a(Object object) {
        org.apache.a.o.a.a(object, "Route");
        this.a.lock();
        try {
            m m2 = this.c(object);
            l l2 = new l(m2.b(), m2.c(), m2.d(), this.d(object));
            return l2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(j j2) {
        this.a.lock();
        try {
            Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                i i2 = (i)iterator.next();
                j2.a(i2);
                if (!i2.e()) continue;
                m m2 = this.c(i2.h());
                m2.a(i2);
                iterator.remove();
            }
            this.g();
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void b(j j2) {
        this.a.lock();
        try {
            for (i i2 : this.d) {
                j2.a(i2);
            }
        }
        finally {
            this.a.unlock();
        }
    }

    private void g() {
        Iterator iterator = this.c.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            m m2 = (m)entry.getValue();
            if (m2.c() + m2.e() != 0) continue;
            iterator.remove();
        }
    }

    public void a(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        long l3 = timeUnit.toMillis(l2);
        if (l3 < 0L) {
            l3 = 0L;
        }
        long l4 = System.currentTimeMillis() - l3;
        this.a(new d(this, l4));
    }

    public void c() {
        long l2 = System.currentTimeMillis();
        this.a(new e(this, l2));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[leased: ");
        stringBuilder.append(this.d);
        stringBuilder.append("][available: ");
        stringBuilder.append(this.e);
        stringBuilder.append("][pending: ");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static /* synthetic */ i a(a a2, Object object, Object object2, long l2, TimeUnit timeUnit, k k2) {
        return a2.a(object, object2, l2, timeUnit, k2);
    }
}

