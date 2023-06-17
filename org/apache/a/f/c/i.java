/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.a.f.c.b;
import org.apache.a.f.c.g;
import org.apache.a.l.j;

class i
implements g {
    private final b a;

    i(b b2) {
        this.a = b2;
    }

    public Socket a(j j2) {
        return this.a.a(j2);
    }

    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, j j2) {
        return this.a.a(socket, inetSocketAddress, inetSocketAddress2, j2);
    }

    public boolean a(Socket socket) {
        return this.a.a(socket);
    }

    public Socket a(Socket socket, String string, int n2, j j2) {
        return this.a.a(socket, string, n2, true);
    }
}

