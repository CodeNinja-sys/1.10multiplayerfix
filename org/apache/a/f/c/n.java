/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.a.f.c.k;
import org.apache.a.f.c.m;
import org.apache.a.l.b;
import org.apache.a.l.j;

class n
implements m {
    private final k a;

    n(k k2) {
        this.a = k2;
    }

    public Socket b() {
        b b2 = new b();
        return this.a.a(b2);
    }

    public Socket a(Socket socket, String string, int n2, InetAddress inetAddress, int n3, j j2) {
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || n3 > 0) {
            inetSocketAddress = new InetSocketAddress(inetAddress, n3 > 0 ? n3 : 0);
        }
        InetAddress inetAddress2 = InetAddress.getByName(string);
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress(inetAddress2, n2);
        return this.a.a(socket, inetSocketAddress2, inetSocketAddress, j2);
    }

    public boolean a(Socket socket) {
        return this.a.a(socket);
    }

    public k a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (object instanceof n) {
            return this.a.equals(((n)object).a);
        }
        return this.a.equals(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

