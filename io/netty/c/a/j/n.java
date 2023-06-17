/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.a;
import io.netty.c.a.j.aj;
import io.netty.c.a.j.ak;
import io.netty.c.a.j.l;
import io.netty.c.a.j.p;
import io.netty.c.a.j.w;
import io.netty.c.a.j.x;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.util.e;
import java.util.List;

public class n
extends io.netty.c.a.w {
    private static final String c = "SOCKS_CMD_REQUEST_DECODER";
    private aj d;
    private int e;
    private w f;
    private a h;
    private byte i;
    private String j;
    private int k;
    private ak l = x.a;

    public static String f() {
        return c;
    }

    public n() {
        super((Object)p.a);
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        block0 : switch ((p)((Object)this.e())) {
            case a: {
                this.d = aj.b(g2.E());
                if (this.d != aj.b) break;
                this.a((Object)p.b);
            }
            case b: {
                this.f = w.b(g2.E());
                this.i = g2.E();
                this.h = a.b(g2.E());
                this.a((Object)p.c);
            }
            case c: {
                switch (this.h) {
                    case a: {
                        this.j = x.a(g2.K());
                        this.k = g2.H();
                        this.l = new l(this.f, this.h, this.j, this.k);
                        break block0;
                    }
                    case b: {
                        this.e = g2.E();
                        this.j = g2.y(this.e).a(io.netty.util.e.f);
                        this.k = g2.H();
                        this.l = new l(this.f, this.h, this.j, this.k);
                        break block0;
                    }
                    case c: {
                        this.j = x.b(g2.y(16).X());
                        this.k = g2.H();
                        this.l = new l(this.f, this.h, this.j, this.k);
                        break block0;
                    }
                }
            }
        }
        bd2.c().a((ba)this);
        list.add(this.l);
    }
}

