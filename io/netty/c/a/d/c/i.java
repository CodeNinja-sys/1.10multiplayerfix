/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.c.ac;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.c.f;
import io.netty.c.a.u;
import io.netty.channel.bd;
import java.util.List;

public class i
extends u
implements af {
    private static final g a = bi.d(bi.b(1, 1).B(0));
    private static final g b = bi.d(bi.b(1, 1).B(-1));
    private static final g c = bi.d(bi.b(2, 2).B(-1).B(0));

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(bd bd2, ac ac2, List list) {
        if (ac2 instanceof f) {
            g g2 = ac2.a();
            list.add(a.S());
            list.add(g2.ab());
            list.add(b.S());
        } else if (ac2 instanceof b) {
            list.add(c.S());
        } else {
            g g3 = ac2.a();
            int n2 = g3.r();
            g g4 = bd2.d().a(5);
            boolean bl2 = true;
            try {
                g4.B(-128);
                int n3 = n2 >>> 28 & 0x7F;
                int n4 = n2 >>> 14 & 0x7F;
                int n5 = n2 >>> 7 & 0x7F;
                int n6 = n2 & 0x7F;
                if (n3 == 0) {
                    if (n4 == 0) {
                        if (n5 == 0) {
                            g4.B(n6);
                        } else {
                            g4.B(n5 | 0x80);
                            g4.B(n6);
                        }
                    } else {
                        g4.B(n4 | 0x80);
                        g4.B(n5 | 0x80);
                        g4.B(n6);
                    }
                } else {
                    g4.B(n3 | 0x80);
                    g4.B(n4 | 0x80);
                    g4.B(n5 | 0x80);
                    g4.B(n6);
                }
                list.add(g4);
                list.add(g3.ab());
                bl2 = false;
            }
            finally {
                if (bl2) {
                    g4.ad();
                }
            }
        }
    }
}

