/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.net.Socket;
import org.apache.a.i.g.d;
import org.apache.a.l.j;
import org.apache.a.o.a;

public class aa
extends d {
    public aa(Socket socket, int n2, j j2) {
        a.a(socket, "Socket");
        int n3 = n2;
        if (n3 < 0) {
            n3 = socket.getSendBufferSize();
        }
        if (n3 < 1024) {
            n3 = 1024;
        }
        this.a(socket.getOutputStream(), n3, j2);
    }
}

