/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.b;

import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.cb;
import io.netty.channel.cr;
import io.netty.channel.h.b.b;
import io.netty.channel.h.b.g;
import io.netty.channel.h.b.h;
import io.netty.channel.h.i;
import io.netty.channel.h.k;
import io.netty.channel.h.l;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public class f
extends io.netty.channel.e.f
implements k {
    private static final io.netty.util.c.b.g d = io.netty.util.c.b.h.a(f.class);
    private final Socket e;
    private final h f;

    public f() {
        this(new Socket());
    }

    public f(Socket socket) {
        this(null, socket);
    }

    public f(an an2, Socket socket) {
        super(an2);
        this.e = socket;
        this.f = new b(this, socket);
        boolean bl2 = false;
        try {
            if (socket.isConnected()) {
                this.a(socket.getInputStream(), socket.getOutputStream());
            }
            socket.setSoTimeout(1000);
            bl2 = true;
        }
        catch (Exception exception) {
            throw new ar("failed to initialize a socket", exception);
        }
        finally {
            if (!bl2) {
                try {
                    socket.close();
                }
                catch (IOException iOException) {
                    d.d("Failed to close a socket.", iOException);
                }
            }
        }
    }

    @Override
    public i T() {
        return (i)super.b();
    }

    public h P() {
        return this.f;
    }

    @Override
    public boolean H() {
        return !this.e.isClosed();
    }

    @Override
    public boolean I() {
        return !this.e.isClosed() && this.e.isConnected();
    }

    @Override
    public boolean Q() {
        return super.Q();
    }

    @Override
    public boolean R() {
        return this.e.isOutputShutdown() || !this.I();
    }

    @Override
    public av S() {
        return this.d(this.p());
    }

    @Override
    protected int a(io.netty.b.g g2) {
        if (this.e.isClosed()) {
            return -1;
        }
        try {
            return super.a(g2);
        }
        catch (SocketTimeoutException socketTimeoutException) {
            return 0;
        }
    }

    @Override
    public av d(bw bw2) {
        cr cr2 = this.e();
        if (cr2.bt_()) {
            try {
                this.e.shutdownOutput();
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            cr2.execute(new g(this, bw2));
        }
        return bw2;
    }

    @Override
    public InetSocketAddress K() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public InetSocketAddress J() {
        return (InetSocketAddress)super.h();
    }

    @Override
    protected SocketAddress x() {
        return this.e.getLocalSocketAddress();
    }

    @Override
    protected SocketAddress y() {
        return this.e.getRemoteSocketAddress();
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.e.bind(socketAddress);
    }

    @Override
    protected void b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            this.e.bind(socketAddress2);
        }
        boolean bl2 = false;
        try {
            this.e.connect(socketAddress, this.P().b());
            this.a(this.e.getInputStream(), this.e.getOutputStream());
            bl2 = true;
        }
        catch (SocketTimeoutException socketTimeoutException) {
            cb cb2 = new cb("connection timed out: " + socketAddress);
            cb2.setStackTrace(socketTimeoutException.getStackTrace());
            throw cb2;
        }
        finally {
            if (!bl2) {
                this.B();
            }
        }
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected void B() {
        this.e.close();
    }

    @Override
    protected boolean L() {
        if (this.Q()) {
            try {
                Thread.sleep(this.P().t());
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return true;
        }
        return false;
    }

    @Override
    protected void a(boolean bl2) {
        super.a(bl2);
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.J();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.K();
    }

    @Override
    public /* synthetic */ an b() {
        return this.T();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.P();
    }

    @Override
    public /* synthetic */ l U() {
        return this.P();
    }
}

