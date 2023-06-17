/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.a.f.c.f;
import org.apache.a.f.c.k;
import org.apache.a.f.e;
import org.apache.a.f.w;
import org.apache.a.i.c.aw;
import org.apache.a.i.c.l;
import org.apache.a.l.h;
import org.apache.a.l.j;
import org.apache.a.n.g;
import org.apache.a.o.b;
import org.apache.a.r;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class m
implements e {
    private final a c = org.apache.commons.d.c.b(this.getClass());
    protected final org.apache.a.f.c.j a;
    protected final org.apache.a.f.l b;

    public m(org.apache.a.f.c.j j2) {
        org.apache.a.o.a.a(j2, "Scheme registry");
        this.a = j2;
        this.b = new aw();
    }

    public m(org.apache.a.f.c.j j2, org.apache.a.f.l l2) {
        org.apache.a.o.a.a(j2, "Scheme registry");
        org.apache.a.o.a.a(l2, "DNS resolver");
        this.a = j2;
        this.b = l2;
    }

    public w a() {
        return new l();
    }

    private org.apache.a.f.c.j a(g g2) {
        org.apache.a.f.c.j j2 = (org.apache.a.f.c.j)g2.a("http.scheme-registry");
        if (j2 == null) {
            j2 = this.a;
        }
        return j2;
    }

    public void a(w w2, r r2, InetAddress inetAddress, g g2, j j2) {
        org.apache.a.o.a.a(w2, "Connection");
        org.apache.a.o.a.a(r2, "Target host");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        org.apache.a.o.b.a(!w2.c(), "Connection must not be open");
        org.apache.a.f.c.j j3 = this.a(g2);
        f f2 = j3.a(r2.c());
        k k2 = f2.c();
        InetAddress[] arrinetAddress = this.a(r2.a());
        int n2 = f2.a(r2.b());
        for (int i2 = 0; i2 < arrinetAddress.length; ++i2) {
            org.apache.a.f.r r3;
            block8: {
                InetAddress inetAddress2 = arrinetAddress[i2];
                boolean bl2 = i2 == arrinetAddress.length - 1;
                Socket socket = k2.a(j2);
                w2.a(socket, r2);
                r3 = new org.apache.a.f.r(r2, inetAddress2, n2);
                InetSocketAddress inetSocketAddress = null;
                if (inetAddress != null) {
                    inetSocketAddress = new InetSocketAddress(inetAddress, 0);
                }
                if (this.c.a()) {
                    this.c.b("Connecting to " + r3);
                }
                try {
                    Socket socket2 = k2.a(socket, r3, inetSocketAddress, j2);
                    if (socket != socket2) {
                        socket = socket2;
                        w2.a(socket, r2);
                    }
                    this.a(socket, g2, j2);
                    w2.a(k2.a(socket), j2);
                    return;
                }
                catch (ConnectException connectException) {
                    if (bl2) {
                        throw connectException;
                    }
                }
                catch (org.apache.a.f.g g3) {
                    if (!bl2) break block8;
                    throw g3;
                }
            }
            if (!this.c.a()) continue;
            this.c.b("Connect to " + r3 + " timed out. " + "Connection will be retried using another IP address");
        }
    }

    public void a(w w2, r r2, g g2, j j2) {
        org.apache.a.o.a.a(w2, "Connection");
        org.apache.a.o.a.a(r2, "Target host");
        org.apache.a.o.a.a(j2, "Parameters");
        org.apache.a.o.b.a(w2.c(), "Connection must be open");
        org.apache.a.f.c.j j3 = this.a(g2);
        f f2 = j3.a(r2.c());
        org.apache.a.o.b.a(f2.c() instanceof org.apache.a.f.c.g, "Socket factory must implement SchemeLayeredSocketFactory");
        org.apache.a.f.c.g g3 = (org.apache.a.f.c.g)f2.c();
        Socket socket = g3.a(w2.t(), r2.a(), f2.a(r2.b()), j2);
        this.a(socket, g2, j2);
        w2.a(socket, r2, g3.a(socket), j2);
    }

    protected void a(Socket socket, g g2, j j2) {
        socket.setTcpNoDelay(h.c(j2));
        socket.setSoTimeout(h.a(j2));
        int n2 = h.e(j2);
        if (n2 >= 0) {
            socket.setSoLinger(n2 > 0, n2);
        }
    }

    protected InetAddress[] a(String string) {
        return this.b.a(string);
    }
}

