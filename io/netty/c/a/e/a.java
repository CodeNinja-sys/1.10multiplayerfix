/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.ByteInput
 */
package io.netty.c.a.e;

import io.netty.b.g;
import org.jboss.marshalling.ByteInput;

class a
implements ByteInput {
    private final g a;

    a(g g2) {
        this.a = g2;
    }

    public void a() {
    }

    public int b() {
        return this.a.r();
    }

    public int c() {
        if (this.a.u()) {
            return this.a.E() & 0xFF;
        }
        return -1;
    }

    public int a(byte[] arrby) {
        return this.a(arrby, 0, arrby.length);
    }

    public int a(byte[] arrby, int n2, int n3) {
        int n4 = this.b();
        if (n4 == 0) {
            return -1;
        }
        n3 = Math.min(n4, n3);
        this.a.a(arrby, n2, n3);
        return n3;
    }

    public long a(long l2) {
        int n2 = this.a.r();
        if ((long)n2 < l2) {
            l2 = n2;
        }
        this.a.g((int)((long)this.a.p() + l2));
        return l2;
    }
}

