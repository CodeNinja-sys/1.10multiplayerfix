/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import org.apache.logging.log4j.core.b;
import org.apache.logging.log4j.core.c;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.d;

public class n
implements c {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private static final int b = 3;
    private static final int c = 300000;
    private int d = 0;
    private long e;
    private final b f;

    public n(b b2) {
        this.f = b2;
    }

    @Override
    public void a(String string) {
        long l2 = System.currentTimeMillis();
        if (this.e + 300000L < l2 || this.d++ < 3) {
            a.b(string);
        }
        this.e = l2;
    }

    @Override
    public void a(String string, Throwable throwable) {
        long l2 = System.currentTimeMillis();
        if (this.e + 300000L < l2 || this.d++ < 3) {
            a.b(string, throwable);
        }
        this.e = l2;
        if (!this.f.c() && throwable != null && !(throwable instanceof org.apache.logging.log4j.core.a.d)) {
            throw new org.apache.logging.log4j.core.a.d(string, throwable);
        }
    }

    @Override
    public void a(String string, h h2, Throwable throwable) {
        long l2 = System.currentTimeMillis();
        if (this.e + 300000L < l2 || this.d++ < 3) {
            a.b(string, throwable);
        }
        this.e = l2;
        if (!this.f.c() && throwable != null && !(throwable instanceof org.apache.logging.log4j.core.a.d)) {
            throw new org.apache.logging.log4j.core.a.d(string, throwable);
        }
    }
}

