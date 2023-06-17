/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.k.bl;
import io.netty.c.a.k.l;
import io.netty.c.a.k.q;
import io.netty.util.c.ad;
import io.netty.util.n;
import io.netty.util.z;

public class a
extends l
implements q {
    private final g a;

    public a(int n2) {
        this(n2, bi.a(0));
    }

    public a(int n2, g g2) {
        super(n2);
        if (g2 == null) {
            throw new NullPointerException("data");
        }
        this.a = io.netty.c.a.k.a.a(g2);
    }

    private static g a(g g2) {
        if (g2.r() > 0xFFFFFF) {
            throw new IllegalArgumentException("data payload cannot exceed 16777215 bytes");
        }
        return g2;
    }

    @Override
    public q b(int n2) {
        super.d(n2);
        return this;
    }

    @Override
    public q a(boolean bl2) {
        super.b(bl2);
        return this;
    }

    @Override
    public g a() {
        if (this.a.ac() <= 0) {
            throw new n(this.a.ac());
        }
        return this.a;
    }

    @Override
    public q e() {
        a a2 = new a(this.h(), this.a().Q());
        a2.a(this.i());
        return a2;
    }

    @Override
    public q f() {
        a a2 = new a(this.h(), this.a().S());
        a2.a(this.i());
        return a2;
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public q g() {
        this.a.ab();
        return this;
    }

    @Override
    public q c(int n2) {
        this.a.H(n2);
        return this;
    }

    @Override
    public boolean ad() {
        return this.a.ad();
    }

    @Override
    public boolean I(int n2) {
        return this.a.I(n2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append("(last: ");
        stringBuilder.append(this.i());
        stringBuilder.append(')');
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Stream-ID = ");
        stringBuilder.append(this.h());
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Size = ");
        if (this.ac() == 0) {
            stringBuilder.append("(freed)");
        } else {
            stringBuilder.append(this.a().r());
        }
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ bl b(boolean bl2) {
        return this.a(bl2);
    }

    @Override
    public /* synthetic */ bl d(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.g();
    }

    @Override
    public /* synthetic */ i c() {
        return this.f();
    }

    @Override
    public /* synthetic */ i b() {
        return this.e();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.g();
    }
}

