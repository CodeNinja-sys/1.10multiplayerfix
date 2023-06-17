/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.OptionUDT
 *  com.barchart.udt.SocketUDT
 *  com.barchart.udt.nio.ChannelUDT
 */
package io.netty.channel.i;

import com.barchart.udt.OptionUDT;
import com.barchart.udt.SocketUDT;
import com.barchart.udt.nio.ChannelUDT;
import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.i.c;
import io.netty.channel.i.d;
import io.netty.channel.i.e;
import java.util.Map;

public class a
extends cd
implements d {
    private static final int b = 1024;
    private static final int c = 0x100000;
    private volatile int d = 0xA00000;
    private volatile int e = 0xA00000;
    private volatile int f = 0x100000;
    private volatile int g = 0x100000;
    private volatile int h = 131072;
    private volatile int i = 131072;
    private volatile int j;
    private volatile boolean k = true;

    public a(c c2, ChannelUDT channelUDT, boolean bl2) {
        super(c2);
        if (bl2) {
            this.a(channelUDT);
        }
    }

    protected void a(ChannelUDT channelUDT) {
        SocketUDT socketUDT = channelUDT.socketUDT();
        socketUDT.setReuseAddress(this.q());
        socketUDT.setSendBufferSize(this.o());
        if (this.p() <= 0) {
            socketUDT.setSoLinger(false, 0);
        } else {
            socketUDT.setSoLinger(true, this.p());
        }
        socketUDT.setOption(OptionUDT.Protocol_Receive_Buffer_Size, (Object)this.m());
        socketUDT.setOption(OptionUDT.Protocol_Send_Buffer_Size, (Object)this.s());
        socketUDT.setOption(OptionUDT.System_Receive_Buffer_Size, (Object)this.r());
        socketUDT.setOption(OptionUDT.System_Send_Buffer_Size, (Object)this.t());
    }

    @Override
    public int m() {
        return this.d;
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == io.netty.channel.i.e.C) {
            return this.m();
        }
        if (bi2 == io.netty.channel.i.e.D) {
            return this.s();
        }
        if (bi2 == io.netty.channel.i.e.E) {
            return this.r();
        }
        if (bi2 == io.netty.channel.i.e.F) {
            return this.t();
        }
        if (bi2 == io.netty.channel.i.e.o) {
            return this.n();
        }
        if (bi2 == io.netty.channel.i.e.n) {
            return this.o();
        }
        if (bi2 == io.netty.channel.i.e.p) {
            return this.q();
        }
        if (bi2 == io.netty.channel.i.e.q) {
            return this.p();
        }
        return super.a(bi2);
    }

    @Override
    public Map a() {
        return this.a(super.a(), io.netty.channel.i.e.C, io.netty.channel.i.e.D, io.netty.channel.i.e.E, io.netty.channel.i.e.F, io.netty.channel.i.e.o, io.netty.channel.i.e.n, io.netty.channel.i.e.p, io.netty.channel.i.e.q);
    }

    @Override
    public int n() {
        return this.h;
    }

    @Override
    public int o() {
        return this.i;
    }

    @Override
    public int p() {
        return this.j;
    }

    @Override
    public boolean q() {
        return this.k;
    }

    @Override
    public d f(int n2) {
        this.d = n2;
        return this;
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == io.netty.channel.i.e.C) {
            this.f((Integer)object);
        } else if (bi2 == io.netty.channel.i.e.D) {
            this.k((Integer)object);
        } else if (bi2 == io.netty.channel.i.e.E) {
            this.l((Integer)object);
        } else if (bi2 == io.netty.channel.i.e.F) {
            this.j((Integer)object);
        } else if (bi2 == io.netty.channel.i.e.o) {
            this.g((Integer)object);
        } else if (bi2 == io.netty.channel.i.e.n) {
            this.h((Integer)object);
        } else if (bi2 == io.netty.channel.i.e.p) {
            this.c((Boolean)object);
        } else if (bi2 == io.netty.channel.i.e.q) {
            this.i((Integer)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public d g(int n2) {
        this.h = n2;
        return this;
    }

    @Override
    public d c(boolean bl2) {
        this.k = bl2;
        return this;
    }

    @Override
    public d h(int n2) {
        this.i = n2;
        return this;
    }

    @Override
    public d i(int n2) {
        this.j = n2;
        return this;
    }

    @Override
    public int r() {
        return this.f;
    }

    @Override
    public d j(int n2) {
        this.f = n2;
        return this;
    }

    @Override
    public int s() {
        return this.e;
    }

    @Override
    public d k(int n2) {
        this.e = n2;
        return this;
    }

    @Override
    public d l(int n2) {
        this.g = n2;
        return this;
    }

    @Override
    public int t() {
        return this.g;
    }

    @Override
    public d m(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public d n(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public d o(int n2) {
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
    public d p(int n2) {
        super.e(n2);
        return this;
    }

    @Override
    public d q(int n2) {
        super.d(n2);
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
        return this.p(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.q(n2);
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

