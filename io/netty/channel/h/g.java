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
import io.netty.channel.h.k;
import io.netty.channel.h.l;
import io.netty.util.c.u;
import java.net.Socket;
import java.net.SocketException;
import java.util.Map;

public class g
extends cd
implements l {
    protected final Socket b;
    private volatile boolean c;

    public g(k k2, Socket socket) {
        super(k2);
        if (socket == null) {
            throw new NullPointerException("javaSocket");
        }
        this.b = socket;
        if (u.e()) {
            try {
                this.o(true);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.o, bi.n, bi.y, bi.m, bi.p, bi.q, bi.t, bi.i);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.o) {
            return this.m();
        }
        if (bi2 == bi.n) {
            return this.n();
        }
        if (bi2 == bi.y) {
            return this.s();
        }
        if (bi2 == bi.m) {
            return this.q();
        }
        if (bi2 == bi.p) {
            return this.r();
        }
        if (bi2 == bi.q) {
            return this.o();
        }
        if (bi2 == bi.t) {
            return this.p();
        }
        if (bi2 == bi.i) {
            return this.x();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.o) {
            this.v((Integer)object);
        } else if (bi2 == bi.n) {
            this.w((Integer)object);
        } else if (bi2 == bi.y) {
            this.o((Boolean)object);
        } else if (bi2 == bi.m) {
            this.n((Boolean)object);
        } else if (bi2 == bi.p) {
            this.m((Boolean)object);
        } else if (bi2 == bi.q) {
            this.x((Integer)object);
        } else if (bi2 == bi.t) {
            this.u((Integer)object);
        } else if (bi2 == bi.i) {
            this.l((Boolean)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public int m() {
        try {
            return this.b.getReceiveBufferSize();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public int n() {
        try {
            return this.b.getSendBufferSize();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public int o() {
        try {
            return this.b.getSoLinger();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public int p() {
        try {
            return this.b.getTrafficClass();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public boolean q() {
        try {
            return this.b.getKeepAlive();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public boolean r() {
        try {
            return this.b.getReuseAddress();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public boolean s() {
        try {
            return this.b.getTcpNoDelay();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public l n(boolean bl2) {
        try {
            this.b.setKeepAlive(bl2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public l b(int n2, int n3, int n4) {
        this.b.setPerformancePreferences(n2, n3, n4);
        return this;
    }

    @Override
    public l v(int n2) {
        try {
            this.b.setReceiveBufferSize(n2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public l m(boolean bl2) {
        try {
            this.b.setReuseAddress(bl2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public l w(int n2) {
        try {
            this.b.setSendBufferSize(n2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public l x(int n2) {
        try {
            if (n2 < 0) {
                this.b.setSoLinger(false, 0);
            } else {
                this.b.setSoLinger(true, n2);
            }
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public l o(boolean bl2) {
        try {
            this.b.setTcpNoDelay(bl2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public l u(int n2) {
        try {
            this.b.setTrafficClass(n2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public boolean x() {
        return this.c;
    }

    @Override
    public l l(boolean bl2) {
        this.c = bl2;
        return this;
    }

    @Override
    public l t(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public l s(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public l r(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public l c(h h2) {
        super.a(h2);
        return this;
    }

    @Override
    public l c(df df2) {
        super.a(df2);
        return this;
    }

    @Override
    public l k(boolean bl2) {
        super.a(bl2);
        return this;
    }

    @Override
    public l j(boolean bl2) {
        super.b(bl2);
        return this;
    }

    public l f(int n2) {
        super.d(n2);
        return this;
    }

    public l g(int n2) {
        super.e(n2);
        return this;
    }

    @Override
    public l c(cy cy2) {
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
    public /* synthetic */ ap b(boolean bl2) {
        return this.j(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.k(bl2);
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
        return this.r(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.s(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.t(n2);
    }
}

