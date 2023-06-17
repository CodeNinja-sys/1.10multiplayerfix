/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.ak;
import io.netty.c.a.j.ao;
import io.netty.c.a.j.b;
import io.netty.c.a.j.e;
import io.netty.c.a.j.x;
import io.netty.c.a.w;
import io.netty.channel.ba;
import io.netty.channel.bd;
import java.util.List;

public class c
extends w {
    private static final String c = "SOCKS_AUTH_REQUEST_DECODER";
    private ao d;
    private int e;
    private String f;
    private String h;
    private ak i = x.a;

    public static String f() {
        return c;
    }

    public c() {
        super((Object)io.netty.c.a.j.e.a);
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        switch ((e)((Object)this.e())) {
            case a: {
                this.d = ao.b(g2.E());
                if (this.d != ao.a) break;
                this.a((Object)io.netty.c.a.j.e.b);
            }
            case b: {
                this.e = g2.E();
                this.f = g2.y(this.e).a(io.netty.util.e.f);
                this.a((Object)io.netty.c.a.j.e.c);
            }
            case c: {
                this.e = g2.E();
                this.h = g2.y(this.e).a(io.netty.util.e.f);
                this.i = new b(this.f, this.h);
            }
        }
        bd2.c().a((ba)this);
        list.add(this.i);
    }
}

