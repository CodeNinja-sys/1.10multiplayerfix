/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.jcraft.jzlib.Deflater
 *  com.jcraft.jzlib.JZlib
 */
package io.netty.c.a.k;

import com.jcraft.jzlib.Deflater;
import com.jcraft.jzlib.JZlib;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.c.a;
import io.netty.c.a.k.ag;
import io.netty.c.a.k.am;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.p;

class ac
extends ag {
    private final Deflater a = new Deflater();
    private boolean b;

    ac(bp bp2, int n2, int n3, int n4) {
        super(bp2);
        if (n2 < 0 || n2 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + n2 + " (expected: 0-9)");
        }
        if (n3 < 9 || n3 > 15) {
            throw new IllegalArgumentException("windowBits: " + n3 + " (expected: 9-15)");
        }
        if (n4 < 1 || n4 > 9) {
            throw new IllegalArgumentException("memLevel: " + n4 + " (expected: 1-9)");
        }
        int n5 = this.a.deflateInit(n2, n3, n4, JZlib.W_ZLIB);
        if (n5 != 0) {
            throw new a("failed to initialize an SPDY header block deflater: " + n5);
        }
        n5 = this.a.deflateSetDictionary(p.y, p.y.length);
        if (n5 != 0) {
            throw new a("failed to set the SPDY dictionary: " + n5);
        }
    }

    private void a(g g2) {
        byte[] arrby = new byte[g2.r()];
        g2.b(arrby);
        this.a.next_in = arrby;
        this.a.next_in_index = 0;
        this.a.avail_in = arrby.length;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(g g2) {
        try {
            byte[] arrby = new byte[(int)Math.ceil((double)this.a.next_in.length * 1.001) + 12];
            this.a.next_out = arrby;
            this.a.next_out_index = 0;
            this.a.avail_out = arrby.length;
            int n2 = this.a.deflate(2);
            if (n2 != 0) {
                throw new a("compression failure: " + n2);
            }
            if (this.a.next_out_index != 0) {
                g2.b(arrby, 0, this.a.next_out_index);
            }
        }
        finally {
            this.a.next_in = null;
            this.a.next_out = null;
        }
    }

    @Override
    public g a(am am2) {
        if (am2 == null) {
            throw new IllegalArgumentException("frame");
        }
        if (this.b) {
            return bi.c;
        }
        g g2 = super.a(am2);
        if (g2.r() == 0) {
            return bi.c;
        }
        g g3 = g2.l().a();
        this.a(g2);
        this.b(g3);
        return g3;
    }

    @Override
    public void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.deflateEnd();
        this.a.next_in = null;
        this.a.next_out = null;
    }
}

