/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.a.y;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.h;

public abstract class c
extends a {
    protected final boolean a;
    private volatile y b;
    private final ReadWriteLock c = new ReentrantReadWriteLock();
    private final Lock d = this.c.readLock();
    private final Lock e = this.c.writeLock();

    protected c(String string, f f2, org.apache.logging.log4j.core.d d2, boolean bl2, boolean bl3, y y2) {
        super(string, d2, f2, bl2);
        this.b = y2;
        this.a = bl3;
    }

    protected y h() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(y y2) {
        this.e.lock();
        try {
            y y3 = this.b;
            this.b = y2;
            y3.c();
        }
        finally {
            this.e.unlock();
        }
    }

    @Override
    public void e() {
        if (this.b() == null) {
            h.b("No layout set for the appender named [" + this.a() + "].");
        }
        if (this.b == null) {
            h.b("No OutputStreamManager set for the appender named [" + this.a() + "].");
        }
        super.e();
    }

    @Override
    public void f() {
        super.f();
        this.b.c();
    }

    @Override
    public void a(h h2) {
        this.d.lock();
        try {
            byte[] arrby = this.b().a(h2);
            if (arrby.length > 0) {
                this.b.a(arrby);
                if (this.a || h2.m()) {
                    this.b.l();
                }
            }
        }
        catch (d d2) {
            this.b("Unable to write to stream " + this.b.d() + " for appender " + this.a());
            throw d2;
        }
        finally {
            this.d.unlock();
        }
    }
}

