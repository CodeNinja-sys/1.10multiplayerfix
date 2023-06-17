/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.a.f.c.k;
import org.apache.a.f.c.m;
import org.apache.a.l.j;

class l
implements k {
    private final m a;

    l(m m2) {
        this.a = m2;
    }

    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, j j2) {
        String string = inetSocketAddress.getHostName();
        int n2 = inetSocketAddress.getPort();
        InetAddress inetAddress = null;
        int n3 = 0;
        if (inetSocketAddress2 != null) {
            inetAddress = inetSocketAddress2.getAddress();
            n3 = inetSocketAddress2.getPort();
        }
        return this.a.a(socket, string, n2, inetAddress, n3, j2);
    }

    public Socket a(j j2) {
        return this.a.b();
    }

    public boolean a(Socket socket) {
        return this.a.a(socket);
    }

    public m a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (object instanceof l) {
            return this.a.equals(((l)object).a);
        }
        return this.a.equals(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

