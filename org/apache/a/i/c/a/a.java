/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.a.f.w;
import org.apache.a.i.c.a.b;
import org.apache.a.i.c.a.g;
import org.apache.a.i.c.z;
import org.apache.commons.d.c;

public abstract class a {
    private final org.apache.commons.d.a h = org.apache.commons.d.c.b(this.getClass());
    protected final Lock a;
    protected Set b = new HashSet();
    protected int c;
    protected volatile boolean d;
    protected Set e;
    protected ReferenceQueue f;
    protected z g = new z();

    protected a() {
        this.a = new ReentrantLock();
    }

    public void a() {
    }

    public final b a(org.apache.a.f.b.b b2, Object object, long l2, TimeUnit timeUnit) {
        return this.a(b2, object).a(l2, timeUnit);
    }

    public abstract g a(org.apache.a.f.b.b var1, Object var2);

    public abstract void a(b var1, boolean var2, long var3, TimeUnit var5);

    public void a(Reference reference) {
    }

    protected abstract void a(org.apache.a.f.b.b var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        this.a.lock();
        try {
            this.g.a(timeUnit.toMillis(l2));
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        this.a.lock();
        try {
            this.g.b();
        }
        finally {
            this.a.unlock();
        }
    }

    public abstract void c();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        this.a.lock();
        try {
            if (this.d) {
                return;
            }
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                b b2 = (b)iterator.next();
                iterator.remove();
                this.a(b2.c());
            }
            this.g.a();
            this.d = true;
        }
        finally {
            this.a.unlock();
        }
    }

    protected void a(w w2) {
        if (w2 != null) {
            try {
                w2.close();
            }
            catch (IOException iOException) {
                this.h.b("I/O error closing connection", iOException);
            }
        }
    }
}

