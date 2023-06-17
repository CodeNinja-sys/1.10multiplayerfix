/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  gnu.io.CommPort
 *  gnu.io.CommPortIdentifier
 *  gnu.io.SerialPort
 */
package io.netty.channel.f;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import io.netty.channel.ap;
import io.netty.channel.f.a;
import io.netty.channel.f.d;
import io.netty.channel.f.f;
import io.netty.channel.f.g;
import io.netty.channel.f.h;
import io.netty.channel.f.i;
import io.netty.channel.f.j;
import io.netty.channel.f.k;
import java.net.SocketAddress;

public class b
extends io.netty.channel.e.f {
    private static final k d = new k("localhost");
    private final f e = new a(this);
    private boolean f = true;
    private k g;
    private SerialPort h;

    public b() {
        super(null);
    }

    public f J() {
        return this.e;
    }

    @Override
    public boolean H() {
        return this.f;
    }

    @Override
    protected io.netty.channel.b bv_() {
        return new d(this, null);
    }

    @Override
    protected void b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        k k2 = (k)socketAddress;
        CommPortIdentifier commPortIdentifier = CommPortIdentifier.getPortIdentifier((String)k2.a());
        CommPort commPort = commPortIdentifier.open(this.getClass().getName(), 1000);
        commPort.enableReceiveTimeout(((Integer)this.J().a(j.J)).intValue());
        this.g = k2;
        this.h = (SerialPort)commPort;
    }

    protected void K() {
        this.h.setSerialPortParams(((Integer)this.J().a(j.C)).intValue(), ((g)((Object)this.J().a(j.G))).a(), ((i)((Object)this.J().a(j.F))).a(), ((h)((Object)this.J().a(j.H))).a());
        this.h.setDTR(((Boolean)this.J().a(j.D)).booleanValue());
        this.h.setRTS(((Boolean)this.J().a(j.E)).booleanValue());
        this.a(this.h.getInputStream(), this.h.getOutputStream());
    }

    public k P() {
        return (k)super.f();
    }

    public k R() {
        return (k)super.h();
    }

    protected k S() {
        return d;
    }

    protected k T() {
        return this.g;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void A() {
        this.B();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void B() {
        this.f = false;
        try {
            super.B();
        }
        finally {
            if (this.h != null) {
                this.h.removeEventListener();
                this.h.close();
                this.h = null;
            }
        }
    }

    @Override
    protected /* synthetic */ SocketAddress y() {
        return this.T();
    }

    @Override
    protected /* synthetic */ SocketAddress x() {
        return this.S();
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.R();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.P();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.J();
    }
}

