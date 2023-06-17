/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.g;
import io.netty.c.a.d.c.a;
import io.netty.c.a.d.c.ac;
import io.netty.c.a.d.c.ae;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.c.f;
import io.netty.c.a.w;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.util.List;

public class h
extends w
implements ae {
    static final int c = 16384;
    private final long d;
    private boolean e;

    public h() {
        this(16384);
    }

    public h(int n2) {
        this.d = n2;
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        if (this.e) {
            g2.A(this.b());
            return;
        }
        byte by2 = g2.E();
        ac ac2 = (by2 & 0x80) == 128 ? this.a(bd2, by2, g2) : this.a(bd2, g2);
        if (ac2 != null) {
            list.add(ac2);
        }
    }

    private ac a(bd bd2, byte by2, g g2) {
        byte by3;
        long l2 = 0L;
        int n2 = 0;
        do {
            by3 = g2.E();
            l2 <<= 7;
            if ((l2 |= (long)(by3 & 0x7F)) > this.d) {
                throw new y();
            }
            if (++n2 <= 8) continue;
            throw new y();
        } while ((by3 & 0x80) == 128);
        if (by2 == -1 && l2 == 0L) {
            this.e = true;
            return new b();
        }
        g g3 = bd2.d().a((int)l2);
        g2.a(g3);
        return new a(g3);
    }

    private ac a(bd bd2, g g2) {
        int n2;
        int n3 = g2.p();
        int n4 = g2.a(n3, n3 + (n2 = this.b()), (byte)-1);
        if (n4 == -1) {
            if ((long)n2 > this.d) {
                throw new y();
            }
            return null;
        }
        int n5 = n4 - n3;
        if ((long)n5 > this.d) {
            throw new y();
        }
        g g3 = bd2.d().a(n5);
        g2.a(g3);
        g2.A(1);
        int n6 = g3.a(g3.p(), g3.q(), (byte)-1);
        if (n6 >= 0) {
            throw new IllegalArgumentException("a text frame should not contain 0xFF.");
        }
        return new f(g3);
    }
}

