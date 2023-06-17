/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.f;

import io.netty.channel.ap;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.f.b;
import io.netty.channel.f.f;
import io.netty.channel.f.g;
import io.netty.channel.f.h;
import io.netty.channel.f.i;
import io.netty.channel.f.j;
import java.util.Map;

final class a
extends cd
implements f {
    private volatile int b = 115200;
    private volatile boolean c;
    private volatile boolean d;
    private volatile i e = io.netty.channel.f.i.a;
    private volatile g f = io.netty.channel.f.g.d;
    private volatile h g = io.netty.channel.f.h.a;
    private volatile int h;
    private volatile int i = 1000;

    a(b b2) {
        super(b2);
    }

    @Override
    public Map a() {
        return this.a(super.a(), j.C, j.D, j.E, j.F, j.G, j.H, j.I);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == j.C) {
            return this.m();
        }
        if (bi2 == j.D) {
            return this.q();
        }
        if (bi2 == j.E) {
            return this.r();
        }
        if (bi2 == j.F) {
            return this.n();
        }
        if (bi2 == j.G) {
            return this.o();
        }
        if (bi2 == j.H) {
            return this.p();
        }
        if (bi2 == j.I) {
            return this.s();
        }
        if (bi2 == j.J) {
            return this.t();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == j.C) {
            this.f((Integer)object);
        } else if (bi2 == j.D) {
            this.c((Boolean)object);
        } else if (bi2 == j.E) {
            this.d((Boolean)object);
        } else if (bi2 == j.F) {
            this.a((i)((Object)object));
        } else if (bi2 == j.G) {
            this.a((g)((Object)object));
        } else if (bi2 == j.H) {
            this.a((h)((Object)object));
        } else if (bi2 == j.I) {
            this.g((Integer)object);
        } else if (bi2 == j.J) {
            this.h((Integer)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public f f(int n2) {
        this.b = n2;
        return this;
    }

    @Override
    public f a(i i2) {
        this.e = i2;
        return this;
    }

    @Override
    public f a(g g2) {
        this.f = g2;
        return this;
    }

    @Override
    public f a(h h2) {
        this.g = h2;
        return this;
    }

    @Override
    public int m() {
        return this.b;
    }

    @Override
    public i n() {
        return this.e;
    }

    @Override
    public g o() {
        return this.f;
    }

    @Override
    public h p() {
        return this.g;
    }

    @Override
    public boolean q() {
        return this.c;
    }

    @Override
    public f c(boolean bl2) {
        this.c = bl2;
        return this;
    }

    @Override
    public boolean r() {
        return this.d;
    }

    @Override
    public f d(boolean bl2) {
        this.d = bl2;
        return this;
    }

    @Override
    public int s() {
        return this.h;
    }

    @Override
    public f g(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Wait time must be >= 0");
        }
        this.h = n2;
        return this;
    }

    @Override
    public f h(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("readTime must be >= 0");
        }
        this.i = n2;
        return this;
    }

    @Override
    public int t() {
        return this.i;
    }

    @Override
    public f i(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public f j(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public f k(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public f b(io.netty.b.h h2) {
        super.a(h2);
        return this;
    }

    @Override
    public f b(df df2) {
        super.a(df2);
        return this;
    }

    @Override
    public f e(boolean bl2) {
        super.a(bl2);
        return this;
    }

    @Override
    public f f(boolean bl2) {
        super.b(bl2);
        return this;
    }

    @Override
    public f l(int n2) {
        super.d(n2);
        return this;
    }

    @Override
    public f m(int n2) {
        super.e(n2);
        return this;
    }

    @Override
    public f b(cy cy2) {
        super.a(cy2);
        return this;
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.m(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.l(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.f(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.e(bl2);
    }

    @Override
    public /* synthetic */ ap a(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ ap a(io.netty.b.h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ ap c(int n2) {
        return this.k(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.j(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.i(n2);
    }
}

