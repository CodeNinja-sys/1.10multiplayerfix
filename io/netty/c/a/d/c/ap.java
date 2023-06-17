/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.c.ac;
import io.netty.c.a.d.c.ag;
import io.netty.c.a.d.c.ah;
import io.netty.c.a.d.c.ai;
import io.netty.c.a.d.c.aq;
import io.netty.c.a.d.c.as;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.i;
import io.netty.channel.aw;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.util.b.ad;
import io.netty.util.c;
import java.util.List;

public class ap
extends ah {
    private static final c a = io.netty.util.c.a(ai.class.getName() + ".HANDSHAKER");
    private final String b;
    private final String c;
    private final boolean d;
    private final int e;

    public ap(String string) {
        this(string, null, false);
    }

    public ap(String string, String string2) {
        this(string, string2, false);
    }

    public ap(String string, String string2, boolean bl2) {
        this(string, string2, bl2, 65536);
    }

    public ap(String string, String string2, boolean bl2, int n2) {
        this.b = string;
        this.c = string2;
        this.d = bl2;
        this.e = n2;
    }

    @Override
    public void e(bd bd2) {
        io.netty.channel.br br2 = bd2.c();
        if (br2.b(as.class) == null) {
            bd2.c().a(bd2.f(), as.class.getName(), (ba)new as(this.b, this.c, this.d, this.e));
        }
    }

    @Override
    protected void a(bd bd2, ac ac2, List list) {
        if (ac2 instanceof b) {
            ai ai2 = ap.c(bd2);
            if (ai2 != null) {
                ac2.h();
                ai2.a(bd2.b(), (b)ac2);
            } else {
                bd2.d(bi.c).a((ad)aw.g);
            }
            return;
        }
        super.a(bd2, ac2, list);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        if (throwable instanceof ag) {
            i i2 = new i(br.b, bp.s, bi.a(throwable.getMessage().getBytes()));
            bd2.b().b(i2).a((ad)aw.g);
        } else {
            bd2.n();
        }
    }

    static ai c(bd bd2) {
        return (ai)bd2.a(a).get();
    }

    static void a(bd bd2, ai ai2) {
        bd2.a(a).set(ai2);
    }

    static ba a() {
        return new aq();
    }
}

