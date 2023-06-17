/*
 * Decompiled with CFR 0.150.
 */
import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bg;

class bnk
extends bg {
    final /* synthetic */ afx a;

    bnk(afx afx2) {
        this.a = afx2;
    }

    @Override
    protected void a(an an2) {
        sz sz2 = new sz(cdz.a);
        sz2.a(new ays(afx.b(this.a), sz2));
        afx.a(this.a).add(sz2);
        an2.c().b("packet_handler", (ba)sz2);
    }
}

