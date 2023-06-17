/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bb;

public class az {
    private Object a = new Object();
    private Object b = new Object();
    private int c;
    private int d;
    private int e;
    private bb f = new bb(null);
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;

    public synchronized bb a() {
        bb bb2 = this.f;
        this.f = new bb(null);
        return bb2;
    }

    public synchronized bb b() {
        bb bb2 = this.f;
        this.f = null;
        return bb2;
    }

    public synchronized bb c() {
        return this.f == null ? null : new bb(this.f, null);
    }

    private synchronized boolean h() {
        ++this.d;
        if (this.f != null) {
            ++this.f.a;
            if (this.d > 1) {
                ++this.f.b;
            }
        }
        return true;
    }

    private synchronized boolean i() {
        if (this.d >= 0 && this.c == 0) {
            return this.h();
        }
        ++this.e;
        return false;
    }

    private synchronized boolean j() {
        if (this.f != null) {
            ++this.f.c;
        }
        if (this.d >= 0 && this.c == 0) {
            --this.e;
            return this.h();
        }
        return false;
    }

    private synchronized boolean k() {
        if (this.d > 0) {
            return 0 == --this.d && this.c > 0;
        }
        throw new IllegalStateException("no current reader to release");
    }

    private synchronized boolean l() {
        this.d = -1;
        if (this.f != null) {
            ++this.f.d;
        }
        return true;
    }

    private synchronized boolean m() {
        if (this.d == 0) {
            return this.l();
        }
        ++this.c;
        return false;
    }

    private synchronized boolean n() {
        if (this.f != null) {
            ++this.f.e;
        }
        if (this.d == 0) {
            --this.c;
            return this.l();
        }
        return false;
    }

    private synchronized int o() {
        if (this.d < 0) {
            this.d = 0;
            if (this.c > 0) {
                return 1;
            }
            if (this.e > 0) {
                return 2;
            }
            return 0;
        }
        throw new IllegalStateException("no current writer to release");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        if (!this.i()) {
            while (true) {
                try {
                    do {
                        Object object = this.b;
                        synchronized (object) {
                            this.b.wait();
                        }
                    } while (!this.j());
                    return;
                }
                catch (InterruptedException interruptedException) {
                    continue;
                }
                break;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e() {
        if (this.k()) {
            Object object = this.a;
            synchronized (object) {
                this.a.notify();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        if (!this.m()) {
            while (true) {
                try {
                    do {
                        Object object = this.a;
                        synchronized (object) {
                            this.a.wait();
                        }
                    } while (!this.n());
                    return;
                }
                catch (InterruptedException interruptedException) {
                    continue;
                }
                break;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void g() {
        switch (this.o()) {
            case 1: {
                Object object = this.a;
                synchronized (object) {
                    this.a.notify();
                    break;
                }
            }
            case 2: {
                Object object = this.b;
                synchronized (object) {
                    this.b.notifyAll();
                    break;
                }
            }
        }
    }
}

