/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.c.aa;
import io.netty.c.a.d.c.ac;
import io.netty.c.a.d.c.ah;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.c.r;
import io.netty.c.a.d.c.x;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.br;
import java.net.URI;
import java.util.List;

public class y
extends ah {
    private final r a;
    private final boolean b;

    public y(URI uRI, av av2, String string, boolean bl2, ar ar2, int n2, boolean bl3) {
        this(x.a(uRI, av2, string, bl2, ar2, n2), bl3);
    }

    public y(URI uRI, av av2, String string, boolean bl2, ar ar2, int n2) {
        this(uRI, av2, string, bl2, ar2, n2, true);
    }

    public y(r r2, boolean bl2) {
        this.a = r2;
        this.b = bl2;
    }

    public y(r r2) {
        this(r2, true);
    }

    @Override
    protected void a(bd bd2, ac ac2, List list) {
        if (this.b && ac2 instanceof b) {
            bd2.n();
            return;
        }
        super.a(bd2, ac2, list);
    }

    @Override
    public void e(bd bd2) {
        br br2 = bd2.c();
        if (br2.b(aa.class) == null) {
            bd2.c().a(bd2.f(), aa.class.getName(), (ba)new aa(this.a));
        }
    }
}

