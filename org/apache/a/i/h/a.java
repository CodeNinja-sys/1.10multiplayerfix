/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.h;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.a.e.h;
import org.apache.a.i.e;
import org.apache.a.i.f;
import org.apache.a.j;
import org.apache.a.l;
import org.apache.a.l.i;
import org.apache.a.r;

public class a
implements org.apache.a.m.f {
    private final SocketFactory a;
    private final SSLSocketFactory b;
    private final int c;
    private final h d;
    private final l e;

    public a(SSLSocketFactory sSLSocketFactory, org.apache.a.l.j j2) {
        org.apache.a.o.a.a(j2, "HTTP params");
        this.a = null;
        this.b = sSLSocketFactory;
        this.c = j2.a("http.connection.timeout", 0);
        this.d = i.a(j2);
        this.e = new f(i.c(j2));
    }

    public a(org.apache.a.l.j j2) {
        this(null, j2);
    }

    public a(SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, int n2, h h2, org.apache.a.e.a a2) {
        this.a = socketFactory;
        this.b = sSLSocketFactory;
        this.c = n2;
        this.d = h2 != null ? h2 : h.a;
        this.e = new f(a2 != null ? a2 : org.apache.a.e.a.a);
    }

    public a(int n2, h h2, org.apache.a.e.a a2) {
        this(null, null, n2, h2, a2);
    }

    public a(h h2, org.apache.a.e.a a2) {
        this(null, null, 0, h2, a2);
    }

    public a() {
        this(null, null, 0, h.a, org.apache.a.e.a.a);
    }

    protected j a(Socket socket, org.apache.a.l.j j2) {
        int n2 = j2.a("http.socket.buffer-size", 8192);
        e e2 = new e(n2);
        e2.a(socket);
        return e2;
    }

    public j a(r r2) {
        String string = r2.c();
        Socket socket = null;
        if ("http".equalsIgnoreCase(string)) {
            Socket socket2 = socket = this.a != null ? this.a.createSocket() : new Socket();
        }
        if ("https".equalsIgnoreCase(string)) {
            socket = (this.b != null ? this.b : SSLSocketFactory.getDefault()).createSocket();
        }
        if (socket == null) {
            throw new IOException(string + " scheme is not supported");
        }
        String string2 = r2.a();
        int n2 = r2.b();
        if (n2 == -1) {
            if (r2.c().equalsIgnoreCase("http")) {
                n2 = 80;
            } else if (r2.c().equalsIgnoreCase("https")) {
                n2 = 443;
            }
        }
        socket.setSoTimeout(this.d.a());
        socket.connect(new InetSocketAddress(string2, n2), this.c);
        socket.setTcpNoDelay(this.d.e());
        int n3 = this.d.c();
        if (n3 >= 0) {
            socket.setSoLinger(n3 > 0, n3);
        }
        socket.setKeepAlive(this.d.d());
        return (j)this.e.a(socket);
    }
}

