/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.b;

import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.h.b.a;
import io.netty.channel.h.b.e;
import io.netty.channel.h.b.f;
import io.netty.channel.h.i;
import io.netty.channel.h.j;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class d
extends io.netty.channel.e.e
implements i {
    private static final g f = io.netty.util.c.b.h.a(d.class);
    private static final bh g = new bh(false);
    final ServerSocket d;
    final Lock e = new ReentrantLock();
    private final e h;

    private static ServerSocket N() {
        try {
            return new ServerSocket();
        }
        catch (IOException iOException) {
            throw new ar("failed to create a server socket", iOException);
        }
    }

    public d() {
        this(io.netty.channel.h.b.d.N());
    }

    public d(ServerSocket serverSocket) {
        super(null);
        if (serverSocket == null) {
            throw new NullPointerException("socket");
        }
        boolean bl2 = false;
        try {
            serverSocket.setSoTimeout(1000);
            bl2 = true;
        }
        catch (IOException iOException) {
            throw new ar("Failed to set the server socket timeout.", iOException);
        }
        finally {
            block12: {
                if (!bl2) {
                    try {
                        serverSocket.close();
                    }
                    catch (IOException iOException) {
                        if (!f.f()) break block12;
                        f.d("Failed to close a partially initialized socket.", iOException);
                    }
                }
            }
        }
        this.d = serverSocket;
        this.h = new a(this, serverSocket);
    }

    @Override
    public InetSocketAddress K() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public bh F() {
        return g;
    }

    public e L() {
        return this.h;
    }

    @Override
    public InetSocketAddress J() {
        return null;
    }

    @Override
    public boolean H() {
        return !this.d.isClosed();
    }

    @Override
    public boolean I() {
        return this.H() && this.d.isBound();
    }

    @Override
    protected SocketAddress x() {
        return this.d.getLocalSocketAddress();
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.d.bind(socketAddress, this.h.o());
    }

    @Override
    protected void B() {
        this.d.close();
    }

    @Override
    protected int a(List list) {
        if (this.d.isClosed()) {
            return -1;
        }
        try {
            Socket socket = this.d.accept();
            try {
                list.add(new f(this, socket));
                return 1;
            }
            catch (Throwable throwable) {
                f.d("Failed to create a new channel from an accepted socket.", throwable);
                try {
                    socket.close();
                }
                catch (Throwable throwable2) {
                    f.d("Failed to close a socket.", throwable2);
                }
            }
        }
        catch (SocketTimeoutException socketTimeoutException) {
            // empty catch block
        }
        return 0;
    }

    @Override
    protected void a(bj bj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected Object c(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected SocketAddress y() {
        return null;
    }

    @Override
    protected void A() {
        throw new UnsupportedOperationException();
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
    public /* synthetic */ ap G() {
        return this.L();
    }

    @Override
    public /* synthetic */ j S() {
        return this.L();
    }
}

