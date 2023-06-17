/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.b.g;
import io.netty.c.a.c.a;
import io.netty.c.a.c.q;
import io.netty.c.a.p;
import io.netty.channel.bd;

public class w
extends p {
    private static final int a = 18;
    private static final byte[] b = new byte[]{-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};
    private final q c = new q();
    private boolean d;

    protected void a(bd bd2, g g2, g g3) {
        block6: {
            int n2;
            if (!g2.u()) {
                return;
            }
            if (!this.d) {
                this.d = true;
                g3.c(b);
            }
            if ((n2 = g2.r()) > 18) {
                g g4;
                int n3;
                while (true) {
                    n3 = g3.q() + 1;
                    if (n2 < 18) {
                        g4 = g2.z(n2);
                        w.a(g4, g3, n2);
                        break block6;
                    }
                    g3.E(0);
                    if (n2 <= 32767) break;
                    g4 = g2.z(32767);
                    w.a(g4, g3);
                    this.c.a(g4, g3, 32767);
                    w.a(g3, n3);
                    n2 -= 32767;
                }
                g4 = g2.z(n2);
                w.a(g4, g3);
                this.c.a(g4, g3, n2);
                w.a(g3, n3);
            } else {
                w.a(g2, g3, n2);
            }
        }
    }

    private static void a(g g2, g g3, int n2) {
        g3.B(1);
        w.b(g3, n2 + 4);
        w.a(g2, g3);
        g3.b(g2, n2);
    }

    private static void a(g g2, int n2) {
        int n3 = g2.q() - n2 - 3;
        if (n3 >>> 24 != 0) {
            throw new a("compressed data too large: " + n3);
        }
        g2.d(n2, io.netty.b.w.a(n3));
    }

    private static void b(g g2, int n2) {
        g2.D(io.netty.b.w.a(n2));
    }

    private static void a(g g2, g g3) {
        g3.E(io.netty.b.w.b(q.a(g2)));
    }
}

