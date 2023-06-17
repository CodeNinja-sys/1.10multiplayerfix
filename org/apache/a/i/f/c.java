/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.a.d.b;
import org.apache.a.f.o;
import org.apache.a.j;
import org.apache.commons.d.a;

class c
implements Closeable,
b,
org.apache.a.f.j {
    private final a a;
    private final o b;
    private final j c;
    private volatile boolean d;
    private volatile Object e;
    private volatile long f;
    private volatile TimeUnit g;
    private volatile boolean h;

    public c(a a2, o o2, j j2) {
        this.a = a2;
        this.b = o2;
        this.c = j2;
    }

    public boolean b() {
        return this.d;
    }

    public void c() {
        this.d = true;
    }

    public void d() {
        this.d = false;
    }

    public void a(Object object) {
        this.e = object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l2, TimeUnit timeUnit) {
        j j2 = this.c;
        synchronized (j2) {
            this.f = l2;
            this.g = timeUnit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cM_() {
        j j2 = this.c;
        synchronized (j2) {
            if (this.h) {
                return;
            }
            this.h = true;
            if (this.d) {
                this.b.a(this.c, this.e, this.f, this.g);
            } else {
                try {
                    this.c.close();
                    this.a.b("Connection discarded");
                }
                catch (IOException iOException) {
                    if (this.a.a()) {
                        this.a.b(iOException.getMessage(), iOException);
                    }
                }
                finally {
                    this.b.a(this.c, null, 0L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cN_() {
        j j2 = this.c;
        synchronized (j2) {
            if (this.h) {
                return;
            }
            this.h = true;
            try {
                this.c.f();
                this.a.b("Connection discarded");
            }
            catch (IOException iOException) {
                if (this.a.a()) {
                    this.a.b(iOException.getMessage(), iOException);
                }
            }
            finally {
                this.b.a(this.c, null, 0L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean a() {
        boolean bl2 = this.h;
        this.a.b("Cancelling request execution");
        this.cN_();
        return !bl2;
    }

    public boolean e() {
        return this.h;
    }

    public void close() {
        this.cN_();
    }
}

