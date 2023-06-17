/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.ByteOutput
 */
package io.netty.c.a.e;

import io.netty.b.g;
import org.jboss.marshalling.ByteOutput;

class b
implements ByteOutput {
    private final g a;

    b(g g2) {
        this.a = g2;
    }

    public void a() {
    }

    public void b() {
    }

    public void a(int n2) {
        this.a.B(n2);
    }

    public void a(byte[] arrby) {
        this.a.c(arrby);
    }

    public void a(byte[] arrby, int n2, int n3) {
        this.a.b(arrby, n2, n3);
    }

    g c() {
        return this.a;
    }
}

