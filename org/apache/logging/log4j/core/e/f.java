/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.e;

import java.io.Serializable;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.e.d;
import org.apache.logging.log4j.core.e.k;
import org.apache.logging.log4j.j;

class f
implements Serializable {
    private static final long a = -7139032940312647146L;
    private final String b;
    private final org.apache.logging.log4j.f c;
    private final b d;
    private final String e;
    private final m f;
    private final long g;
    private final k h;
    private final Map i;
    private final j j;
    private final String k;
    private final StackTraceElement l;
    private final boolean m;
    private final boolean n;

    public f(d d2, boolean bl2) {
        this.b = org.apache.logging.log4j.core.e.d.a(d2);
        this.c = org.apache.logging.log4j.core.e.d.b(d2);
        this.d = org.apache.logging.log4j.core.e.d.c(d2);
        this.e = org.apache.logging.log4j.core.e.d.d(d2);
        this.f = org.apache.logging.log4j.core.e.d.e(d2);
        this.g = org.apache.logging.log4j.core.e.d.f(d2);
        this.h = org.apache.logging.log4j.core.e.d.g(d2);
        this.i = org.apache.logging.log4j.core.e.d.h(d2);
        this.j = org.apache.logging.log4j.core.e.d.i(d2);
        this.l = bl2 ? d2.c() : null;
        this.k = d2.f();
        this.m = bl2;
        this.n = org.apache.logging.log4j.core.e.d.j(d2);
    }

    protected Object a() {
        d d2 = new d(this.e, this.c, this.b, this.d, this.f, this.h, this.i, this.j, this.k, this.l, this.g, null);
        d2.b(this.n);
        d2.a(this.m);
        return d2;
    }

    static /* synthetic */ String a(f f2) {
        return f2.e;
    }

    static /* synthetic */ org.apache.logging.log4j.f b(f f2) {
        return f2.c;
    }

    static /* synthetic */ String c(f f2) {
        return f2.b;
    }

    static /* synthetic */ b d(f f2) {
        return f2.d;
    }

    static /* synthetic */ m e(f f2) {
        return f2.f;
    }

    static /* synthetic */ k f(f f2) {
        return f2.h;
    }

    static /* synthetic */ Map g(f f2) {
        return f2.i;
    }

    static /* synthetic */ j h(f f2) {
        return f2.j;
    }

    static /* synthetic */ String i(f f2) {
        return f2.k;
    }

    static /* synthetic */ StackTraceElement j(f f2) {
        return f2.l;
    }

    static /* synthetic */ long k(f f2) {
        return f2.g;
    }

    static /* synthetic */ boolean l(f f2) {
        return f2.n;
    }

    static /* synthetic */ boolean m(f f2) {
        return f2.m;
    }
}

