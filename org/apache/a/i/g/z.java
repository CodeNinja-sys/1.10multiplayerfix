/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.net.Socket;
import org.apache.a.i.g.c;
import org.apache.a.j.b;
import org.apache.a.l.j;
import org.apache.a.o.a;

public class z
extends c
implements b {
    private final Socket a;
    private boolean b;

    public z(Socket socket, int n2, j j2) {
        org.apache.a.o.a.a(socket, "Socket");
        this.a = socket;
        this.b = false;
        int n3 = n2;
        if (n3 < 0) {
            n3 = socket.getReceiveBufferSize();
        }
        if (n3 < 1024) {
            n3 = 1024;
        }
        this.a(socket.getInputStream(), n3, j2);
    }

    protected int i() {
        int n2 = super.i();
        this.b = n2 == -1;
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(int n2) {
        boolean bl2 = this.j();
        if (!bl2) {
            int n3 = this.a.getSoTimeout();
            try {
                this.a.setSoTimeout(n2);
                this.i();
                bl2 = this.j();
            }
            finally {
                this.a.setSoTimeout(n3);
            }
        }
        return bl2;
    }

    public boolean d() {
        return this.b;
    }
}

