/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.a.h.b;
import org.apache.a.i.e.d;
import org.apache.a.i.g.e;
import org.apache.a.i.g.f;
import org.apache.a.i.g.g;
import org.apache.a.i.g.h;
import org.apache.a.i.g.u;
import org.apache.a.i.g.v;
import org.apache.a.i.g.w;
import org.apache.a.i.g.x;
import org.apache.a.i.g.y;
import org.apache.a.i.o;
import org.apache.a.j.i;
import org.apache.a.k;
import org.apache.a.m;
import org.apache.a.n;
import org.apache.a.o.a;
import org.apache.a.o.j;
import org.apache.a.s;
import org.apache.a.t;

public class c
implements k,
s {
    private final x a;
    private final y b;
    private final o c;
    private final org.apache.a.h.e d;
    private final org.apache.a.h.e e;
    private volatile boolean f;
    private volatile Socket g;

    protected c(int n2, int n3, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.apache.a.e.d d2, org.apache.a.h.e e2, org.apache.a.h.e e3) {
        org.apache.a.o.a.a(n2, "Buffer size");
        u u2 = new u();
        u u3 = new u();
        this.a = new x(u2, n2, -1, d2 != null ? d2 : org.apache.a.e.d.a, charsetDecoder);
        this.b = new y(u3, n2, n3, charsetEncoder);
        this.c = new o(u2, u3);
        this.d = e2 != null ? e2 : org.apache.a.i.e.d.c;
        this.e = e3 != null ? e3 : org.apache.a.i.e.e.c;
    }

    protected void l() {
        org.apache.a.o.b.a(this.f, "Connection is not open");
        if (!this.a.d()) {
            this.a.a(this.b(this.g));
        }
        if (!this.b.c()) {
            this.b.a(this.c(this.g));
        }
    }

    protected InputStream b(Socket socket) {
        return socket.getInputStream();
    }

    protected OutputStream c(Socket socket) {
        return socket.getOutputStream();
    }

    protected void a(Socket socket) {
        org.apache.a.o.a.a(socket, "Socket");
        this.g = socket;
        this.f = true;
        this.a.a((InputStream)null);
        this.b.a((OutputStream)null);
    }

    protected org.apache.a.j.h m() {
        return this.a;
    }

    protected i o() {
        return this.b;
    }

    protected void p() {
        this.b.a();
    }

    public boolean c() {
        return this.f;
    }

    protected Socket t() {
        return this.g;
    }

    protected OutputStream a(long l2, i i2) {
        if (l2 == -2L) {
            return new f(2048, i2);
        }
        if (l2 == -1L) {
            return new w(i2);
        }
        return new h(i2, l2);
    }

    protected OutputStream a(t t2) {
        long l2 = this.e.a(t2);
        return this.a(l2, this.b);
    }

    protected InputStream a(long l2, org.apache.a.j.h h2) {
        if (l2 == -2L) {
            return new e(h2);
        }
        if (l2 == -1L) {
            return new v(h2);
        }
        return new g(h2, l2);
    }

    protected n b(t t2) {
        org.apache.a.f f2;
        b b2 = new b();
        long l2 = this.d.a(t2);
        InputStream inputStream = this.a(l2, this.a);
        if (l2 == -2L) {
            b2.a(true);
            b2.a(-1L);
            b2.a(inputStream);
        } else if (l2 == -1L) {
            b2.a(false);
            b2.a(-1L);
            b2.a(inputStream);
        } else {
            b2.a(false);
            b2.a(l2);
            b2.a(inputStream);
        }
        org.apache.a.f f3 = t2.c("Content-Type");
        if (f3 != null) {
            b2.a(f3);
        }
        if ((f2 = t2.c("Content-Encoding")) != null) {
            b2.b(f2);
        }
        return b2;
    }

    public InetAddress h() {
        if (this.g != null) {
            return this.g.getLocalAddress();
        }
        return null;
    }

    public int i() {
        if (this.g != null) {
            return this.g.getLocalPort();
        }
        return -1;
    }

    public InetAddress j() {
        if (this.g != null) {
            return this.g.getInetAddress();
        }
        return null;
    }

    public int k() {
        if (this.g != null) {
            return this.g.getPort();
        }
        return -1;
    }

    public void b(int n2) {
        if (this.g != null) {
            try {
                this.g.setSoTimeout(n2);
            }
            catch (SocketException socketException) {
                // empty catch block
            }
        }
    }

    public int e() {
        if (this.g != null) {
            try {
                return this.g.getSoTimeout();
            }
            catch (SocketException socketException) {
                return -1;
            }
        }
        return -1;
    }

    public void f() {
        this.f = false;
        Socket socket = this.g;
        if (socket != null) {
            socket.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        if (!this.f) {
            return;
        }
        this.f = false;
        Socket socket = this.g;
        try {
            this.a.j();
            this.b.a();
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int a(int n2) {
        int n3 = this.g.getSoTimeout();
        try {
            this.g.setSoTimeout(n2);
            int n4 = this.a.e();
            return n4;
        }
        finally {
            this.g.setSoTimeout(n3);
        }
    }

    protected boolean c(int n2) {
        if (this.a.i()) {
            return true;
        }
        this.a(n2);
        return this.a.i();
    }

    public boolean d() {
        if (!this.c()) {
            return true;
        }
        try {
            int n2 = this.a(1);
            return n2 < 0;
        }
        catch (SocketTimeoutException socketTimeoutException) {
            return false;
        }
        catch (IOException iOException) {
            return true;
        }
    }

    protected void q() {
        this.c.f();
    }

    protected void r() {
        this.c.g();
    }

    public m g() {
        return this.c;
    }

    public String toString() {
        if (this.g != null) {
            StringBuilder stringBuilder = new StringBuilder();
            SocketAddress socketAddress = this.g.getRemoteSocketAddress();
            SocketAddress socketAddress2 = this.g.getLocalSocketAddress();
            if (socketAddress != null && socketAddress2 != null) {
                j.a(stringBuilder, socketAddress2);
                stringBuilder.append("<->");
                j.a(stringBuilder, socketAddress);
            }
            return stringBuilder.toString();
        }
        return "[Not bound]";
    }
}

