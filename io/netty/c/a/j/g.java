/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.c.a.j.am;
import io.netty.c.a.j.ao;
import io.netty.c.a.j.f;
import io.netty.c.a.j.i;
import io.netty.c.a.j.k;
import io.netty.c.a.j.x;
import io.netty.c.a.w;
import io.netty.channel.ba;
import io.netty.channel.bd;
import java.util.List;

public class g
extends w {
    private static final String c = "SOCKS_AUTH_RESPONSE_DECODER";
    private ao d;
    private k e;
    private am f = x.b;

    public static String f() {
        return c;
    }

    public g() {
        super((Object)i.a);
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        switch ((i)((Object)this.e())) {
            case a: {
                this.d = ao.b(g2.E());
                if (this.d != ao.a) break;
                this.a((Object)i.b);
            }
            case b: {
                this.e = k.b(g2.E());
                this.f = new f(this.e);
            }
        }
        bd2.c().a((ba)this);
        list.add(this.f);
    }
}

