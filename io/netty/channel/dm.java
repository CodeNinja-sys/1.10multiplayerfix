/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.dj;
import io.netty.channel.dn;
import io.netty.channel.do;
import io.netty.util.b.ad;

public class dm
extends dj {
    private final do a;
    private an d;

    public dm(do do_) {
        super(do_, do_.a, true);
        this.a = do_;
    }

    @Override
    public av a(an an2, bw bw2) {
        return super.a(an2, bw2).a((ad)new dn(this));
    }

    @Override
    protected void e() {
        while (true) {
            Runnable runnable;
            if ((runnable = this.q()) != null) {
                runnable.run();
                this.w();
            }
            an an2 = this.d;
            if (this.br_()) {
                if (an2 != null) {
                    an2.t().b(an2.t().h());
                }
                if (!this.x()) continue;
                break;
            }
            if (an2 == null || an2.j()) continue;
            this.v();
            this.f();
        }
    }

    protected void f() {
        this.d = null;
        this.a.b.remove(this);
        this.a.c.add(this);
    }

    static /* synthetic */ an a(dm dm2, an an2) {
        dm2.d = an2;
        return dm2.d;
    }
}

