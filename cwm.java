/*
 * Decompiled with CFR 0.150.
 */
import io.netty.c.e.i;
import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.ba;
import io.netty.channel.bg;
import io.netty.channel.bi;

final class cwm
extends bg {
    final /* synthetic */ sz a;

    cwm(sz sz2) {
        this.a = sz2;
    }

    @Override
    protected void a(an an2) {
        try {
            an2.G().a(bi.y, true);
        }
        catch (ar ar2) {
            // empty catch block
        }
        an2.c().b("timeout", (ba)new i(30)).b("splitter", (ba)new cst()).b("decoder", (ba)new bko(cdz.b)).b("prepender", (ba)new bzp()).b("encoder", (ba)new cwk(cdz.a)).b("packet_handler", (ba)this.a);
    }
}

