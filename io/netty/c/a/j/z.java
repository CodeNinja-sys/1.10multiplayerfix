/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.ab;
import io.netty.c.a.j.aj;
import io.netty.c.a.j.ak;
import io.netty.c.a.j.j;
import io.netty.c.a.j.x;
import io.netty.c.a.j.y;
import io.netty.c.a.w;
import io.netty.channel.ba;
import io.netty.channel.bd;
import java.util.ArrayList;
import java.util.List;

public class z
extends w {
    private static final String c = "SOCKS_INIT_REQUEST_DECODER";
    private final List d = new ArrayList();
    private aj e;
    private byte f;
    private ak h = x.a;

    public static String f() {
        return c;
    }

    public z() {
        super((Object)ab.a);
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        switch ((ab)((Object)this.e())) {
            case a: {
                this.e = aj.b(g2.E());
                if (this.e != aj.b) break;
                this.a((Object)ab.b);
            }
            case b: {
                this.d.clear();
                this.f = g2.E();
                for (int i2 = 0; i2 < this.f; ++i2) {
                    this.d.add(j.b(g2.E()));
                }
                this.h = new y(this.d);
            }
        }
        bd2.c().a((ba)this);
        list.add(this.h);
    }
}

