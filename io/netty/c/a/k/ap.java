/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.ax;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.v;
import io.netty.c.a.k.a;
import io.netty.c.a.k.aj;
import io.netty.c.a.k.am;
import io.netty.c.a.k.aq;
import io.netty.c.a.k.bl;
import io.netty.c.a.k.bn;
import io.netty.c.a.k.bo;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.g;
import io.netty.c.a.k.m;
import io.netty.c.a.k.n;
import io.netty.c.a.u;
import io.netty.c.a.z;
import io.netty.channel.bd;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ap
extends u {
    private final int a;
    private int b;

    public ap(bp bp2) {
        if (bp2 == null) {
            throw new NullPointerException("version");
        }
        this.a = bp2.a();
    }

    protected void a(bd bd2, ax ax2, List list) {
        bl bl2;
        ax ax3;
        boolean bl3 = false;
        boolean bl4 = false;
        if (ax2 instanceof bj) {
            ax3 = (bj)ax2;
            bl2 = this.a((av)ax3);
            list.add(bl2);
            bl4 = bl2.i();
            bl3 = true;
        }
        if (ax2 instanceof bm) {
            ax3 = (bm)ax2;
            if (ax3.q().d("X-SPDY-Associated-To-Stream-ID")) {
                bl2 = this.a((av)ax3);
                bl4 = bl2.i();
                list.add(bl2);
            } else {
                bl2 = this.a((bm)ax3);
                bl4 = bl2.i();
                list.add(bl2);
            }
            bl3 = true;
        }
        if (ax2 instanceof ad && !bl4) {
            ax3 = (ad)ax2;
            ax3.a().ab();
            bl2 = new a(this.b, ax3.a());
            bl2.a(ax3 instanceof bs);
            if (ax3 instanceof bs) {
                bs bs2 = (bs)ax3;
                ar ar2 = bs2.e();
                if (ar2.c()) {
                    list.add(bl2);
                } else {
                    g g2 = new g(this.b);
                    for (Map.Entry entry : ar2) {
                        g2.e().a((String)entry.getKey(), entry.getValue());
                    }
                    list.add(g2);
                    list.add(bl2);
                }
            } else {
                list.add(bl2);
            }
            bl3 = true;
        }
        if (!bl3) {
            throw new z(ax2, new Class[0]);
        }
    }

    private bo a(av av2) {
        Iterator iterator;
        int n2 = aq.b(av2);
        int n3 = aq.d(av2);
        byte by2 = aq.f(av2);
        String string = aq.h(av2);
        String string2 = aq.j(av2);
        aq.a(av2);
        aq.c(av2);
        aq.e(av2);
        aq.g(av2);
        aq.i(av2);
        av2.q().a("Connection");
        av2.q().a("Keep-Alive");
        av2.q().a("Proxy-Connection");
        av2.q().a("Transfer-Encoding");
        n n4 = new n(n2, n3, by2);
        if (av2 instanceof v) {
            iterator = (bj)av2;
            aj.a(this.a, (am)n4, iterator.s());
            aj.b(this.a, n4, iterator.t());
            aj.a(this.a, (am)n4, av2.r());
        }
        if (av2 instanceof bm) {
            iterator = (bm)av2;
            aj.a(this.a, (am)n4, iterator.s());
            aj.b(this.a, n4, string);
            aj.a(this.a, (am)n4, av2.r());
            n4.d(true);
        }
        if (this.a >= 3) {
            iterator = ar.d(av2);
            av2.q().a("Host");
            aj.b(n4, (String)((Object)iterator));
        }
        if (string2 == null) {
            string2 = "https";
        }
        aj.a(this.a, (am)n4, string2);
        for (Map.Entry entry : av2.q()) {
            n4.e().a((String)entry.getKey(), entry.getValue());
        }
        this.b = n4.h();
        n4.c(ap.b(av2));
        return n4;
    }

    private bn a(bm bm2) {
        int n2 = aq.b(bm2);
        aq.a(bm2);
        bm2.q().a("Connection");
        bm2.q().a("Keep-Alive");
        bm2.q().a("Proxy-Connection");
        bm2.q().a("Transfer-Encoding");
        m m2 = new m(n2);
        aj.a(this.a, (am)m2, bm2.s());
        aj.a(this.a, (am)m2, bm2.r());
        for (Map.Entry entry : bm2.q()) {
            m2.e().a((String)entry.getKey(), entry.getValue());
        }
        this.b = n2;
        m2.c(ap.b(bm2));
        return m2;
    }

    private static boolean b(av av2) {
        io.netty.c.a.d.u u2;
        return av2 instanceof io.netty.c.a.d.u && (u2 = (io.netty.c.a.d.u)av2).e().c() && !u2.a().u();
    }
}

