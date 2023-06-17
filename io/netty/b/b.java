/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.a;
import io.netty.b.ac;
import io.netty.b.ag;
import io.netty.b.bf;
import io.netty.b.f;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.aa;
import io.netty.util.ab;
import io.netty.util.c.ad;
import io.netty.util.c.u;

public abstract class b
implements h {
    private static final int b = 256;
    private static final int c = 16;
    private final boolean d;
    private final g e;

    protected static g a(g g2) {
        switch (ab.b()) {
            case b: {
                aa aa2 = a.a.a(g2);
                if (aa2 == null) break;
                g2 = new bf(g2, aa2);
                break;
            }
            case c: 
            case d: {
                aa aa3 = a.a.a(g2);
                if (aa3 == null) break;
                g2 = new f(g2, aa3);
            }
        }
        return g2;
    }

    protected b() {
        this(false);
    }

    protected b(boolean bl2) {
        this.d = bl2 && u.f();
        this.e = new ag(this);
    }

    @Override
    public g a() {
        if (this.d) {
            return this.d();
        }
        return this.c();
    }

    @Override
    public g a(int n2) {
        if (this.d) {
            return this.d(n2);
        }
        return this.c(n2);
    }

    @Override
    public g a(int n2, int n3) {
        if (this.d) {
            return this.d(n2, n3);
        }
        return this.c(n2, n3);
    }

    @Override
    public g b() {
        if (u.f()) {
            return this.d(256);
        }
        return this.c(256);
    }

    @Override
    public g b(int n2) {
        if (u.f()) {
            return this.d(n2);
        }
        return this.c(n2);
    }

    @Override
    public g b(int n2, int n3) {
        if (u.f()) {
            return this.d(n2, n3);
        }
        return this.c(n2, n3);
    }

    @Override
    public g c() {
        return this.c(256, Integer.MAX_VALUE);
    }

    @Override
    public g c(int n2) {
        return this.c(n2, Integer.MAX_VALUE);
    }

    @Override
    public g c(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return this.e;
        }
        io.netty.b.b.g(n2, n3);
        return this.e(n2, n3);
    }

    @Override
    public g d() {
        return this.d(256, Integer.MAX_VALUE);
    }

    @Override
    public g d(int n2) {
        return this.d(n2, Integer.MAX_VALUE);
    }

    @Override
    public g d(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return this.e;
        }
        io.netty.b.b.g(n2, n3);
        return this.f(n2, n3);
    }

    @Override
    public ac e() {
        if (this.d) {
            return this.g();
        }
        return this.f();
    }

    @Override
    public ac e(int n2) {
        if (this.d) {
            return this.g(n2);
        }
        return this.f(n2);
    }

    @Override
    public ac f() {
        return this.f(16);
    }

    @Override
    public ac f(int n2) {
        return new ac(this, false, n2);
    }

    @Override
    public ac g() {
        return this.g(16);
    }

    @Override
    public ac g(int n2) {
        return new ac(this, true, n2);
    }

    private static void g(int n2, int n3) {
        if (n2 < 0) {
            throw new IllegalArgumentException("initialCapacity: " + n2 + " (expectd: 0+)");
        }
        if (n2 > n3) {
            throw new IllegalArgumentException(String.format("initialCapacity: %d (expected: not greater than maxCapacity(%d)", n2, n3));
        }
    }

    protected abstract g e(int var1, int var2);

    protected abstract g f(int var1, int var2);

    public String toString() {
        return ad.a(this) + "(directByDefault: " + this.d + ')';
    }
}

