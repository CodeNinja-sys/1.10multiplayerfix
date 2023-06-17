/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.c.a.k.ad;
import io.netty.c.a.k.am;
import io.netty.c.a.k.ax;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.p;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

final class ah
extends ad {
    private static final int a = 4096;
    private static final ax b = new ax("Invalid Header Block");
    private final Inflater c = new Inflater();
    private g d;

    ah(bp bp2, int n2) {
        super(bp2, n2);
    }

    @Override
    void a(g g2, am am2) {
        int n2;
        int n3 = this.a(g2);
        while ((n2 = this.a(g2.l(), am2)) > 0) {
        }
        if (this.c.getRemaining() != 0) {
            throw b;
        }
        g2.A(n3);
    }

    private int a(g g2) {
        int n2 = g2.r();
        if (g2.W()) {
            this.c.setInput(g2.X(), g2.Y() + g2.p(), n2);
        } else {
            byte[] arrby = new byte[n2];
            g2.a(g2.p(), arrby);
            this.c.setInput(arrby, 0, arrby.length);
        }
        return n2;
    }

    private int a(h h2, am am2) {
        this.a(h2);
        byte[] arrby = this.d.X();
        int n2 = this.d.Y() + this.d.q();
        try {
            int n3 = this.c.inflate(arrby, n2, this.d.s());
            if (n3 == 0 && this.c.needsDictionary()) {
                try {
                    this.c.setDictionary(p.y);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw b;
                }
                n3 = this.c.inflate(arrby, n2, this.d.s());
            }
            if (am2 != null) {
                this.d.h(this.d.q() + n3);
                this.b(this.d, am2);
                this.d.B();
            }
            return n3;
        }
        catch (DataFormatException dataFormatException) {
            throw new ax("Received invalid header block", dataFormatException);
        }
    }

    private void a(h h2) {
        if (this.d == null) {
            this.d = h2.c(4096);
        }
        this.d.k(1);
    }

    @Override
    void a(am am2) {
        super.a(am2);
        this.b();
    }

    @Override
    public void a() {
        super.a();
        this.b();
        this.c.end();
    }

    private void b() {
        if (this.d != null) {
            this.d.ad();
            this.d = null;
        }
    }
}

