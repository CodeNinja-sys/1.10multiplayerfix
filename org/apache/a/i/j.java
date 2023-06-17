/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.net.Socket;
import org.apache.a.i.q;
import org.apache.a.o.a;

public class j
extends q {
    public void a(Socket socket, org.apache.a.l.j j2) {
        a.a(socket, "Socket");
        a.a(j2, "HTTP parameters");
        this.w();
        socket.setTcpNoDelay(j2.a("http.tcp.nodelay", true));
        socket.setSoTimeout(j2.a("http.socket.timeout", 0));
        socket.setKeepAlive(j2.a("http.socket.keepalive", false));
        int n2 = j2.a("http.socket.linger", -1);
        if (n2 >= 0) {
            socket.setSoLinger(n2 > 0, n2);
        }
        super.a(socket, j2);
    }
}

