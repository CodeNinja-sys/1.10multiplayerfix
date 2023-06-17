/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.a;

import io.netty.c.a.d.a.b;
import io.netty.c.a.d.a.c;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.k;
import io.netty.util.c.ad;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public final class a {
    private final Set a;
    private final boolean b;
    private final boolean c;
    private final Set d;
    private final boolean e;
    private final long f;
    private final Set g;
    private final Set h;
    private final boolean i;
    private final Map j;
    private final boolean k;

    private a(c c2) {
        this.a = new LinkedHashSet(io.netty.c.a.d.a.c.a(c2));
        this.b = io.netty.c.a.d.a.c.b(c2);
        this.c = io.netty.c.a.d.a.c.c(c2);
        this.d = io.netty.c.a.d.a.c.d(c2);
        this.e = io.netty.c.a.d.a.c.e(c2);
        this.f = io.netty.c.a.d.a.c.f(c2);
        this.g = io.netty.c.a.d.a.c.g(c2);
        this.h = io.netty.c.a.d.a.c.h(c2);
        this.i = io.netty.c.a.d.a.c.i(c2);
        this.j = io.netty.c.a.d.a.c.j(c2);
        this.k = io.netty.c.a.d.a.c.k(c2);
    }

    public boolean a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public String c() {
        return this.a.isEmpty() ? "*" : (String)this.a.iterator().next();
    }

    public Set d() {
        return this.a;
    }

    public boolean e() {
        return this.i;
    }

    public Set f() {
        return Collections.unmodifiableSet(this.d);
    }

    public boolean g() {
        return this.e;
    }

    public long h() {
        return this.f;
    }

    public Set i() {
        return Collections.unmodifiableSet(this.g);
    }

    public Set j() {
        return Collections.unmodifiableSet(this.h);
    }

    public ar k() {
        if (this.j.isEmpty()) {
            return ar.b;
        }
        k k2 = new k();
        for (Map.Entry entry : this.j.entrySet()) {
            Object object = io.netty.c.a.d.a.a.a((Callable)entry.getValue());
            if (object instanceof Iterable) {
                ((ar)k2).a((CharSequence)entry.getKey(), (Iterable)object);
                continue;
            }
            ((ar)k2).a((CharSequence)entry.getKey(), object);
        }
        return k2;
    }

    public boolean l() {
        return this.k;
    }

    private static Object a(Callable callable) {
        try {
            return callable.call();
        }
        catch (Exception exception) {
            throw new IllegalStateException("Could not generate value for callable [" + callable + ']', exception);
        }
    }

    public String toString() {
        return ad.a(this) + "[enabled=" + this.c + ", origins=" + this.a + ", anyOrigin=" + this.b + ", exposedHeaders=" + this.d + ", isCredentialsAllowed=" + this.e + ", maxAge=" + this.f + ", allowedRequestMethods=" + this.g + ", allowedRequestHeaders=" + this.h + ", preflightHeaders=" + this.j + ']';
    }

    public static c m() {
        return new c();
    }

    public static c a(String string) {
        if ("*".equals(string)) {
            return new c();
        }
        return new c(string);
    }

    public static c a(String ... arrstring) {
        return new c(arrstring);
    }

    /* synthetic */ a(c c2, b b2) {
        this(c2);
    }
}

