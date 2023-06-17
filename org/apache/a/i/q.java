/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import org.apache.a.i.a;
import org.apache.a.i.g.aa;
import org.apache.a.i.g.z;
import org.apache.a.j.h;
import org.apache.a.j.i;
import org.apache.a.l.j;
import org.apache.a.o.b;
import org.apache.a.s;

public class q
extends a
implements s {
    private volatile boolean a;
    private volatile Socket b = null;

    protected void w() {
        org.apache.a.o.b.a(!this.a, "Connection is already open");
    }

    protected void o() {
        org.apache.a.o.b.a(this.a, "Connection is not open");
    }

    protected h a(Socket socket, int n2, j j2) {
        return new z(socket, n2, j2);
    }

    protected i b(Socket socket, int n2, j j2) {
        return new aa(socket, n2, j2);
    }

    protected void a(Socket socket, j j2) {
        org.apache.a.o.a.a(socket, "Socket");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        this.b = socket;
        int n2 = j2.a("http.socket.buffer-size", -1);
        this.a(this.a(socket, n2, j2), this.b(socket, n2, j2), j2);
        this.a = true;
    }

    public boolean c() {
        return this.a;
    }

    protected Socket t() {
        return this.b;
    }

    public InetAddress h() {
        if (this.b != null) {
            return this.b.getLocalAddress();
        }
        return null;
    }

    public int i() {
        if (this.b != null) {
            return this.b.getLocalPort();
        }
        return -1;
    }

    public InetAddress j() {
        if (this.b != null) {
            return this.b.getInetAddress();
        }
        return null;
    }

    public int k() {
        if (this.b != null) {
            return this.b.getPort();
        }
        return -1;
    }

    public void b(int n2) {
        this.o();
        if (this.b != null) {
            try {
                this.b.setSoTimeout(n2);
            }
            catch (SocketException socketException) {
                // empty catch block
            }
        }
    }

    public int e() {
        if (this.b != null) {
            try {
                return this.b.getSoTimeout();
            }
            catch (SocketException socketException) {
                return -1;
            }
        }
        return -1;
    }

    public void f() {
        this.a = false;
        Socket socket = this.b;
        if (socket != null) {
            socket.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        if (!this.a) {
            return;
        }
        this.a = false;
        Socket socket = this.b;
        try {
            this.u();
            try {
                try {
                    socket.shutdownOutput();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                try {
                    socket.shutdownInput();
                }
                catch (IOException iOException) {}
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                // empty catch block
            }
        }
        finally {
            socket.close();
        }
    }

    private static void a(StringBuilder stringBuilder, SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
            stringBuilder.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress()).append(':').append(inetSocketAddress.getPort());
        } else {
            stringBuilder.append(socketAddress);
        }
    }

    public String toString() {
        if (this.b != null) {
            StringBuilder stringBuilder = new StringBuilder();
            SocketAddress socketAddress = this.b.getRemoteSocketAddress();
            SocketAddress socketAddress2 = this.b.getLocalSocketAddress();
            if (socketAddress != null && socketAddress2 != null) {
                q.a(stringBuilder, socketAddress2);
                stringBuilder.append("<->");
                q.a(stringBuilder, socketAddress);
            }
            return stringBuilder.toString();
        }
        return super.toString();
    }
}

