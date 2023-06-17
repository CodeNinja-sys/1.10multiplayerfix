/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.channel.br;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;

public abstract class bg
extends bf {
    private static final g a = h.a(bg.class);

    protected abstract void a(an var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void g(bd bd2) {
        br br2 = bd2.c();
        boolean bl2 = false;
        try {
            this.a(bd2.b());
            br2.a((ba)this);
            bd2.g();
            bl2 = true;
        }
        catch (Throwable throwable) {
            a.d("Failed to initialize a channel. Closing: " + bd2.b(), throwable);
        }
        finally {
            if (br2.b((ba)this) != null) {
                br2.a((ba)this);
            }
            if (!bl2) {
                bd2.n();
            }
        }
    }
}

