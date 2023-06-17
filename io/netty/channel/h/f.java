/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h;

import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.h.i;
import io.netty.channel.h.j;
import io.netty.util.o;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.Map;

public class f
extends cd
implements j {
    protected final ServerSocket b;
    private volatile int c = o.e;

    public f(i i2, ServerSocket serverSocket) {
        super(i2);
        if (serverSocket == null) {
            throw new NullPointerException("javaSocket");
        }
        this.b = serverSocket;
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.o, bi.p, bi.r);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.o) {
            return this.n();
        }
        if (bi2 == bi.p) {
            return this.m();
        }
        if (bi2 == bi.r) {
            return this.o();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.o) {
            this.p((Integer)object);
        } else if (bi2 == bi.p) {
            this.g((Boolean)object);
        } else if (bi2 == bi.r) {
            this.q((Integer)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public boolean m() {
        try {
            return this.b.getReuseAddress();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public j g(boolean bl2) {
        try {
            this.b.setReuseAddress(bl2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public int n() {
        try {
            return this.b.getReceiveBufferSize();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public j p(int n2) {
        try {
            this.b.setReceiveBufferSize(n2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public j b(int n2, int n3, int n4) {
        this.b.setPerformancePreferences(n2, n3, n4);
        return this;
    }

    @Override
    public int o() {
        return this.c;
    }

    @Override
    public j q(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("backlog: " + n2);
        }
        this.c = n2;
        return this;
    }

    @Override
    public j o(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public j n(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public j m(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public j c(h h2) {
        super.a(h2);
        return this;
    }

    @Override
    public j c(df df2) {
        super.a(df2);
        return this;
    }

    @Override
    public j f(boolean bl2) {
        super.a(bl2);
        return this;
    }

    public j f(int n2) {
        super.d(n2);
        return this;
    }

    public j g(int n2) {
        super.e(n2);
        return this;
    }

    @Override
    public j c(cy cy2) {
        super.a(cy2);
        return this;
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.c(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.g(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.f(bl2);
    }

    @Override
    public /* synthetic */ ap a(df df2) {
        return this.c(df2);
    }

    @Override
    public /* synthetic */ ap a(h h2) {
        return this.c(h2);
    }

    @Override
    public /* synthetic */ ap c(int n2) {
        return this.m(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.n(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.o(n2);
    }
}

