/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.c.a;
import org.apache.logging.log4j.d.c;
import org.apache.logging.log4j.d.f;

public final class d
extends a {
    public static final String a = "log4j2.status.entries";
    private static final String i = "?";
    private static final org.apache.logging.log4j.e.b j = new org.apache.logging.log4j.e.b("log4j2.StatusLogger.properties");
    private static final int k = j.a("log4j2.status.entries", 200);
    private static final String l = j.a("log4j2.StatusLogger.level");
    private static final d m = new d();
    private final org.apache.logging.log4j.b.a n;
    private final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    private final ReentrantReadWriteLock p = new ReentrantReadWriteLock();
    private final Queue q = new f(this, k);
    private final ReentrantLock r = new ReentrantLock();
    private int s;

    private d() {
        this.n = new org.apache.logging.log4j.b.a("StatusLogger", org.apache.logging.log4j.b.c, false, true, false, false, "", null, j, System.err);
        this.s = org.apache.logging.log4j.b.a(l, org.apache.logging.log4j.b.d).a();
    }

    public static d k() {
        return m;
    }

    public b l() {
        return this.n.k();
    }

    public void b(b b2) {
        this.n.b(b2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(c c2) {
        this.p.writeLock().lock();
        try {
            this.o.add(c2);
            b b2 = c2.d();
            if (this.s < b2.a()) {
                this.s = b2.a();
            }
        }
        finally {
            this.p.writeLock().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(c c2) {
        this.p.writeLock().lock();
        try {
            this.o.remove(c2);
            int n2 = org.apache.logging.log4j.b.a(l, org.apache.logging.log4j.b.d).a();
            for (c c3 : this.o) {
                int n3 = c3.d().a();
                if (n2 >= n3) continue;
                n2 = n3;
            }
            this.s = n2;
        }
        finally {
            this.p.writeLock().unlock();
        }
    }

    public Iterator m() {
        return this.o.iterator();
    }

    public void n() {
        this.o.clear();
        this.p();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List o() {
        this.r.lock();
        try {
            ArrayList arrayList = new ArrayList(this.q);
            return arrayList;
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void p() {
        this.r.lock();
        try {
            this.q.clear();
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(org.apache.logging.log4j.f f2, String string, b b2, m m2, Throwable throwable) {
        StackTraceElement stackTraceElement = null;
        if (string != null) {
            stackTraceElement = this.a(string, Thread.currentThread().getStackTrace());
        }
        org.apache.logging.log4j.d.b b3 = new org.apache.logging.log4j.d.b(stackTraceElement, b2, m2, throwable);
        this.r.lock();
        try {
            this.q.add(b3);
        }
        finally {
            this.r.unlock();
        }
        if (this.o.size() > 0) {
            for (c c2 : this.o) {
                if (!b3.c().a(c2.d())) continue;
                c2.a(b3);
            }
        } else {
            this.n.a(f2, string, b2, m2, throwable);
        }
    }

    private StackTraceElement a(String string, StackTraceElement[] arrstackTraceElement) {
        if (string == null) {
            return null;
        }
        boolean bl2 = false;
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            if (bl2) {
                return stackTraceElement;
            }
            String string2 = stackTraceElement.getClassName();
            if (string.equals(string2)) {
                bl2 = true;
                continue;
            }
            if (i.equals(string2)) break;
        }
        return null;
    }

    @Override
    protected boolean b(b b2, org.apache.logging.log4j.f f2, String string) {
        return this.a(b2, f2);
    }

    @Override
    protected boolean b(b b2, org.apache.logging.log4j.f f2, String string, Throwable throwable) {
        return this.a(b2, f2);
    }

    @Override
    protected boolean c(b b2, org.apache.logging.log4j.f f2, String string, Object ... arrobject) {
        return this.a(b2, f2);
    }

    @Override
    protected boolean b(b b2, org.apache.logging.log4j.f f2, Object object, Throwable throwable) {
        return this.a(b2, f2);
    }

    @Override
    protected boolean b(b b2, org.apache.logging.log4j.f f2, m m2, Throwable throwable) {
        return this.a(b2, f2);
    }

    @Override
    public boolean a(b b2, org.apache.logging.log4j.f f2) {
        if (this.o.size() > 0) {
            return this.s >= b2.a();
        }
        switch (b2) {
            case b: {
                return this.n.c(f2);
            }
            case g: {
                return this.n.e(f2);
            }
            case f: {
                return this.n.a(f2);
            }
            case e: {
                return this.n.d(f2);
            }
            case d: {
                return this.n.f(f2);
            }
            case c: {
                return this.n.b(f2);
            }
        }
        return false;
    }

    static /* synthetic */ Queue a(d d2) {
        return d2.q;
    }
}

