/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.c.ai;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.br;
import io.netty.channel.bw;

class aj
implements aw {
    final /* synthetic */ String a;
    final /* synthetic */ bw b;
    final /* synthetic */ ai c;

    aj(ai ai2, String string, bw bw2) {
        this.c = ai2;
        this.a = string;
        this.b = bw2;
    }

    public void a(av av2) {
        if (av2.bo_()) {
            br br2 = av2.e().c();
            br2.a(this.a);
            this.b.b();
        } else {
            this.b.a(av2.bq_());
        }
    }
}

