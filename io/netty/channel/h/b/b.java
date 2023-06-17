/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.b;

import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bi;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.h.b.f;
import io.netty.channel.h.b.h;
import io.netty.channel.h.g;
import io.netty.channel.h.k;
import io.netty.channel.h.l;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;

public class b
extends g
implements h {
    public b(k k2, Socket socket) {
        super(k2, socket);
    }

    b(f f2, Socket socket) {
        super(f2, socket);
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.s);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.s) {
            return this.t();
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
    public h h(int n2) {
        try {
            this.b.setSoTimeout(n2);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public int t() {
        try {
            return this.b.getSoTimeout();
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public h c(boolean bl2) {
        super.o(bl2);
        return this;
    }

    @Override
    public h i(int n2) {
        super.x(n2);
        return this;
    }

    @Override
    public h j(int n2) {
        super.w(n2);
        return this;
    }

    @Override
    public h k(int n2) {
        super.v(n2);
        return this;
    }

    @Override
    public h d(boolean bl2) {
        super.n(bl2);
        return this;
    }

    @Override
    public h l(int n2) {
        super.u(n2);
        return this;
    }

    @Override
    public h e(boolean bl2) {
        super.m(bl2);
        return this;
    }

    @Override
    public h a(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        return this;
    }

    @Override
    public h f(boolean bl2) {
        super.l(bl2);
        return this;
    }

    @Override
    public h m(int n2) {
        super.t(n2);
        return this;
    }

    @Override
    public h n(int n2) {
        super.s(n2);
        return this;
    }

    @Override
    public h o(int n2) {
        super.r(n2);
        return this;
    }

    @Override
    public h b(io.netty.b.h h2) {
        super.c(h2);
        return this;
    }

    @Override
    public h b(df df2) {
        super.c(df2);
        return this;
    }

    @Override
    public h g(boolean bl2) {
        super.k(bl2);
        return this;
    }

    @Override
    protected void l() {
        if (this.a instanceof f) {
            ((f)this.a).a(false);
        }
    }

    @Override
    public h h(boolean bl2) {
        super.j(bl2);
        return this;
    }

    @Override
    public h p(int n2) {
        super.f(n2);
        return this;
    }

    @Override
    public h q(int n2) {
        super.g(n2);
        return this;
    }

    @Override
    public h b(cy cy2) {
        super.c(cy2);
        return this;
    }

    @Override
    public /* synthetic */ l c(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ l g(int n2) {
        return this.q(n2);
    }

    @Override
    public /* synthetic */ l f(int n2) {
        return this.p(n2);
    }

    @Override
    public /* synthetic */ l j(boolean bl2) {
        return this.h(bl2);
    }

    @Override
    public /* synthetic */ l k(boolean bl2) {
        return this.g(bl2);
    }

    @Override
    public /* synthetic */ l c(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ l c(io.netty.b.h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ l r(int n2) {
        return this.o(n2);
    }

    @Override
    public /* synthetic */ l s(int n2) {
        return this.n(n2);
    }

    @Override
    public /* synthetic */ l t(int n2) {
        return this.m(n2);
    }

    @Override
    public /* synthetic */ l l(boolean bl2) {
        return this.f(bl2);
    }

    @Override
    public /* synthetic */ l u(int n2) {
        return this.l(n2);
    }

    @Override
    public /* synthetic */ l o(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ l x(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ l w(int n2) {
        return this.j(n2);
    }

    @Override
    public /* synthetic */ l m(boolean bl2) {
        return this.e(bl2);
    }

    @Override
    public /* synthetic */ l v(int n2) {
        return this.k(n2);
    }

    @Override
    public /* synthetic */ l b(int n2, int n3, int n4) {
        return this.a(n2, n3, n4);
    }

    @Override
    public /* synthetic */ l n(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.q(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.p(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.h(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.g(bl2);
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
        return this.o(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.n(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.m(n2);
    }
}

