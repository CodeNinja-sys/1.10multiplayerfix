/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.logging.log4j.core.a.a.b;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.e;

public abstract class a
extends org.apache.logging.log4j.core.a.a {
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private final Lock b = this.a.readLock();
    private final Lock c = this.a.writeLock();
    private b d;

    protected a(String string, org.apache.logging.log4j.core.d d2, boolean bl2, b b2) {
        super(string, d2, null, bl2);
        this.d = b2;
    }

    @Override
    public final f b() {
        return null;
    }

    public final b h() {
        return this.d;
    }

    @Override
    public final void e() {
        if (this.h() == null) {
            h.b("No AbstractDatabaseManager set for the appender named [{}].", this.a());
        }
        super.e();
        if (this.h() != null) {
            this.h().g();
        }
    }

    @Override
    public final void f() {
        super.f();
        if (this.h() != null) {
            this.h().c();
        }
    }

    @Override
    public final void a(h h2) {
        this.b.lock();
        try {
            this.h().b(h2);
        }
        catch (e e2) {
            h.b("Unable to write to database [{}] for appender [{}].", this.h().d(), this.a(), e2);
            throw e2;
        }
        catch (Exception exception) {
            h.b("Unable to write to database [{}] for appender [{}].", this.h().d(), this.a(), exception);
            throw new d("Unable to write to database in appender: " + exception.getMessage(), exception);
        }
        finally {
            this.b.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(b b2) {
        this.c.lock();
        try {
            b b3 = this.h();
            if (!b2.j()) {
                b2.g();
            }
            this.d = b2;
            b3.c();
        }
        finally {
            this.c.unlock();
        }
    }
}

