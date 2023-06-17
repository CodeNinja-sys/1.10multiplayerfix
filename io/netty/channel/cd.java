/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.b.h;
import io.netty.channel.ak;
import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.bi;
import io.netty.channel.co;
import io.netty.channel.cy;
import io.netty.channel.d.a;
import io.netty.channel.df;
import io.netty.channel.dh;
import java.util.IdentityHashMap;
import java.util.Map;

public class cd
implements ap {
    private static final df b = ak.d;
    private static final cy c = co.a;
    private static final int d = 30000;
    protected final an a;
    private volatile h e = io.netty.b.h.a;
    private volatile df f = b;
    private volatile cy g = c;
    private volatile int h = 30000;
    private volatile int i;
    private volatile int j = 16;
    private volatile boolean k = true;
    private volatile boolean l = true;
    private volatile int m = 65536;
    private volatile int n = 32768;

    public cd(an an2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        this.a = an2;
        this.i = an2 instanceof dh || an2 instanceof a ? 16 : 1;
    }

    @Override
    public Map a() {
        return this.a(null, bi.d, bi.e, bi.f, bi.a, bi.j, bi.k, bi.b, bi.g, bi.h, bi.c);
    }

    protected Map a(Map identityHashMap, bi ... arrbi) {
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap<bi, Object>();
        }
        for (bi bi2 : arrbi) {
            identityHashMap.put(bi2, this.a(bi2));
        }
        return identityHashMap;
    }

    @Override
    public boolean a(Map map) {
        if (map == null) {
            throw new NullPointerException("options");
        }
        boolean bl2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (this.a((bi)entry.getKey(), entry.getValue())) continue;
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == null) {
            throw new NullPointerException("option");
        }
        if (bi2 == bi.d) {
            return this.b();
        }
        if (bi2 == bi.e) {
            return this.c();
        }
        if (bi2 == bi.f) {
            return this.d();
        }
        if (bi2 == bi.a) {
            return this.e();
        }
        if (bi2 == bi.b) {
            return this.f();
        }
        if (bi2 == bi.j) {
            return this.g();
        }
        if (bi2 == bi.k) {
            return this.h();
        }
        if (bi2 == bi.g) {
            return this.i();
        }
        if (bi2 == bi.h) {
            return this.j();
        }
        if (bi2 == bi.c) {
            return this.k();
        }
        return null;
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.d) {
            this.a((Integer)object);
        } else if (bi2 == bi.e) {
            this.b((Integer)object);
        } else if (bi2 == bi.f) {
            this.c((Integer)object);
        } else if (bi2 == bi.a) {
            this.a((h)object);
        } else if (bi2 == bi.b) {
            this.a((df)object);
        } else if (bi2 == bi.j) {
            this.a((Boolean)object);
        } else if (bi2 == bi.k) {
            this.b((Boolean)object);
        } else if (bi2 == bi.g) {
            this.d((Integer)object);
        } else if (bi2 == bi.h) {
            this.e((Integer)object);
        } else if (bi2 == bi.c) {
            this.a((cy)object);
        } else {
            return false;
        }
        return true;
    }

    protected void b(bi bi2, Object object) {
        if (bi2 == null) {
            throw new NullPointerException("option");
        }
        bi2.a(object);
    }

    @Override
    public int b() {
        return this.h;
    }

    @Override
    public ap a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException(String.format("connectTimeoutMillis: %d (expected: >= 0)", n2));
        }
        this.h = n2;
        return this;
    }

    @Override
    public int c() {
        return this.i;
    }

    @Override
    public ap b(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxMessagesPerRead: " + n2 + " (expected: > 0)");
        }
        this.i = n2;
        return this;
    }

    @Override
    public int d() {
        return this.j;
    }

    @Override
    public ap c(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
        }
        this.j = n2;
        return this;
    }

    @Override
    public h e() {
        return this.e;
    }

    @Override
    public ap a(h h2) {
        if (h2 == null) {
            throw new NullPointerException("allocator");
        }
        this.e = h2;
        return this;
    }

    @Override
    public df f() {
        return this.f;
    }

    @Override
    public ap a(df df2) {
        if (df2 == null) {
            throw new NullPointerException("allocator");
        }
        this.f = df2;
        return this;
    }

    @Override
    public boolean g() {
        return this.k;
    }

    @Override
    public ap a(boolean bl2) {
        boolean bl3 = this.k;
        this.k = bl2;
        if (bl2 && !bl3) {
            this.a.o();
        } else if (!bl2 && bl3) {
            this.l();
        }
        return this;
    }

    protected void l() {
    }

    @Override
    public boolean h() {
        return this.l;
    }

    @Override
    public ap b(boolean bl2) {
        this.l = bl2;
        return this;
    }

    @Override
    public int i() {
        return this.m;
    }

    @Override
    public ap d(int n2) {
        if (n2 < this.j()) {
            throw new IllegalArgumentException("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark (" + this.j() + "): " + n2);
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("writeBufferHighWaterMark must be >= 0");
        }
        this.m = n2;
        return this;
    }

    @Override
    public int j() {
        return this.n;
    }

    @Override
    public ap e(int n2) {
        if (n2 > this.i()) {
            throw new IllegalArgumentException("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark (" + this.i() + "): " + n2);
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("writeBufferLowWaterMark must be >= 0");
        }
        this.n = n2;
        return this;
    }

    @Override
    public cy k() {
        return this.g;
    }

    @Override
    public ap a(cy cy2) {
        if (cy2 == null) {
            throw new NullPointerException("estimator");
        }
        this.g = cy2;
        return this;
    }
}

