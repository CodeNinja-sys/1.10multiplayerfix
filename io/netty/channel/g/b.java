/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g;

import com.sun.nio.sctp.SctpServerChannel;
import com.sun.nio.sctp.SctpStandardSocketOptions;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.g.e;
import io.netty.channel.g.h;
import io.netty.channel.g.i;
import io.netty.util.o;
import java.io.IOException;
import java.util.Map;

public class b
extends cd
implements i {
    private final SctpServerChannel b;
    private volatile int c = o.e;

    public b(h h2, SctpServerChannel sctpServerChannel) {
        super(h2);
        if (sctpServerChannel == null) {
            throw new NullPointerException("javaChannel");
        }
        this.b = sctpServerChannel;
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.o, bi.n, e.F);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.o) {
            return this.n();
        }
        if (bi2 == bi.n) {
            return this.m();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.o) {
            this.g((Integer)object);
        } else if (bi2 == bi.n) {
            this.f((Integer)object);
        } else if (bi2 == SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS) {
            this.a((SctpStandardSocketOptions.InitMaxStreams)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public int m() {
        try {
            return this.b.getOption(SctpStandardSocketOptions.SO_SNDBUF);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public i f(int n2) {
        try {
            this.b.setOption(SctpStandardSocketOptions.SO_SNDBUF, n2);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public int n() {
        try {
            return this.b.getOption(SctpStandardSocketOptions.SO_RCVBUF);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public i g(int n2) {
        try {
            this.b.setOption(SctpStandardSocketOptions.SO_RCVBUF, n2);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public SctpStandardSocketOptions.InitMaxStreams o() {
        try {
            return this.b.getOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public i a(SctpStandardSocketOptions.InitMaxStreams initMaxStreams) {
        try {
            this.b.setOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS, initMaxStreams);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public int p() {
        return this.c;
    }

    @Override
    public i h(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("backlog: " + n2);
        }
        this.c = n2;
        return this;
    }

    @Override
    public i i(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public i j(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public i k(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public i b(io.netty.b.h h2) {
        super.a(h2);
        return this;
    }

    @Override
    public i b(df df2) {
        super.a(df2);
        return this;
    }

    @Override
    public i c(boolean bl2) {
        super.a(bl2);
        return this;
    }

    @Override
    public i d(boolean bl2) {
        super.b(bl2);
        return this;
    }

    @Override
    public i l(int n2) {
        super.e(n2);
        return this;
    }

    @Override
    public i m(int n2) {
        super.d(n2);
        return this;
    }

    @Override
    public i b(cy cy2) {
        super.a(cy2);
        return this;
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.l(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.m(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.c(bl2);
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
        return this.j(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.k(n2);
    }
}

