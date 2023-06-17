/*
 * Decompiled with CFR 0.150.
 */
import io.netty.c.e.i;
import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.ba;
import io.netty.channel.bg;
import io.netty.channel.bi;

class amd
extends bg {
    final /* synthetic */ afx a;

    amd(afx afx2) {
        this.a = afx2;
    }

    @Override
    protected void a(an an2) {
        try {
            an2.G().a(bi.y, true);
        }
        catch (ar ar2) {
            // empty catch block
        }
        an2.c().b("timeout", (ba)new i(30)).b("legacy_query", (ba)new dba(this.a)).b("splitter", (ba)new cst()).b("decoder", (ba)new bko(cdz.a)).b("prepender", (ba)new bzp()).b("encoder", (ba)new cwk(cdz.b));
        sz sz2 = new sz(cdz.a);
        afx.a(this.a).add(sz2);
        an2.c().b("packet_handler", (ba)sz2);
        sz2.a(new cjf(afx.b(this.a), sz2));
    }
}

