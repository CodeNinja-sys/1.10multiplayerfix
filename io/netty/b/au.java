/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.ai;
import io.netty.b.aj;
import io.netty.b.an;
import io.netty.b.av;
import io.netty.b.b;
import io.netty.b.bk;
import io.netty.b.bl;
import io.netty.b.bm;
import io.netty.b.e;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.c.ae;
import io.netty.util.c.u;

public class au
extends b {
    private static final io.netty.util.c.b.g d = io.netty.util.c.b.h.a(au.class);
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n = 4096;
    private static final int o = 0x40000000;
    public static final au b;
    private final ah[] p;
    private final ah[] q;
    private final int r;
    private final int s;
    private final int t;
    final av c = new av(this);

    public au() {
        this(false);
    }

    public au(boolean bl2) {
        this(bl2, e, f, g, h);
    }

    public au(int n2, int n3, int n4, int n5) {
        this(false, n2, n3, n4, n5);
    }

    public au(boolean bl2, int n2, int n3, int n4, int n5) {
        this(bl2, n2, n3, n4, n5, i, j, k);
    }

    public au(boolean bl2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        super(bl2);
        int n9;
        this.r = n6;
        this.s = n7;
        this.t = n8;
        int n10 = au.g(n4, n5);
        if (n2 < 0) {
            throw new IllegalArgumentException("nHeapArena: " + n2 + " (expected: >= 0)");
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("nDirectArea: " + n3 + " (expected: >= 0)");
        }
        int n11 = au.i(n4);
        if (n2 > 0) {
            this.p = au.h(n2);
            for (n9 = 0; n9 < this.p.length; ++n9) {
                this.p[n9] = new aj(this, n4, n5, n11, n10);
            }
        } else {
            this.p = null;
        }
        if (n3 > 0) {
            this.q = au.h(n3);
            for (n9 = 0; n9 < this.q.length; ++n9) {
                this.q[n9] = new ai(this, n4, n5, n11, n10);
            }
        } else {
            this.q = null;
        }
    }

    public au(boolean bl2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        this(bl2, n2, n3, n4, n5, n6, n7, n8);
    }

    private static ah[] h(int n2) {
        return new ah[n2];
    }

    private static int i(int n2) {
        if (n2 < 4096) {
            throw new IllegalArgumentException("pageSize: " + n2 + " (expected: " + 4096 + "+)");
        }
        if ((n2 & n2 - 1) != 0) {
            throw new IllegalArgumentException("pageSize: " + n2 + " (expected: power of 2)");
        }
        return 31 - Integer.numberOfLeadingZeros(n2);
    }

    private static int g(int n2, int n3) {
        if (n3 > 14) {
            throw new IllegalArgumentException("maxOrder: " + n3 + " (expected: 0-14)");
        }
        int n4 = n2;
        for (int i2 = n3; i2 > 0; --i2) {
            if (n4 > 0x20000000) {
                throw new IllegalArgumentException(String.format("pageSize (%d) << maxOrder (%d) must not exceed %d", n2, n3, 0x40000000));
            }
            n4 <<= 1;
        }
        return n4;
    }

    @Override
    protected g e(int n2, int n3) {
        an an2 = (an)this.c.f();
        ah ah2 = an2.a;
        e e2 = ah2 != null ? ah2.a(an2, n2, n3) : new bl((h)this, n2, n3);
        return au.a(e2);
    }

    @Override
    protected g f(int n2, int n3) {
        an an2 = (an)this.c.f();
        ah ah2 = an2.b;
        e e2 = ah2 != null ? ah2.a(an2, n2, n3) : (u.f() ? new bm((h)this, n2, n3) : new bk((h)this, n2, n3));
        return au.a(e2);
    }

    @Override
    public boolean h() {
        return this.q != null;
    }

    public boolean i() {
        return this.c.g();
    }

    public void j() {
        this.c.h();
    }

    static /* synthetic */ ah[] a(au au2) {
        return au2.p;
    }

    static /* synthetic */ ah[] b(au au2) {
        return au2.q;
    }

    static /* synthetic */ int c(au au2) {
        return au2.r;
    }

    static /* synthetic */ int d(au au2) {
        return au2.s;
    }

    static /* synthetic */ int e(au au2) {
        return au2.t;
    }

    static /* synthetic */ int k() {
        return l;
    }

    static /* synthetic */ int l() {
        return m;
    }

    static {
        int n2 = ae.a("io.netty.allocator.pageSize", 8192);
        Throwable throwable = null;
        try {
            au.i(n2);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            n2 = 8192;
        }
        g = n2;
        int n3 = ae.a("io.netty.allocator.maxOrder", 11);
        Throwable throwable3 = null;
        try {
            au.g(g, n3);
        }
        catch (Throwable throwable4) {
            throwable3 = throwable4;
            n3 = 11;
        }
        h = n3;
        Runtime runtime = Runtime.getRuntime();
        int n4 = g << h;
        e = Math.max(0, ae.a("io.netty.allocator.numHeapArenas", (int)Math.min((long)runtime.availableProcessors(), Runtime.getRuntime().maxMemory() / (long)n4 / 2L / 3L)));
        f = Math.max(0, ae.a("io.netty.allocator.numDirectArenas", (int)Math.min((long)runtime.availableProcessors(), u.h() / (long)n4 / 2L / 3L)));
        i = ae.a("io.netty.allocator.tinyCacheSize", 512);
        j = ae.a("io.netty.allocator.smallCacheSize", 256);
        k = ae.a("io.netty.allocator.normalCacheSize", 64);
        l = ae.a("io.netty.allocator.maxCachedBufferCapacity", 32768);
        m = ae.a("io.netty.allocator.cacheTrimInterval", 8192);
        if (d.d()) {
            d.b("-Dio.netty.allocator.numHeapArenas: {}", (Object)e);
            d.b("-Dio.netty.allocator.numDirectArenas: {}", (Object)f);
            if (throwable == null) {
                d.b("-Dio.netty.allocator.pageSize: {}", (Object)g);
            } else {
                d.b("-Dio.netty.allocator.pageSize: {}", (Object)g, (Object)throwable);
            }
            if (throwable3 == null) {
                d.b("-Dio.netty.allocator.maxOrder: {}", (Object)h);
            } else {
                d.b("-Dio.netty.allocator.maxOrder: {}", (Object)h, (Object)throwable3);
            }
            d.b("-Dio.netty.allocator.chunkSize: {}", (Object)(g << h));
            d.b("-Dio.netty.allocator.tinyCacheSize: {}", (Object)i);
            d.b("-Dio.netty.allocator.smallCacheSize: {}", (Object)j);
            d.b("-Dio.netty.allocator.normalCacheSize: {}", (Object)k);
            d.b("-Dio.netty.allocator.maxCachedBufferCapacity: {}", (Object)l);
            d.b("-Dio.netty.allocator.cacheTrimInterval: {}", (Object)m);
        }
        b = new au(u.g());
    }
}

