/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g;

import com.sun.nio.sctp.SctpChannel;
import com.sun.nio.sctp.SctpStandardSocketOptions;
import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.g.c;
import io.netty.channel.g.d;
import io.netty.channel.g.e;
import io.netty.util.c.u;
import java.io.IOException;
import java.util.Map;

public class a
extends cd
implements d {
    private final SctpChannel b;

    public a(c c2, SctpChannel sctpChannel) {
        super(c2);
        if (sctpChannel == null) {
            throw new NullPointerException("javaChannel");
        }
        this.b = sctpChannel;
        if (u.e()) {
            try {
                this.c(true);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public Map a() {
        return this.a(super.a(), e.o, e.n, e.G, e.F);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == e.o) {
            return this.o();
        }
        if (bi2 == e.n) {
            return this.n();
        }
        if (bi2 == e.G) {
            return this.m();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == e.o) {
            this.g((Integer)object);
        } else if (bi2 == e.n) {
            this.f((Integer)object);
        } else if (bi2 == e.G) {
            this.c((Boolean)object);
        } else if (bi2 == e.F) {
            this.a((SctpStandardSocketOptions.InitMaxStreams)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public boolean m() {
        try {
            return this.b.getOption(SctpStandardSocketOptions.SCTP_NODELAY);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public d c(boolean bl2) {
        try {
            this.b.setOption(SctpStandardSocketOptions.SCTP_NODELAY, bl2);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public int n() {
        try {
            return this.b.getOption(SctpStandardSocketOptions.SO_SNDBUF);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public d f(int n2) {
        try {
            this.b.setOption(SctpStandardSocketOptions.SO_SNDBUF, n2);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public int o() {
        try {
            return this.b.getOption(SctpStandardSocketOptions.SO_RCVBUF);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public d g(int n2) {
        try {
            this.b.setOption(SctpStandardSocketOptions.SO_RCVBUF, n2);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public SctpStandardSocketOptions.InitMaxStreams p() {
        try {
            return this.b.getOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    public d a(SctpStandardSocketOptions.InitMaxStreams initMaxStreams) {
        try {
            this.b.setOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS, initMaxStreams);
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
        return this;
    }

    @Override
    public d h(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public d i(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public d j(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public d b(h h2) {
        super.a(h2);
        return this;
    }

    @Override
    public d b(df df2) {
        super.a(df2);
        return this;
    }

    @Override
    public d d(boolean bl2) {
        super.a(bl2);
        return this;
    }

    @Override
    public d e(boolean bl2) {
        super.b(bl2);
        return this;
    }

    @Override
    public d k(int n2) {
        super.d(n2);
        return this;
    }

    @Override
    public d l(int n2) {
        super.e(n2);
        return this;
    }

    @Override
    public d b(cy cy2) {
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
        return this.k(n2);
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
        return this.j(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.h(n2);
    }
}

