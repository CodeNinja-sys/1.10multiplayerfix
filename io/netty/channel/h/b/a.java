/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.b;

import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bi;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.h.b.d;
import io.netty.channel.h.b.e;
import io.netty.channel.h.f;
import io.netty.channel.h.i;
import io.netty.channel.h.j;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Map;

public class a
extends f
implements e {
    public a(i i2, ServerSocket serverSocket) {
        super(i2, serverSocket);
    }

    a(d d2, ServerSocket serverSocket) {
        super(d2, serverSocket);
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.s);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.s) {
            return this.p();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 != bi.s) {
            return super.a(bi2, object);
        }
        this.h((Integer)object);
        return true;
    }

    @Override
    public e h(int n2) {
        try {
            this.b.setSoTimeout(n2);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public int p() {
        try {
            return this.b.getSoTimeout();
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public e i(int n2) {
        super.q(n2);
        return this;
    }

    @Override
    public e c(boolean bl2) {
        super.g(bl2);
        return this;
    }

    @Override
    public e j(int n2) {
        super.p(n2);
        return this;
    }

    @Override
    public e a(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        return this;
    }

    @Override
    public e k(int n2) {
        super.o(n2);
        return this;
    }

    @Override
    public e l(int n2) {
        super.n(n2);
        return this;
    }

    @Override
    public e r(int n2) {
        super.m(n2);
        return this;
    }

    @Override
    public e b(h h2) {
        super.c(h2);
        return this;
    }

    @Override
    public e b(df df2) {
        super.c(df2);
        return this;
    }

    @Override
    public e d(boolean bl2) {
        super.f(bl2);
        return this;
    }

    @Override
    protected void l() {
        if (this.a instanceof d) {
            ((d)this.a).a(false);
        }
    }

    @Override
    public e e(boolean bl2) {
        super.b(bl2);
        return this;
    }

    @Override
    public e s(int n2) {
        super.f(n2);
        return this;
    }

    @Override
    public e t(int n2) {
        super.g(n2);
        return this;
    }

    @Override
    public e b(cy cy2) {
        super.c(cy2);
        return this;
    }

    @Override
    public /* synthetic */ j c(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ j g(int n2) {
        return this.t(n2);
    }

    @Override
    public /* synthetic */ j f(int n2) {
        return this.s(n2);
    }

    @Override
    public /* synthetic */ j f(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ j c(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ j c(h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ j m(int n2) {
        return this.r(n2);
    }

    @Override
    public /* synthetic */ j n(int n2) {
        return this.l(n2);
    }

    @Override
    public /* synthetic */ j o(int n2) {
        return this.k(n2);
    }

    @Override
    public /* synthetic */ j q(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ j b(int n2, int n3, int n4) {
        return this.a(n2, n3, n4);
    }

    @Override
    public /* synthetic */ j p(int n2) {
        return this.j(n2);
    }

    @Override
    public /* synthetic */ j g(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.t(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.s(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.e(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ ap a(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ ap a(h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ ap c(int n2) {
        return this.r(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.l(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.k(n2);
    }
}

