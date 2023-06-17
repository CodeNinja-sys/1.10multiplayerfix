/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.ThreadFactory;
import org.apache.commons.c.a.a;
import org.apache.commons.c.b.e;

public class g
implements a {
    private ThreadFactory a;
    private Thread.UncaughtExceptionHandler b;
    private String c;
    private Integer d;
    private Boolean e;

    public g a(ThreadFactory threadFactory) {
        if (threadFactory == null) {
            throw new NullPointerException("Wrapped ThreadFactory must not be null!");
        }
        this.a = threadFactory;
        return this;
    }

    public g a(String string) {
        if (string == null) {
            throw new NullPointerException("Naming pattern must not be null!");
        }
        this.c = string;
        return this;
    }

    public g a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public g a(int n2) {
        this.d = n2;
        return this;
    }

    public g a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            throw new NullPointerException("Uncaught exception handler must not be null!");
        }
        this.b = uncaughtExceptionHandler;
        return this;
    }

    public void b() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public e c() {
        e e2 = new e(this, null);
        this.b();
        return e2;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.c();
    }

    static /* synthetic */ ThreadFactory a(g g2) {
        return g2.a;
    }

    static /* synthetic */ String b(g g2) {
        return g2.c;
    }

    static /* synthetic */ Integer c(g g2) {
        return g2.d;
    }

    static /* synthetic */ Boolean d(g g2) {
        return g2.e;
    }

    static /* synthetic */ Thread.UncaughtExceptionHandler e(g g2) {
        return g2.b;
    }
}

