/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.b.cl;
import com.a.a.b.eg;
import com.a.a.c.an;
import com.a.a.c.f;
import com.a.a.d.aac;
import com.a.a.d.io;
import com.a.a.d.vi;
import com.a.a.f.b;
import com.a.a.f.g;
import com.a.a.f.i;
import com.a.a.f.j;
import com.a.a.f.k;
import com.a.a.f.l;
import com.a.a.f.m;
import com.a.a.f.n;
import com.a.a.f.p;
import com.a.a.f.q;
import com.a.a.f.r;
import com.a.a.n.a.gk;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class h {
    private static final an a = com.a.a.c.f.a().i().a(new i());
    private final aac b = io.v();
    private final ReadWriteLock c = new ReentrantReadWriteLock();
    private final r d = new b();
    private final ThreadLocal e = new j(this);
    private final ThreadLocal f = new k(this);
    private q g;

    public h() {
        this("default");
    }

    public h(String string) {
        this(new m(string));
    }

    public h(q q2) {
        this.g = (q)cl.a(q2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Object object) {
        vi vi2 = this.d.a(object);
        this.c.writeLock().lock();
        try {
            this.b.a(vi2);
        }
        finally {
            this.c.writeLock().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(Object object) {
        vi vi2 = this.d.a(object);
        for (Map.Entry entry : vi2.c().entrySet()) {
            Class class_ = (Class)entry.getKey();
            Collection collection = (Collection)entry.getValue();
            this.c.writeLock().lock();
            try {
                Set set = this.b.a(class_);
                if (!set.containsAll(collection)) {
                    throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + object + " registered?");
                }
                set.removeAll(collection);
            }
            finally {
                this.c.writeLock().unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(Object object) {
        Set set = this.a(object.getClass());
        boolean bl2 = false;
        for (Class class_ : set) {
            this.c.readLock().lock();
            try {
                Set set2 = this.b.a(class_);
                if (set2.isEmpty()) continue;
                bl2 = true;
                for (n n2 : set2) {
                    this.a(object, n2);
                }
            }
            finally {
                this.c.readLock().unlock();
            }
        }
        if (!bl2 && !(object instanceof g)) {
            this.c(new g(this, object));
        }
        this.a();
    }

    void a(Object object, n n2) {
        ((Queue)this.e.get()).offer(new l(object, n2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        if (((Boolean)this.f.get()).booleanValue()) {
            return;
        }
        this.f.set(true);
        try {
            l l2;
            Queue queue = (Queue)this.e.get();
            while ((l2 = (l)queue.poll()) != null) {
                this.b(l2.a, l2.b);
            }
        }
        finally {
            this.f.remove();
            this.e.remove();
        }
    }

    void b(Object object, n n2) {
        try {
            n2.a(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            try {
                this.g.a(invocationTargetException.getCause(), new p(this, object, n2.a(), n2.b()));
            }
            catch (Throwable throwable) {
                Logger.getLogger(h.class.getName()).log(Level.SEVERE, String.format("Exception %s thrown while handling exception: %s", throwable, invocationTargetException.getCause()), throwable);
            }
        }
    }

    Set a(Class class_) {
        try {
            return (Set)a.c(class_);
        }
        catch (gk gk2) {
            throw eg.b(gk2.getCause());
        }
    }
}

