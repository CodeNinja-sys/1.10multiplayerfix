/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.aa;
import io.netty.util.b.v;
import io.netty.util.c.ad;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class u
implements ThreadFactory {
    private static final AtomicInteger a = new AtomicInteger();
    private final AtomicInteger b = new AtomicInteger();
    private final String c;
    private final boolean d;
    private final int e;

    public u(Class class_) {
        this(class_, false, 5);
    }

    public u(String string) {
        this(string, false, 5);
    }

    public u(Class class_, boolean bl2) {
        this(class_, bl2, 5);
    }

    public u(String string, boolean bl2) {
        this(string, bl2, 5);
    }

    public u(Class class_, int n2) {
        this(class_, false, n2);
    }

    public u(String string, int n2) {
        this(string, false, n2);
    }

    public u(Class class_, boolean bl2, int n2) {
        this(u.a(class_), bl2, n2);
    }

    private static String a(Class class_) {
        if (class_ == null) {
            throw new NullPointerException("poolType");
        }
        String string = ad.a(class_);
        switch (string.length()) {
            case 0: {
                return "unknown";
            }
            case 1: {
                return string.toLowerCase(Locale.US);
            }
        }
        if (Character.isUpperCase(string.charAt(0)) && Character.isLowerCase(string.charAt(1))) {
            return Character.toLowerCase(string.charAt(0)) + string.substring(1);
        }
        return string;
    }

    public u(String string, boolean bl2, int n2) {
        if (string == null) {
            throw new NullPointerException("poolName");
        }
        if (n2 < 1 || n2 > 10) {
            throw new IllegalArgumentException("priority: " + n2 + " (expected: Thread.MIN_PRIORITY <= priority <= Thread.MAX_PRIORITY)");
        }
        this.c = string + '-' + a.incrementAndGet() + '-';
        this.d = bl2;
        this.e = n2;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = this.a(new v(runnable), this.c + this.b.incrementAndGet());
        try {
            if (thread.isDaemon()) {
                if (!this.d) {
                    thread.setDaemon(false);
                }
            } else if (this.d) {
                thread.setDaemon(true);
            }
            if (thread.getPriority() != this.e) {
                thread.setPriority(this.e);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return thread;
    }

    protected Thread a(Runnable runnable, String string) {
        return new aa(runnable, string);
    }
}

