/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.a.e.h;
import org.apache.a.f.d.a;
import org.apache.a.f.d.b;
import org.apache.a.f.l;
import org.apache.a.f.q;
import org.apache.a.f.x;
import org.apache.a.f.y;
import org.apache.a.i.c.aw;
import org.apache.a.i.c.u;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.commons.d.c;

class v {
    static final String a = "http.socket-factory-registry";
    private final org.apache.commons.d.a b = org.apache.commons.d.c.b(this.getClass());
    private final org.apache.a.e.c c;
    private final x d;
    private final l e;

    v(org.apache.a.e.c c2, x x2, l l2) {
        org.apache.a.o.a.a(c2, "Socket factory registry");
        this.c = c2;
        this.d = x2 != null ? x2 : u.a;
        this.e = l2 != null ? l2 : aw.a;
    }

    private org.apache.a.e.c a(g g2) {
        org.apache.a.e.c c2 = (org.apache.a.e.c)g2.a(a);
        if (c2 == null) {
            c2 = this.c;
        }
        return c2;
    }

    public void a(org.apache.a.f.u u2, r r2, InetSocketAddress inetSocketAddress, int n2, h h2, g g2) {
        org.apache.a.e.c c2 = this.a(g2);
        a a2 = (a)c2.c(r2.c());
        if (a2 == null) {
            throw new y(r2.c() + " protocol is not supported");
        }
        InetAddress[] arrinetAddress = this.e.a(r2.a());
        int n3 = this.d.a(r2);
        for (int i2 = 0; i2 < arrinetAddress.length; ++i2) {
            InetSocketAddress inetSocketAddress2;
            block10: {
                InetAddress inetAddress = arrinetAddress[i2];
                boolean bl2 = i2 == arrinetAddress.length - 1;
                Socket socket = a2.a(g2);
                socket.setReuseAddress(h2.b());
                u2.a(socket);
                inetSocketAddress2 = new InetSocketAddress(inetAddress, n3);
                if (this.b.a()) {
                    this.b.b("Connecting to " + inetSocketAddress2);
                }
                try {
                    socket.setSoTimeout(h2.a());
                    socket = a2.a(n2, socket, r2, inetSocketAddress2, inetSocketAddress, g2);
                    socket.setTcpNoDelay(h2.e());
                    socket.setKeepAlive(h2.d());
                    int n4 = h2.c();
                    if (n4 >= 0) {
                        socket.setSoLinger(n4 > 0, n4);
                    }
                    u2.a(socket);
                    if (this.b.a()) {
                        this.b.b("Connection established " + u2);
                    }
                    return;
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    if (bl2) {
                        throw new org.apache.a.f.g(socketTimeoutException, r2, arrinetAddress);
                    }
                }
                catch (ConnectException connectException) {
                    if (!bl2) break block10;
                    String string = connectException.getMessage();
                    if ("Connection timed out".equals(string)) {
                        throw new org.apache.a.f.g(connectException, r2, arrinetAddress);
                    }
                    throw new q(connectException, r2, arrinetAddress);
                }
            }
            if (!this.b.a()) continue;
            this.b.b("Connect to " + inetSocketAddress2 + " timed out. " + "Connection will be retried using another IP address");
        }
    }

    public void a(org.apache.a.f.u u2, r r2, g g2) {
        org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2);
        org.apache.a.e.c c3 = this.a(c2);
        a a2 = (a)c3.c(r2.c());
        if (a2 == null) {
            throw new y(r2.c() + " protocol is not supported");
        }
        if (!(a2 instanceof b)) {
            throw new y(r2.c() + " protocol does not support connection upgrade");
        }
        b b2 = (b)a2;
        Socket socket = u2.t();
        int n2 = this.d.a(r2);
        socket = b2.a(socket, r2.a(), n2, g2);
        u2.a(socket);
    }
}

