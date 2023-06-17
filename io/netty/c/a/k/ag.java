/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.k.ab;
import io.netty.c.a.k.am;
import io.netty.c.a.k.bp;
import java.util.Set;

public class ag
extends ab {
    private final int a;

    public ag(bp bp2) {
        if (bp2 == null) {
            throw new NullPointerException("version");
        }
        this.a = bp2.a();
    }

    private static void a(g g2, int n2, int n3) {
        g2.e(n2, n3);
    }

    private static void a(g g2, int n2) {
        g2.E(n2);
    }

    @Override
    public g a(am am2) {
        Set set = am2.e().c();
        int n2 = set.size();
        if (n2 == 0) {
            return bi.c;
        }
        if (n2 > 65535) {
            throw new IllegalArgumentException("header block contains too many headers");
        }
        g g2 = bi.a();
        ag.a(g2, n2);
        for (String string : set) {
            byte[] arrby = string.getBytes("UTF-8");
            ag.a(g2, arrby.length);
            g2.c(arrby);
            int n3 = g2.q();
            int n4 = 0;
            ag.a(g2, n4);
            for (String string2 : am2.e().c(string)) {
                byte[] arrby2 = string2.getBytes("UTF-8");
                if (arrby2.length <= 0) continue;
                g2.c(arrby2);
                g2.B(0);
                n4 += arrby2.length + 1;
            }
            if (n4 != 0) {
                --n4;
            }
            if (n4 > 65535) {
                throw new IllegalArgumentException("header exceeds allowable length: " + string);
            }
            if (n4 <= 0) continue;
            ag.a(g2, n3, n4);
            g2.h(g2.q() - 1);
        }
        return g2;
    }

    @Override
    void a() {
    }
}

