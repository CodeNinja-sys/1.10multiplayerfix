/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.b;

import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.a.a.b.c;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.j;

public abstract class a
implements h {
    private static final long a = 1L;
    private final h b;

    protected a() {
        this(new c(null));
    }

    protected a(h h2) {
        if (h2 == null) {
            throw new IllegalArgumentException("The wrapped event cannot be null.");
        }
        this.b = h2;
    }

    protected final h n() {
        return this.b;
    }

    public void a(b b2) {
    }

    public void a(String string) {
    }

    public void a(StackTraceElement stackTraceElement) {
    }

    public void a(m m2) {
    }

    public void a(f f2) {
    }

    public void b(String string) {
    }

    public void a(long l2) {
    }

    public void a(Throwable throwable) {
    }

    public void a(Map map) {
    }

    public void a(j j2) {
    }

    public void c(String string) {
    }

    @Override
    public final boolean l() {
        return this.n().l();
    }

    @Override
    public final void a(boolean bl2) {
        this.n().a(bl2);
    }

    @Override
    public final boolean m() {
        return this.n().m();
    }

    @Override
    public final void b(boolean bl2) {
        this.n().b(bl2);
    }
}

