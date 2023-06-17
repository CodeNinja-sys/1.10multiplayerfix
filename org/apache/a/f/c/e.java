/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.a.f.c.a;
import org.apache.a.f.c.k;
import org.apache.a.f.c.m;
import org.apache.a.f.g;
import org.apache.a.l.h;
import org.apache.a.l.j;

public class e
implements k,
m {
    private final a a;

    public static e a() {
        return new e();
    }

    public e(a a2) {
        this.a = a2;
    }

    public e() {
        this.a = null;
    }

    public Socket a(j j2) {
        return new Socket();
    }

    public Socket b() {
        return new Socket();
    }

    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, j j2) {
        org.apache.a.o.a.a(inetSocketAddress, "Remote address");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        Socket socket2 = socket;
        if (socket2 == null) {
            socket2 = this.b();
        }
        if (inetSocketAddress2 != null) {
            socket2.setReuseAddress(h.b(j2));
            socket2.bind(inetSocketAddress2);
        }
        int n2 = h.f(j2);
        int n3 = h.a(j2);
        try {
            socket2.setSoTimeout(n3);
            socket2.connect(inetSocketAddress, n2);
        }
        catch (SocketTimeoutException socketTimeoutException) {
            throw new g("Connect to " + inetSocketAddress + " timed out");
        }
        return socket2;
    }

    public final boolean a(Socket socket) {
        return false;
    }

    public Socket a(Socket socket, String string, int n2, InetAddress inetAddress, int n3, j j2) {
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || n3 > 0) {
            inetSocketAddress = new InetSocketAddress(inetAddress, n3 > 0 ? n3 : 0);
        }
        InetAddress inetAddress2 = this.a != null ? this.a.a(string) : InetAddress.getByName(string);
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress(inetAddress2, n2);
        return this.a(socket, inetSocketAddress2, inetSocketAddress, j2);
    }
}

