/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.net.Socket;
import org.apache.a.f.c.b;
import org.apache.a.f.c.c;
import org.apache.a.f.c.n;

class d
extends n
implements c {
    private final b a;

    d(b b2) {
        super(b2);
        this.a = b2;
    }

    public Socket b(Socket socket, String string, int n2, boolean bl2) {
        return this.a.a(socket, string, n2, bl2);
    }
}

