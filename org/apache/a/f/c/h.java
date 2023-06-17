/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.net.Socket;
import org.apache.a.f.c.c;
import org.apache.a.f.c.g;
import org.apache.a.f.c.l;
import org.apache.a.l.j;

class h
extends l
implements g {
    private final c a;

    h(c c2) {
        super(c2);
        this.a = c2;
    }

    public Socket a(Socket socket, String string, int n2, j j2) {
        return this.a.b(socket, string, n2, true);
    }
}

