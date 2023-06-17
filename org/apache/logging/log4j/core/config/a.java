/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.g;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;

public class a
extends org.apache.logging.log4j.core.c.b {
    private final ThreadLocal a = new ThreadLocal();
    private final org.apache.logging.log4j.core.b b;
    private final b c;
    private final int d;

    public a(org.apache.logging.log4j.core.b b2, b b3, d d2) {
        super(d2);
        this.b = b2;
        this.c = b3;
        this.d = b3 == null ? org.apache.logging.log4j.b.h.a() : b3.a();
        this.aZ_();
    }

    public org.apache.logging.log4j.core.b c() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(h h2) {
        e e2;
        if (this.aY_() != null && (e2 = this.aY_().a(h2)) == e.c) {
            return;
        }
        if (this.c != null && this.d < h2.a().a()) {
            return;
        }
        if (this.a.get() != null) {
            this.b.d().a("Recursive call to appender " + this.b.a());
            return;
        }
        try {
            this.a.set(this);
            if (!this.b.g()) {
                this.b.d().a("Attempted to append to non-started appender " + this.b.a());
                if (!this.b.c()) {
                    throw new org.apache.logging.log4j.core.a.d("Attempted to append to non-started appender " + this.b.a());
                }
            }
            if (this.b instanceof g && ((g)((Object)this.b)).b(h2)) {
                return;
            }
            try {
                this.b.a(h2);
            }
            catch (RuntimeException runtimeException) {
                this.b.d().a("An exception occurred processing Appender " + this.b.a(), runtimeException);
                if (!this.b.c()) {
                    throw runtimeException;
                }
            }
            catch (Exception exception) {
                this.b.d().a("An exception occurred processing Appender " + this.b.a(), exception);
                if (!this.b.c()) {
                    throw new org.apache.logging.log4j.core.a.d(exception);
                }
            }
        }
        finally {
            this.a.set(null);
        }
    }
}

