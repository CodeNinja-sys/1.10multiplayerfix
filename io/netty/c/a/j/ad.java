/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.ac;
import io.netty.c.a.j.af;
import io.netty.c.a.j.aj;
import io.netty.c.a.j.am;
import io.netty.c.a.j.j;
import io.netty.c.a.j.x;
import io.netty.c.a.w;
import io.netty.channel.ba;
import io.netty.channel.bd;
import java.util.List;

public class ad
extends w {
    private static final String c = "SOCKS_INIT_RESPONSE_DECODER";
    private aj d;
    private j e;
    private am f = x.b;

    public static String f() {
        return c;
    }

    public ad() {
        super((Object)af.a);
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        switch ((af)((Object)this.e())) {
            case a: {
                this.d = aj.b(g2.E());
                if (this.d != aj.b) break;
                this.a((Object)af.b);
            }
            case b: {
                this.e = j.b(g2.E());
                this.f = new ac(this.e);
            }
        }
        bd2.c().a((ba)this);
        list.add(this.f);
    }
}

