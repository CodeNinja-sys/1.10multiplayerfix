/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.a;
import io.netty.c.a.j.aj;
import io.netty.c.a.j.am;
import io.netty.c.a.j.q;
import io.netty.c.a.j.u;
import io.netty.c.a.j.v;
import io.netty.c.a.j.x;
import io.netty.c.a.w;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.util.e;
import java.util.List;

public class s
extends w {
    private static final String c = "SOCKS_CMD_RESPONSE_DECODER";
    private aj d;
    private int e;
    private v f;
    private a h;
    private byte i;
    private String j;
    private int k;
    private am l = x.b;

    public static String f() {
        return c;
    }

    public s() {
        super((Object)u.a);
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        block0 : switch ((u)((Object)this.e())) {
            case a: {
                this.d = aj.b(g2.E());
                if (this.d != aj.b) break;
                this.a((Object)u.b);
            }
            case b: {
                this.f = v.b(g2.E());
                this.i = g2.E();
                this.h = a.b(g2.E());
                this.a((Object)u.c);
            }
            case c: {
                switch (this.h) {
                    case a: {
                        this.j = x.a(g2.K());
                        this.k = g2.H();
                        this.l = new q(this.f, this.h, this.j, this.k);
                        break block0;
                    }
                    case b: {
                        this.e = g2.E();
                        this.j = g2.y(this.e).a(io.netty.util.e.f);
                        this.k = g2.H();
                        this.l = new q(this.f, this.h, this.j, this.k);
                        break block0;
                    }
                    case c: {
                        this.j = x.b(g2.y(16).X());
                        this.k = g2.H();
                        this.l = new q(this.f, this.h, this.j, this.k);
                        break block0;
                    }
                }
            }
        }
        bd2.c().a((ba)this);
        list.add(this.l);
    }
}

