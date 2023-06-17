/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.ae;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.util.c.ad;
import io.netty.util.z;

public abstract class ac
extends ae {
    private final boolean a;
    private final int b;

    protected ac(g g2) {
        this(true, 0, g2);
    }

    protected ac(boolean bl2, int n2, g g2) {
        super(g2);
        this.a = bl2;
        this.b = n2;
    }

    public boolean m() {
        return this.a;
    }

    public int n() {
        return this.b;
    }

    public abstract ac j();

    public abstract ac i();

    @Override
    public String toString() {
        return ad.a(this) + "(data: " + this.a().toString() + ')';
    }

    public ac h() {
        super.bC_();
        return this;
    }

    public ac c(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.h();
    }

    @Override
    public /* synthetic */ i c() {
        return this.i();
    }

    @Override
    public /* synthetic */ i b() {
        return this.j();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.h();
    }
}

