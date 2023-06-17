/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.h;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.t;
import io.netty.channel.bd;
import io.netty.channel.g.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b
extends t {
    private final Map a = new HashMap();

    protected void a(bd bd2, f f2, List list) {
        g g2 = f2.a();
        int n2 = f2.f();
        int n3 = f2.e();
        boolean bl2 = f2.h();
        g g3 = this.a.containsKey(n3) ? (g)this.a.remove(n3) : bi.c;
        if (bl2 && !g3.u()) {
            list.add(f2);
        } else if (!bl2 && g3.u()) {
            this.a.put(n3, bi.a(g3, g2));
        } else if (bl2 && g3.u()) {
            this.a.remove(n3);
            f f3 = new f(n2, n3, bi.a(g3, g2));
            list.add(f3);
        } else {
            this.a.put(n3, g2);
        }
        g2.ab();
    }
}

