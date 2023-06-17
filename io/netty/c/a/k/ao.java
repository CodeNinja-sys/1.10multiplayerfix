/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.br;
import io.netty.c.a.d.h;
import io.netty.c.a.d.u;
import io.netty.c.a.d.v;
import io.netty.c.a.d.w;
import io.netty.c.a.k.aj;
import io.netty.c.a.k.am;
import io.netty.c.a.k.aq;
import io.netty.c.a.k.ay;
import io.netty.c.a.k.bm;
import io.netty.c.a.k.bn;
import io.netty.c.a.k.bo;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.i;
import io.netty.c.a.k.m;
import io.netty.c.a.k.p;
import io.netty.c.a.k.q;
import io.netty.c.a.k.r;
import io.netty.c.a.t;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ao
extends t {
    private final boolean a;
    private final int b;
    private final int c;
    private final Map d;

    public ao(bp bp2, int n2) {
        this(bp2, n2, new HashMap(), true);
    }

    public ao(bp bp2, int n2, boolean bl2) {
        this(bp2, n2, new HashMap(), bl2);
    }

    protected ao(bp bp2, int n2, Map map) {
        this(bp2, n2, map, true);
    }

    protected ao(bp bp2, int n2, Map map, boolean bl2) {
        if (bp2 == null) {
            throw new NullPointerException("version");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxContentLength must be a positive integer: " + n2);
        }
        this.b = bp2.a();
        this.c = n2;
        this.d = map;
        this.a = bl2;
    }

    protected u a(int n2, u u2) {
        return this.d.put(n2, u2);
    }

    protected u a(int n2) {
        return (u)this.d.get(n2);
    }

    protected u b(int n2) {
        return (u)this.d.remove(n2);
    }

    protected void a(bd bd2, r r2, List list) {
        block32: {
            if (r2 instanceof bo) {
                bo bo2 = (bo)r2;
                int n2 = bo2.h();
                if (p.a(n2)) {
                    int n3 = bo2.g();
                    if (n3 == 0) {
                        i i2 = new i(n2, bm.b);
                        bd2.d(i2);
                        return;
                    }
                    String string = aj.h(this.b, bo2);
                    if (string == null) {
                        i i3 = new i(n2, bm.a);
                        bd2.d(i3);
                        return;
                    }
                    if (bo2.c()) {
                        i i4 = new i(n2, bm.f);
                        bd2.d(i4);
                        return;
                    }
                    try {
                        w w2 = ao.a(bd2, this.b, bo2, this.a);
                        aq.a((av)w2, n2);
                        aq.b((av)w2, n3);
                        aq.a((av)w2, bo2.j());
                        aq.a((av)w2, string);
                        if (bo2.i()) {
                            ar.b((av)w2, 0L);
                            list.add(w2);
                            break block32;
                        }
                        this.a(n2, w2);
                    }
                    catch (Exception exception) {
                        i i5 = new i(n2, bm.a);
                        bd2.d(i5);
                    }
                } else {
                    if (bo2.c()) {
                        m m2 = new m(n2);
                        m2.c(true);
                        aj.a(this.b, (am)m2, io.netty.c.a.d.bp.R);
                        aj.a(this.b, (am)m2, br.a);
                        bd2.d(m2);
                        return;
                    }
                    try {
                        v v2 = ao.a(this.b, bo2);
                        aq.a((av)v2, n2);
                        if (bo2.i()) {
                            list.add(v2);
                            break block32;
                        }
                        this.a(n2, v2);
                    }
                    catch (Exception exception) {
                        m m3 = new m(n2);
                        m3.c(true);
                        aj.a(this.b, (am)m3, io.netty.c.a.d.bp.s);
                        aj.a(this.b, (am)m3, br.a);
                        bd2.d(m3);
                    }
                }
            } else if (r2 instanceof bn) {
                bn bn2 = (bn)r2;
                int n4 = bn2.h();
                if (bn2.c()) {
                    i i6 = new i(n4, bm.f);
                    bd2.d(i6);
                    return;
                }
                try {
                    w w3 = ao.a(bd2, this.b, bn2, this.a);
                    aq.a((av)w3, n4);
                    if (bn2.i()) {
                        ar.b((av)w3, 0L);
                        list.add(w3);
                        break block32;
                    }
                    this.a(n4, w3);
                }
                catch (Exception exception) {
                    i i7 = new i(n4, bm.a);
                    bd2.d(i7);
                }
            } else if (r2 instanceof am) {
                am am2 = (am)r2;
                int n5 = am2.h();
                u u2 = this.a(n5);
                if (u2 == null) {
                    return;
                }
                if (!am2.c()) {
                    for (Map.Entry entry : am2.e()) {
                        u2.q().a((String)entry.getKey(), entry.getValue());
                    }
                }
                if (am2.i()) {
                    ar.b((av)u2, u2.a().r());
                    this.b(n5);
                    list.add(u2);
                }
            } else if (r2 instanceof q) {
                q q2 = (q)r2;
                int n6 = q2.h();
                u u3 = this.a(n6);
                if (u3 == null) {
                    return;
                }
                g g2 = u3.a();
                if (g2.r() > this.c - q2.a().r()) {
                    this.b(n6);
                    throw new y("HTTP content length exceeded " + this.c + " bytes.");
                }
                g g3 = q2.a();
                int n7 = g3.r();
                g2.b(g3, g3.p(), n7);
                if (q2.i()) {
                    ar.b((av)u3, g2.r());
                    this.b(n6);
                    list.add(u3);
                }
            } else if (r2 instanceof ay) {
                ay ay2 = (ay)r2;
                int n8 = ay2.h();
                this.b(n8);
            }
        }
    }

    private static v a(int n2, am am2) {
        aj aj2 = am2.e();
        aw aw2 = aj.b(n2, am2);
        String string = aj.h(n2, am2);
        br br2 = aj.j(n2, am2);
        aj.a(n2, am2);
        aj.g(n2, am2);
        aj.i(n2, am2);
        h h2 = new h(br2, aw2, string);
        aj.c(n2, am2);
        String string2 = aj2.b(":host");
        aj2.a(":host");
        h2.q().b("Host", (Object)string2);
        for (Map.Entry entry : am2.e()) {
            h2.q().a((String)entry.getKey(), entry.getValue());
        }
        ar.a((av)h2, true);
        h2.q().a("Transfer-Encoding");
        return h2;
    }

    private static w a(bd bd2, int n2, am am2, boolean bl2) {
        io.netty.c.a.d.bp bp2 = aj.f(n2, am2);
        br br2 = aj.j(n2, am2);
        aj.e(n2, am2);
        aj.i(n2, am2);
        io.netty.c.a.d.i i2 = new io.netty.c.a.d.i(br2, bp2, bd2.d().a(), bl2);
        for (Map.Entry entry : am2.e()) {
            i2.q().a((String)entry.getKey(), entry.getValue());
        }
        ar.a((av)i2, true);
        i2.q().a("Transfer-Encoding");
        i2.q().a("Trailer");
        return i2;
    }
}

